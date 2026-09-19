package edu.iau.cshj.csc402.lab2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
fun GreetingCard() {

    var name by remember { mutableStateOf("") }
    var submittedName by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
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
                "Greeting Card",
                color = Color.White,
                fontWeight = FontWeight.Bold
            )

            Text(
                "Task 9 - TextField & state",
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

        Column(
            modifier = Modifier.padding(16.dp)
        ) {

            OutlinedTextField(
                value = name,
                onValueChange = {
                    name = it
                },
                label = {
                    Text("Your name")
                },
                singleLine = true,
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(Modifier.height(12.dp))

            Button(
                onClick = {
                    submittedName = name.trim()
                },
                enabled = name.isNotBlank(),
                modifier = Modifier.fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(
                    containerColor = AndroidGreen
                )
            ) {
                Text("Show greeting")
            }

            Spacer(Modifier.height(20.dp))

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(140.dp)
            ) {

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    contentAlignment = Alignment.Center
                ) {

                    if (submittedName.isBlank()) {

                        Text(
                            text = "Type your name above\nto see the greeting.",
                            textAlign = TextAlign.Center,
                            color = Color.Gray
                        )

                    } else {

                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {

                            Text(
                                text = "Marhaba, $submittedName!",
                                fontWeight = FontWeight.Bold,
                                fontSize = 22.sp
                            )

                            Spacer(Modifier.height(6.dp))

                            Text(
                                text = "Your name has ${submittedName.length} letters.",
                                color = Color.Gray
                            )

                            Spacer(Modifier.height(10.dp))

                            Text(
                                text = "CSC 402 - Lab 2",
                                color = AndroidGreen,
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingCardPreview() {
    GreetingCard()
}