package com.ifp.green_market;

import static androidx.test.espresso.Espresso.onView;
import static org.junit.Assert.assertEquals;

import android.content.Context;

import androidx.test.core.app.ActivityScenario;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.platform.app.InstrumentationRegistry;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class ProductoresTest {

    @Before
    public void launchActivity() {
        // Iniciar la actividad utilizando ActivityScenario
        ActivityScenario.launch(ProductoresActivity.class);
    }

    @Test
    public void componentes() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.ifp.green_market", appContext.getPackageName());

        // Verificar que el elemento con el ID R.id.myTextView esté presente y contenga el texto esperado
        onView(ViewMatchers.withId(R.id.ScrollView_Productores))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        onView(ViewMatchers.withId(R.id.imageView_IconoPerfil_Productores))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
                .check(ViewAssertions.matches(ViewMatchers.isClickable()));

        onView(ViewMatchers.withId(R.id.imageView2_Productores))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));



    }
}
