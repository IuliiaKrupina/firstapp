package com.example.myapplication
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.doubleClick
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*


open class EspressoBaseTest {
    open fun clickButton (resourceId: Int) {
        onView(withId(resourceId)).
        perform(click()).
        check(matches(isDisplayed()))
    }
    open fun resultClickButton (resourceId: Int) {
        onView(withId(resourceId))
            .check(matches(withText("1")))
    }
    open fun doubleClickButton (resourceId: Int) {
        onView(withId(resourceId))
            .perform(doubleClick())
            .check(matches(isDisplayed()))
    }
    open fun resultDoubleClickButton (resourceId: Int) {
        onView(withId(resourceId))
            .check(matches(withText("2")))
    }

}

