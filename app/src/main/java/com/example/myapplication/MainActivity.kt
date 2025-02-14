package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.Animals.AnimalBear
import com.example.myapplication.Animals.AnimalCat
import com.example.myapplication.Animals.AnimalCheetah
import com.example.myapplication.Animals.AnimalDog
import com.example.myapplication.Animals.AnimalElephant
import com.example.myapplication.Animals.AnimalFox
import com.example.myapplication.Animals.AnimalGriraffe
import com.example.myapplication.Animals.AnimalJackal
import com.example.myapplication.Animals.AnimalLion
import com.example.myapplication.Animals.AnimalTiger
import com.example.myapplication.Animals.AnimalWolf
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            // Start navigation
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = "main") {
                composable("main") {
                    Animal(navController)
                }
                composable("animalDog") {
                    AnimalDog(navController = navController)
                }
                composable("cat") {
                    AnimalCat(navController = navController)
                }
                composable("cheetah") {
                    AnimalCheetah(navController = navController)
                }
                composable("cheetah") {
                    AnimalCheetah(navController = navController)
                }
                composable("jackal") {
                    AnimalJackal(navController = navController)
                }
                composable("giraffe") {
                    AnimalGriraffe(navController = navController)
                }
                composable("elephant") {
                    AnimalElephant(navController = navController)
                }
                composable("bear") {
                    AnimalBear(navController = navController)
                }
                composable("bear") {
                    AnimalBear(navController = navController)
                }
                composable("fox") {
                    AnimalFox(navController = navController)
                }
                composable("lion") {
                    AnimalLion(navController = navController)
                }
                composable("wolf") {
                    AnimalWolf(navController = navController)
                }
                composable("tiger") {
                    AnimalTiger(navController = navController)
                }
                composable("about") {
                    AboutScreen(navController = navController)
                }
                composable("settings") {
                    Seting(navController = navController)
                }

            }
        }
    }
}

@Composable
fun Animal(navController: NavHostController) {
    var isSwitch by remember { mutableStateOf(false) }
    val items = listOf("About")
    val selectedItem = remember { mutableStateOf(items[0]) }
    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val scope = rememberCoroutineScope()


    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .width(200.dp)
                    .clip(
                        RoundedCornerShape(
                            topStart = 20.dp,
                            topEnd = 20.dp
                        )
                    )
                    .background(Color(0xFF3876A4))

            ) {
                Row(
                    modifier = Modifier
                        .padding(5.dp)
                        .padding(top = 20.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ico),
                        contentDescription = "ImG", contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(55.dp)
                            .clip(RoundedCornerShape(15.dp))
                    )
                    Column(
                        modifier = Modifier
                            .padding(start = 5.dp)
                    ) {
                        Text("Jalilov", Modifier.padding(top = 20.dp), color = Color.White)
                        Text("Muhammadamin", color = Color.White)

                    }
                }
                items.forEach { item ->
                    TextButton(
                        onClick = {
                            scope.launch { drawerState.close() }
                            selectedItem.value = item
                        },
                        colors = ButtonDefaults.buttonColors(
                            contentColor = Color.Black,
                            containerColor = Color.Transparent
                        )
                    ) {


                        Column {
                            Text(
                                text = "About",
                                fontSize = 30.sp,
                                color = Color.White,
                                textAlign = TextAlign.Center,
                                modifier = Modifier

                                    .fillMaxWidth()
                                    .padding(top = 5.dp)
                                    .clip(shape = RoundedCornerShape(18.dp))
                                    .background(Color(0xFF336b99))
                                    .height(40.dp)
                                    .clickable { navController.navigate("about") }


                            )
                            Text(
                                text = "Settings",
                                fontSize = 30.sp,
                                color = Color.White,
                                textAlign = TextAlign.Center,
                                modifier = Modifier

                                    .fillMaxWidth()
                                    .padding(top = 5.dp)
                                    .clip(shape = RoundedCornerShape(18.dp))
                                    .background(Color(0xFF336b99))
                                    .height(40.dp)
                                    .clickable { navController.navigate("settings") }


                            )
                        }


                    }
                }

            }
        },

        content = {
            Column {
                Column(
                    modifier = Modifier

                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(if (isSwitch) Color.Gray else Color(0xFF3876A4))
                            .padding(top = 30.dp)
                            .height(50.dp)

                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(top = 4.dp)
                        ) {
                            IconButton(onClick = {
                                scope.launch { drawerState.open() }
                            }) {
                                Icon(
                                    Icons.Filled.Menu,
                                    "Меню",
                                    tint = if (isSwitch) Color.Black else Color.White
                                )


                            }


                            Text(
                                "Animals",
                                Modifier.padding(start = 20.dp),
                                fontSize = 32.sp,
                                fontStyle = FontStyle.Italic,
                                color = if (isSwitch) Color.Black else Color.White
                            )
                            Box(modifier = Modifier
                                .padding(5.dp)
                                .padding(start = 70.dp)) {
                                Icon(Icons.Filled.Search,"search",
                                    modifier = Modifier
                                        .padding(start =  15.dp)
                                        .size(55.dp)
                                        .clip(RoundedCornerShape(1.dp)))
                                Image(
                                    painter = painterResource(id = R.drawable.ico),
                                    contentDescription = "ImG", contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .padding(start = 60.dp)
                                         .size(55.dp)
                                        .clip(RoundedCornerShape(15.dp))
                                )
                            }

                        }
                    }
                    Column(
                        modifier = Modifier
                            .verticalScroll(rememberScrollState())
                    ) {


                        //Tiger
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(color = if(isSwitch)Color.DarkGray else Color(0xFFF0F0F0))
                                .clickable {navController.navigate("tiger")  }
                                .height(80.dp), verticalAlignment = Alignment.CenterVertically

                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.a2),
                                contentDescription = "ImG", contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .padding(5.dp)
                                    .size(65.dp)
                                    .clip(shape = RoundedCornerShape(15.dp))
                            )
                            Text(
                                "Tiger",
                                fontSize = 30.sp,
                                fontStyle = FontStyle.Italic,
                                fontWeight = FontWeight.Bold,
                                color = if(isSwitch)Color.White else Color.DarkGray
                            )

                        }
                        //Wolf
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 3.dp)
                                .background(Color(0xFFF0F0F0))
                                .clickable {navController.navigate("wolf")  }

                                .height(80.dp), verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.an2),
                                contentDescription = "ImG", contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .padding(5.dp)
                                    .size(65.dp)
                                    .clip(shape = RoundedCornerShape(15.dp))
                            )
                            Text(
                                "Wolf",
                                fontSize = 30.sp,
                                fontStyle = FontStyle.Italic,
                                fontWeight = FontWeight.Bold,
                                color = Color.DarkGray
                            )

                        }
                        //Lion an3
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 3.dp)
                                .clickable { navController.navigate("lion") }
                                .background(Color(0xFFF0F0F0))
                                .height(80.dp), verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.an3),
                                contentDescription = "ImG", contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .padding(5.dp)
                                    .size(65.dp)
                                    .clip(shape = RoundedCornerShape(15.dp))
                            )
                            Text(
                                "Lion",
                                fontSize = 30.sp,
                                fontStyle = FontStyle.Italic,
                                fontWeight = FontWeight.Bold,
                                color = Color.DarkGray
                            )

                        }
                        // Fox an4
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 3.dp)
                                .background(Color(0xFFF0F0F0))
                                .clickable { navController.navigate("fox") }

                                .height(80.dp), verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.an4),
                                contentDescription = "ImG", contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .padding(5.dp)
                                    .size(65.dp)
                                    .clip(shape = RoundedCornerShape(15.dp))
                            )
                            Text(
                                "Fox",
                                fontSize = 30.sp,
                                fontStyle = FontStyle.Italic,
                                fontWeight = FontWeight.Bold,
                                color = Color.DarkGray
                            )

                        }
                        // Bear a5
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 3.dp)
                                .clickable { navController.navigate("bear") }

                                .background(Color(0xFFF0F0F0))
                                .height(80.dp), verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.a5),
                                contentDescription = "ImG", contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .padding(5.dp)
                                    .size(65.dp)
                                    .clip(shape = RoundedCornerShape(15.dp))
                            )
                            Text(
                                "Bear",
                                fontSize = 30.sp,
                                fontStyle = FontStyle.Italic,
                                fontWeight = FontWeight.Bold,
                                color = Color.DarkGray
                            )

                        }
                        // elephant A6
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 3.dp)
                                .background(Color(0xFFF0F0F0))
                                .clickable { navController.navigate("elephant") }

                                .height(80.dp), verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.a6),
                                contentDescription = "ImG", contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .padding(5.dp)
                                    .size(65.dp)
                                    .clip(shape = RoundedCornerShape(15.dp))
                            )
                            Text(
                                "Elephant",
                                fontSize = 30.sp,
                                fontStyle = FontStyle.Italic,
                                fontWeight = FontWeight.Bold,
                                color = Color.DarkGray
                            )

                        }
                        //Girafe a7 a8 a88
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 3.dp)
                                .background(Color(0xFFF0F0F0))
                                .clickable { navController.navigate("giraffe") }

                                .height(80.dp), verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.a8),
                                contentDescription = "ImG", contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .padding(5.dp)
                                    .size(65.dp)
                                    .clip(shape = RoundedCornerShape(15.dp))
                            )
                            Text(
                                "Giraffe",
                                fontSize = 30.sp,
                                fontStyle = FontStyle.Italic,
                                fontWeight = FontWeight.Bold,
                                color = Color.DarkGray
                            )
                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 3.dp)
                                .background(Color(0xFFF0F0F0))
                                .clickable { navController.navigate("jackal") }

                                .height(80.dp), verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.a9),
                                contentDescription = "ImG", contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .padding(5.dp)
                                    .size(65.dp)
                                    .clip(shape = RoundedCornerShape(15.dp))
                            )
                            Text(
                                "Jackal",
                                fontSize = 30.sp,
                                fontStyle = FontStyle.Italic,
                                fontWeight = FontWeight.Bold,
                                color = Color.DarkGray
                            )

                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable { navController.navigate("cheetah") }

                                .padding(top = 3.dp)
                                .background(Color(0xFFF0F0F0))
                                .height(80.dp), verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.a10),
                                contentDescription = "ImG", contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .padding(5.dp)
                                    .size(65.dp)
                                    .clip(shape = RoundedCornerShape(15.dp))
                            )
                            Text(
                                "Cheetah",
                                fontSize = 30.sp,
                                fontStyle = FontStyle.Italic,
                                fontWeight = FontWeight.Bold,
                                color = Color.DarkGray
                            )

                        }

                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 3.dp)
                                .background(Color(0xFFF0F0F0))
                                .clickable {
                                    navController.navigate("animalDog") // Navigate to AnimalDog screen
                                }
                                .height(80.dp), verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.a11),
                                contentDescription = "ImG", contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .padding(5.dp)
                                    .size(65.dp)
                                    .clip(shape = RoundedCornerShape(15.dp))
                            )
                            Text(
                                "Dog",
                                fontSize = 30.sp,
                                fontStyle = FontStyle.Italic,
                                fontWeight = FontWeight.Bold,
                                color = Color.DarkGray
                            )

                        }
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 3.dp)
                                .background(Color(0xFFF0F0F0))
                                .clickable { navController.navigate("cat") }
                                .height(80.dp), verticalAlignment = Alignment.CenterVertically

                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.a12),
                                contentDescription = "ImG", contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .padding(5.dp)
                                    .size(65.dp)
                                    .clip(shape = RoundedCornerShape(15.dp))
                            )
                            Text(
                                "Cat",
                                fontSize = 30.sp,
                                fontStyle = FontStyle.Italic,
                                fontWeight = FontWeight.Bold,
                                color = Color.DarkGray
                            )
                        }
                    }
                }
            }
        }
    )
}
