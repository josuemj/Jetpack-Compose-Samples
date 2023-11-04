package com.example.simpleloginfb.ui.signup

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.simpleloginfb.ui.login.LoginViewModel
import com.example.simpleloginfb.ui.navigation.Model

@Composable
fun SignUpScreen(
    viewModel: LoginViewModel,
    navController: NavController
){
    val context = LocalContext.current

    val state = viewModel.state
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF041f34)),
        horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Text(
            modifier = Modifier.padding(20.dp),
            text = "Sign Up Firebase",
            fontWeight = FontWeight.Bold,
            color = Color(0xFF7297b2),
            fontSize = 24.sp
        )

        OutlinedTextField(

            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .background(Color.White),
            textStyle = TextStyle(
                color = Color.Black,
                textAlign = TextAlign.Left
            ),
            placeholder = {
                Text(
                    text = "Email",
                    color = Color(0xFF7297b2),
                    fontSize = 14.sp
                )
            },
            value = state.email,
            onValueChange = {viewModel.updateEmail(it)}
        )
        Spacer(modifier = Modifier.size(10.dp))

        OutlinedTextField(

            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .background(Color.White),
            textStyle = TextStyle(
                color = Color.Black,
                textAlign = TextAlign.Left
            ),
            placeholder = {
                Text(
                    text = "Password",
                    color = Color(0xFF7297b2),
                    fontSize = 14.sp
                )
            },
            value = state.password,
            onValueChange = {
                viewModel.updatePassword(it)

            }
        )

        Button(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
                .height(50.dp)
                .background(Color.Transparent),
            shape = RoundedCornerShape(50),
            colors = ButtonDefaults.buttonColors(
                contentColor = Color.White,
                backgroundColor = Color(0xFF7297b2)
            ),
            onClick = {
                viewModel.signIn()
                Toast.makeText(
                    context,
                    LoginViewModel.staticMessage,
                    Toast.LENGTH_SHORT)
                    .show()

                if (LoginViewModel.staticMessage=="Sign in Success"){
                    navController.navigate(Model.LoginScreen.route)
                }
            }
        ) {
            Text(text = "Sign Up")
        }
    }
}