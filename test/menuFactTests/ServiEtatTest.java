package menuFactTests;

import menufact.plats.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ServiEtatTest {
    private PlatEtat serviEtat;

    private PlatChoisi platChoisi;

    @BeforeEach
    void setUp() {
        IPlat plat = new PlatAuMenu(1, "Steak Frites", 15);
        platChoisi = new PlatChoisi(plat, 1);
        serviEtat = new CommanderEtat(platChoisi);


    }

    @Test
    void onCommande() {
        String expected = "Deja en Commande";
        assertEquals(expected, serviEtat.onCommande());
    }

    @Test
    void onPreparation() {
        String expected = "de commande a preparation";
        assertEquals(expected, serviEtat.onPreparation());
    }

    @Test
    void onTermine() {
        String expected = "Doit preparer avant!";
        assertEquals(expected, serviEtat.onTermine());
    }

    @Test
    void onServi() {
        String expected = "Doit preparer avant!";
        assertEquals(expected, serviEtat.onServi());
    }

    @Test
    void onPuDIngredient() {
        String expected = "puDIngredients";
        assertEquals(expected, serviEtat.onPuDIngredient());
    }
}
