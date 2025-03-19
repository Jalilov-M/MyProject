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
 fun AnimalWolf(navController: NavController) {
    var language by remember { mutableStateOf("en") }
    val nameMao= mapOf(
        "en" to "Wolf ",
        "ru" to "Волк")
    val textMap = mapOf(
        "en" to "Wolves are smart, strong, and great team players! They live in forests, mountains, and cold snowy places around the world.\n" +
                "\n" +
                "\uD83D\uDC3E Big Family: Wolves live in groups called packs, which can have 6 to 15 wolves. They work together to hunt and protect each other.\n" +
                "\n" +
                "\uD83D\uDC3E Loud Howl: A wolf’s howl can be heard up to 10 km (6 miles) away! They howl to talk to their pack and warn other wolves to stay away.\n" +
                "\n" +
                "\uD83D\uDC3E Fast Runners: Wolves can run up to 60 km/h (37 mph) when chasing prey!\n" +
                "\n" +
                "\uD83D\uDC3E Strong Bites: A wolf’s bite is twice as strong as a big dog’s bite! They have sharp teeth that help them eat meat and break bones.\n" +
                "\n" +
                "\uD83D\uDC3E Thick Fur: Wolves have thick fur to keep them warm in winter. In summer, they shed their fur to stay cool.\n" +
                "\n" +
                "\uD83D\uDC3E Great Hunters: Wolves can smell their prey from 2.5 km (1.5 miles) away and can track them for hours.\n" +
                "\n" +
                "\uD83D\uDC3E Loyal Friends: Wolves stay with the same mate for life and take care of their cubs together.\n" +
                "\n" +
                "Wolves are brave, loyal, and love their families! \uD83D\uDC3A\uD83C\uDF32",
        "ru" to "Волки — умные, сильные и отличные командные игроки! Они живут в лесах, горах и холодных местах по всему миру.\n" +
                "\n" +
                "\uD83D\uDC3E Большая семья: Волки живут в группах, которые называются стаи. В стае может быть от 6 до 15 волков, и они помогают друг другу охотиться и защищаться.\n" +
                "\n" +
                "\uD83D\uDC3E Громкий вой: Вой волка слышно на расстоянии до 10 км! Волки воют, чтобы общаться и предупреждать чужаков.\n" +
                "\n" +
                "\uD83D\uDC3E Быстрые бегуны: Волки могут разгоняться до 60 км/ч, когда преследуют добычу!\n" +
                "\n" +
                "\uD83D\uDC3E Сильные челюсти: Укус волка в два раза сильнее, чем у большой собаки! Их острые зубы помогают разрывать мясо и ломать кости.\n" +
                "\n" +
                "\uD83D\uDC3E Тёплая шерсть: У волков густая шерсть, которая защищает их от холода. Летом они сбрасывают часть шерсти, чтобы не перегреваться.\n" +
                "\n" +
                "\uD83D\uDC3E Отличные охотники: Волки могут чуять добычу на расстоянии 2,5 км и преследовать её часами.\n" +
                "\n" +
                "\uD83D\uDC3E Верные партнёры: Волки живут с одним партнёром всю жизнь и вместе заботятся о детёнышах.\n" +
                "\n" +
                "Волки — смелые, преданные и заботливые к своей стае! \uD83D\uDC3A\uD83C\uDF32"
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
                        painter = painterResource(id = R.drawable.an2),
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

