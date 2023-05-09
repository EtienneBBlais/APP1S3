package menuFactTests;

import menufact.plats.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PreparationEtatTest {
    private PlatEtat preparationEtat;
    private PlatChoisi platChoisi;

    @BeforeEach
    void setUp() {
        IPlat plat = new PlatAuMenu(1, "Spaghetti Bolognese", 12);
        platChoisi = new PlatChoisi(plat, 1);
        preparationEtat = new CommanderEtat(platChoisi);
        preparationEtat.onPreparation();
    }

    @Test
    void onCommande() {
        String expected = "Deja en Commande";
        assertEquals(expected, preparationEtat.onCommande());
    }

    @Test
    void onPreparation() {
        String expected = "de commande a preparation";
        assertEquals(expected, preparationEtat.onPreparation());
    }

    @Test
    void onTermine() {
        String expected = "Doit preparer avant!";
        assertEquals(expected, preparationEtat.onTermine());

    }

    @Test
    void onServi() {
        String expected = "Doit preparer avant!";
        assertEquals(expected, preparationEtat.onServi());
    }

    @Test
    void onPuDIngredient() {
        String expected = "puDIngredients";
        assertEquals(expected, preparationEtat.onPuDIngredient());
        assertEquals(IngrédientInsuffisantEtat.class, platChoisi.getEtat().getClass());
    }
}
