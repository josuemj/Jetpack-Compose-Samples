package com.example.navigation_sample_1.screens

import android.graphics.drawable.shapes.Shape
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.navigation_sample_1.navigation.Screen

@Composable
fun LoginScreen(navController: NavController){

    var userName by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            modifier = Modifier.padding(top = 30.dp, bottom = 50.dp),
            text = "Welcome!",
            fontSize = 36.sp,
            color = Color.White
        )

        Text(
            modifier = Modifier.padding(20.dp),
            text = "Please login",
            fontSize = 24.sp,
            color = Color.White
        )


        Box(modifier = Modifier.background(Color.Black).padding(10.dp)){
            TextField(
                modifier = Modifier.background(Color.White),
                value = userName,
                onValueChange = {userName=it},
                textStyle = TextStyle(color = Color.Black),
                placeholder = { Text(text = "user name", color = Color.Black) }
            )
        }

        Box(modifier = Modifier.background(Color.Black).padding(10.dp)){
            TextField(
                modifier = Modifier.background(Color.White),
                value = password,
                onValueChange = {password=it},
                textStyle = TextStyle(color = Color.Black),
                placeholder = { Text(text = "password", color = Color.Black) }
            )
        }
        
        Button(
            onClick = {
                if (userName == ""){
                          println("No usernanme")
                      }

                if (password == ""){
                    println("No usernanme")
                }

                navController.navigate(Screen.WelcomeScreen.route)

            },
            modifier = Modifier.padding(30.dp)) {
            Text(text = "Login")
        }


    }
}