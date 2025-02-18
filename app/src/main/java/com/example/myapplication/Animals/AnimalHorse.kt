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
 fun AnimalHorse(navController: NavController) {
    var language by remember { mutableStateOf("en") }
    val textMap = mapOf(
        "en" to "Horses are graceful, strong, and fast animals that have been helping humans for thousands of years. They live on farms, in stables, and even in the wild!\n" +
                "\n" +
                "\uD83D\uDC3E Fast Runners: Horses can run up to 70 km/h (43 mph) in short bursts! That’s faster than most cars can go in a city!\n" +
                "\n" +
                "\uD83D\uDC3E Super Strong: Horses can carry heavy loads, and some are even used for pulling carts or plows. Their muscles help them carry people and do hard work.\n" +
                "\n" +
                "\uD83D\uDC3E Long Faces: Horses have long, beautiful faces with large, expressive eyes. Their eyes are located on the side of their heads, which helps them see all around them!\n" +
                "\n" +
                "\uD83D\uDC3E Excellent Ears: Horses have big, sensitive ears that can move in different directions. They use their ears to listen for sounds and show how they’re feeling!\n" +
                "\n" +
                "\uD83D\uDC3E Horses Sleep Standing Up: Horses can sleep while standing because they have special muscles that lock their legs in place. But they need to lie down for deeper sleep.\n" +
                "\n" +
                "\uD83D\uDC3E Mane and Tail: A horse’s mane and tail are made of long, flowing hair. They help keep flies and bugs away from their bodies.\n" +
                "\n" +
                "\uD83D\uDC3E Friendly and Smart: Horses are very intelligent and can learn new tricks and tasks. Many horses are also friendly and enjoy spending time with people.\n" +
                "\n" +
                "Horses are beautiful, strong, and wonderful companions! \uD83D\uDC34\uD83C\uDF3F",
        "ru" to "Лошади — грациозные, сильные и быстрые животные, которые помогают людям уже тысячи лет. Они живут на фермах, в конюшнях и даже в дикой природе!\n" +
                "\n" +
                "\uD83D\uDC3E Быстрые бегуны: Лошади могут бегать со скоростью до 70 км/ч на короткие дистанции! Это быстрее, чем большинство машин в городе!\n" +
                "\n" +
                "\uD83D\uDC3E Очень сильные: Лошади могут нести тяжёлые грузы, а некоторые используются для транспортировки тележек и плугов. Их мышцы помогают им нести людей и выполнять тяжёлую работу.\n" +
                "\n" +
                "\uD83D\uDC3E Длинные морды: У лошадей длинные, красивые морды с большими выразительными глазами. Их глаза расположены по бокам головы, что помогает им видеть всё вокруг!\n" +
                "\n" +
                "\uD83D\uDC3E Отличные уши: У лошадей большие чувствительные уши, которые могут двигаться в разные стороны. Они используют уши, чтобы слушать звуки и показывать своё настроение!\n" +
                "\n" +
                "\uD83D\uDC3E Лошади спят стоя: Лошади могут спать стоя, потому что у них есть особые мышцы, которые фиксируют их ноги. Но для глубокого сна им нужно ложиться.\n" +
                "\n" +
                "\uD83D\uDC3E Грива и хвост: Грива и хвост лошади состоят из длинных, шелковистых волос. Они помогают защищаться от мух и насекомых.\n" +
                "\n" +
                "\uD83D\uDC3E Дружелюбные и умные: Лошади очень умные и могут учить новые трюки и задачи. Многие лошади также дружелюбны и любят проводить время с людьми.\n" +
                "\n" +
                "Лошади — красивые, сильные и замечательные спутники! \uD83D\uDC34\uD83C\uDF3F"
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
                        "Horse",
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
                        painter = painterResource(id = R.drawable.ho1),
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

