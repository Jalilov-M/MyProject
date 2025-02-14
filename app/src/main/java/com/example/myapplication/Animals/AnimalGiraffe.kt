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
 fun AnimalGriraffe  (navController: NavController) {
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
                        "Giraffe",
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
                        painter = painterResource(id = R.drawable.a88),
                        contentDescription = "ImG", contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(5.dp)
                            .size(width = 0.dp, height = 190.dp)
                            .clip(RoundedCornerShape(20.dp))
                    )
                    Text(
                        text = "The giraffe (Giraffa camelopardalis) is the tallest land animal in the world, known for its long neck, distinctive spotted coat, and graceful, yet awkward, movements. Giraffes are native to Africa, where they inhabit savannas, grasslands, and open woodlands. They have adapted well to life in areas with sparse vegetation, relying on their height to feed on leaves and fruits from the tops of trees, particularly acacia trees.\n" +
                                "\n" +
                                "Giraffes can grow up to 5.5 meters (18 feet) tall for males and 4.3 meters (14 feet) for females, with their long necks accounting for much of their height. Despite their size, giraffes can run at speeds of up to 56 km/h (35 mph) in short bursts when threatened by predators. They are also capable swimmers, though they generally avoid water.\n" +
                                "\n" +
                                "One of the most distinctive features of giraffes is their coat pattern, which consists of irregular brown patches separated by lighter-colored areas. This pattern is unique to each individual, much like human fingerprints. Their long necks are composed of seven vertebrae, the same number as most mammals, but each vertebra is much longer. This adaptation allows them to reach food that other herbivores cannot access, giving them a unique advantage in their environment.\n" +
                                "\n" +
                                "Giraffes are social animals, often found in loose herds that vary in size and composition. These herds are generally made up of females and their young, while males tend to be more solitary, especially as they reach adulthood. Males engage in necking contests, where they swing their necks to strike each other with their heads in competition for dominance or mating rights.\n" +
                                "\n" +
                                "Giraffes primarily feed on leaves, especially those of acacia trees, but they also consume fruit, flowers, and herbs. Their long, prehensile tongues (about 45 cm, or 18 inches long) are adapted to grasp and strip leaves from trees.\n" +
                                "\n" +
                                "While giraffes are not currently endangered, they face threats from habitat loss, poaching, and human-wildlife conflict. The populations of giraffes have been declining, particularly in parts of East Africa, and several subspecies are classified as vulnerable or endangered. Conservation efforts aim to protect giraffes through habitat restoration, anti-poaching measures, and conservation education.\n" +
                                "\n" +
                                "Giraffes have been a symbol of grace, elegance, and uniqueness in many cultures and are beloved by people around the world for their towering presence and gentle nature.", Modifier.padding(5.dp), fontSize = 15.sp, textAlign = TextAlign.Justify
                    )
                }
            }
        }
    }
}

