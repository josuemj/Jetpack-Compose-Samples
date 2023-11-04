package com.example.noteapp2.notes.navigation

sealed class Model(val route:String){
    object LoginScreen:Model("login_screen")
    object SignUpScreen:Model("signUp_screen")
    object HomeScreen:Model("home_screen")
}
