package com.example.jetpackcomposetutorial_3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackcomposetutorial_3.ui.theme.JetpackComposetutorial_3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposetutorial_3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    FourQuadrants()
                }
            }
        }
    }
}

@Composable
fun FourQuadrants(modifier: Modifier = Modifier) {
    Column (
        modifier = modifier.fillMaxWidth()
    )
    {
        Row (
            Modifier.weight(1f)
        ){
            Quadrant(
                Modifier.weight(1f),
                Color(0xFFEADDFF),
                stringResource(id = R.string.title1),
                stringResource(id = R.string.text1)
            )
            Quadrant(
                Modifier.weight(1f),
                Color(0xFFD0BCFF),
                stringResource(id = R.string.title2),
                stringResource(id = R.string.text2)
            )        }
        Row (
            Modifier.weight(1f)
        ){
            Quadrant(
                Modifier.weight(1f),
                Color(0xFFB69DF8),
                stringResource(id = R.string.title3),
                stringResource(id = R.string.text3)
            )
            Quadrant(
                Modifier.weight(1f),
                Color(0xFFF6EDFF),
                stringResource(id = R.string.title4),
                stringResource(id = R.string.text4)
            )        }
    }

}

@Composable
fun Quadrant(
    modifier: Modifier = Modifier,
    bg_color: Color = Color.Gray,
    title: String = "",
    text: String = ""
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color = bg_color)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Text(
            text = title,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
        Text(
            text = text,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposetutorial_3Theme {
        FourQuadrants()
    }
}