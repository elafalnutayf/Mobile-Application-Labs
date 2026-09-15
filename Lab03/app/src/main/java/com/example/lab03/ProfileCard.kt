package com.example.lab03

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

data class Student(
    val name: String,
    val program: String,
    val gpa: String,
    val email: String,
    val city: String
)

@Composable
fun StudentCard(
    student: Student,
    modifier: Modifier = Modifier
) {
}

@Preview(showBackground = true)
@Composable
private fun StudentCardPreview() {
    StudentCard(
        student = Student(
            name = "Ahmed Al-Qahtani",
            program = "Computer Science - Level 6",
            gpa = "4.62",
            email = "202000123@iau.edu.sa",
            city = "Jubail, Eastern Province"
        )
    )
}
