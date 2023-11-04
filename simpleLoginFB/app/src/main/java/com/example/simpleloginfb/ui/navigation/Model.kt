package com.example.simpleloginfb.ui.navigation

sealed class Model(val route:String){
    object LaunchScreen:Model("launch_screen")
    object LoginScreen:Model("login_screen")
    object SignUpScreen:Model("signup_screen")
    object HomeScreen:Model("home_screen")
}
