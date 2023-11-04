package com.example.simpleloginfb.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.simpleloginfb.ui.home.HomeScreen
import com.example.simpleloginfb.ui.launch.LaunchScreenApp
import com.example.simpleloginfb.ui.login.LoginScreen
import com.example.simpleloginfb.ui.login.LoginViewModel
import com.example.simpleloginfb.ui.signup.SignUpScreen

@Composable
fun Navigation(
    viewModel: LoginViewModel
){

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Model.LaunchScreen.route
    ){
        composable(route = Model.LaunchScreen.route){
            LaunchScreenApp(navController = navController)
        }

        composable(route = Model.LoginScreen.route){
            LoginScreen(
                viewModel,
                navController = navController
            )
        }

        composable(route = Model.SignUpScreen.route){
            SignUpScreen(
                viewModel,
                navController = navController
            )
        }

        composable(route = Model.HomeScreen.route){
            HomeScreen()
        }
    }

}