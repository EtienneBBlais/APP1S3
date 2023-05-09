package menuFactTests;

import menufact.plats.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IngrédientInsuffisantEtatTest {
    private PlatEtat etat;
    private PlatChoisi platChoisi;

    @BeforeEach
    void setUp() {
        IPlat plat = new PlatAuMenu(1, "Spaghetti Bolognese", 12);
        platChoisi = new PlatChoisi(plat, 1);
        etat = new CommanderEtat(platChoisi);
        platChoisi.getEtat().onCommande();
        platChoisi.getEtat().onPuDIngredient();

    }

    @Test
    void onCommande() {

        String expected = "Essai de commande apres un manque d'ingredient";
        assertEquals(expected, platChoisi.getEtat().onCommande());
        assertEquals(CommanderEtat.class, platChoisi.getEtat().getClass());
    }

    @Test
    void onPreparation() {
        String expected = "Cannot execute onPreparation in IngrédientInsuffisantEtat";
        assertEquals(expected, platChoisi.getEtat().onPreparation());
    }

    @Test
    void onTermine() {
        String expected = "Cannot execute onTermine in IngrédientInsuffisantEtat";
        assertEquals(expected, platChoisi.getEtat().onTermine());
    }

    @Test
    void onServi() {
        String expected = "Cannot execute onServi in IngrédientInsuffisantEtat";
        assertEquals(expected, platChoisi.getEtat().onServi());
    }

    @Test
    void onPuDIngredient() {
        String expected = "on savais deja qui manque des ingredients";
        assertEquals(expected, platChoisi.getEtat().onPuDIngredient());
    }
}
