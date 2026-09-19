package edu.iau.cshj.csc402.lab2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.iau.cshj.csc402.lab2.ui.theme.AndroidGreen
import edu.iau.cshj.csc402.lab2.ui.theme.Navy
import edu.iau.cshj.csc402.lab2.ui.theme.ScreenBackground

data class TeamTask(
    val id: Int,
    val title: String,
    val owner: String,
    val isDone: Boolean = false
)

@Composable
fun TaskTrackerScreen() {

    val tasks = remember {
        mutableStateListOf(
            TeamTask(1, "Create GitHub repository", "Fatimah", true),
            TeamTask(2, "Write project proposal", "Omar", true),
            TeamTask(3, "Design the login screen", "Noura", false),
            TeamTask(4, "Set up Android Studio", "Yousef", false)
        )
    }

    val done = tasks.count { it.isDone }
    val open = tasks.size - done
    val total = tasks.size

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
                "Team Task Tracker",
                color = Color.White,
                fontWeight = FontWeight.Bold
            )

            Text(
                "Task 11 - Challenge",
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

        Spacer(Modifier.height(10.dp))

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 12.dp)
        ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Navy)
                    .padding(14.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {

                SummaryItem(done.toString(), "Done", AndroidGreen)
                SummaryItem(open.toString(), "Open", Color.White)
                SummaryItem(total.toString(), "Total", Color.White)
            }
        }

        LazyColumn(
            modifier = Modifier.weight(1f),
            contentPadding = PaddingValues(12.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {

            items(
                items = tasks,
                key = { it.id }
            ) { task ->

                TaskRow(
                    task = task,
                    onToggle = {

                        val index =
                            tasks.indexOfFirst { it.id == task.id }

                        if (index != -1) {
                            tasks[index] =
                                task.copy(isDone = !task.isDone)
                        }
                    }
                )
            }
        }

        Button(
            onClick = {

                val nextId =
                    (tasks.maxOfOrNull { it.id } ?: 0) + 1

                tasks.add(
                    TeamTask(
                        id = nextId,
                        title = "New task",
                        owner = "Elaf al nutayf"
                    )
                )
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp)
        ) {
            Text("+  Add task")
        }
    }
}

@Composable
fun SummaryItem(
    value: String,
    label: String,
    valueColor: Color
) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            value,
            color = valueColor,
            fontWeight = FontWeight.Bold
        )

        Text(
            label,
            color = Color.LightGray,
            fontSize = 10.sp
        )
    }
}

@Composable
fun TaskRow(
    task: TeamTask,
    onToggle: () -> Unit
) {

    Card(
        modifier = Modifier.fillMaxWidth()
    ) {

        Row(
            modifier = Modifier.padding(10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            Checkbox(
                checked = task.isDone,
                onCheckedChange = {
                    onToggle()
                }
            )

            Column {

                Text(
                    text = task.title,
                    color =
                        if (task.isDone)
                            Color.Gray
                        else
                            Navy,
                    textDecoration =
                        if (task.isDone)
                            TextDecoration.LineThrough
                        else
                            TextDecoration.None,
                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = task.owner,
                    color = Color.Gray,
                    fontSize = 11.sp
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TaskTrackerScreenPreview() {
    TaskTrackerScreen()
}