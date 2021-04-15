package com.example.myapplication.Screens

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.example.myapplication.R

class ImageScreen: BaseScreen() {
    private val imageView = onView(withId(R.id.imageView))

    fun shouldBeDisplayedImageScreen() : ImageScreen {
        imageView.check(matches(isDisplayed()))
        return ImageScreen()
    }
}