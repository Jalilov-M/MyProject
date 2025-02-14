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
 fun AnimalTiger(navController: NavController) {
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
                        "Tiger",
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
                            .padding(start = 175.dp)
                            .size(60.dp)
                            .clip(RoundedCornerShape(20.dp))
                    )
                }
            }
            Box() {
                Column(Modifier.verticalScroll(rememberScrollState())) {
                    Image(
                        painter = painterResource(id = R.drawable.a2),
                        contentDescription = "ImG", contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(5.dp)
                            .size(width = 150.dp, height = 190.dp)
                            .clip(RoundedCornerShape(20.dp))
                    )
                    Text(
                        text = "The tiger (Panthera tigris) is the largest wild cat species and a powerful predator known for its striking orange coat with black stripes. It has a muscular body, sharp claws, and strong jaws, making it an apex predator in its ecosystem. Tigers are primarily found in forests, grasslands, and mangroves across Asia, from India and Russia to Southeast Asia and Indonesia.\n" +
                                "\n" +
                                "Tigers are solitary hunters, relying on stealth and strength to ambush prey such as deer, wild boar, and buffalo. Unlike most cats, they are excellent swimmers and often cool off or hunt in the water. Each tiger has a unique stripe pattern, much like a human fingerprint, which helps with camouflage in dense vegetation.\n" +
                                "\n" +
                                "There are several subspecies of tigers, including the Bengal tiger, Siberian tiger, Indochinese tiger, Malayan tiger, South China tiger, and Sumatran tiger. The Siberian tiger is the largest, while the Sumatran tiger is the smallest and most endangered. Sadly, habitat destruction and poaching have led to a dramatic decline in tiger populations, with fewer than 4,000 remaining in the wild. Conservation efforts focus on protecting their natural habitats, enforcing anti-poaching laws, and increasing awareness to prevent their extinction.\n" +
                                "\n" +
                                "Tigers can roar so loudly that their call can be heard up to three kilometers away. They are symbols of strength, courage, and power in many cultures, appearing in folklore, mythology, and national emblems. Despite their fearsome reputation, they play a crucial role in maintaining ecological balance, making their conservation essential for the health of their ecosystems.\n" +
                                "\n", Modifier.padding(5.dp), fontSize = 15.sp, textAlign = TextAlign.Justify
                    )
                }
            }
        }
    }
}

