package net.azokle.calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import net.azokle.calculator.ui.MainScreen
import net.azokle.calculator.ui.theme.AzokleCalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AzokleCalculatorTheme {
                // A surface container using the 'background' color from the theme
                MainScreen()
            }
        }
    }
}