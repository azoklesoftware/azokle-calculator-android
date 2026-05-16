package net.azokle.calculator.viewmodels

import android.content.Context
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.input.TextFieldValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import net.azokle.calculator.CalculatorApplication
import net.azokle.calculator.data.CalculatorEvent
import net.azokle.calculator.data.EventHandler

class CalculatorViewModel(context: Context) : ViewModel() {

    private val eventHandler =
        EventHandler(context, onUpdateHistory = this::onUpdateHistory)
    var displayText by mutableStateOf(TextFieldValue(""))

    var history: MutableList<String> = mutableStateListOf()

    fun setExpression(text: String) {
        displayText = TextFieldValue(text)
    }

    fun onEvent(event: CalculatorEvent) {
        displayText = eventHandler.processEvent(event, displayText)
    }

    private fun onUpdateHistory(item: String) {
        history.add(item)
    }

    companion object {
        val Factory = viewModelFactory {
            initializer {
                val application = this[APPLICATION_KEY] as CalculatorApplication
                CalculatorViewModel(application)
            }
        }
    }
}