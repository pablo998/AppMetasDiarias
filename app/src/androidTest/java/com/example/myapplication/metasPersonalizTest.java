package com.example.myapplication;


import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import androidx.test.espresso.DataInteraction;
import androidx.test.espresso.ViewInteraction;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withClassName;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.Matchers.is;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class metasPersonalizTest {

    @Rule
    public ActivityTestRule<inicioActivity> mActivityTestRule = new ActivityTestRule<>(inicioActivity.class);

    @Test
    public void metasPersonalizTest() {
        ViewInteraction appCompatButton = onView(
                allOf(withId(R.id.botonTransparente),
                        childAtPosition(
                                allOf(withId(R.id.linearLayout),
                                        childAtPosition(
                                                withId(android.R.id.content),
                                                0)),
                                3),
                        isDisplayed()));
        appCompatButton.perform(click());

        ViewInteraction appCompatButton2 = onView(
                allOf(withId(R.id.registrarme), withText("Registrarme"),
                        childAtPosition(
                                allOf(withId(R.id.linearLayout),
                                        childAtPosition(
                                                withId(android.R.id.content),
                                                0)),
                                5),
                        isDisplayed()));
        appCompatButton2.perform(click());

        ViewInteraction appCompatButton3 = onView(
                allOf(withId(R.id.registrarmeButton), withText("Registrarme"),
                        childAtPosition(
                                allOf(withId(R.id.linearLayout),
                                        childAtPosition(
                                                withId(android.R.id.content),
                                                0)),
                                7),
                        isDisplayed()));
        appCompatButton3.perform(click());

        ViewInteraction appCompatButton4 = onView(
                allOf(withId(R.id.menuOpcion4),
                        childAtPosition(
                                allOf(withId(R.id.linearLayout),
                                        childAtPosition(
                                                withId(android.R.id.content),
                                                0)),
                                14),
                        isDisplayed()));
        appCompatButton4.perform(click());

        ViewInteraction appCompatSpinner = onView(
                allOf(withId(R.id.sexoSpinnerMetasPer),
                        childAtPosition(
                                allOf(withId(R.id.relativeLayoutMetasPers1),
                                        childAtPosition(
                                                withId(R.id.linearLayout),
                                                6)),
                                0),
                        isDisplayed()));
        appCompatSpinner.perform(click());

        DataInteraction appCompatTextView = onData(anything())
                .inAdapterView(childAtPosition(
                        withClassName(is("android.widget.PopupWindow$PopupBackgroundView")),
                        0))
                .atPosition(1);
        appCompatTextView.perform(click());

        ViewInteraction appCompatSpinner2 = onView(
                allOf(withId(R.id.añosSpinnerMetasPer),
                        childAtPosition(
                                allOf(withId(R.id.relativeLayoutMetasPers1),
                                        childAtPosition(
                                                withId(R.id.linearLayout),
                                                6)),
                                1),
                        isDisplayed()));
        appCompatSpinner2.perform(click());

        DataInteraction appCompatTextView2 = onData(anything())
                .inAdapterView(childAtPosition(
                        withClassName(is("android.widget.PopupWindow$PopupBackgroundView")),
                        0))
                .atPosition(3);
        appCompatTextView2.perform(click());

        ViewInteraction appCompatSpinner3 = onView(
                allOf(withId(R.id.mesesSpinnerMetasPer),
                        childAtPosition(
                                allOf(withId(R.id.relativeLayoutMetasPers2),
                                        childAtPosition(
                                                withId(R.id.linearLayout),
                                                7)),
                                1),
                        isDisplayed()));
        appCompatSpinner3.perform(click());

        DataInteraction appCompatTextView3 = onData(anything())
                .inAdapterView(childAtPosition(
                        withClassName(is("android.widget.PopupWindow$PopupBackgroundView")),
                        0))
                .atPosition(2);
        appCompatTextView3.perform(click());

        ViewInteraction appCompatSpinner4 = onView(
                allOf(withId(R.id.diasSpinnerMetasPer),
                        childAtPosition(
                                allOf(withId(R.id.relativeLayoutMetasPers2),
                                        childAtPosition(
                                                withId(R.id.linearLayout),
                                                7)),
                                0),
                        isDisplayed()));
        appCompatSpinner4.perform(click());

        DataInteraction appCompatTextView4 = onData(anything())
                .inAdapterView(childAtPosition(
                        withClassName(is("android.widget.PopupWindow$PopupBackgroundView")),
                        0))
                .atPosition(2);
        appCompatTextView4.perform(click());

        ViewInteraction appCompatButton5 = onView(
                allOf(withId(R.id.obtenerMetasPersoBtn),
                        childAtPosition(
                                allOf(withId(R.id.linearLayout),
                                        childAtPosition(
                                                withId(android.R.id.content),
                                                0)),
                                8),
                        isDisplayed()));
        appCompatButton5.perform(click());

        ViewInteraction appCompatButton6 = onView(
                allOf(withId(R.id.dia1calendar), withText("1"),
                        childAtPosition(
                                allOf(withId(R.id.linearLayout),
                                        childAtPosition(
                                                withId(android.R.id.content),
                                                0)),
                                12),
                        isDisplayed()));
        appCompatButton6.perform(click());

        ViewInteraction tabView = onView(
                allOf(withContentDescription("Comida"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tabsMetasPerso),
                                        0),
                                1),
                        isDisplayed()));
        tabView.perform(click());



        ViewInteraction tabView2 = onView(
                allOf(withContentDescription("Deporte"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tabsMetasPerso),
                                        0),
                                2),
                        isDisplayed()));
        tabView2.perform(click());


        ViewInteraction tabView3 = onView(
                allOf(withContentDescription("Level Up"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tabsMetasPerso),
                                        0),
                                0),
                        isDisplayed()));
        tabView3.perform(click());

        ViewInteraction actionMenuItemView = onView(
                allOf(withId(R.id.item3), withContentDescription("appLogo"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.myToolBar),
                                        1),
                                0),
                        isDisplayed()));
        actionMenuItemView.perform(click());
    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View>() {
            @Override
            public void describeTo(Description description) {
                description.appendText("Child at position " + position + " in parent ");
                parentMatcher.describeTo(description);
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent();
                return parent instanceof ViewGroup && parentMatcher.matches(parent)
                        && view.equals(((ViewGroup) parent).getChildAt(position));
            }
        };
    }
}
