package com.example.hiltdemo

import android.util.Log
import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import javax.inject.Named

/**
 * Created by Nishant Kumar on 23-May-2021.
 */

@HiltViewModel
class TestViewModel @Inject constructor(
    @Named("String2") testString2: String
): ViewModel() {

    init {
        Log.d(this::class.simpleName, "Test String from viewModel: $testString2")
    }
}