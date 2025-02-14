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
 fun AnimalCat(navController: NavController) {
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
                        "Cat",
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
                        painter = painterResource(id = R.drawable.a12),
                        contentDescription = "ImG", contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(5.dp)
                            .size(width = 150.dp, height = 190.dp)
                            .clip(RoundedCornerShape(20.dp))
                    )
                    Text(
                        text = "The cat (Felis catus) is one of the most popular and beloved pets worldwide, known for its independence, agility, and mysterious charm. Cats are descendants of wild cats, particularly the African wildcat (Felis lybica), and have been living alongside humans for thousands of years, primarily as hunters and companions.\n" +
                                "\n" +
                                "Cats are carnivores, meaning their diet mainly consists of meat, though some may also eat small amounts of plants. They are skilled hunters and use their sharp claws and keen senses of sight, smell, and hearing to catch small prey, such as mice, birds, and insects. Their retractable claws help them climb and catch prey, while their sharp teeth are designed for cutting and tearing meat.\n" +
                                "\n" +
                                "Cats are often seen as more independent than dogs, although they can form strong bonds with their owners. They are generally solitary hunters and may prefer to spend time alone, especially when resting or eating. However, many cats also enjoy the company of their human companions, and they often show affection through purring, rubbing, and kneading. Cats are also known for their grooming behavior, spending a significant amount of time cleaning their fur with their rough tongues.\n" +
                                "\n" +
                                "There are many breeds of domestic cats, ranging from short-haired to long-haired, with varying colors and patterns. Each breed has its own personality traits, with some being more outgoing and social, while others may be more reserved or playful. Cats are also known for their curiosity, often exploring their environment with a sense of adventure.\n" +
                                "\n" +
                                "Cats communicate with humans and other animals through body language, vocalizations, and facial expressions. They may purr to show contentment, hiss or growl when threatened, and meow to communicate with their owners. Each cat has its own set of behaviors, and over time, cats can form strong emotional connections with their owners.\n" +
                                "\n" +
                                "Unlike dogs, cats are not typically trained to perform tasks, but they can learn to follow commands, use a litter box, and interact with toys. Cats are generally more low-maintenance than dogs, but they still require attention, proper nutrition, and regular veterinary care to stay healthy.\n" +
                                "\n" +
                                "A cat's life expectancy ranges from 12 to 16 years, though many cats can live well into their 20s with good care. Common health issues in cats include dental problems, obesity, and urinary tract diseases.\n" +
                                "\n" +
                                "Cats have been revered in many cultures, often seen as symbols of mystery, grace, and independence. In ancient Egypt, for example, cats were sacred and even worshiped. Today, they continue to be cherished as playful, loving, and independent companions, providing joy and comfort to their owners.", Modifier.padding(5.dp), fontSize = 15.sp, textAlign = TextAlign.Justify
                    )
                }
            }
        }
    }
}

