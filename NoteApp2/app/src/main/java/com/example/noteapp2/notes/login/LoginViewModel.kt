package com.example.noteapp2.notes.login

import android.content.Context
import android.widget.Toast
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.noteapp2.notes.repository.AuthRepository
import kotlinx.coroutines.launch

class LoginViewModel(
    private val repository: AuthRepository = AuthRepository()
):ViewModel() {

    val currentUser = repository.currentUser

    val hasUser:Boolean
        get() = repository.hasUser()

    var loginUiState by mutableStateOf(LoginUiState())
        private set //modified inside view model


    fun onUserNameChange(userName:String){
        loginUiState = loginUiState.copy(userName = userName)
    }

    fun onPasswordNameChange(password:String){
        loginUiState = loginUiState.copy(password = password)
    }

    fun onUserNameChangeSignUp(userName: String){
        loginUiState = loginUiState.copy(userNameSignUp = userName)
    }

    fun onPasswordChangeSignUp(password:String){
        loginUiState = loginUiState.copy(passwordSignUp = password)
    }

    fun onConfirmPasswordChange(password:String){
        loginUiState = loginUiState.copy(confirmPasswordSignUp = password)
    }

    private fun validateLoginForm() =
        loginUiState.userName.isBlank() &&
                loginUiState.password.isNotBlank()

    private fun validateSignUpForm() =
        loginUiState.userNameSignUp.isNotBlank() &&
                loginUiState.passwordSignUp.isNotBlank() &&
                loginUiState.confirmPasswordSignUp.isNotBlank()

    fun loginUser(context: Context) = viewModelScope.launch {
        try{
            if (!validateLoginForm()){
                throw IllegalArgumentException("fields can't be empty")
            }

            loginUiState = loginUiState.copy(isLoading = true)


            loginUiState = loginUiState.copy(loginError = null)
            repository.login(
                loginUiState.userName,
                loginUiState.password
            ){
                    isSuccesful ->
                if(isSuccesful){
                    Toast.makeText(
                        context,
                        "succes login",
                        Toast.LENGTH_SHORT
                    ).show()
                    loginUiState = loginUiState.copy(
                        isSuccesLogin = true
                    )
                }else{
                    Toast.makeText(
                        context,
                        "Fail login",
                        Toast.LENGTH_SHORT
                    ).show()
                    loginUiState = loginUiState.copy(
                        isSuccesLogin = false
                    )
                }

            }

        } catch (e:Exception){
            loginUiState = loginUiState.copy(loginError = e.localizedMessage)
            e.printStackTrace()
        } finally{
            loginUiState = loginUiState.copy(isLoading = false)
        }

    }

    fun createUser(context: Context) = viewModelScope.launch {
        try{
            if (!validateSignUpForm()){
                throw IllegalArgumentException("fields can't be empty")
            }

            loginUiState = loginUiState.copy(isLoading = true)

            if(loginUiState.passwordSignUp != loginUiState.confirmPasswordSignUp){
                throw IllegalArgumentException("Password does not match")
            }
            loginUiState = loginUiState.copy(signUpError = null)
            repository.login(
                loginUiState.userNameSignUp,
                loginUiState.passwordSignUp
            ){
                isSuccesful ->
                if(isSuccesful){
                    Toast.makeText(
                        context,
                        "succes login",
                        Toast.LENGTH_SHORT
                    ).show()
                    loginUiState = loginUiState.copy(
                        isSuccesLogin = true
                    )
                }else{
                    Toast.makeText(
                        context,
                        "Fail login",
                        Toast.LENGTH_SHORT
                    ).show()
                    loginUiState = loginUiState.copy(
                        isSuccesLogin = false
                    )
                }

            }

        } catch (e:Exception){
            loginUiState = loginUiState.copy(signUpError = e.localizedMessage)
            e.printStackTrace()
        } finally{
            loginUiState = loginUiState.copy(isLoading = false)
        }

    }


}

data class LoginUiState(
    val userName: String = "",
    val password: String = "",
    val userNameSignUp: String = "",
    val passwordSignUp: String = "",
    val confirmPasswordSignUp: String = "",
    val isLoading:Boolean = false,
    val isSuccesLogin:Boolean = false,
    val signUpError:String? = null,
    val loginError:String? = null
)