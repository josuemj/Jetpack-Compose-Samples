package com.example.simpleloginfb.ui.launch

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.simpleloginfb.ui.navigation.Model

@Composable
fun LaunchScreenApp(
    navController: NavController
){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF041f34)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            modifier = Modifier.padding(20.dp),
            text = "Firebase Authentication",
            fontWeight = FontWeight.Bold,
            color = Color(0xFF7297b2),
            fontSize = 24.sp
        )
        /**
         * Sign In/log in Button
         */
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
                .height(50.dp)
                .background(Color.Transparent)
                ,
            shape = RoundedCornerShape(50),
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.White,
                backgroundColor = Color(0xFF7297b2)
            ),
            onClick = {
                navController.navigate(Model.LoginScreen.route)
            }
        ) {
            Text(text = "Log in")
        }

        /**
         * Sign Up Button
         */
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
                .height(50.dp)
                .background(Color.Transparent),
            shape = RoundedCornerShape(50),
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.White,
                backgroundColor = Color(0xFF7297b2)
            ),
            onClick = {
                navController.navigate(Model.SignUpScreen.route)
            }
        ) {
            Text(text = "Sign Up")
        }
    }
}