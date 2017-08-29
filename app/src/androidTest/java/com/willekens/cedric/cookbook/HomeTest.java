package com.willekens.cedric.cookbook;

import android.support.test.filters.SmallTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

/**
 * Created by cedri on 8/29/2017.
 */

@RunWith(AndroidJUnit4.class)
@SmallTest
public class HomeTest {

    @Rule
    public ActivityTestRule<Home> homeActivityTestRule = new ActivityTestRule<>(Home.class);

    @Test
    public void checkCorrectTest() {
        final String expectedResult = "Welcome to your Cookbook";
        onView(withId(R.id.welcome_message)).check(matches(withText(expectedResult)));
    }

}
