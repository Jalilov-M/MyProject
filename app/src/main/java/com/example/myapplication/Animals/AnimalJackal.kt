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
 fun AnimalJackal(navController: NavController) {
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
                        "Jackal",
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
                        painter = painterResource(id = R.drawable.a99),
                        contentDescription = "ImG", contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(5.dp)
                            .size(width = 150.dp, height = 190.dp)
                            .clip(RoundedCornerShape(20.dp))
                    )
                    Text(
                        text = "The jackal (Canis aureus and related species) is a medium-sized carnivorous mammal belonging to the Canidae family, which also includes wolves, foxes, and domestic dogs. Jackals are highly adaptable animals found in Africa, Asia, and parts of the Middle East. There are several species of jackals, including the golden jackal (Canis aureus), the black-backed jackal (Canis mesomelas), and the side-striped jackal (Canis adustus), each inhabiting different regions and exhibiting slight behavioral differences.\n" +
                                "\n" +
                                "Jackals are known for their versatile diet. While primarily carnivorous, they are also opportunistic feeders, eating whatever they can find, including small mammals, birds, reptiles, and insects. They are skilled scavengers, often feeding on the remains of larger predators' kills, and sometimes they will raid farms for livestock. Their ability to adapt to various food sources has made them successful survivors in a range of habitats, including deserts, grasslands, forests, and urban areas.\n" +
                                "\n" +
                                "One of the most notable features of jackals is their social structure. While they can be solitary, many jackal species form monogamous pairs or small family groups that work together to hunt and raise offspring. They communicate using a variety of vocalizations, including howls, barks, and yips, which help them coordinate within their pack or warn others of danger. These vocalizations are also a way for jackals to mark their territory and avoid conflict with other predators.\n" +
                                "\n" +
                                "Jackals are generally territorial animals. They will mark their territories with scent markings, usually urine, and will defend their home ranges from intruders, including other jackals. However, they are often seen working cooperatively in hunting and defending their young.\n" +
                                "\n" +
                                "Despite their adaptability, jackals face threats from habitat loss, human-wildlife conflict, and hunting. They are sometimes regarded as pests in areas where they raid livestock, leading to persecution by farmers. Nevertheless, jackals are important in maintaining ecological balance, as they help control populations of smaller mammals and act as scavengers, cleaning up carcasses.\n" +
                                "\n" +
                                "In many cultures, jackals have been portrayed in folklore and mythology as symbols of cunning, trickery, and survival, owing to their intelligence and adaptability.", Modifier.padding(5.dp), fontSize = 15.sp, textAlign = TextAlign.Justify
                    )
                }
            }
        }
    }
}

