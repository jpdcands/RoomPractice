package com.ebookfrenzy.roompractice

import Database.VerticalTractionDao
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class VerticalTractionViewModel(val dao: VerticalTractionDao) : ViewModel() {
    var newVerticalTractionDate = ""
    private val verticalTraction = dao.getAll()
    val verticalTractionString = Transformations.map(verticalTraction) {
            verticalTraction -> formatVerticalTraction(verticalTraction)
}

    fun addVerticalTraction() {
        viewModelScope.launch {
            val verticalTraction = VerticalTraction()
            verticalTraction.verticalTractionDate = newVerticalTractionDate
            dao.insert(verticalTraction)
        }
    }

    fun formatVerticalTraction(verticalTraction: List<VerticalTraction>): String {
        return verticalTraction.fold("") {
            str, item -> str + '\n' + formatVerticalTraction(item)
        }
}
    fun formatVerticalTraction(verticalTraction: VerticalTraction): Int {
        var str = "ID: ${verticalTraction.verticalTractionId}"
        str += '\n' + "Date: ${verticalTraction.verticalTractionDate}"
        str += '\n' + "Complete: ${task.taskDone}" + '\n'
        str += '\n' + "Complete: ${task.taskDone}" + '\n'
        return str
    }

    }