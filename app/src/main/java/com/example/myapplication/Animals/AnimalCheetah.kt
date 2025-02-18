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
 fun AnimalCheetah(navController: NavController) {
    var language by remember { mutableStateOf("en") }
    val textMap = mapOf(
        "en" to "Cheetahs are the fastest animals on land! They can run as fast as a car on a highway—up to 120 km/h (75 mph)! But they can only run that fast for a short time.\n" +
                "\n" +
                "\uD83D\uDC3E Super Speed: Cheetahs can go from 0 to 100 km/h (62 mph) in just 3 seconds—faster than most sports cars!\n" +
                "\n" +
                "\uD83D\uDC3E Spots for Camouflage: Their black spots help them hide in the tall grass and sneak up on their food.\n" +
                "\n" +
                "\uD83D\uDC3E Tear Marks: Cheetahs have black lines on their faces, like \"tears.\" These help protect their eyes from the sun, like built-in sunglasses!\n" +
                "\n" +
                "\uD83D\uDC3E They Don’t Roar: Unlike lions and tigers, cheetahs don’t roar—they purr, chirp, and even meow!\n" +
                "\n" +
                "\uD83D\uDC3E Fast but Not Strong: Cheetahs are built for speed, not fighting. Unlike other big cats, they can’t climb trees or fight off bigger animals.\n" +
                "\n" +
                "Cheetahs are amazing runners and love open spaces. They are some of the coolest cats in the wild! \uD83D\uDC06\uD83C\uDF3F\n" +
                "\n",
        "ru" to "Гепарды — самые быстрые животные на земле! Они могут разгоняться до 120 км/ч, как машина на трассе! Но бегать так быстро они могут только недолго.\n" +
                "\n" +
                "\uD83D\uDC3E Суперскорость: Гепарды разгоняются от 0 до 100 км/ч всего за 3 секунды—быстрее, чем спортивные автомобили!\n" +
                "\n" +
                "\uD83D\uDC3E Пятна для маскировки: Чёрные пятнышки помогают гепардам прятаться в траве и незаметно подкрадываться к добыче.\n" +
                "\n" +
                "\uD83D\uDC3E Слёзные полоски: У гепардов есть чёрные линии на мордочке, похожие на слёзы. Они защищают глаза от солнца—как встроенные солнцезащитные очки!\n" +
                "\n" +
                "\uD83D\uDC3E Они не рычат: В отличие от львов и тигров, гепарды не рычат—они мурлычут, чирикают и даже мяукают!\n" +
                "\n" +
                "\uD83D\uDC3E Быстрые, но не сильные: Гепарды созданы для скорости, а не для борьбы. Они не умеют лазить по деревьям и избегают драки с сильными животными.\n" +
                "\n" +
                "Гепарды—удивительные бегуны, которые любят просторные равнины. Это одни из самых крутых кошек в дикой природе! \uD83D\uDC06\uD83C\uDF3F"
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
                        "Cheetah",
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
                            .padding(start = 85.dp)
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
                        painter = painterResource(id = R.drawable.a101),
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

