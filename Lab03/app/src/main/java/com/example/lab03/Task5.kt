package com.example.lab03

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.height

@Composable
fun StudentCardTask5(
    student: Student,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier.fillMaxWidth()
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {

                Box {

                    Box(
                        modifier = Modifier
                            .size(52.dp)
                            .clip(CircleShape)
                            .background(MaterialTheme.colorScheme.primary),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "AQ",
                            color = MaterialTheme.colorScheme.onPrimary
                        )
                    }

                    Box(
                        modifier = Modifier
                            .size(16.dp)
                            .align(Alignment.BottomEnd)
                            .clip(CircleShape)
                            .background(MaterialTheme.colorScheme.surface),
                        contentAlignment = Alignment.Center
                    ) {
                        Box(
                            modifier = Modifier
                                .size(10.dp)
                                .clip(CircleShape)
                                .background(MaterialTheme.colorScheme.tertiary)
                        )
                    }
                }

                Spacer(modifier = Modifier.width(12.dp))

                Column(
                    modifier = Modifier.weight(1f)
                ) {
                    Text(
                        text = student.name,
                        color = MaterialTheme.colorScheme.onSurface
                    )

                    Text(
                        text = student.program,
                        color = MaterialTheme.colorScheme.onSurfaceVariant
                    )
                }

                Text(
                    text = student.gpa,
                    color = MaterialTheme.colorScheme.primary
                )
            }

            HorizontalDivider()

            Text(
                text = student.email,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )

            Text(
                text = student.city,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun StudentCardTask5Preview() {
    Column {
        Spacer(modifier = Modifier.height(70.dp))

        StudentCardTask5(
            student = Student(
                name = "Ahmed Al-Qahtani",
                program = "Computer Science - Level 6",
                gpa = "4.62",
                email = "202000123@iau.edu.sa",
                city = "Jubail, Eastern Province"
            ),
            modifier = Modifier.padding(horizontal = 16.dp)
        )
    }
}