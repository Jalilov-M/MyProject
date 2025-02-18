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
import com.example.myapplication.R
import androidx.navigation.NavController


@Composable
fun AnimalDog(navController: NavController) {
    var language by remember { mutableStateOf("en") }
    val textMap = mapOf(
        "en" to "Dogs are friendly and loyal animals that love to play and protect their families. They come in all shapes and sizes, from tiny Chihuahuas to big Saint Bernards!\n" +
                "\n" +
                "\uD83D\uDC3E Super Smellers: Dogs can smell things 100,000 times better than humans! That’s why they help police find missing people and hidden objects.\n" +
                "\n" +
                "\uD83D\uDC3E Fast Runners: Some dogs, like greyhounds, can run up to 72 km/h (45 mph)—almost as fast as a car in the city!\n" +
                "\n" +
                "\uD83D\uDC3E Smart & Loyal: Dogs can learn more than 100 words and commands. Some, like Border Collies, are as smart as a 2-year-old child!\n" +
                "\n" +
                "\uD83D\uDC3E Different Barks: Dogs bark in different ways to show happiness, excitement, or even to warn their owners.\n" +
                "\n" +
                "\uD83D\uDC3E Wagging Tails: A wagging tail usually means a dog is happy, but it can also show excitement or nervousness.\n" +
                "\n" +
                "Dogs are amazing pets that love humans and always bring happiness to their families! \uD83D\uDC36❤\uFE0F",
        "ru" to "Собаки — это дружелюбные и верные животные, которые любят играть и защищать свою семью. Они бывают разного размера — от крошечных чихуахуа до огромных сенбернаров!\n" +
                "\n" +
                "\uD83D\uDC3E Отличный нюх: Собаки чувствуют запахи в 100 000 раз лучше, чем люди! Поэтому они помогают полиции искать пропавших людей и находить спрятанные вещи.\n" +
                "\n" +
                "\uD83D\uDC3E Быстрые бегуны: Некоторые собаки, например борзые, могут разгоняться до 72 км/ч — почти как машина в городе!\n" +
                "\n" +
                "\uD83D\uDC3E Умные и преданные: Собаки могут запомнить более 100 слов и команд. А породы, такие как бордер-колли, такие же умные, как двухлетний ребёнок!\n" +
                "\n" +
                "\uD83D\uDC3E Разные лаи: Собаки лают по-разному, чтобы показать радость, волнение или предупредить хозяина.\n" +
                "\n" +
                "\uD83D\uDC3E Виляние хвостом: Обычно виляющий хвост значит, что собака счастлива, но иногда это признак волнения.\n" +
                "\n" +
                "Собаки — замечательные друзья, которые любят людей и всегда дарят радость! \uD83D\uDC36❤\uFE0F"
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
                    IconButton(onClick = {
                        navController.popBackStack()
                    }) {
                        Icon(Icons.Filled.ArrowBack, "Back", tint = Color.White)


                    }


                    Text(
                        "Dog",
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
                        painter = painterResource(id = R.drawable.a11),
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

