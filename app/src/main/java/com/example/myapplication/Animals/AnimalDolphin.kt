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
 fun AnimalDolphin(navController: NavController) {
    var language by remember { mutableStateOf("en") }
    val textMap = mapOf(
        "en" to "Dolphins are intelligent, friendly, and playful sea animals. They live in oceans and seas around the world and are known for their amazing swimming skills!\n" +
                "\n" +
                "\uD83D\uDC3E Smart Animals: Dolphins are very intelligent and can learn tricks, solve problems, and communicate with each other using sounds and body movements.\n" +
                "\n" +
                "\uD83D\uDC3E Friendly Creatures: Dolphins are known to be very friendly to humans. Sometimes, they even help fishermen by guiding their boats to fish!\n" +
                "\n" +
                "\uD83D\uDC3E Excellent Swimmers: Dolphins can swim as fast as 37 km/h (23 mph), and they can even leap out of the water!\n" +
                "\n" +
                "\uD83D\uDC3E Social Animals: Dolphins live in groups called pods. They help each other find food and take care of each other. Some pods can have up to 1,000 dolphins!\n" +
                "\n" +
                "\uD83D\uDC3E Playful Nature: Dolphins love to play! They enjoy surfing in waves, chasing each other, and even playing with objects like seaweed or bubbles.\n" +
                "\n" +
                "\uD83D\uDC3E Echo Location: Dolphins use echolocation to find food and communicate with each other. They send out sound waves, and when the waves hit an object, they bounce back, helping the dolphin know where things are.\n" +
                "\n" +
                "\uD83D\uDC3E Breathing Air: Dolphins are mammals, so they breathe air through blowholes on the top of their heads. They have to come to the surface to take a breath!\n" +
                "\n" +
                "Dolphins are friendly, smart, and amazing swimmers! \uD83D\uDC2C\uD83C\uDF0A",
        "ru" to "Дельфины — умные, дружелюбные и игривые морские животные. Они живут в океанах и морях по всему миру и известны своими потрясающими навыками плавания!\n" +
                "\n" +
                "\uD83D\uDC3E Умные животные: Дельфины очень умные и могут учить трюки, решать задачи и общаться друг с другом с помощью звуков и движений тела.\n" +
                "\n" +
                "\uD83D\uDC3E Дружелюбные существа: Дельфины известны своей дружелюбностью к людям. Иногда они даже помогают рыбакам, направляя их лодки к рыбе!\n" +
                "\n" +
                "\uD83D\uDC3E Отличные пловцы: Дельфины могут плавать со скоростью до 37 км/ч и даже выпрыгивать из воды!\n" +
                "\n" +
                "\uD83D\uDC3E Социальные животные: Дельфины живут в группах, которые называются стаями. Они помогают друг другу искать еду и заботятся друг о друге. В одной стае может быть до 1000 дельфинов!\n" +
                "\n" +
                "\uD83D\uDC3E Игривый характер: Дельфины любят играть! Они наслаждаются катанием на волнах, догонялками и даже игрой с предметами, такими как водоросли или пузыри.\n" +
                "\n" +
                "\uD83D\uDC3E Эхолокация: Дельфины используют эхолокацию, чтобы находить еду и общаться. Они посылают звуковые волны, и когда волна встречает объект, она возвращается назад, помогая дельфину определить местоположение объектов.\n" +
                "\n" +
                "\uD83D\uDC3E Дыхание воздухом: Дельфины — млекопитающие, поэтому они дышат через дымоходы на верхней части головы. Им нужно подниматься на поверхность, чтобы сделать вдох!\n" +
                "\n" +
                "Дельфины — дружелюбные, умные и потрясающие пловцы! \uD83D\uDC2C\uD83C\uDF0A"
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
                        "Dolphin",
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
                            .padding(start = 85.dp)
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
                        painter = painterResource(id = R.drawable.do1),
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

