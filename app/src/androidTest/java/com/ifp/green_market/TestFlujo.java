package com.ifp.green_market;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.typeText;

import androidx.test.core.app.ActivityScenario;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.ext.junit.rules.ActivityScenarioRule;

import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

@RunWith(AndroidJUnit4.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestFlujo {

    //@Rule
    //public ActivityScenarioRule<SplashActivity> activityScenarioRule = new ActivityScenarioRule<>(SplashActivity.class);

    @Test
    public void a_Splash_Inicar() {
        ActivityScenario.launch(SplashActivity.class);
        // Comprobamos que se ha abierto correctamente comprobando que la imagen es visible
        onView(ViewMatchers.withId(R.id.imageViewSplash_splash))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        onView(ViewMatchers.withId(R.id.textView_IniciarSesion_iniciar))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
                .check(ViewAssertions.matches(ViewMatchers.withText("Iniciar sesión")));
    }
    @Test
     public void b_Iniciar_Productores() {
            // Verificar que el elemento del título esté presente y contenga el texto indicado
         ActivityScenario.launch(IniciarSesionActivity.class);
            onView(ViewMatchers.withId(R.id.editText_Email_iniciar))
                    .perform(typeText("email"));
            onView(ViewMatchers.withId(R.id.editText_Contrasena_iniciar))
                    .perform(typeText("contrasena"));

            // Encontramos la vista del botón utilizando su ID y clicamos para pasar de pantalla
            onView(ViewMatchers.withId(R.id.button_IniciarSesion_iniciar))
                    .perform(ViewActions.click());
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            onView(ViewMatchers.withId(R.id.ScrollView_Productores))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
        }

@Test
    public void c_Productores_Perfil() {
    ActivityScenario.launch(ProductoresActivity.class);

        // Encontramos la vista del botón de perfil utilizando su ID y clicamos para pasar de pantalla
        onView(ViewMatchers.withId(R.id.imageView_IconoPerfil_Productores))
                .perform(ViewActions.click());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        onView(ViewMatchers.withId(R.id.textViewHola_perfil))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
            .check(ViewAssertions.matches(ViewMatchers.withText("¡Hola de nuevo!")));
    }
    @Test
    public void d_Perfil_Iniciar() {
        ActivityScenario.launch(PerfilUsuarioActivity.class);
        // Encontramos la vista del botón de perfil utilizando su ID y clicamos para pasar de pantalla
        onView(ViewMatchers.withId(R.id.imageButton_CerrarSesion_perfil))
                .perform(ViewActions.click());
        onView(ViewMatchers.withId(R.id.textView_IniciarSesion_iniciar))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
                .check(ViewAssertions.matches(ViewMatchers.withText("Iniciar sesión")));
    }
    @Test
    public void e_Iniciar_Registrar() {
        ActivityScenario.launch(IniciarSesionActivity.class);
        // Encontramos la vista del botón de perfil utilizando su ID y clicamos para pasar de pantalla
        onView(ViewMatchers.withId(R.id.textView_Registrate_iniciar))
                .perform(ViewActions.click());
        onView(ViewMatchers.withId(R.id.textView_Registrate_registar))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
                .check(ViewAssertions.matches(ViewMatchers.withText("Regístrate")));
    }

}

