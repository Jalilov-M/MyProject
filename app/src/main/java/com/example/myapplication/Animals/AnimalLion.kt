package com.example.myapplication.Animals

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.myapplication.R


@Composable
 fun AnimalLion(navController: NavController) {
    var language by remember { mutableStateOf("en") }
    val nameMao= mapOf(
        "en" to "Lion",
        "ru" to "Лев")
    val textMap = mapOf(
        "en" to "Lions are strong and brave animals known as the \"kings of the jungle.\" They live in Africa and love to spend time with their families, called prides.\n" +
                "\n" +
                "\uD83D\uDC3E Big Cats: Lions are the second-largest big cats after tigers! Male lions can weigh up to 250 kg (550 lbs)!\n" +
                "\n" +
                "\uD83D\uDC3E Loud Roar: A lion’s roar is so powerful that it can be heard up to 8 km (5 miles) away!\n" +
                "\n" +
                "\uD83D\uDC3E Sleepy Kings: Lions sleep for 16-20 hours a day to save energy for hunting!\n" +
                "\n" +
                "\uD83D\uDC3E Team Hunters: Lionesses (female lions) hunt together while male lions protect the pride. They work as a team to catch zebras, antelopes, and buffalos.\n" +
                "\n" +
                "\uD83D\uDC3E Fluffy Mane: Only male lions have a big, fluffy mane around their heads. The darker the mane, the stronger the lion!\n" +
                "\n" +
                "\uD83D\uDC3E Fast Sprinters: Lions can run up to 80 km/h (50 mph), but only for short distances.\n" +
                "\n" +
                "\uD83D\uDC3E Big Families: A lion pride can have up to 40 lions, including cubs, mothers, and a few males.\n" +
                "\n" +
                "Lions are strong, powerful, and love their families! \uD83E\uDD81\uD83C\uDF3F",
        "ru" to "Львы — сильные и смелые животные, которых называют \"королями джунглей\". Они живут в Африке и любят проводить время со своей семьёй, которая называется прайд.\n" +
                "\n" +
                "\uD83D\uDC3E Большие кошки: Львы — вторые по величине кошки после тигров! Вес самца может достигать 250 кг!\n" +
                "\n" +
                "\uD83D\uDC3E Громкий рёв: Рык льва такой мощный, что его слышно на расстоянии 8 км!\n" +
                "\n" +
                "\uD83D\uDC3E Сонные короли: Львы спят по 16-20 часов в день, чтобы накапливать силы для охоты!\n" +
                "\n" +
                "\uD83D\uDC3E Охотники в команде: Львицы (самки) охотятся вместе, а самцы защищают прайд. Они работают в команде, чтобы ловить зебр, антилоп и буйволов.\n" +
                "\n" +
                "\uD83D\uDC3E Густая грива: Только у самцов есть пышная грива вокруг головы. Чем темнее грива, тем сильнее лев!\n" +
                "\n" +
                "\uD83D\uDC3E Быстрые спринтеры: Львы могут разгоняться до 80 км/ч, но на короткие дистанции.\n" +
                "\n" +
                "\uD83D\uDC3E Большие семьи: В одном прайде может быть до 40 львов, включая детёнышей, мам и нескольких самцов.\n" +
                "\n" +
                "Львы — сильные, могучие и заботливые к своей семье! \uD83E\uDD81\uD83C\uDF3F"
    )
    Column {
        Column(
            modifier = Modifier

        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()

                    .background(Color(0xFF3876A4))
                    .padding(top = 30.dp)
                    .height(50.dp)

            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(top = 4.dp)
                ) {
                    IconButton(onClick = {navController.popBackStack()
                    }) {
                        Icon(Icons.Filled.ArrowBack, "Back", tint = Color.White)


                    }


                    Text(
                        text = nameMao[language] ?: "",
                        Modifier.padding(start = 20.dp),
                        fontSize = 32.sp,
                        fontStyle = FontStyle.Italic,
                        color = Color.White
                    )
                    Image(
                        painter = painterResource(id = R.drawable.ru),
                        contentDescription = "Russian", contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .padding(5.dp)
                            .padding(start = 130.dp)
                            .clip(RoundedCornerShape(20.dp))

                            .size(35.dp)
                            .clickable { language ="ru" }

                    )
                    Image(
                        painter = painterResource(id = R.drawable.en),
                        contentDescription = "English", contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .padding(5.dp)
                            .padding(start = 1.dp)
                            .clip(RoundedCornerShape(20.dp))
                            .size(35.dp)
                            .clickable { language="en" }

                    )
                }
            }
            Box() {
                Column(Modifier.verticalScroll(rememberScrollState())) {
                    Image(
                        painter = painterResource(id = R.drawable.an3),
                        contentDescription = "ImG", contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(5.dp)
                            .size(width = 150.dp, height = 190.dp)
                            .clip(RoundedCornerShape(20.dp))
                    )
                    Text(
                        text = textMap[language] ?: ""
                        , Modifier.padding(10.dp), fontSize = 15.sp, textAlign = TextAlign.Justify
                    )
                }
            }
        }
    }
}

