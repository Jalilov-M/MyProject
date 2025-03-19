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
 fun AnimalCat(navController: NavController) {
    var language by remember { mutableStateOf("en") }
    val nameMao= mapOf(
        "en" to "Cat      ",
        "ru" to "Кошкa")
    val textMap = mapOf(
        "en" to "Cats are small, furry animals that love to play, jump, and explore! They can be pets or live in the wild. Some cats, like lions and tigers, are big, but house cats are small and friendly.\n" +
                "\n" +
                "\uD83D\uDC3E Purring Power: Cats purr when they are happy and relaxed. Some even purr to comfort themselves!\n" +
                "\n" +
                "\uD83D\uDC3E Super Jumpers: Cats can jump six times their body length in one leap! That helps them catch things and climb high places.\n" +
                "\n" +
                "\uD83D\uDC3E Night Vision: Cats can see in the dark much better than humans. This helps them hunt at night!\n" +
                "\n" +
                "\uD83D\uDC3E Whisker Magic: A cat's whiskers help them feel things around them, even in the dark. If their whiskers touch something, they know not to bump into it!\n" +
                "\n" +
                "\uD83D\uDC3E Fast Cleaners: Cats lick their fur to keep themselves clean. They don’t need baths like dogs!\n" +
                "\n" +
                "Cats are cute, playful, and love to sleep a lot—sometimes up to 16 hours a day! \uD83D\uDC31\uD83D\uDCA4",
        "ru" to "Кошки — это маленькие, пушистые животные, которые любят играть, прыгать и исследовать мир! Они могут быть домашними или жить в дикой природе. Некоторые кошки, например львы и тигры, очень большие, но домашние кошки маленькие и дружелюбные.\n" +
                "\n" +
                "\uD83D\uDC3E Мурчание: Кошки мурчат, когда они счастливы и расслаблены. А иногда — чтобы себя успокоить!\n" +
                "\n" +
                "\uD83D\uDC3E Суперпрыгуны: Кошки могут прыгать в шесть раз дальше своей длины! Это помогает им ловить добычу и забираться на высокие места.\n" +
                "\n" +
                "\uD83D\uDC3E Ночное зрение: Кошки видят в темноте гораздо лучше людей. Это помогает им охотиться ночью!\n" +
                "\n" +
                "\uD83D\uDC3E Усы-навигаторы: Кошачьи усы помогают им чувствовать пространство вокруг, даже в темноте. Если усы касаются чего-то, кошка понимает, что рядом препятствие!\n" +
                "\n" +
                "\uD83D\uDC3E Чистюли: Кошки умываются языком и не нуждаются в частых купаниях, как собаки.\n" +
                "\n" +
                "Кошки милые, игривые и обожают спать — до 16 часов в день! \uD83D\uDC31\uD83D\uDCA4"
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
                            .padding(start = 110.dp)
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
                        painter = painterResource(id = R.drawable.a12),
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

