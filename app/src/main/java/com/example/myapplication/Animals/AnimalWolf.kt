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
 fun AnimalWolf(navController: NavController) {
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
                        "Wolf",
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
                        painter = painterResource(id = R.drawable.an2),
                        contentDescription = "ImG", contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(5.dp)
                            .size(width = 150.dp, height = 190.dp)
                            .clip(RoundedCornerShape(20.dp))
                    )
                    Text(
                        text = "The wolf (*Canis lupus*) is a highly intelligent and social carnivore, known for its strong pack behavior and exceptional hunting skills. As the largest member of the canine family, wolves are found in forests, mountains, tundras, and grasslands across North America, Europe, and Asia. They have thick fur, which helps them survive in harsh climates, and their coat color ranges from gray and black to white and brown, depending on their habitat.  \n" +
                                "\n" +
                                "Wolves live in structured packs, usually consisting of an **alpha pair**, their offspring, and other related members. Pack cooperation is essential for hunting and survival, allowing them to take down large prey like deer, moose, and bison. Their powerful jaws and sharp teeth can crush bones, and their stamina enables them to chase prey over long distances.  \n" +
                                "\n" +
                                "Communication is a key part of wolf behavior. They use howls to signal their location, warn rivals, or strengthen social bonds within the pack. Body language, facial expressions, and scent marking also play a crucial role in their interactions.  \n" +
                                "\n" +
                                "There are several subspecies of wolves, including the gray wolf, Arctic wolf, timber wolf, and Eurasian wolf. Despite their adaptability, wolves have faced significant threats from habitat loss and human conflict. Historically, they were hunted due to fears of livestock predation, but conservation efforts have helped restore some populations.  \n" +
                                "\n" +
                                "Wolves are symbols of strength, loyalty, and resilience in many cultures, often appearing in folklore and mythology. Their role in ecosystems is vital, as they help control prey populations and maintain ecological balance. Today, conservation programs continue to protect wolves and promote coexistence between humans and wildlife.", Modifier.padding(5.dp), fontSize = 15.sp, textAlign = TextAlign.Justify
                    )
                }
            }
        }
    }
}

