package com.example.lab03

import android.content.res.Configuration
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lab03.ui.theme.Lab03Theme

private val previewStudent = Student(
    name = "Ahmed Al-Qahtani",
    program = "Computer Science - Level 6",
    gpa = "4.62",
    email = "202000123@iau.edu.sa",
    city = "Jubail, Eastern Province"
)

@Preview(
    name = "Light Mode",
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_NO
)
@Composable
fun StudentCardLightPreview() {
    Lab03Theme {
        StudentCardTask6(
            student = previewStudent,
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Preview(
    name = "Dark Mode",
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES
)
@Composable
fun StudentCardDarkPreview() {
    Lab03Theme {
        StudentCardTask6(
            student = previewStudent,
            modifier = Modifier.padding(16.dp)
        )
    }
}