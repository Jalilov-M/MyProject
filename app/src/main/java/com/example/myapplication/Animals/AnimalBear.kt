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
                        Icon(Icons.Filled.ArrowBack, "Back", tint = Color.White
                        , modifier = Modifier
                                .clickable { navController.popBackStack() }
                        )


                    }


                    Text(
                        "Bear",
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
                        painter = painterResource(id = R.drawable.a5),
                        contentDescription = "ImG", contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(5.dp)
                            .size(width = 150.dp, height = 190.dp)
                            .clip(RoundedCornerShape(20.dp))
                    )
                    Text(
                        text = "The bear (Ursidae) is a large, powerful mammal known for its strength, intelligence, and adaptability. There are eight species of bears found across North America, South America, Europe, and Asia, with the most well-known being the brown bear, polar bear, and black bear. Bears vary in size and behavior, but most have thick fur, strong claws, and an excellent sense of smell, which helps them locate food over long distances.\n" +
                                "\n" +
                                "Bears are omnivores, meaning they eat both plants and meat. Their diet depends on the species and habitat—while polar bears primarily hunt seals, brown bears and black bears eat berries, fish, small mammals, and honey. Some species, like the giant panda, rely almost entirely on bamboo.\n" +
                                "\n" +
                                "Most bears are solitary animals, except during mating season or when a mother is raising cubs. Despite their large size, they can run fast, climb trees, and even swim well. Hibernation is another key feature of some bear species, such as the grizzly bear, which enters a deep sleep during winter to survive harsh conditions.\n" +
                                "\n" +
                                "Bears play important roles in ecosystems by spreading seeds, controlling prey populations, and maintaining balance in their habitats. However, they face threats from habitat loss, climate change, and illegal hunting. Conservation efforts are crucial to protecting bear populations, especially species like the polar bear, which is endangered due to melting ice in the Arctic.\n" +
                                "\n" +
                                "Bears have been symbols of strength, courage, and wisdom in many cultures, appearing in myths, folklore, and even modern wildlife conservation campaigns.",
                        Modifier.padding(5.dp),
                        fontSize = 15.sp,
                        textAlign = TextAlign.Justify
                    )
                }
            }
        }
    }
}

