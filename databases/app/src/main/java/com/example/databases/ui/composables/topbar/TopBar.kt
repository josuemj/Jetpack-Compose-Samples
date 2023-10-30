package com.example.databases.ui.composables.bottonbar

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TopAppBar(tittle:String){
    androidx.compose.material.TopAppBar(
        backgroundColor = Color(0xFF16d5d5),

        ) {
        Text(
            modifier = Modifier.padding(start = 10.dp),
            text = tittle,
            fontSize = 18.sp,
            color = Color.White
        )
    }
}
