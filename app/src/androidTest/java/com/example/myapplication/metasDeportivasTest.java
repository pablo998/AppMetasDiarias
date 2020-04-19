package com.example.myapplication;


import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

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

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class metasDeportivasTest {

    @Rule
    public ActivityTestRule<inicioActivity> mActivityTestRule = new ActivityTestRule<>(inicioActivity.class);

    @Test
    public void metasDeportivasTest() {
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
                allOf(withId(R.id.menuOpcion2),
                        childAtPosition(
                                allOf(withId(R.id.linearLayout),
                                        childAtPosition(
                                                withId(android.R.id.content),
                                                0)),
                                6),
                        isDisplayed()));
        appCompatButton4.perform(click());

        ViewInteraction appCompatButton5 = onView(
                allOf(withId(R.id.menuOpcion1),
                        childAtPosition(
                                allOf(withId(R.id.linearLayout),
                                        childAtPosition(
                                                withId(android.R.id.content),
                                                0)),
                                2),
                        isDisplayed()));
        appCompatButton5.perform(click());

        ViewInteraction tabView = onView(
                allOf(withContentDescription("Caminar"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tabsMetasPerso),
                                        0),
                                1),
                        isDisplayed()));
        tabView.perform(click());

        ViewInteraction tabView2 = onView(
                allOf(withContentDescription("Información"),
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

        ViewInteraction appCompatButton6 = onView(
                allOf(withId(R.id.menuOpcion2),
                        childAtPosition(
                                allOf(withId(R.id.linearLayout),
                                        childAtPosition(
                                                withId(android.R.id.content),
                                                0)),
                                6),
                        isDisplayed()));
        appCompatButton6.perform(click());

        ViewInteraction appCompatButton7 = onView(
                allOf(withId(R.id.menuOpcion2),
                        childAtPosition(
                                allOf(withId(R.id.linearLayout),
                                        childAtPosition(
                                                withId(android.R.id.content),
                                                0)),
                                5),
                        isDisplayed()));
        appCompatButton7.perform(click());

        ViewInteraction tabView4 = onView(
                allOf(withContentDescription("Correr"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tabsMetasPerso),
                                        0),
                                1),
                        isDisplayed()));
        tabView4.perform(click());

        ViewInteraction tabView5 = onView(
                allOf(withContentDescription("Información"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tabsMetasPerso),
                                        0),
                                2),
                        isDisplayed()));
        tabView5.perform(click());

        ViewInteraction tabView6 = onView(
                allOf(withContentDescription("Level Up"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tabsMetasPerso),
                                        0),
                                0),
                        isDisplayed()));
        tabView6.perform(click());

        ViewInteraction actionMenuItemView2 = onView(
                allOf(withId(R.id.item3), withContentDescription("appLogo"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.myToolBar),
                                        1),
                                0),
                        isDisplayed()));
        actionMenuItemView2.perform(click());

        ViewInteraction appCompatButton8 = onView(
                allOf(withId(R.id.menuOpcion2),
                        childAtPosition(
                                allOf(withId(R.id.linearLayout),
                                        childAtPosition(
                                                withId(android.R.id.content),
                                                0)),
                                6),
                        isDisplayed()));
        appCompatButton8.perform(click());

        ViewInteraction appCompatButton9 = onView(
                allOf(withId(R.id.menuOpcion3),
                        childAtPosition(
                                allOf(withId(R.id.linearLayout),
                                        childAtPosition(
                                                withId(android.R.id.content),
                                                0)),
                                8),
                        isDisplayed()));
        appCompatButton9.perform(click());

        ViewInteraction tabView7 = onView(
                allOf(withContentDescription("Ejercicio variado"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tabsMetasPerso),
                                        0),
                                1),
                        isDisplayed()));
        tabView7.perform(click());

        ViewInteraction tabView8 = onView(
                allOf(withContentDescription("Información"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tabsMetasPerso),
                                        0),
                                2),
                        isDisplayed()));
        tabView8.perform(click());

        ViewInteraction tabView9 = onView(
                allOf(withContentDescription("Level Up"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.tabsMetasPerso),
                                        0),
                                0),
                        isDisplayed()));
        tabView9.perform(click());

        ViewInteraction actionMenuItemView3 = onView(
                allOf(withId(R.id.item3), withContentDescription("appLogo"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.myToolBar),
                                        1),
                                0),
                        isDisplayed()));
        actionMenuItemView3.perform(click());

        ViewInteraction appCompatButton10 = onView(
                allOf(withId(R.id.menuOpcion2),
                        childAtPosition(
                                allOf(withId(R.id.linearLayout),
                                        childAtPosition(
                                                withId(android.R.id.content),
                                                0)),
                                6),
                        isDisplayed()));
        appCompatButton10.perform(click());

        ViewInteraction appCompatButton11 = onView(
                allOf(withId(R.id.informacionGnralBtn), withText("Información General"),
                        childAtPosition(
                                allOf(withId(R.id.linearLayout),
                                        childAtPosition(
                                                withId(android.R.id.content),
                                                0)),
                                12),
                        isDisplayed()));
        appCompatButton11.perform(click());

        ViewInteraction actionMenuItemView4 = onView(
                allOf(withId(R.id.item3), withContentDescription("appLogo"),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.myToolBar),
                                        1),
                                0),
                        isDisplayed()));
        actionMenuItemView4.perform(click());
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
