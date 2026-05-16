package net.azokle.calculator

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import net.azokle.calculator.ui.CalculatorScreen
import net.azokle.calculator.ui.screens.CharacterInputScreen
import net.azokle.calculator.ui.screens.ConverterGridScreen
import net.azokle.calculator.ui.screens.ConverterScreen
import net.azokle.calculator.ui.screens.graphing.GraphingScreen

@Composable
fun AppNavHost(modifier: Modifier = Modifier, navHostController: NavHostController) {
    NavHost(
        modifier = modifier,
        navController = navHostController,
        startDestination = Destination.Calculator.route
    ) {
        composable(route = Destination.Calculator.route) {
            CalculatorScreen()
        }

        composable(route = Destination.Converters.route) {
            ConverterGridScreen(onNavigate = {
                navHostController.navigateTo(it.route)
            })
        }

        composable(route = Destination.CharacterInput.route) {
            CharacterInputScreen()
        }

        composable(route = Destination.Graphing.route) {
            GraphingScreen()
        }

        Destination.Converter.values.forEach { converter ->
            composable(route = converter.route) {
                ConverterScreen(converter = converter.converter, converterName = converter.resId)
            }
        }
    }
}

fun NavHostController.navigateTo(route: String) = this.navigate(route) {
    launchSingleTop = true
    restoreState = true
}