package com.example.loginform.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.example.loginform.ui.components.CustomButton
import com.example.loginform.ui.components.OutlinedTextFieldText
import com.example.loginform.ui.components.TitleText

@Composable
fun Login(modifier: Modifier = Modifier){
    val screenModifier = modifier.fillMaxWidth()
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var passwordVisibility: Boolean by remember { mutableStateOf(false) }
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = screenModifier.padding(15.dp, 95.dp, 15.dp, 0.dp)
    )   {
        TitleText(
            text = "Login"
        )
        Spacer(Modifier.height(40.dp))
        OutlinedTextField(
            label = { OutlinedTextFieldText("Username") },
            value = username,
            onValueChange = { username = it} ,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            trailingIcon = {
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = "Email icon"
                )
            },
            modifier = screenModifier
        )
        OutlinedTextField(
            label = {OutlinedTextFieldText("Password")},
            value = password,
            onValueChange = { password = it },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            trailingIcon = {
                Icon(
                    imageVector = Icons.Default.Lock,
                    contentDescription = "Lock icon"
                )
            },
            visualTransformation = if (passwordVisibility) VisualTransformation.None else PasswordVisualTransformation(),
            modifier = screenModifier
        )
        Spacer(Modifier.height(10.dp))
        CustomButton(
            modifier = screenModifier
        )
    }
}