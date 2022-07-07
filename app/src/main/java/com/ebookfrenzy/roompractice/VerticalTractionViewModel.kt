package com.ebookfrenzy.roompractice

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class VerticalTractionViewModel(val dao: VerticalTractionDao) : ViewModel() {
    var newVerticalTractionDate = Int

    fun addVerticalTraction() {
        viewModelScope.launch
            val verticalTraction = VerticalTraction()
            verticalTraction = newVerticalTractionDate
            dao.insert(verticalTraction)
    }
}