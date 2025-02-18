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
fun AnimalCow(navController: NavController) {
    var language by remember { mutableStateOf("en") }

    val textMap = mapOf(
        "en" to "Cows are gentle, social, and important animals on farms all over the world. They provide us with milk, meat, and are loved for their calm nature.\n" +
                "\n" +
                "\uD83D\uDC3E Milk Makers: Cows are known for producing milk, which we drink, and it’s also used to make cheese, butter, and yogurt! A cow can drink up to 100 liters (26 gallons) of water a day to stay healthy.\n" +
                "\n" +
                "\uD83D\uDC3E Big Ears and Eyes: Cows have big eyes and sensitive ears that can move in different directions to listen for sounds all around them.\n" +
                "\n" +
                "\uD83D\uDC3E Social Animals: Cows are very social and like to stay in groups. They have close friendships with other cows and can even recognize their friends after being apart for a long time.\n" +
                "\n" +
                "\uD83D\uDC3E Good Memory: Cows have a good memory and can remember things for a long time, like the places where they’ve been or the faces of other cows.\n" +
                "\n" +
                "\uD83D\uDC3E Mooing Sounds: Cows make a sound called mooing to communicate with each other. Each cow has a unique moo, like a voiceprint!\n" +
                "\n" +
                "\uD83D\uDC3E Eating Machines: Cows eat a lot! They spend 6–8 hours a day eating and can chew their food over 40,000 times a day!\n" +
                "\n" +
                "\uD83D\uDC3E Large Bodies: Cows can weigh between 500 to 900 kg (1100 to 2000 lbs), and they have four stomachs to help them digest their food.\n" +
                "\n" +
                "Cows are gentle, social, and hardworking animals that help us in many ways! \uD83D\uDC04\uD83C\uDF3E\n" +
                "\n",
        "ru" to "Коровы — дружелюбные, социальные и важные животные на фермах по всему миру. Они дают нам молоко, мясо и любимы за их спокойный характер.\n" +
                "\n" +
                "\uD83D\uDC3E Производители молока: Коровы известны тем, что дают молоко, которое мы пьем, и из которого делают сыр, масло и йогурт! Коровы могут пить до 100 литров воды в день, чтобы оставаться здоровыми.\n" +
                "\n" +
                "\uD83D\uDC3E Большие глаза и уши: У коров большие глаза и чувствительные уши, которые могут двигаться в разные стороны, чтобы услышать звуки вокруг.\n" +
                "\n" +
                "\uD83D\uDC3E Социальные животные: Коровы очень социальные и любят оставаться в группах. У них есть близкие дружбы с другими коровами, и они могут узнавать своих друзей, даже если долго не виделись.\n" +
                "\n" +
                "\uD83D\uDC3E Хорошая память: Коровы обладают хорошей памятью и могут запомнить вещи надолго, например, места, где они были, или лица других коров.\n" +
                "\n" +
                "\uD83D\uDC3E Мычание: Коровы издают звук, который называется мычание, чтобы общаться между собой. У каждой коровы есть уникальное мычание, как отпечаток голоса!\n" +
                "\n" +
                "\uD83D\uDC3E Много едят: Коровы много едят! Они тратят 6–8 часов в день на поедание пищи и могут жевать более 40 000 раз за день!\n" +
                "\n" +
                "\uD83D\uDC3E Большие тела: Коровы могут весить от 500 до 900 кг и имеют четыре желудка для переваривания пищи.\n" +
                "\n" +
                "Коровы — дружелюбные, социальные и трудолюбивые животные, которые помогают нам во многих вещах! \uD83D\uDC04\uD83C\uDF3E"
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
                    }) {
                        Icon(Icons.Filled.ArrowBack, "Back", tint = Color.White
                        , modifier = Modifier
                                .clickable { navController.popBackStack() }
                        )


                    }


                    Text(
                        "Cow",
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
                            .clip(RoundedCornerShape(20.dp))
                            .padding(5.dp)
                            .padding(start = 1.dp)
                            .size(35.dp)
                            .clickable { language="en" }

                    )
                }
            }
            Box() {
                Column(Modifier.verticalScroll(rememberScrollState())) {
                    Image(
                        painter = painterResource(id = R.drawable.co1),
                        contentDescription = "ImG", contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(5.dp)
                            .size(width = 150.dp, height = 190.dp)
                            .clip(RoundedCornerShape(20.dp))
                    )
                    Text(
                        text = textMap[language] ?: "",
                        Modifier.padding(10.dp),
                        fontSize = 15.sp,
                        textAlign = TextAlign.Justify
                    )
                }
            }
        }
    }
}

