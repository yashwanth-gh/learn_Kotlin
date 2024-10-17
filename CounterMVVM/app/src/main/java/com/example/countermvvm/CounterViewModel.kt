package com.example.countermvvm

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel(private val repository: CounterRepository) : ViewModel() {
    private val _count = mutableIntStateOf(repository.getCounter().count)

    // Expose the _count as immutable state
    val count : MutableState<Int> = _count

    fun increment(){
        repository.increment()
        _count.intValue = repository.getCounter().count
    }

    fun decrement(){
        repository.decrement()
        _count.intValue = repository.getCounter().count
    }
}