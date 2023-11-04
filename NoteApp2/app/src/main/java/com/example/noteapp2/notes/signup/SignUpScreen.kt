package com.example.noteapp2.notes.signup

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.noteapp2.notes.login.LoginViewModel
import com.example.noteapp2.notes.navigation.Model

@Composable
fun SignUpScreen(
    loginViewModel: LoginViewModel? = null,
    onNavToHomePage:()->Unit,
    onNavToLoginScreen:()->Unit
){
    val loginUiState = loginViewModel?.loginUiState
    val isError = loginUiState?.signUpError != null
    val context = LocalContext.current

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = "Sign Up",
            style = MaterialTheme.typography.h3,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colors.primary
        )

        if(isError){
            Text(
                text = loginUiState?.signUpError?: "unknowm error",
                color = Color.Red
            )
        }

        OutlinedTextField(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            value = loginUiState?.userNameSignUp?: "",
            onValueChange = {loginViewModel?.onUserNameChangeSignUp(it)},
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = null
                )
            },
            label = {
                Text("Email")
            },
            isError =  isError
        )

        OutlinedTextField(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            value = loginUiState?.passwordSignUp?: "",
            onValueChange = {loginViewModel?.onPasswordChangeSignUp(it)},
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Lock,
                    contentDescription = null
                )
            },
            label = {
                Text("Password")
            },
            visualTransformation = PasswordVisualTransformation(),
            isError =  isError
        )

        OutlinedTextField(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            value = loginUiState?.confirmPasswordSignUp?: "",
            onValueChange = {loginViewModel?.onConfirmPasswordChange(it)},
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Lock,
                    contentDescription = null
                )
            },
            label = {
                Text("Confirm Password")
            },
            visualTransformation = PasswordVisualTransformation(),
            isError =  isError
        )
        Button(
            onClick = { /*TODO*/
                loginViewModel?.createUser(context)
            }
        ) {

        }
        Spacer(modifier = Modifier.size(16.dp))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ){
            Text(
                text = "Already have an account"
            )
            Spacer(modifier = Modifier.size(8.dp))
            TextButton(
                onClick = {
                    onNavToLoginScreen.invoke()
                }
            ) {
                Text(text = "Sign In")
            }

        }

        if(loginUiState?.isLoading == true){
            CircularProgressIndicator()
        }

        LaunchedEffect(
            key1 = loginViewModel?.hasUser,
        ){
            if(loginViewModel?.hasUser == true){
                onNavToHomePage.invoke()
            }
        }

    }
}