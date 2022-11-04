package com.example.quadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterStart
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quadrant.ui.theme.QuadrantTheme
import kotlin.math.floor

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuadrantTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    QuadrantApp()
                }
            }
        }
    }
}

@Composable
private fun QuadrantApp() {
    Column {
        Row(modifier = Modifier.weight(weight = 1F, fill = true)) {
            Row(modifier = Modifier.weight(weight = 1F, fill = true)) {
                SingleQuadrant(
                    title = stringResource(R.string.first_title),
                    content = stringResource(R.string.first_content),
                    bgColor = Color.Green
                )
            }
            Row(modifier = Modifier.weight(weight = 1F, fill = true)) {
                SingleQuadrant(
                    title = stringResource(R.string.second_title),
                    content = stringResource(R.string.second_content),
                    bgColor = Color.Yellow
                )
            }
        }
        Row(modifier = Modifier.weight(weight = 1F, fill = true)) {
            Row(modifier = Modifier.weight(weight = 1F, fill = true)) {
                SingleQuadrant(
                    title = stringResource(R.string.third_title),
                    content = stringResource(R.string.third_content),
                    bgColor = Color.Cyan
                )
            }
            Row(modifier = Modifier.weight(weight = 1F, fill = true)) {
                SingleQuadrant(
                    title = stringResource(R.string.fourth_title),
                    content = stringResource(R.string.fourth_content),
                    bgColor = Color.LightGray
                )
            }
        }
    }
}

@Composable
private fun SingleQuadrant(title: String, content: String, bgColor: Color) {
    Column(
        modifier = Modifier
            .background(color = bgColor)
            .padding(all = 16.dp)
            .fillMaxWidth()
            .fillMaxHeight()
            .wrapContentHeight(Alignment.CenterVertically)
    ) {

        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(bottom = 16.dp)
                .fillMaxWidth()
                .wrapContentWidth(Alignment.CenterHorizontally),
            textAlign = TextAlign.Justify
        )



        Text(
            text = content,
            modifier = Modifier.wrapContentWidth(Alignment.CenterHorizontally),
            textAlign = TextAlign.Justify
        )

    }

}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun QuadrantPreview() {
    QuadrantTheme {
        QuadrantApp()
    }
}