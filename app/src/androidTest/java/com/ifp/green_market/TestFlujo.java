package com.ifp.green_market;

import android.content.Context;

import androidx.test.espresso.action.ViewActions;
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
public class TestFlujo {

    @Before
    public void launchActivity() {
        // Iniciar la actividad utilizando ActivityScenario
        ActivityScenario.launch(SplashActivity.class);
    }

    @Test
    public void confirmaciónDeInicializaciónPantallaSplash() {
        // Comprobamos que se ha abierto correctamente comprobando que la imagen es visible
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.ifp.green_market", appContext.getPackageName());

        // Verificar que el elemento esté presente
        onView(ViewMatchers.withId(R.id.imageViewSplash_splash))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }
    public void confirmaciónIniciarSesionPantalla() {
        // Comprobamos que se ha abierto correctamente comprobando que aparece el titulo IniciarSesion
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.ifp.green_market", appContext.getPackageName());

        // Verificar que el elemento del titulo esté presente y contenga el texto indicado
        onView(ViewMatchers.withId(R.id.textView_IniciarSesion_iniciar))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
                .check(ViewAssertions.matches(ViewMatchers.withText("Iniciar Sesión")));

        // Encontramos la vista del botón utilizando su ID y clicamos para pasar de pantalla
        onView(ViewMatchers.withId(R.id.button_IniciarSesion_iniciar))
        .perform(ViewActions.click());
    }
    public void confirmaciónPantallaProductores() {
        // Comprobamos que se ha abierto correctamente comprobando que aparece el titulo IniciarSesion
        // Verificar que el elemento ScrollView_Productores esté presente
        onView(ViewMatchers.withId(R.id.ScrollView_Productores))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));

        // Encontramos la vista del botón de perfil utilizando su ID y clicamos para pasar de pantalla
        onView(ViewMatchers.withId(R.id.imageView_IconoPerfil_Productores))
                .perform(ViewActions.click());
    }
    public void confirmaciónPantallaPerfilUsuario() {
        // Comprobamos que se ha abierto correctamente comprobando que aparece el titulo IniciarSesion
        // Verificar que el elemento ScrollView_Productores esté presente
        onView(ViewMatchers.withId(R.id.textViewHola_perfil))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
                .check(ViewAssertions.matches(ViewMatchers.withText("¡Hola de nuevo!")));

        // Encontramos la vista del botón de perfil utilizando su ID y clicamos para pasar de pantalla
        onView(ViewMatchers.withId(R.id.imageView_IconoPerfil_Productores))
                .perform(ViewActions.click());
    }
    public void confirmaciónPantallaIniciar() {
        // Comprobamos que se ha abierto correctamente comprobando que aparece el titulo IniciarSesion
        // Verificar que el elemento ScrollView_Productores esté presente
        onView(ViewMatchers.withId(R.id.textView_IniciarSesion_iniciar))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
                .check(ViewAssertions.matches(ViewMatchers.withText("Iniciar Sesión")));

        // Encontramos la vista del botón de perfil utilizando su ID y clicamos para pasar de pantalla
        onView(ViewMatchers.withId(R.id.textView_Registrate_iniciar))
                .perform(ViewActions.click());
    }
    public void confirmaciónPantallaRegistrate() {
        // Comprobamos que se ha abierto correctamente comprobando que aparece el titulo IniciarSesion
        // Verificar que el elemento ScrollView_Productores esté presente
        onView(ViewMatchers.withId(R.id.textView_IniciarSesion_iniciar))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
                .check(ViewAssertions.matches(ViewMatchers.withText("Iniciar Sesión")));

        // Encontramos la vista del botón de perfil utilizando su ID y clicamos para pasar de pantalla
        onView(ViewMatchers.withId(R.id.textView_Registrate_iniciar))
                .perform(ViewActions.click());
    }

}
