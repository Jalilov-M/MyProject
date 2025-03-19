package com.example.myapplication

import AnimalViewModel
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController

@Composable
fun Settings(navController: NavController, viewModel: AnimalViewModel = viewModel()) {

    var isDarkTheme=viewModel.isDarkTheme
    var language by remember { mutableStateOf("en") }
    val title = if (language == "en") "Settings" else "Настройка"
    val dar = if (language == "en") "Dark theme" else "Тёмная тема"
    val nots = if (language == "en") "Notification" else "Уведомления"
    val fstyle = if (language == "en") "Font style" else "Стиль шрифта"
    val fsize = if (language == "en") "Font size" else "Размер шрифта"
    val but = if (language == "en") "Choose" else "Выбрать"


    val not = remember { mutableStateOf(false) }
    var selectedFont by remember { mutableStateOf(FontFamily.Default) }
    var expanded by remember { mutableStateOf(false) }
    var expanded1 by remember { mutableStateOf(false) }
    var selectedFontSize by remember { mutableStateOf(18.sp) }
    val colorItem = if (viewModel.isDarkTheme) Color.Gray else Color(0xFFE8E8E8)
    val colorBack = if (viewModel.isDarkTheme) Color.DarkGray else Color.White
    val colorFont = if (viewModel.isDarkTheme) Color.White else Color.DarkGray
    val colorUp = if (viewModel.isDarkTheme) Color.Black else Color(0xFF3876A4)

    val fonts = listOf(
        "Default" to FontFamily.Default,
        "Serif" to FontFamily.Serif,
        "Sans-serif" to FontFamily.SansSerif,
        "Monospace" to FontFamily.Monospace
    )

    Column(modifier = Modifier.fillMaxSize().background(colorBack)) {
        Column(modifier = Modifier) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(colorUp)
                    .padding(top = 30.dp)
                    .height(50.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(top = 4.dp)
                ) {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(Icons.Filled.ArrowBack, "Back", tint = Color.White)
                    }

                    Text(
                        title,
                        Modifier.padding(start = 20.dp),
                        fontSize = selectedFontSize,
                        fontStyle = FontStyle.Italic,
                        color = Color.White,
                        fontFamily = selectedFont
                    )
                    Spacer(Modifier.weight(1f))
                    Image(
                        painter = painterResource(id = R.drawable.ru),
                        contentDescription = "Russian", contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .padding(5.dp)
                            .padding(start = 7.dp)
                            .clip(RoundedCornerShape(20.dp))
                            .size(35.dp)
                            .clickable { language = "ru" }
                    )
                    Image(
                        painter = painterResource(id = R.drawable.en),
                        contentDescription = "English", contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .padding(5.dp)
                            .padding(start = 1.dp)
                            .clip(RoundedCornerShape(20.dp))
                            .size(35.dp)
                            .clickable { language = "en" }
                    )
                }
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(horizontal = 14.dp)
                    .padding(top = 5.dp)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(12.dp))
                    .background(colorItem)
                    .height(50.dp)
                    .padding(horizontal = 8.dp)
            ) {
                Text(
                    text = dar,
                    color = colorFont,
                    fontSize = selectedFontSize,
                    fontFamily = selectedFont
                )

                Spacer(Modifier.weight(1f))

                Switch(
                    checked = viewModel.isDarkTheme,
                    onCheckedChange = { viewModel.toggleTheme() },
                    colors = SwitchDefaults.colors(
                        checkedThumbColor = Color.White,
                        uncheckedThumbColor = Color.Gray,
                        checkedTrackColor = Color(0xFF585858),
                        uncheckedTrackColor = Color(0xFFE0E0E0)
                    )
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(horizontal = 14.dp)
                    .padding(top = 19.dp)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(12.dp))
                    .background(colorItem)
                    .height(50.dp)
                    .padding(horizontal = 8.dp)
            ) {
                Text(
                    text = nots,
                    color = colorFont,
                    fontSize = selectedFontSize,
                    fontFamily = selectedFont
                )

                Spacer(Modifier.weight(1f))

                Switch(
                    checked = not.value,
                    onCheckedChange = { not.value = it },
                    colors = SwitchDefaults.colors(
                        checkedThumbColor = Color.White,
                        uncheckedThumbColor = Color.Gray,
                        checkedTrackColor = Color(0xFF585858),
                        uncheckedTrackColor = Color(0xFFE0E0E0)
                    )
                )
            }

            // Font Style Dropdown
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(top = 19.dp)
                    .padding(horizontal = 14.dp)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(12.dp))
                    .background(colorItem)
                    .height(55.dp)
                    .padding(8.dp)
            ) {
                Text(
                    text = fstyle,
                    color = colorFont,
                    fontSize = selectedFontSize,
                    fontFamily = selectedFont
                )

                Spacer(Modifier.weight(1f))

                Box {
                    Button(
                        onClick = { expanded = true },
                        modifier = Modifier
                            .height(40.dp)
                            .clip(RoundedCornerShape(8.dp)),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFFBEBEBE),
                            contentColor = Color.Black
                        )
                    ) {
                        Text(text = but, color = colorFont)
                    }

                    DropdownMenu(
                        expanded = expanded,
                        onDismissRequest = { expanded = false },
                        modifier = Modifier
                            .background(Color(0xFFD0D0D0))
                            .clip(RoundedCornerShape(12.dp))
                    ) {
                        fonts.forEach { (name, font) ->
                            DropdownMenuItem(
                                text = { Text(name) },
                                onClick = {
                                    selectedFont = font
                                    expanded = false
                                }
                            )
                        }
                    }
                }
            }

            // Font Size Dropdown
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(top = 19.dp)
                    .padding(horizontal = 14.dp)
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(12.dp))
                    .background(colorItem)
                    .height(55.dp)
                    .padding(8.dp)
            ) {
                Text(
                    text = fsize,
                    color = colorFont,
                    fontSize = selectedFontSize,
                    fontFamily = selectedFont
                )

                Spacer(Modifier.weight(1f))

                Box {
                    Button(
                        onClick = { expanded1 = true },
                        modifier = Modifier
                            .height(40.dp)
                            .clip(RoundedCornerShape(8.dp)),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFFBEBEBE),
                            contentColor = Color.Black
                        )
                    ) {
                        Text(text = but, color = colorFont)
                    }

                    DropdownMenu(
                        expanded = expanded1,
                        onDismissRequest = { expanded1 = false },
                        modifier = Modifier
                            .background(Color(0xFFD0D0D0))
                            .clip(RoundedCornerShape(12.dp))
                    ) {
                        listOf(10, 12, 14, 16, 18, 20, 22, 24, 26).forEach { size ->
                            DropdownMenuItem(
                                text = { Text("$size sp", color = colorFont) },
                                onClick = {
                                    selectedFontSize = size.sp
                                    expanded1 = false
                                }
                            )
                        }
                    }
                }
            }
        }
    }
}