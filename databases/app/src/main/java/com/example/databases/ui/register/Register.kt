package com.example.databases.ui.register

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.databases.ui.composables.bottonbar.AppBottomBar
import java.lang.reflect.Modifier

@Composable
fun RegistScreen(navController: NavController){

    var mail by remember { mutableStateOf("") }
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Scaffold(
        topBar = {
            com.example.databases.ui.composables.bottonbar.TopAppBar(tittle = "Database registration")
        },

        bottomBar = {
            AppBottomBar(navController)
        }
    ) {innerPadding->

        Box(
            modifier = androidx.compose.ui.Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ){
            Column(
                modifier = androidx.compose.ui.Modifier.padding(innerPadding),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Registration",
                    fontSize = 20.sp,
                    modifier = androidx.compose.ui.Modifier.padding(5.dp)
                )
                TextField(value = mail,
                    onValueChange = { mail=it},
                    label = { Text(text = "mail")}
                )

                TextField(value = username,
                    onValueChange = { username=it},
                    label = { Text(text = "username")}
                )

                TextField(value = password,
                    onValueChange = { password=it},
                    label = { Text(text = "password")}
                )

                Button(
                    onClick = { /*TODO*/ },
                    modifier = androidx.compose.ui.Modifier.padding(10.dp),
                ) {
                    Text(text = "Sign up")
                }

            }
        }

        
    }
    
}