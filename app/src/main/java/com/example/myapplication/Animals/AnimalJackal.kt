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
 fun AnimalJackal(navController: NavController) {
    var language by remember { mutableStateOf("en") }
    val textMap = mapOf(
        "en" to "Jackals are smart and fast animals that live in Africa and Asia. They look like small wolves and are great at surviving in the wild!\n" +
                "\n" +
                "\uD83D\uDC3E Super Runners: Jackals can run up to 40 km/h (25 mph) and keep running for a long time without getting tired!\n" +
                "\n" +
                "\uD83D\uDC3E Team Hunters: Jackals hunt in pairs or small groups. They help each other find food and protect their territory.\n" +
                "\n" +
                "\uD83D\uDC3E Sharp Ears: Jackals have excellent hearing and can hear small animals moving in the grass, even from far away!\n" +
                "\n" +
                "\uD83D\uDC3E Talkative Animals: Jackals howl, yelp, and bark to talk to each other. Their howls help them call family members from long distances.\n" +
                "\n" +
                "\uD83D\uDC3E Clever Survivors: Jackals eat almost anything—fruits, insects, meat, and even leftovers from bigger animals like lions!\n" +
                "\n" +
                "\uD83D\uDC3E Loyal Families: Jackals stay with the same mate for life and take care of their babies together.\n" +
                "\n" +
                "Jackals are fast, smart, and great at working as a team! \uD83D\uDC15\uD83C\uDF3F",
        "ru" to "Шакалы — умные и быстрые животные, которые живут в Африке и Азии. Они похожи на маленьких волков и отлично выживают в дикой природе!\n" +
                "\n" +
                "\uD83D\uDC3E Быстрые бегуны: Шакалы могут бегать со скоростью до 40 км/ч и долго не устают!\n" +
                "\n" +
                "\uD83D\uDC3E Охотники в команде: Шакалы охотятся парами или небольшими группами. Они помогают друг другу находить еду и защищать территорию.\n" +
                "\n" +
                "\uD83D\uDC3E Отличный слух: У шакалов очень острый слух—они слышат, как маленькие животные шевелятся в траве даже издалека!\n" +
                "\n" +
                "\uD83D\uDC3E Разговорчивые звери: Шакалы воют, лают и визжат, чтобы общаться. Их вой помогает звать сородичей на большие расстояния.\n" +
                "\n" +
                "\uD83D\uDC3E Хитрые выживальщики: Шакалы едят почти всё—фрукты, насекомых, мясо и даже остатки еды от более крупных хищников, например, львов!\n" +
                "\n" +
                "\uD83D\uDC3E Верные семьи: Шакалы живут с одним партнёром всю жизнь и вместе заботятся о детёнышах.\n" +
                "\n" +
                "Шакалы — умные, быстрые и отличные командные игроки! \uD83D\uDC15\uD83C\uDF3F"
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
                        "Jackal",
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
                        painter = painterResource(id = R.drawable.a99),
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

