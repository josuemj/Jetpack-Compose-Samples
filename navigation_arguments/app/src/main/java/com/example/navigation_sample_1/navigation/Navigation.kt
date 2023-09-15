package com.example.navigation_sample_1.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigation_sample_1.screens.LoginScreen
import com.example.navigation_sample_1.screens.WelcomeScreen

@Preview(showBackground = true)
@Composable
fun navigation(){

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.LoginScreen.route){

        composable(route = Screen.LoginScreen.route){
            LoginScreen(navController)
        }

        composable(route = Screen.WelcomeScreen.route){
            WelcomeScreen()
        }

    }

}