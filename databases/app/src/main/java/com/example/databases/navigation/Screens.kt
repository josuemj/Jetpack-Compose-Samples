package com.example.databases.navigation

sealed class Screens(val route:String){
    object LaunchScreen:Screens("launch_screen")
    object RegistScreen:Screens("regist_screen")
    object LoginScreen:Screens("login_screen")


}
