package com.example.myapplication.Screens

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import com.example.myapplication.R

class MainScreen : BaseScreen() {
    private val buttonCount = onView(withId(R.id.count_button2))
    private val textCount = onView(withId(R.id.textView))
    private val randomButton = onView(withId(R.id.random_button3))

    fun pressCountButton() : MainScreen {
        buttonCount.check(matches(isDisplayed()))
        buttonCount.perform(ViewActions.click())
        return MainScreen()
    }

    fun shouldBeDisplayedCountButton() : MainScreen {
        buttonCount.check(matches(isDisplayed()))
        return MainScreen()
    }

    fun shouldBeValueInTextView(value: String) : MainScreen {
        textCount.check(matches(isDisplayed()))
        textCount.check(matches(withText(value)))
        return MainScreen()
    }

    fun openImageScreen() : ImageScreen {
        randomButton.check(matches(isDisplayed()))
        randomButton.perform(click())
        return ImageScreen()
    }
}