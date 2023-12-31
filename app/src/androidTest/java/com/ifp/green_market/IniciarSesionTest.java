package com.ifp.green_market;

import android.content.Context;

import androidx.test.filters.LargeTest;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.core.app.ActivityScenario;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class IniciarSesionTest {

    @Before
    public void launchActivity() {
        // Iniciar la actividad utilizando ActivityScenario
        ActivityScenario.launch(IniciarSesionActivity.class);
    }

    @Test
    public void elementosIniciarSesion() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.ifp.green_market", appContext.getPackageName());

        // Verificar que el elemento con el ID R.id.myTextView esté presente y contenga el texto esperado
        onView(ViewMatchers.withId(R.id.textView_Registrate_iniciar))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
                .check(ViewAssertions.matches(ViewMatchers.isClickable()))
                .check(ViewAssertions.matches(ViewMatchers.withText("Regístrate")));
        onView(ViewMatchers.withId(R.id.textView_IniciarSesion_iniciar))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
                .check(ViewAssertions.matches(ViewMatchers.withText("Iniciar sesión")));
        onView(ViewMatchers.withId(R.id.editText_Email_iniciar))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        onView(ViewMatchers.withId(R.id.editText_Contrasena_iniciar))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        onView(ViewMatchers.withId(R.id.button_IniciarSesion_iniciar))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
                .check(ViewAssertions.matches(ViewMatchers.isClickable()))
                .check(ViewAssertions.matches(ViewMatchers.withText("Iniciar sesión")));
        onView(ViewMatchers.withId(R.id.textView_Olvidaste_iniciar))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
                .check(ViewAssertions.matches(ViewMatchers.withText("¿Olvidaste tu contraseña?")));
        onView(ViewMatchers.withId(R.id.imageView1_iniciar))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}
