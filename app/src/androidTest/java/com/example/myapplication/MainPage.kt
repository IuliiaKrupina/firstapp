package com.example.myapplication

import com.example.myapplication.R.id.count_button2
import com.example.myapplication.R.id.textView


class MainPage : EspressoBaseTest() {
    fun getMainPageButton(): Int {
        return count_button2
    }

    fun getMainPageTextView(): Int {
        return textView
    }

    override fun clickButton(resourceId: Int) {
        super.clickButton(resourceId)
    }

    override fun resultClickButton(resourceId: Int) {
        super.resultClickButton(resourceId)
    }

    override fun doubleClickButton(resourceId: Int) {
        super.doubleClickButton(resourceId)
    }

    override fun resultDoubleClickButton(resourceId: Int) {
        super.resultDoubleClickButton(resourceId)
    }
}