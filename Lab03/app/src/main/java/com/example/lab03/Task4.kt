package com.example.lab03

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.clickable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun ChainA(modifier: Modifier = Modifier) {
    Text(
        "content",
        modifier = modifier
            .background(Color(0xFF3DDC84))
            .padding(24.dp)
    )
}

@Composable
fun ChainB(modifier: Modifier = Modifier) {
    Text(
        "content",
        modifier = modifier
            .padding(24.dp)
            .background(Color(0xFF3DDC84))
    )
}

@Composable
fun ChainC(modifier: Modifier = Modifier) {
    Text(
        "content",
        modifier = modifier
            .clip(RoundedCornerShape(20.dp))
            .background(Color(0xFF3DDC84))
            .padding(24.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun ModifierOrderPreview() {
    Column {
        ChainA()
        ChainB()
        ChainC()
    }
}
@Composable
fun TapTargetTest() {

    var message by remember { mutableStateOf("Tap near the edge of each button") }

    Column {

        Text(
            text = "Clickable then Padding",
            modifier = Modifier
                .clickable {
                    message = "First button clicked"
                }
                .padding(16.dp)
                .background(Color(0xFF3DDC84))
        )

        Text(
            text = "Padding then Clickable",
            modifier = Modifier
                .padding(16.dp)
                .clickable {
                    message = "Second button clicked"
                }
                .background(Color(0xFF3DDC84))
        )

        Text(
            text = message,
            modifier = Modifier.padding(top = 24.dp)
        )
    }
}

//@Preview(showBackground = true)
//@Composable
//fun TapTargetPreview() {
//    TapTargetTest()
//}