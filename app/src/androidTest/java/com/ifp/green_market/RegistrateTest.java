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
public class RegistrateTest {

    @Before
    public void launchActivity() {
        // Iniciar la actividad utilizando ActivityScenario
        ActivityScenario.launch(RegistrarActivity.class);
    }

    @Test
    public void elementosIniciarSesion() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.ifp.green_market", appContext.getPackageName());

        // Verificar que el elemento con el ID R.id.myTextView esté presente y contenga el texto esperado
        onView(ViewMatchers.withId(R.id.textView_IniciarSesion_registrar))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
                .check(ViewAssertions.matches(ViewMatchers.isClickable()))
                .check(ViewAssertions.matches(ViewMatchers.withText("Iniciar sesión")));
        onView(ViewMatchers.withId(R.id.textView_Registrate_registar))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
                .check(ViewAssertions.matches(ViewMatchers.withText("Regístrate")));
        onView(ViewMatchers.withId(R.id.editText_Nombre_registar))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        onView(ViewMatchers.withId(R.id.editText_Email_registrar))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        onView(ViewMatchers.withId(R.id.editText_Contrasena_registrar))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        onView(ViewMatchers.withId(R.id.button_Registrate_registrar))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
                .check(ViewAssertions.matches(ViewMatchers.isClickable()))
                .check(ViewAssertions.matches(ViewMatchers.withText("Regístrate")));
        onView(ViewMatchers.withId(R.id.checkBox_Proveedor_registrar))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
                .check(ViewAssertions.matches(ViewMatchers.isNotChecked()))
                .check(ViewAssertions.matches(ViewMatchers.withText("Regístrate como proveedor")));
        onView(ViewMatchers.withId(R.id.imageView1_registar))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
}
