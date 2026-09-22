package com.example.lab03

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lab03.ui.theme.Lab03Theme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen(modifier: Modifier = Modifier) {

    val sampleStudent = Student(
        name = "Ahmed Al-Qahtani",
        program = "Computer Science - Level 6",
        gpa = "4.62",
        email = "202000123@iau.edu.sa",
        city = "Jubail, Eastern Province"
    )

    Scaffold(
        modifier = modifier,

        topBar = {
            TopAppBar(
                title = {
                    Text("My Profile")
                }
            )
        },

        floatingActionButton = {
            FloatingActionButton(
                onClick = { }
            ) {
                Icon(
                    imageVector = Icons.Default.Edit,
                    contentDescription = "Edit profile"
                )
            }
        }

    ) { innerPadding ->

        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(16.dp)
        ) {
            StudentCardTask6(
                student = sampleStudent
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() {
    Lab03Theme {
        ProfileScreen()
    }
}