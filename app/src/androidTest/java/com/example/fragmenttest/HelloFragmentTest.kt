package com.example.fragmenttest

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@LargeTest
class HelloFragmentTest {
    @get:Rule
    var activityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun testBtnEventFragment() {
        onView(withId(R.id.button)).perform(click())
    }
}