package com.example.myapplication.Animals

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
 fun AnimalLion(navController: NavController) {
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
                        "Lion",
                        Modifier.padding(start = 20.dp),
                        fontSize = 32.sp,
                        fontStyle = FontStyle.Italic,
                        color = Color.White
                    )
                    Image(
                        painter = painterResource(id = R.drawable.ico),
                        contentDescription = "ImG", contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .padding(5.dp)
                            .padding(start = 150.dp)
                            .size(35.dp)
                            .clip(RoundedCornerShape(20.dp))
                    )
                }
            }
            Box() {
                Column(Modifier.verticalScroll(rememberScrollState())) {
                    Image(
                        painter = painterResource(id = R.drawable.an3),
                        contentDescription = "ImG", contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(5.dp)
                            .size(width = 150.dp, height = 190.dp)
                            .clip(RoundedCornerShape(20.dp))
                    )
                    Text(
                        text = "The lion AnimalWolf.ktis one of the most powerful and iconic big cats, known for its majestic mane, strong social structure, and commanding presence. Unlike most wild cats, lions are highly social and live in groups called **prides**, which typically consist of related lionesses, their cubs, and a few dominant males. These prides work together to protect their territory and hunt prey, making lions unique among big cats.  \n" +
                                "\n" +
                                "Lions are found in **savannas, grasslands, and open woodlands**, primarily in Africa, with a small, endangered population in India’s Gir Forest. They are **apex predators**, preying on animals like zebras, wildebeests, and buffalos. Lionesses are the primary hunters, using teamwork to take down large prey, while males defend the pride and their territory from rivals.  \n" +
                                "\n" +
                                "A male lion’s **mane** is a symbol of strength and dominance, with darker, fuller manes often attracting more mates and intimidating rivals. Their deep, thunderous **roar** can be heard up to **8 kilometers (5 miles) away**, serving as a warning to intruders or a call to pride members.  \n" +
                                "\n" +
                                "Despite their reputation as \"kings of the jungle,\" lions face major threats, including habitat loss, human conflict, and poaching. Their populations have significantly declined, and conservation efforts focus on protecting their habitats and reducing conflicts with local communities.  \n" +
                                "\n" +
                                "Lions have been revered in human culture for centuries, symbolizing courage, leadership, and power. From ancient myths and royal emblems to modern wildlife conservation campaigns, lions continue to be one of the most respected and admired animals in the world.", Modifier.padding(5.dp), fontSize = 15.sp, textAlign = TextAlign.Justify
                    )
                }
            }
        }
    }
}

