package com.example.databases.ui.register

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.text.input.TextFieldValue
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
        
        Column(
            modifier = androidx.compose.ui.Modifier.padding(innerPadding)
        ) {
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
                label = { Text(text = "username")}
            )

        }
        
    }
    
}