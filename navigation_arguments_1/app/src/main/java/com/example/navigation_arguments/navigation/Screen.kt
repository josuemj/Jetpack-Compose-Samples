package com.example.navigation_arguments.navigation

sealed class Screen(val route: String){
    object LoginScreen : Screen("login_screen")
    object WelcomeScreen: Screen("welcome_screen")
}
