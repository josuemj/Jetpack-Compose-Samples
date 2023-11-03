package com.example.noteapp2.notes.login

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun LoginScreen(
    loginViewModel: LoginViewModel? = null,
    onNavToHomePage:() -> Unit,
    onNavtoSignUpPage:() -> Unit
){
    val loginUiState = loginViewModel?.loginUiState
    val isError = loginUiState?.loginError != null
    val context = LocalContext.current

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Login",
            style = MaterialTheme.typography.h3,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colors.primary
        )
        
        if(isError){
            Text(
                text = loginUiState?.loginError?: "unknowm error",
                color = Color.Red
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun LoginPreview(){
    LoginScreen(onNavToHomePage = { /*TODO*/ }) {
        
    }
}
