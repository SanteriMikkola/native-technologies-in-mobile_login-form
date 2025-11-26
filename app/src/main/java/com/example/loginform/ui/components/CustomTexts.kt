package com.example.loginform.ui.components

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TitleText(text: String, modifier: Modifier = Modifier){
    Text(
        text = text,
        style = MaterialTheme.typography.titleLarge,
        modifier = modifier
    )
}

@Composable
fun OutlinedTextFieldText(text: String, modifier: Modifier = Modifier){
    Text(
        text = text,
        style = MaterialTheme.typography.labelSmall,
        modifier = modifier
    )
}