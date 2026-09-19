package edu.iau.cshj.csc402.lab2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.iau.cshj.csc402.lab2.ui.theme.AndroidGreen
import edu.iau.cshj.csc402.lab2.ui.theme.Navy
import edu.iau.cshj.csc402.lab2.ui.theme.ScreenBackground

@Composable
fun StudentIdScreen(modifier: Modifier = Modifier) {

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
                text = "Student ID",
                color = Color.White,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "Task 7 - Row & Column",
                color = Color.LightGray,
                fontSize = 12.sp
            )
        }

        Box(
            Modifier
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

            Column {

                Row(
                    modifier = Modifier.padding(16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Box(
                        modifier = Modifier
                            .size(60.dp)
                            .clip(CircleShape)
                            .background(Navy),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "EA",
                            color = AndroidGreen,
                            fontWeight = FontWeight.Bold
                        )
                    }

                    Spacer(Modifier.width(12.dp))

                    Column {
                        Text(
                            text = "Elaf Hassan Al-Nutayf",
                            fontWeight = FontWeight.Bold
                        )

                        Text(
                            text = "Computer Science",
                            color = Color.Gray
                        )

                        Text(
                            text = "2240005931",
                            fontFamily = FontFamily.Monospace,
                            color = Color.Gray
                        )

                        Spacer(Modifier.height(6.dp))

                        Row {
                            Box(
                                modifier = Modifier
                                    .clip(RoundedCornerShape(50))
                                    .background(AndroidGreen.copy(alpha = 0.15f))
                                    .padding(horizontal = 8.dp, vertical = 4.dp)
                            ) {
                                Text(
                                    "Level 7",
                                    color = AndroidGreen,
                                    fontSize = 11.sp
                                )
                            }

                            Spacer(Modifier.width(6.dp))

                            Box(
                                modifier = Modifier
                                    .clip(RoundedCornerShape(50))
                                    .background(Color.LightGray)
                                    .padding(horizontal = 8.dp, vertical = 4.dp)
                            ) {
                                Text(
                                    "CSHJ",
                                    fontSize = 11.sp
                                )
                            }
                        }
                    }
                }

                HorizontalDivider()
            }
        }

        Spacer(Modifier.height(12.dp))

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                StatItem("4.42", "GPA")
                StatItem("78", "Credits")
                StatItem("Active", "Status")
            }
        }
    }
}

@Composable
fun StatItem(value: String, label: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = value,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = label,
            color = Color.Gray,
            fontSize = 11.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun StudentIdScreenPreview() {
    StudentIdScreen()
}