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
 fun AnimalFox(navController: NavController) {
    var language by remember { mutableStateOf("en") }
    val nameMao= mapOf(
        "en" to "Fox   ",
        "ru" to "Лисa")
    val textMap = mapOf(
        "en" to "Foxes are smart, playful, and curious animals that live in forests, mountains, and even cities! They are part of the dog family but act more like cats!\n" +
                "\n" +
                "\uD83D\uDC3E Super Hearing: Foxes can hear tiny sounds, even a mouse moving under deep snow! This helps them find food even in winter.\n" +
                "\n" +
                "\uD83D\uDC3E Night Explorers: Foxes are nocturnal, which means they sleep during the day and are most active at night.\n" +
                "\n" +
                "\uD83D\uDC3E Fluffy Tail: A fox’s tail, called a \"brush,\" helps it stay warm in winter. Foxes even wrap their tails around themselves like a blanket when they sleep!\n" +
                "\n" +
                "\uD83D\uDC3E Fox Talk: Foxes make more than 40 different sounds! They can bark, yelp, chirp, and even scream to talk to each other.\n" +
                "\n" +
                "\uD83D\uDC3E Jumping Masters: Foxes are great jumpers! They can leap over fences and pounce high into the air to catch their food.\n" +
                "\n" +
                "\uD83D\uDC3E Clever Tricksters: Foxes are known for being very smart! They use clever tricks to escape danger and find food.\n" +
                "\n" +
                "\uD83D\uDC3E Loners: Unlike wolves, foxes don’t live in big packs. They usually hunt alone but take care of their babies, called kits, until they grow up.\n" +
                "\n" +
                "Foxes are cute, curious, and full of surprises! \uD83E\uDD8A\uD83C\uDF42",
        "ru" to "Лисы — умные, игривые и любопытные животные, которые живут в лесах, горах и даже рядом с людьми! Они принадлежат к семейству собак, но во многом ведут себя, как кошки!\n" +
                "\n" +
                "\uD83D\uDC3E Отличный слух: Лисы могут слышать даже мышь, двигающуюся под толстым слоем снега! Это помогает им находить еду зимой.\n" +
                "\n" +
                "\uD83D\uDC3E Ночные охотники: Лисы ведут ночной образ жизни—днём они спят, а ночью выходят искать еду.\n" +
                "\n" +
                "\uD83D\uDC3E Пушистый хвост: Лисий хвост, который называют \"кистью\", помогает сохранять тепло. Лисы даже закутываются в него, как в одеяло, когда спят!\n" +
                "\n" +
                "\uD83D\uDC3E Разговоры лис: Лисы умеют издавать более 40 разных звуков! Они могут лаять, визжать, чирикать и даже \"кричать\", общаясь друг с другом.\n" +
                "\n" +
                "\uD83D\uDC3E Прыгуны: Лисы отлично прыгают! Они могут перепрыгивать заборы и высоко подпрыгивать, чтобы поймать добычу.\n" +
                "\n" +
                "\uD83D\uDC3E Хитрые охотники: Лисы известны своей находчивостью и хитростью! Они придумывают умные способы избегать опасности и находить еду.\n" +
                "\n" +
                "\uD83D\uDC3E Одиночки: В отличие от волков, лисы не живут в стаях. Они охотятся в одиночку, но заботятся о своих детёнышах, которых называют лисятами, пока те не вырастут.\n" +
                "\n" +
                "Лисы — удивительные, ловкие и умные животные, которые всегда находят выход из любой ситуации! \uD83E\uDD8A\uD83C\uDF42"
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
                            .padding(start = 120.dp)
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
                        painter = painterResource(id = R.drawable.an4),
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

