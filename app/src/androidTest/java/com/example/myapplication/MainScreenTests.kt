package com.example.myapplication

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.myapplication.Screens.ImageScreen
import com.example.myapplication.Screens.MainScreen
import org.junit.Test
import org.junit.runner.RunWith


class MainScreenTests: BaseTestCase() {

    @Test
    fun countButtonIsDisplayed() {
        MainScreen().shouldBeDisplayedCountButton()
    }

    @Test
    fun countTextIsDisplayed() {
        MainScreen().shouldBeValueInTextView("0")
    }

    @Test
    fun incrementTextWithCount() {
        MainScreen()
          .shouldBeValueInTextView("0")
          .pressCountButton()
          .shouldBeValueInTextView("1")
    }
}