package com.example.myapplication

import androidx.test.rule.ActivityTestRule
import org.junit.Before
import org.junit.Rule

open class BaseTestCase {

    @Rule
    @JvmField
    val activityTestRule: ActivityTestRule<MainActivity> = ActivityTestRule(MainActivity::class.java)

    @Before
    fun setUp() {
    }
}