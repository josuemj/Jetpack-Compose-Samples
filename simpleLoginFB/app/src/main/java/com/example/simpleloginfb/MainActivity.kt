package com.example.simpleloginfb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.simpleloginfb.ui.login.LoginScreen
import com.example.simpleloginfb.ui.login.LoginViewModel
import com.example.simpleloginfb.ui.navigation.Navigation
import com.example.simpleloginfb.ui.theme.SimpleLoginFBTheme

class MainActivity : ComponentActivity() {

  private val viewModel by viewModels<LoginViewModel>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SimpleLoginFBTheme {
                // A surface container using the 'background' color from the theme
                Navigation(viewModel = viewModel)
        }
    }
}}
