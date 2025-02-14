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
 fun AnimalFox(navController: NavController) {
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
                        "Fox",
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
                        painter = painterResource(id = R.drawable.an4),
                        contentDescription = "ImG", contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(5.dp)
                            .size(width = 150.dp, height = 190.dp)
                            .clip(RoundedCornerShape(20.dp))
                    )
                    Text(
                        text = "The fox (Vulpes) is a small to medium-sized carnivorous mammal known for its intelligence, agility, and adaptability. Foxes belong to the **Canidae** family, which also includes wolves and dogs, but they are distinguished by their slender bodies, bushy tails, pointed ears, and sharp facial features. The most common species is the **red fox** (*Vulpes vulpes*), which is found across North America, Europe, Asia, and even parts of North Africa.  \n" +
                                "\n" +
                                "Foxes are highly adaptable and can thrive in **forests, grasslands, mountains, deserts, and even urban areas**. They are opportunistic omnivores, feeding on small mammals, birds, insects, fruits, and even scavenging from human settlements when necessary. Their sharp senses of hearing and smell help them locate prey even under snow or thick vegetation.  \n" +
                                "\n" +
                                "Unlike wolves and lions, foxes are solitary hunters, meaning they do not rely on packs for survival. However, they do form small family groups during the breeding season, and both parents often take care of the cubs. Foxes use high-pitched barks, yelps, and body language to communicate with each other.  \n" +
                                "\n" +
                                "One of the most recognizable features of a fox is its bushy tail, also known as a brush, which helps with balance and warmth. Foxes are also famous for their cunning nature, often outsmarting predators and humans alike, which has made them a common character in folklore and mythology around the world.  \n" +
                                "\n" +
                                "Fox populations are generally stable, but they face threats such as habitat destruction, hunting, and diseases like rabies. Despite this, their adaptability has allowed them to thrive in a wide range of environments, including cities, where they have learned to coexist with humans.", Modifier.padding(5.dp), fontSize = 15.sp, textAlign = TextAlign.Justify
                    )
                }
            }
        }
    }
}

