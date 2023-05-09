package menuFactTests;

import menufact.plats.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CommanderEtatTest {
    private CommanderEtat commanderEtat;
    private PlatChoisi platChoisi;

    @BeforeEach
    void setUp() {
        IPlat plat = new PlatAuMenu(1, "Spaghetti Bolognese", 12);
        platChoisi = new PlatChoisi(plat, 1);
        commanderEtat = new CommanderEtat(platChoisi);
    }

    @Test
    void onCommande() {
        String expected = "Deja en Commande";
        assertEquals(expected, commanderEtat.onCommande());
    }

    @Test
    void onPreparation() {
        String expected = "de commande a preparation";
        assertEquals(expected, commanderEtat.onPreparation());
        assertEquals(PreparationEtat.class, platChoisi.getEtat().getClass());
    }

    @Test
    void onTermine() {
        String expected = "Doit preparer avant!";
        assertEquals(expected, commanderEtat.onTermine());
    }

    @Test
    void onServi() {
        String expected = "Doit preparer avant!";
        assertEquals(expected, commanderEtat.onServi());
    }

    @Test
    void onPuDIngredient() {
        String expected = "puDIngredients";
        assertEquals(expected, commanderEtat.onPuDIngredient());
        assertEquals(IngrédientInsuffisantEtat.class, platChoisi.getEtat().getClass());
    }
}
