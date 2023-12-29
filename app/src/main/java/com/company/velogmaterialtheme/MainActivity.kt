package com.company.velogmaterialtheme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.company.velogmaterialtheme.ui.theme.Typography
import com.company.velogmaterialtheme.ui.theme.VelogMaterialThemeTheme
import com.company.velogmaterialtheme.ui.theme.custom1
import com.company.velogmaterialtheme.ui.theme.custom2
import com.company.velogmaterialtheme.ui.theme.custom3
import com.company.velogmaterialtheme.ui.theme.customShapes1
import com.company.velogmaterialtheme.ui.theme.customShapes2

val TEXT_SIZE = 30.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            VelogMaterialThemeTheme() {
                Surface(
                    color = MaterialTheme.colorScheme.background,
                    modifier = Modifier.fillMaxSize(),
                ) {
                    Check1()
                }
            }
        }
    }
}

@Composable
fun Check1() {
    Column {
        Text(
            text = "테스트1",
            color = MaterialTheme.colorScheme.primary,
            style = Typography.custom1
        )
        Text(
            text = "테스트2",
            color = MaterialTheme.colorScheme.onPrimary,
            style = Typography.custom2
        )
        Text(
            text = "테스트3",
            color = MaterialTheme.colorScheme.primaryContainer,
            style = Typography.custom3
        )
        Button(
            onClick = {},
            shape = customShapes1.large
        ) {

        }
        Button(
            onClick = {},
            shape = customShapes2.large
        ) {

        }
    }
}

@Preview
@Composable
fun Check1Preview() {
    VelogMaterialThemeTheme {
        Check1()
    }
}