package com.example.lab03

import android.content.res.Configuration
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lab03.ui.theme.Lab03Theme

@Composable
fun StudentListScreen(
    modifier: Modifier = Modifier
) {
    val students = listOf(
        Student(
            name = "Ahmed Al-Qahtani",
            program = "Computer Science - Level 6",
            gpa = "4.62",
            email = "202000123@iau.edu.sa",
            city = "Jubail, Eastern Province"
        ),
        Student(
            name = "Sara Al-Harbi",
            program = "Computer Science - Level 6",
            gpa = "4.85",
            email = "202000124@iau.edu.sa",
            city = "Dammam, Eastern Province"
        ),
        Student(
            name = "Noura Al-Dosari",
            program = "Computer Science - Level 5",
            gpa = "4.51",
            email = "202000125@iau.edu.sa",
            city = "Khobar, Eastern Province"
        ),
        Student(
            name = "Reem Al-Otaibi",
            program = "Computer Science - Level 7",
            gpa = "4.70",
            email = "202000126@iau.edu.sa",
            city = "Qatif, Eastern Province"
        ),
        Student(
            name = "Layan Al-Zahrani",
            program = "Computer Science - Level 6",
            gpa = "4.93",
            email = "202000127@iau.edu.sa",
            city = "Dammam, Eastern Province"
        )
    )

    Scaffold(
        modifier = modifier
    ) { innerPadding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 12.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text("Students")
                Text("${students.size} students")
            }

            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(
                    start = 16.dp,
                    end = 16.dp,
                    bottom = 16.dp
                ),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                items(students) { student ->
                    StudentCardTask6(
                        student = student
                    )
                }
            }
        }
    }
}

@Preview(
    name = "Light Mode",
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_NO
)
@Composable
fun StudentListLightPreview() {
    Lab03Theme(darkTheme = false) {
        StudentListScreen()
    }
}

@Preview(
    name = "Dark Mode",
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES
)
@Composable
fun StudentListDarkPreview() {
    Lab03Theme(darkTheme = true) {
        StudentListScreen()
    }
}