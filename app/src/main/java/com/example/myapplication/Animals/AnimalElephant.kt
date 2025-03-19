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
 fun AnimalElephant(navController: NavController ) {
    var language by remember { mutableStateOf("en") }
    val nameMao= mapOf(
        "en" to "Elephant",
        "ru" to "Слон      ")
    val textMap = mapOf(
        "en" to "Elephants are the biggest land animals on Earth! They live in Africa and Asia and love to be with their families.\n" +
                "\n" +
                "\uD83D\uDC3E Super Trunks: An elephant’s trunk is like a long nose and arm combined! They use it to drink water, pick up food, and even give hugs!\n" +
                "\n" +
                "\uD83D\uDC3E Big Ears: Their large ears help them stay cool in hot weather by flapping like fans.\n" +
                "\n" +
                "\uD83D\uDC3E Smart Giants: Elephants are very intelligent! They can remember places, recognize friends, and even feel emotions like happiness and sadness.\n" +
                "\n" +
                "\uD83D\uDC3E Heavyweights: Elephants can weigh as much as 10 cars and eat over 100 kg of food every day!\n" +
                "\n" +
                "\uD83D\uDC3E Loving Families: Elephants live in big families called herds and take care of each other, just like humans do!\n" +
                "\n" +
                "Elephants are gentle giants who love water, playing in mud, and spending time with their friends! \uD83D\uDC18\uD83D\uDC99",
        "ru" to "Слоны — самые большие наземные животные на Земле! Они живут в Африке и Азии и любят быть рядом с семьёй.\n" +
                "\n" +
                "\uD83D\uDC3E Суперхобот: Хобот слона — это и нос, и рука! С его помощью слон пьёт воду, поднимает еду и даже обнимается!\n" +
                "\n" +
                "\uD83D\uDC3E Огромные уши: Большие уши помогают слону охлаждаться в жару — он машет ими, как веером.\n" +
                "\n" +
                "\uD83D\uDC3E Умные великаны: Слоны очень умные! Они запоминают места, узнают друзей и даже чувствуют радость и грусть.\n" +
                "\n" +
                "\uD83D\uDC3E Тяжеловесы: Слоны весят как 10 машин и съедают более 100 кг еды в день!\n" +
                "\n" +
                "\uD83D\uDC3E Дружные семьи: Слоны живут в больших семьях — стадах — и заботятся друг о друге, как люди.\n" +
                "\n" +
                "Слоны — добрые великаны, которые любят воду, грязевые ванны и игры с друзьями! \uD83D\uDC18\uD83D\uDC99\n"
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
                        Modifier.padding(start = 10.dp),
                        fontSize = 32.sp,
                        fontStyle = FontStyle.Italic,
                        color = Color.White
                    )
                    Image(
                        painter = painterResource(id = R.drawable.ru),
                        contentDescription = "Russian", contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .padding(5.dp)
                            .padding(start = 75.dp)
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
                        painter = painterResource(id = R.drawable.a6),
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

