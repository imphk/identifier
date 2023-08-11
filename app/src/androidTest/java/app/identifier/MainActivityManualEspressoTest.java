package app.identifier;


import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.ViewInteraction;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withHint;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

//import androidx.test.rule.ActivityTestRule;
//import androidx.test.runner.AndroidJUnit4;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityManualEspressoTest {

    @Rule
    public ActivityScenarioRule<MainActivity> mActivityTestRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void checkIsDisplayedTest() {
        onView(withId(R.id.label)).check(matches(isDisplayed()));
        onView(withId(R.id.input)).check(matches(isDisplayed()));
        onView(withId(R.id.output)).check(matches(isDisplayed()));
        onView(withId(R.id.validateBtn)).check(matches(isDisplayed()));
    }

    @Test
    public void validIdentifierTest() {
        onView(withId(R.id.output)).check(matches(withText("Validation Result")));
        onView(withId(R.id.input)).perform(typeText("abc"));
        Espresso.closeSoftKeyboard();
        onView(withId(R.id.validateBtn)).perform(click());
        onView(withId(R.id.output)).check(matches(withText("Valid")));
    }
}
