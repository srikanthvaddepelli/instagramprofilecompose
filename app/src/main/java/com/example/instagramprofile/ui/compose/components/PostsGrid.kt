package com.example.instagramprofile.ui.compose.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.instagramprofile.R

@Composable
fun PostsGrid() {
    val images = listOf(
        R.drawable.post1,
        R.drawable.post2,
        R.drawable.post3,
        R.drawable.post3,
        R.drawable.post1,
        R.drawable.post2,
        R.drawable.post1,
        R.drawable.post2,
        R.drawable.post3,
        R.drawable.post3,
        R.drawable.post1,
        R.drawable.post2,
    )
    LazyVerticalGrid(
        columns = GridCells.Fixed(3),
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
    ) {
        items(images.size) { index ->
            Image(
                painter = painterResource(id = images[index]),
                contentDescription = "Post",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .aspectRatio(1f)
                    .padding(1.dp)
            )
        }
    }
}