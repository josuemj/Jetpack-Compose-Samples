package com.example.navigationapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigationapp.screens.DetailsScreen
import com.example.navigationapp.screens.MainScreen


@Preview
@Composable
fun navigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.MainScreen.route){

        composable(route = Screen.MainScreen.route){
            MainScreen(navController = navController)
        }

        composable(route = Screen.DetailsScreen.route){
            DetailsScreen()
        }
    }
}