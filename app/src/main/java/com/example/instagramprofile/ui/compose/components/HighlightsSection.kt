package com.example.instagramprofile.ui.compose.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.instagramprofile.R
import com.example.instagramprofile.data.ProfileHighlightsData

@Composable
fun HighlightsSection() {
    val highlights = listOf(
        ProfileHighlightsData("#Finance", R.drawable.post1),
        ProfileHighlightsData("#FAQ", R.drawable.post2),
        ProfileHighlightsData("#Loans", R.drawable.post3),
        ProfileHighlightsData("#Finance", R.drawable.post3),
        ProfileHighlightsData("#FAQ", R.drawable.post1),
        ProfileHighlightsData("#Loans", R.drawable.post2),
        ProfileHighlightsData("#Finance", R.drawable.post1),
        ProfileHighlightsData("#FAQ", R.drawable.post2),
        ProfileHighlightsData("#Loans", R.drawable.post3),
        ProfileHighlightsData("#Finance", R.drawable.post3),
        ProfileHighlightsData("#FAQ", R.drawable.post1),
        ProfileHighlightsData("#Loans", R.drawable.post2),
    )
    LazyRow(modifier = Modifier.padding(horizontal = 16.dp)) {
        for (it in highlights) {
            item {
                Column(modifier = Modifier, horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(
                        painter = painterResource(id = it.imageResId),
                        contentDescription = "Post",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(64.dp)
                            .clip(CircleShape)
                            .border(1.dp, Color.Gray, CircleShape)
                    )
                    Spacer(Modifier.height(4.dp))
                    Text(it.title, color = Color.White, fontSize = 12.sp)
                }
                Spacer(Modifier.width(12.dp))
            }
        }
    }
}