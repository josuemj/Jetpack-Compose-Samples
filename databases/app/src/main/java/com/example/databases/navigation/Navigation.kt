package com.example.databases.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.databases.ui.launch.LaunchScreen
import com.example.databases.ui.login.LoginScreen
import com.example.databases.ui.register.Register

@Composable
fun Navigation(){

    val navController = rememberNavController()
    
    NavHost(navController = navController,  startDestination = Screens.LaunchScreen.route ){

        composable(route = Screens.LaunchScreen.route){
            LaunchScreen(navController)
        }

        composable(route = Screens.RegistScreen.route){
            Register.RegistScreen(navController = navController)
        }

        composable(route = Screens.LoginScreen.route){
            LoginScreen(navController = navController)
        }

    }

}