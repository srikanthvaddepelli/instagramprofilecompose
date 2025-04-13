package com.example.instagramprofile.ui.compose.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.instagramprofile.R
import com.example.instagramprofile.ui.compose.components.HighlightsSection
import com.example.instagramprofile.ui.compose.components.PostsGrid
import com.example.instagramprofile.ui.compose.components.ProfileButton
import com.example.instagramprofile.ui.compose.components.ProfileFollowButton
import com.example.instagramprofile.ui.compose.components.ProfileStat
import com.example.instagramprofile.ui.compose.components.TopProfileToolbar


@Preview
@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        Spacer(Modifier.height(40.dp)) // Space for status bar
        TopProfileToolbar()
        Spacer(Modifier.height(10.dp))
        ProfileDetails()
        Spacer(Modifier.height(16.dp))
        HighlightsSection()
        Spacer(Modifier.height(16.dp))
        PostsGrid()
    }
}

@Composable
private fun ProfileDetails() {
    Column (modifier = Modifier.padding(horizontal = 16.dp)){
        Row(
            verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxWidth()
        ) {
            Image(
                painter = painterResource(R.drawable.logo), // Replace with actual image
                contentDescription = "Profile",
                modifier = Modifier
                    .size(80.dp)
                    .clip(CircleShape)
                    .border(2.dp, Color.Gray, CircleShape)
            )
            Spacer(Modifier.width(16.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                ProfileStat("1,687", "posts")
                ProfileStat("92.2K", "followers")
                ProfileStat("48", "following")
            }
        }
        Spacer(Modifier.height(8.dp))
        // Username & Bio
        Text("mPokket", color = Color.White, fontWeight = FontWeight.Bold)
        Text(
            "Personal Loan? Turant!\nStarting from ₹1,000 to ₹50,000\nRBI Registered NBFC",
            color = Color.White
        )
        Text(
            text = "🔗 click.mpkt.to/jr2q/j6jzmjzw and 2 more",
            color = Color.White,
            style = TextStyle(
                fontSize = 13.sp,
                fontWeight = FontWeight.Bold
            ),
            fontSize = 13.sp
        )
        Text("@mpokketofficial", color = Color.White, fontWeight = FontWeight.Bold)
        Spacer(Modifier.height(8.dp))
        Row(modifier = Modifier.fillMaxWidth()) {
            ProfileFollowButton("Follow")
            Spacer(modifier = Modifier.width(8.dp))
            ProfileButton("Message")
            Spacer(modifier = Modifier.width(8.dp))
            ProfileButton("Email")
        }
    }
}


