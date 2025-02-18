package com.example.myapplication

import AnimalViewModel
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
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Close
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
import androidx.lifecycle.viewmodel.compose.viewModel

import androidx.compose.material3.*
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.material3.*
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.text.font.FontFamily
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.myapplication.Animals.AnimalCow
import com.example.myapplication.Animals.AnimalDolphin
import com.example.myapplication.Animals.AnimalHorse
import com.example.myapplication.Animals.AnimalKangaroo


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = "main") {
                composable("main") { Animal(navController) }
                composable("Dog | Собака") { AnimalDog(navController) }
                composable("Cat | Кошка") { AnimalCat(navController) }
                composable("Cheetah | Гепард") { AnimalCheetah(navController) }
                composable("Jackal | Шакал") { AnimalJackal(navController) }
                composable("Giraffe | Жираф") { AnimalGriraffe(navController) }
                composable("Elephant | Слон") { AnimalElephant(navController) }
                composable("Bear | Медвед") { AnimalBear(navController) }
                composable("Fox | Лиса") { AnimalFox(navController) }
                composable("Lion | Лев") { AnimalLion(navController) }
                composable("Wolf | Волк") { AnimalWolf(navController) }
                composable("Tiger | Тигр") { AnimalTiger(navController) }
                composable("Kangaroo | Кенгуру") { AnimalKangaroo(navController) }
                composable("Horse | Лощадь") { AnimalHorse(navController) }
                composable("Dolphin | Дельфин") { AnimalDolphin(navController) }
                composable("Cow | Корова") { AnimalCow(navController) }
                composable("about") { AboutScreen(navController) }
                composable("settings") { Seting(navController) }

            }
        }

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Animal(navController: NavHostController, viewModel: AnimalViewModel = viewModel()) {
    var searchQuery by remember { mutableStateOf("") }
    val filteredAnimals = viewModel.animals.filter { it.first.contains(searchQuery, ignoreCase = true) }

    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    val Language = false
    val backgroundColor = if (viewModel.isDarkTheme) Color.DarkGray else Color(0xFF3876A4)
    val textColor = if (viewModel.isDarkTheme) Color.White else Color.Black
    val backOfButton = if (viewModel.isDarkTheme) Color.Gray else Color(0xFF336b99)

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .width(200.dp)
                    .clip(RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp))
                    .background(backgroundColor)
            ) {
                Row(
                    modifier = Modifier
                        .padding(5.dp)
                        .padding(top = 20.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.ico),
                        contentDescription = "Image",
                        modifier = Modifier
                            .size(55.dp)
                            .clip(RoundedCornerShape(15.dp))
                    )
                    Column(modifier = Modifier.padding(start = 5.dp)) {
                        Text("Jalilov", color = textColor, fontWeight = FontWeight.SemiBold, fontSize = 22.sp)
                        Text("Muhammadamin", color = textColor, fontWeight = FontWeight.Light, fontSize = 18.sp)
                    }
                }

                TextButton(onClick = { scope.launch { drawerState.close() } }) {
                    Column {
                        Text(
                            "About",
                            fontSize = 30.sp,
                            color = textColor,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(bottom = 5.dp)
                                .clip(RoundedCornerShape(10.dp))
                                .background(backOfButton)
                                .height(50.dp)
                                .clickable { navController.navigate("about") }
                         )
                        Text(
                            "Settings",
                            fontSize = 30.sp,
                            color = textColor,
                            modifier = Modifier
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(10.dp))
                                .background(backOfButton)
                                .height(50.dp)
                                .clickable { navController.navigate("settings") }
                         )
                    }
                }

                 Row(modifier = Modifier.padding(16.dp)) {
                    Text("Dark Theme", color = textColor, fontSize = 18.sp, fontStyle = FontStyle.Normal)
                    Switch(
                        checked = viewModel.isDarkTheme,
                        onCheckedChange = { viewModel.toggleTheme() },
                        modifier = Modifier.padding(start = 10.dp)
                    )
                }
            }
        },
        content = {
            Column {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(backgroundColor)
                        .padding(top = 30.dp)
                        .clip(RoundedCornerShape(5.dp))
                        .height(50.dp)
                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.padding(top = 4.dp)
                    ) {
                        IconButton(onClick = { scope.launch { drawerState.open() } }) {
                            Icon(
                                Icons.Filled.Menu,
                                "Menu",
                                Modifier.size(30.dp),
                                tint = Color.White
                            )
            }
                        Text(
                            "Animals",
                            fontSize = 32.sp,
                            color = textColor,
                            modifier = Modifier.padding(start = 20.dp),
                         )
                    }
                }

                TextField(
                    value = searchQuery,
                    onValueChange = { searchQuery = it },
                    label = { Text("Поиск ", fontSize = 18.sp,  color = Color.DarkGray) },
                    leadingIcon = { Icon(Icons.Filled.Search, contentDescription = "Search Icon") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(12.dp))
                        .background(Color.White)
                        .height(60.dp)
                    ,
                    colors = TextFieldDefaults.textFieldColors(
                        cursorColor = Color.Black,
                        focusedIndicatorColor = Color.LightGray,
                        unfocusedIndicatorColor = Color.Gray
                    ),
                    singleLine = true,
                    shape = RoundedCornerShape(12.dp)
                )

                LazyColumn(modifier = Modifier.fillMaxSize()) {
                    items(filteredAnimals) { (name, imageRes) ->
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 3.dp)
                                .clickable { navController.navigate(name.lowercase()) }
                                .background(Color(0xFFF0F0F0))
                                .height(80.dp),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(id = imageRes),
                                contentDescription = "Animal Image",
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .padding(5.dp)
                                    .size(65.dp)
                                    .clip(RoundedCornerShape(15.dp))
                                    .shadow(5.dp, shape = RoundedCornerShape(15.dp))
                            )
                            Text(
                                name,
                                fontSize = 28.sp,
                                fontStyle = FontStyle.Normal,
                                fontWeight = FontWeight.Light,
                                color = Color.DarkGray,
                            )




                        }
                    }
                }





            }
        }
    )
}
