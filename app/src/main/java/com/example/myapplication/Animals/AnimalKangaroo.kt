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
 fun AnimalKangaroo(navController: NavController) {
    var language by remember { mutableStateOf("en") }
    val nameMao= mapOf(
        "en" to "Kangaroo",
        "ru" to "Кенгуру   ")
    val textMap = mapOf(
        "en" to "Kangaroos are bouncy, strong, and unique animals that live in Australia. They are famous for their big feet and strong tails!\n" +
                "\n" +
                "\uD83D\uDC3E Super Jumpers: Kangaroos are amazing jumpers! They can jump over 3 meters (10 feet) in a single leap—that’s as tall as a basketball hoop!\n" +
                "\n" +
                "\uD83D\uDC3E Powerful Legs: A kangaroo’s hind legs are super strong, and they can use them to kick really hard if they feel threatened.\n" +
                "\n" +
                "\uD83D\uDC3E Long Tails: A kangaroo’s tail is as long as its body, and it helps them balance when jumping and moving quickly.\n" +
                "\n" +
                "\uD83D\uDC3E Pouch for Babies: Female kangaroos have a special pouch where they carry their babies, called joeys. The joey stays in the pouch for several months until it’s big enough to hop around!\n" +
                "\n" +
                "\uD83D\uDC3E Bouncing Everywhere: Kangaroos don’t walk like other animals. They hop on their strong hind legs to travel long distances without getting tired.\n" +
                "\n" +
                "\uD83D\uDC3E Herbivores: Kangaroos are plant-eaters and love munching on grasses and leaves.\n" +
                "\n" +
                "\uD83D\uDC3E Sleepy Animals: Kangaroos like to rest during the hottest part of the day, staying cool in the shade and bouncing around in the cooler evenings.\n" +
                "\n" +
                "Kangaroos are fun, strong, and love to bounce around Australia! \uD83E\uDD98\uD83C\uDF3F",
        "ru" to "Кенгуру — прыгающие, сильные и уникальные животные, которые живут в Австралии. Они известны своими большими лапами и сильными хвостами!\n" +
                "\n" +
                "\uD83D\uDC3E Отличные прыгуны: Кенгуру — потрясающие прыгуны! Они могут прыгать на 3 метра за один раз — это как высота баскетбольного кольца!\n" +
                "\n" +
                "\uD83D\uDC3E Мощные задние лапы: Задние лапы кенгуру очень сильные, и они могут использовать их, чтобы сильно пнуть в случае угрозы.\n" +
                "\n" +
                "\uD83D\uDC3E Длинный хвост: Хвост кенгуру такой же длины, как его тело и помогает им поддерживать равновесие при прыжках и быстром движении.\n" +
                "\n" +
                "\uD83D\uDC3E Кармашек для детёнышей: У самок кенгуру есть особый кармашек, где они носят своих детёнышей, называемых джойи. Джойи остаются в кармашке несколько месяцев, пока не станут достаточно большими, чтобы прыгать!\n" +
                "\n" +
                "\uD83D\uDC3E Прыгают всюду: Кенгуру не ходят, как другие животные. Они прыгают на сильных задних лапах, что позволяет им преодолевать большие расстояния без усталости.\n" +
                "\n" +
                "\uD83D\uDC3E Травоядные: Кенгуру — травоядные и любят поедать траву и листья.\n" +
                "\n" +
                "\uD83D\uDC3E Сонные животные: Кенгуру любят отдыхать в самый жаркий период дня, оставаясь в тени, и активны, когда становится прохладнее.\n" +
                "\n" +
                "Кенгуру — весёлые, сильные и любящие прыгать животные, которые обитают в Австралии! \uD83E\uDD98\uD83C\uDF3F"
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
                            .padding(start = 65.dp)
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
                        painter = painterResource(id = R.drawable.ka1),
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

