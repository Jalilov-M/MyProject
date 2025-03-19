package com.example.myapplication.Animals

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
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
fun AnimalBear(navController: NavController) {
    var language by remember { mutableStateOf("en") }
    val nameMao = mapOf(
        "en" to "Bear      ",
        "ru" to "Медвед"
    )
    val textMap = mapOf(
        "en" to "Bears are big, strong, and fluffy animals that live in forests, mountains, and even icy places! There are different kinds of bears, like brown bears, black bears, and polar bears. Some, like pandas, love to eat bamboo, while others enjoy honey, berries, fish, and even insects!\n" +
                "\n" +
                "\uD83D\uDC3E Hibernation: Some bears sleep all winter in their dens. This is called hibernation, and it helps them save energy when it's cold and there’s little food.\n" +
                "\n" +
                "\uD83D\uDC3E Super Sniffers: Bears have an amazing sense of smell—even better than dogs! They can smell food from far, far away.\n" +
                "\n" +
                "\uD83D\uDC3E Bear Cubs: Baby bears are called cubs. They are born tiny and stay close to their mother, learning how to find food and stay safe.\n" +
                "\n" +
                "\uD83D\uDC3E Fast & Strong: Even though bears look slow, they can run really fast—some as fast as a horse! They are also great at climbing trees and swimming.\n" +
                "\n" +
                "But remember, bears are wild animals and should be respected. They are best watched from a safe distance or in nature videos! \uD83C\uDF3F\uD83D\uDC3B\n" +
                "\n" +
                "\n",
        "ru" to "Медведи — это большие, сильные и пушистые животные, которые живут в лесах, горах и даже в снегах! Бывают бурые, чёрные и белые медведи. Некоторые, как панды, любят кушать бамбук, а другие — мёд, ягоды, рыбу и даже насекомых!\n" +
                "\n" +
                "\uD83D\uDC3E Спячка: Некоторые медведи спят всю зиму в своих берлогах. Это называется спячка, и она помогает им сохранять силы, когда холодно и мало еды.\n" +
                "\n" +
                "\uD83D\uDC3E Супер-нюх: У медведей потрясающий нюх — лучше, чем у собак! Они могут учуять еду издалека.\n" +
                "\n" +
                "\uD83D\uDC3E Медвежата: Маленькие медведи называются медвежатами. Они рождаются крошечными и сначала живут с мамой, которая учит их находить еду и защищаться.\n" +
                "\n" +
                "\uD83D\uDC3E Быстрые и сильные: Хотя медведи кажутся медлительными, они могут бегать так же быстро, как лошади! А ещё они отлично лазают по деревьям и плавают.\n" +
                "\n" +
                "Но помните, что медведи — дикие животные, и их лучше наблюдать издалека или в интересных видео про природу! \uD83C\uDF3F\uD83D\uDC3B"
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
                        Icon(Icons.Filled.ArrowBack, "Back", tint = Color.White, modifier = Modifier
                            .clickable { navController.popBackStack() }
                        )


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
                            .padding(start = 85.dp)
                            .clip(RoundedCornerShape(20.dp))

                            .size(35.dp)
                            .clickable { language = "ru" }

                    )
                    Image(
                        painter = painterResource(id = R.drawable.en),
                        contentDescription = "English", contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .clip(RoundedCornerShape(20.dp))
                            .padding(5.dp)
                            .padding(start = 1.dp)
                            .size(35.dp)
                            .clickable { language = "en" }

                    )

                }
            }
            Box() {
                Column(Modifier.verticalScroll(rememberScrollState())) {
                    Row(Modifier.horizontalScroll(rememberScrollState())) {
                        Image(
                            painter = painterResource(id = R.drawable.a5),
                            contentDescription = "ImG", contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(5.dp)
                                .size(width = 340.dp, height = 190.dp)
                                .clip(RoundedCornerShape(20.dp))
                        )
                        Image(
                            painter = painterResource(id = R.drawable.b2),
                            contentDescription = "ImG", contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(5.dp)
                                .size(width = 320.dp, height = 190.dp)
                                .clip(RoundedCornerShape(20.dp))
                        )
                        Image(
                            painter = painterResource(id = R.drawable.b3),
                            contentDescription = "ImG", contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(5.dp)
                                .size(width = 320.dp, height = 190.dp)
                                .clip(RoundedCornerShape(20.dp))
                        )
                        Image(
                            painter = painterResource(id = R.drawable.b4),
                            contentDescription = "ImG", contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(5.dp)
                                .size(width = 320.dp, height = 190.dp)
                                .clip(RoundedCornerShape(20.dp))
                        )
                        Image(
                            painter = painterResource(id = R.drawable.b5),
                            contentDescription = "ImG", contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(5.dp)
                                .size(width = 320.dp, height = 190.dp)
                                .clip(RoundedCornerShape(20.dp))
                        )
                    }

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

