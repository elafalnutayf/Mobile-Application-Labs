package com.example.lab03

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun StudentCardTask2(
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

                Column(
                    modifier = Modifier.weight(1f)
                ) {
                    Text(text = student.name)
                    Text(text = student.program)
                }

                Text(text = student.gpa)
            }

            HorizontalDivider()

            Text(text = student.email)
            Text(text = student.city)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun StudentCardTask2Preview() {
    StudentCardTask2(
        student = Student(
            name = "Ahmed Al-Qahtani",
            program = "Computer Science - Level 6",
            gpa = "4.62",
            email = "202000123@iau.edu.sa",
            city = "Jubail, Eastern Province"
        ),
        modifier = Modifier.padding(16.dp)
    )
}
