import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.SystemFontFamily
import androidx.compose.ui.unit.sp
import com.example.myapplication.R
class AnimalViewModel(private val savedStateHandle: SavedStateHandle) : ViewModel() {

    var isDarkTheme by mutableStateOf(savedStateHandle.get<Boolean>("isDarkTheme") ?: false)
        private set

    var notificationsEnabled by mutableStateOf(savedStateHandle.get<Boolean>("notificationsEnabled") ?: false)
        private set

    private val fontMap = mapOf(
        "Default" to FontFamily.Default,
        "Serif" to FontFamily.Serif,
        "SansSerif" to FontFamily.SansSerif,
        "Monospace" to FontFamily.Monospace
    )

    var selectedFont by mutableStateOf(
        fontMap[savedStateHandle.get<String>("selectedFont")] ?: FontFamily.Default
    )
        private set

    var selectedFontSize by mutableStateOf(savedStateHandle.get<Float>("selectedFontSize")?.sp ?: 18.sp)
        private set

    var searchQuery by mutableStateOf("")
        private set

    val animals = listOf(
        "Tiger | Тигр" to R.drawable.a2,
        "Wolf | Волк" to R.drawable.an2,
        "Lion | Лев" to R.drawable.an3,
        "Fox | Лиса" to R.drawable.an4,
        "Bear | Медвед" to R.drawable.a5,
        "Elephant | Слон" to R.drawable.a6,
        "Giraffe | Жираф" to R.drawable.a8,
        "Jackal | Шакал" to R.drawable.a9,
        "Cheetah | Гепард" to R.drawable.a10,
        "Dog | Собака" to R.drawable.a11,
        "Cat | Кошка" to R.drawable.a12,
        "Kangaroo | Кенгуру" to R.drawable.ka1,
        "Horse | Лощадь" to R.drawable.ho1,
        "Dolphin | Дельфин" to R.drawable.do1,
        "Cow | Корова" to R.drawable.co3
    ).sortedBy { it.first }

    fun toggleTheme() {
        isDarkTheme = !isDarkTheme
        savedStateHandle["isDarkTheme"] = isDarkTheme
    }

    fun toggleNotifications() {
        notificationsEnabled = !notificationsEnabled
        savedStateHandle["notificationsEnabled"] = notificationsEnabled
    }

    fun setFont(font: FontFamily) {
        selectedFont = font as SystemFontFamily
        val fontName = fontMap.entries.find { it.value == font }?.key ?: "Default"
        savedStateHandle["selectedFont"] = fontName
    }

    fun setFontSize(size: Float) {
        selectedFontSize = size.sp
        savedStateHandle["selectedFontSize"] = size
    }

    fun updateSearchQuery(newQuery: String) {
        searchQuery = newQuery
    }

    fun filteredAnimals(): List<Pair<String, Int>> {
        return if (searchQuery.isBlank()) {
            animals
        } else {
            animals.filter { it.first.contains(searchQuery, ignoreCase = true) }
        }
    }
}
