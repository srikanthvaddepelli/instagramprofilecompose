package com.example.instagramprofile.ui.compose.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun ProfileFollowButton(text: String) {
    Box(
        modifier = Modifier
            .width(120.dp)
            .background(Color.Blue, RoundedCornerShape(6.dp))
            .padding(vertical = 6.dp, horizontal = 16.dp)
    ) {
        Text(
            text = text,
            color = Color.White,
            fontSize = 14.sp,
            modifier = Modifier.align(alignment = Alignment.Center)
        )
    }
}

@Composable
fun ProfileButton(text: String) {
    Box(
        modifier = Modifier
            .width(120.dp)
            .border(1.dp, Color.Gray, RoundedCornerShape(6.dp))
            .padding(vertical = 6.dp, horizontal = 16.dp)
    ) {
        Text(
            text = text,
            color = Color.White,
            fontSize = 14.sp,
            modifier = Modifier.align(alignment = Alignment.Center)
        )
    }
}