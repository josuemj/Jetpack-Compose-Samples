package com.example.noteapp2.notes.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.noteapp2.notes.home.HomeScreen
import com.example.noteapp2.notes.login.LoginScreen
import com.example.noteapp2.notes.login.LoginViewModel
import com.example.noteapp2.notes.signup.SignUpScreen

@Composable
fun Navigation(
    loginViewModel: LoginViewModel,
    navController: NavHostController = rememberNavController()
){

    NavHost(
        navController = navController,
        startDestination = Model.SignUpScreen.route
    ){

        /*
        Sign in composable and navigation
         */
        composable(route = Model.LoginScreen.route){
            LoginScreen(onNavToHomePage =
            {
                navController.navigate(Model.HomeScreen.route){
                   launchSingleTop = true
                    popUpTo(route = Model.LoginScreen.route){
                        inclusive = true //Not going back mechanism
                    }
                }
            },
                loginViewModel =loginViewModel
            ) {
                navController.navigate(Model.SignUpScreen.route){
                    launchSingleTop = true
                    popUpTo(Model.LoginScreen.route){
                        inclusive = true
                    }
                }
            }
        }

        /*
        Sign up composable and navigation
         */
        composable(route = Model.SignUpScreen.route){
            SignUpScreen(onNavToHomePage = {
                navController.navigate(Model.HomeScreen.route){
                    popUpTo(Model.LoginScreen.route){
                        inclusive = true
                    }
                }
            },
                loginViewModel =loginViewModel
            ) {

                navController.navigate(Model.LoginScreen.route)

            }
        }

        /**
         * Home screen
         */

        composable(route = Model.HomeScreen.route){
            HomeScreen()
        }



    }
}
