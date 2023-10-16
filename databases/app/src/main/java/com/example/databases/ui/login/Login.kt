package com.example.databases.ui.login

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.input.TextFieldValue
import androidx.navigation.NavController
import com.example.databases.ui.composables.bottonbar.AppBottomBar
import java.lang.reflect.Modifier

@Composable
fun LoginScreen(navController: NavController){

    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    
    Scaffold(
        topBar = {
            com.example.databases.ui.composables.bottonbar.TopAppBar(tittle = "Database login test")
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
                modifier = androidx.compose.ui.Modifier.padding(innerPadding)
            ) {


                TextField(value = username,
                    onValueChange = { username=it},
                    label = { Text(text = "username")}
                )

                TextField(value = password,
                    onValueChange = { password=it},
                    label = { Text(text = "username")}
                )
                
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Login")
                    
                }

            }
        }
        

    }

}