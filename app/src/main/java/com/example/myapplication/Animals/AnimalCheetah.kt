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
 fun AnimalCheetah(navController: NavController) {
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
                        painter = painterResource(id = R.drawable.a101),
                        contentDescription = "ImG", contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(5.dp)
                            .size(width = 150.dp, height = 190.dp)
                            .clip(RoundedCornerShape(20.dp))
                    )
                    Text(
                        text = "The cheetah (Acinonyx jubatus) is a large, agile cat known for being the fastest land animal, capable of reaching speeds of up to 100 km/h (62 mph) in short bursts. This extraordinary speed allows it to catch fast prey, such as gazelles, impalas, and other small to medium-sized ungulates, in a quick sprint after a short chase. Cheetahs are found primarily in sub-Saharan Africa, though there are small populations in Iran.\n" +
                                "\n" +
                                "Cheetahs are built for speed, with a slender body, long legs, and flexible spine that allow them to stretch their bodies out during high-speed chases. Their large nasal passages and enlarged heart help them get enough oxygen during intense bursts of speed. Unlike other big cats, cheetahs do not have retractable claws, which provide better grip while running at high speeds. Their tail, long and muscular, is used for steering and maintaining balance during high-speed pursuits.\n" +
                                "\n" +
                                "Cheetahs have distinctive black tear marks under their eyes, which help reduce glare from the sun, and they have unique spotted coats that provide camouflage in their grassy, open habitats. Their sharp vision, especially in the daylight, allows them to spot potential prey from great distances.\n" +
                                "\n" +
                                "Unlike other big cats, cheetahs are solitary or live in small family groups. Males are more independent, often forming loose coalitions, usually made up of brothers. Females tend to live alone, except when they are raising their cubs. Cheetah cubs are particularly vulnerable in their early life, and their survival rate is low due to predation by larger carnivores, like lions and hyenas.\n" +
                                "\n" +
                                "Cheetahs typically rely on stealth to get as close as possible to their prey before launching a chase. Their hunts are very energy-intensive, lasting only a few minutes, as they cannot sustain high speeds for long. Once a cheetah catches its prey, it needs to rest before consuming it because of the energy spent during the chase.\n" +
                                "\n" +
                                "Despite being incredible predators, cheetahs face significant threats. Habitat loss, human-wildlife conflict, and inbreeding due to low genetic diversity have led to a decline in their population. They are currently classified as vulnerable, with fewer than 7,000 cheetahs remaining in the wild.\n" +
                                "\n" +
                                "Cheetahs have been admired for their elegance and speed, symbolizing agility, grace, and precision in many cultures. Their unique abilities make them one of the most fascinating and admired animals in the animal kingdom.", Modifier.padding(5.dp), fontSize = 15.sp, textAlign = TextAlign.Justify
                    )
                }
            }
        }
    }
}

