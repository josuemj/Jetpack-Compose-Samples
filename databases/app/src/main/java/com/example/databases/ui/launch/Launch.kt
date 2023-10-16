package com.example.databases.ui.launch

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController





import com.example.databases.R
import com.example.databases.ui.composables.bottonbar.AppBottomBar

@Composable
fun LaunchScreen(navController: NavController){

    Scaffold(

        topBar = {
            com.example.databases.ui.composables.bottonbar.TopAppBar(tittle = "Database app")
        },

        bottomBar = {
            AppBottomBar(navController)
        }

    ) { innerPadding ->

        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ){
            Column(
                modifier = Modifier.padding(innerPadding)
            ) {
                Text(text = "Database sample")
            }
        }

    }


}