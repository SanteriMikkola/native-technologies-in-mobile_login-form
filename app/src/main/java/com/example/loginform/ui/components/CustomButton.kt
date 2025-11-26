package com.example.loginform.ui.components

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CustomButton(modifier: Modifier = Modifier){
    Button(
        onClick = {},
        modifier = modifier
            .height(60.dp)
    ) {
        Text(
            text = "Submit",
            style = MaterialTheme.typography.bodySmall
        )
    }
}