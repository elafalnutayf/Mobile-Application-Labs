package edu.iau.cshj.csc402.lab2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.iau.cshj.csc402.lab2.ui.theme.AndroidGreen
import edu.iau.cshj.csc402.lab2.ui.theme.Navy
import edu.iau.cshj.csc402.lab2.ui.theme.ScreenBackground

@Composable
fun WelcomeScreen(modifier: Modifier = Modifier) {

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(ScreenBackground)
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Navy)
                .padding(16.dp)
        ) {
            Text(
                text = "CSC 402 Lab 2",
                color = Color.White,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "Task 6 - My First Screen",
                color = Color.LightGray,
                fontSize = 12.sp
            )
        }

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(3.dp)
                .background(AndroidGreen)
        )

        Spacer(Modifier.height(16.dp))

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        ) {

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(24.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Box(
                    modifier = Modifier
                        .size(60.dp)
                        .clip(CircleShape)
                        .background(Navy),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "JU",
                        color = AndroidGreen,
                        fontWeight = FontWeight.Bold
                    )
                }

                Spacer(Modifier.height(12.dp))

                Text(
                    text = "Hello, Jubail!",
                    fontSize = 26.sp,
                    fontWeight = FontWeight.Bold
                )

                Spacer(Modifier.height(6.dp))

                Text(
                    text = "Welcome to Mobile Application\nProgramming",
                    color = Color.Gray,
                    textAlign = TextAlign.Center
                )

                Spacer(Modifier.height(12.dp))

                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(50))
                        .background(AndroidGreen.copy(alpha = 0.15f))
                        .padding(horizontal = 12.dp, vertical = 6.dp)
                ) {
                    Text(
                        text = "Built with Jetpack Compose",
                        color = AndroidGreen,
                        fontWeight = FontWeight.Bold,
                        fontSize = 12.sp
                    )
                }
            }
        }

        Spacer(Modifier.height(16.dp))

        Text(
            text = "Everything on this screen is drawn\nby ONE composable function.",
            color = Color.Gray,
            modifier = Modifier.padding(horizontal = 16.dp),
            fontSize = 12.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun WelcomeScreenPreview() {
    WelcomeScreen()
}