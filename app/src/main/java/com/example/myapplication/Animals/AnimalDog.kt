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
import com.example.myapplication.R
import androidx.navigation.NavController


@Composable
fun AnimalDog(navController: NavController) {
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
                        "Dog",
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
                        painter = painterResource(id = R.drawable.a11),
                        contentDescription = "ImG", contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(5.dp)
                            .size(width = 150.dp, height = 190.dp)
                            .clip(RoundedCornerShape(20.dp))
                    )
                    Text(
                        text = "The dog (Canis lupus familiaris) is one of the most popular and diverse domesticated animals in the world. Known for its loyalty, companionship, and varied roles in human society, dogs have been living alongside humans for thousands of years, evolving from wild ancestors, such as wolves, into the vast array of breeds seen today.\n" +
                                "\n" +
                                "Dogs come in various shapes, sizes, and temperaments, from tiny breeds like the Chihuahua to large ones like the Great Dane. Over time, humans have selectively bred dogs for specific traits, leading to the creation of hundreds of distinct breeds with varying abilities, including herding, hunting, guarding, and companionship. These different breeds also exhibit a wide range of personalities, from energetic and playful to calm and laid-back.\n" +
                                "\n" +
                                "Dogs are omnivores, meaning they can eat a wide variety of foods, including meat, vegetables, and grains. However, their diet should be balanced to meet their nutritional needs, with high-quality dog food often containing protein, fats, vitamins, and minerals.\n" +
                                "\n" +
                                "One of the most defining characteristics of dogs is their social nature. They thrive in the company of humans and other animals, making them excellent pets and companions. Dogs are often trained to assist people with disabilities, such as guide dogs for the blind, or as therapy dogs to provide comfort in hospitals and nursing homes. Many dogs also serve as working animals in roles such as police dogs, search-and-rescue dogs, and herding dogs for livestock.\n" +
                                "\n" +
                                "Dogs have an extraordinary ability to communicate with humans through body language, vocalizations, and expressions. They can learn a wide range of commands and tricks, and their keen sense of smell allows them to detect drugs, explosives, or even illnesses like cancer. Their sense of hearing is also highly developed, making them excellent watchdogs.\n" +
                                "\n" +
                                "Over the centuries, dogs have become not only loyal companions but also symbols of friendship, protection, and unconditional love. They are often featured in stories, folklore, and art as symbols of loyalty and courage. However, despite their domestication, dogs still retain many instincts and behaviors from their wild ancestors, including territoriality, hunting, and pack dynamics.\n" +
                                "\n" +
                                "Dogs' life expectancy ranges from about 10 to 15 years, depending on the breed, size, and overall health. Larger breeds tend to have shorter lifespans, while smaller breeds may live longer. Regular veterinary care, a healthy diet, and plenty of exercise are essential for a dog's well-being.\n" +
                                "\n" +
                                "Today, dogs are beloved around the world, serving as loyal companions, protectors, and helpers in many aspects of human life.",
                        Modifier.padding(5.dp),
                        fontSize = 15.sp,
                        textAlign = TextAlign.Justify
                    )
                }
            }
        }
    }
}

