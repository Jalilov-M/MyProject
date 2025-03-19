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
 fun AnimalGriraffe  (navController: NavController) {
    var language by remember { mutableStateOf("en") }
    val nameMao= mapOf(
        "en" to "Giraffe ",
        "ru" to "Жираф")
    val textMap = mapOf(
        "en" to "Giraffes are the tallest animals in the world! They live in Africa and love eating leaves from tall trees.\n" +
                "\n" +
                "\uD83D\uDC3E Super Tall: Giraffes can grow up to 6 meters (20 feet) tall—that’s as high as a two-story house!\n" +
                "\n" +
                "\uD83D\uDC3E Long Neck: A giraffe’s neck is as long as an adult human—about 2 meters (6 feet)! But guess what? They have the same number of neck bones as humans—just much bigger!\n" +
                "\n" +
                "\uD83D\uDC3E Blue Tongue: Their tongues are dark blue or purple and can be 50 cm (20 inches) long! This helps protect them from the hot sun while they eat.\n" +
                "\n" +
                "\uD83D\uDC3E Fast Runners: Even though giraffes look slow, they can run up to 60 km/h (37 mph) for short distances!\n" +
                "\n" +
                "\uD83D\uDC3E Sleepy Giants: Giraffes sleep only 30 minutes to 2 hours a day—one of the shortest sleep times of any animal!\n" +
                "\n" +
                "\uD83D\uDC3E Powerful Kick: A giraffe’s kick is so strong it can knock down a lion!\n" +
                "\n" +
                "\uD83D\uDC3E No Voice?: Giraffes are very quiet, but they can make humming, grunting, and even mooing sounds!\n" +
                "\n" +
                "Giraffes are gentle giants that love roaming the African savanna! \uD83E\uDD92\uD83C\uDF3F",
        "ru" to "Жирафы — самые высокие животные в мире! Они живут в Африке и любят лакомиться листьями с высоких деревьев.\n" +
                "\n" +
                "\uD83D\uDC3E Очень высокие: Жирафы могут вырастать до 6 метров—это как двухэтажный дом!\n" +
                "\n" +
                "\uD83D\uDC3E Длинная шея: Шея жирафа длиной почти 2 метра—примерно как рост взрослого человека! Но знаете что? У них столько же шейных позвонков, сколько у людей—просто они намного больше!\n" +
                "\n" +
                "\uD83D\uDC3E Синий язык: Язык жирафа тёмно-синий или фиолетовый и может быть длиной до 50 см! Это помогает ему не обжигаться на солнце, пока он ест.\n" +
                "\n" +
                "\uD83D\uDC3E Быстрые бегуны: Несмотря на длинные ноги, жирафы могут разгоняться до 60 км/ч!\n" +
                "\n" +
                "\uD83D\uDC3E Мало спят: Жирафы спят всего от 30 минут до 2 часов в сутки—это один из самых коротких снов среди животных!\n" +
                "\n" +
                "\uD83D\uDC3E Сильный удар: Удар жирафа такой мощный, что он может свалить даже льва!\n" +
                "\n" +
                "\uD83D\uDC3E Почти не издают звуков: Жирафы очень тихие, но они умеют гудеть, фыркать и даже \"мычать\"!\n" +
                "\n" +
                "Жирафы — это добрые великаны, которые живут в африканской саванне! \uD83E\uDD92\uD83C\uDF3F"
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
                            .padding(start = 97.dp)
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
                        painter = painterResource(id = R.drawable.a88),
                        contentDescription = "ImG", contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(5.dp)
                            .size(width = 0.dp, height = 190.dp)
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

