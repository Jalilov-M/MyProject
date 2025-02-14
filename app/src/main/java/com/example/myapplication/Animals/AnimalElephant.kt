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
 fun AnimalElephant(navController: NavController) {
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
                        "Elephant",
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
                        painter = painterResource(id = R.drawable.a6),
                        contentDescription = "ImG", contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(5.dp)
                            .size(width = 150.dp, height = 190.dp)
                            .clip(RoundedCornerShape(20.dp))
                    )
                    Text(
                        text = "The elephant (Elephantidae) is the largest land animal on Earth, known for its immense size, intelligence, and distinctive features such as its trunk, large ears, and tusks. There are three species of elephants: the **African bush elephant** (*Loxodonta africana*), the **African forest elephant** (*Loxodonta cyclotis*), and the **Asian elephant** (*Elephas maximus*). African elephants are the largest, with males sometimes weighing over **6,000 kg (13,200 lbs)**, while Asian elephants are slightly smaller in comparison.\n" +
                                "\n" +
                                "Elephants are herbivores, with a diet consisting of grasses, fruits, bark, leaves, and shrubs. Their trunks, which are long, muscular extensions of their upper lip and nose, are incredibly versatile, allowing them to pick up food, drink water, communicate, and even help in social interactions. The trunks also help elephants reach high branches and dig for water.\n" +
                                "\n" +
                                "Elephants are known for their complex social structure. They live in herds led by a matriarch, typically the oldest female, who makes decisions for the group. Herds are usually composed of female elephants and their young, while males tend to leave the herd as they mature. These animals are highly **social and emotional**, often displaying behaviors like grief, joy, and empathy. For example, elephants are known to mourn their dead, sometimes even returning to the remains of deceased herd members.\n" +
                                "\n" +
                                "Elephants have large ears that help regulate their body temperature, as they have a large amount of blood vessels in them. Their tusks, which are elongated incisor teeth, are used for digging, stripping bark from trees, and defending themselves. Unfortunately, these tusks make elephants targets for poaching, as they are highly valued for their ivory. Both African and Asian elephants face serious threats from habitat destruction, human-wildlife conflict, and illegal poaching, leading to a decline in populations, particularly in Asia.\n" +
                                "\n" +
                                "Conservation efforts, including protected areas, anti-poaching laws, and wildlife corridors, are crucial to preserving these magnificent creatures. Elephants play an important ecological role by maintaining the health of their environments, such as spreading seeds and creating waterholes that other animals depend on. They are also revered in many cultures, symbolizing wisdom, strength, and longevity.", Modifier.padding(5.dp), fontSize = 15.sp, textAlign = TextAlign.Justify
                    )
                }
            }
        }
    }
}

