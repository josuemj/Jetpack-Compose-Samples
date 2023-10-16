package com.example.databases.ui.composables.bottonbar

import androidx.compose.material.BottomAppBar
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.databases.R
import com.example.databases.navigation.Screens

@Composable
fun AppBottomBar(navController: NavController){

    BottomAppBar(
        backgroundColor = Color(0xFF16d5d5)
    ) {
        IconButton(
            onClick = {
                navController.navigate(Screens.RegistScreen.route)
            }) {
            Icon(
                painter = painterResource(id = R.drawable.regist_icon)
                , contentDescription = "Registration")
        }

        IconButton(
            onClick = {
                navController.navigate(Screens.LaunchScreen.route)
            }) {
            Icon(
                painter = painterResource(id = R.drawable.home_icon)
                , contentDescription = "Home")
        }

        IconButton(
            onClick = {
                navController.navigate(Screens.LoginScreen.route)
            }) {
            Icon(
                painter = painterResource(id = R.drawable.login_icon)
                , contentDescription = "Login")
        }

        IconButton(
            onClick = { /*TODO*/ }) {
            Icon(
                painter = painterResource(id = R.drawable.database_icon)
                , contentDescription = "Registration")
        }
    }
}