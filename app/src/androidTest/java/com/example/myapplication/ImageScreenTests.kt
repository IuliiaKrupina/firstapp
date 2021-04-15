package com.example.myapplication

import com.example.myapplication.Screens.ImageScreen
import com.example.myapplication.Screens.MainScreen
import org.junit.Test

class ImageScreenTests: BaseTestCase() {
    @Test
    fun imageViewIsDisplayed() {
        MainScreen()
            .openImageScreen()

        ImageScreen()
            .shouldBeDisplayedImageScreen()
    }
}