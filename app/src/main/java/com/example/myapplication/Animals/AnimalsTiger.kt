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
 fun AnimalTiger(navController: NavController) {
    var language by remember { mutableStateOf("en") }
    val nameMao= mapOf(
        "en" to "Tiger",
        "ru" to "Тигр ")
    val textMap = mapOf(
        "en" to "Tigers are the biggest cats in the world! They are strong, fast, and love to swim. These beautiful animals live in forests and grasslands of Asia.\n" +
                "\n" +
                "\uD83D\uDC3E Biggest Cat: Tigers are the largest wild cats—they can grow up to 3 meters (10 feet) long and weigh more than 300 kg (660 lbs)!\n" +
                "\n" +
                "\uD83D\uDC3E Unique Stripes: No two tigers have the same stripes! Their patterns are like human fingerprints—each one is different.\n" +
                "\n" +
                "\uD83D\uDC3E Powerful Roar: A tiger’s roar is so loud it can be heard 3 km (2 miles) away!\n" +
                "\n" +
                "\uD83D\uDC3E Loves Water: Unlike most cats, tigers love to swim! They can swim for long distances and often cool off in rivers and lakes.\n" +
                "\n" +
                "\uD83D\uDC3E Great Jumpers: Tigers can jump up to 5 meters (16 feet) in the air—higher than a basketball hoop!\n" +
                "\n" +
                "\uD83D\uDC3E Silent Hunters: Tigers have soft pads on their feet, which help them walk quietly when hunting.\n" +
                "\n" +
                "\uD83D\uDC3E Sharp Teeth & Claws: A tiger’s teeth can grow up to 7.5 cm (3 inches) long! Their claws are super sharp and help them catch prey.\n" +
                "\n" +
                "\uD83D\uDC3E Solo Life: Unlike lions, tigers live alone and only meet others during mating season or when raising cubs.\n" +
                "\n" +
                "Tigers are strong, fast, and amazing hunters! \uD83D\uDC2F\uD83C\uDF3F",
        "ru" to "Тигры — самые большие дикие кошки в мире! Они сильные, быстрые и любят воду. Эти красивые животные живут в лесах и степях Азии.\n" +
                "\n" +
                "\uD83D\uDC3E Самая большая кошка: Тигры — крупнейшие дикие кошки! Они могут вырастать до 3 метров в длину и весить более 300 кг!\n" +
                "\n" +
                "\uD83D\uDC3E Уникальные полоски: У каждого тигра свой уникальный узор полос—как отпечатки пальцев у людей, они никогда не повторяются!\n" +
                "\n" +
                "\uD83D\uDC3E Мощный рёв: Рёв тигра очень громкий—его слышно на расстоянии 3 км!\n" +
                "\n" +
                "\uD83D\uDC3E Любит воду: В отличие от других кошек, тигры обожают плавать! Они могут проплывать большие расстояния и часто отдыхают в воде.\n" +
                "\n" +
                "\uD83D\uDC3E Отличные прыгуны: Тигры могут прыгать на 5 метров в высоту—выше баскетбольного кольца!\n" +
                "\n" +
                "\uD83D\uDC3E Тихие охотники: Подушечки на лапах помогают тиграм двигаться бесшумно, чтобы подкрадываться к добыче.\n" +
                "\n" +
                "\uD83D\uDC3E Острые зубы и когти: Клыки тигра могут достигать 7,5 см в длину! А их когти очень острые и помогают ловить добычу.\n" +
                "\n" +
                "\uD83D\uDC3E Одиночки: В отличие от львов, тигры живут в одиночку и встречаются с другими тиграми только во время брачного сезона или когда растят детёнышей.\n" +
                "\n" +
                "Тигры — мощные, ловкие и красивые хищники! \uD83D\uDC2F\uD83C\uDF3F"
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
                        painter = painterResource(id = R.drawable.a2),
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

