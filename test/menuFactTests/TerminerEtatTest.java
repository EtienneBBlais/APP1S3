package menufact.plats;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TerminerEtatTest {
    private TerminerEtat terminerEtat;
    private PlatChoisi platChoisi;

    @BeforeEach
    void setUp() {
        IPlat plat = new PlatAuMenu(1, "Steak Frites", 15);
        platChoisi = new PlatChoisi(plat, 1);
        terminerEtat = new TerminerEtat(platChoisi);
    }

    @Test
    void onCommande() {
        String expected = "deja Commande";
        assertEquals(expected, terminerEtat.onCommande());
    }

    @Test
    void onPreparation() {
        String expected = "deja prepare";
        assertEquals(expected, terminerEtat.onPreparation());
    }

    @Test
    void onTermine() {
        String expected = "deja termine";
        assertEquals(expected, terminerEtat.onTermine());
    }

    @Test
    void onServi() {
        String expected = "On sert!!";
        assertEquals(expected, terminerEtat.onServi());
        assertEquals(ServiEtat.class, platChoisi.getEtat().getClass());
    }

    @Test
    void onPuDIngredient() {
        String expected = "Pu d'ingredient :(";
        assertEquals(expected, terminerEtat.onPuDIngredient());
        assertEquals(IngrédientInsuffisantEtat.class, platChoisi.getEtat().getClass());
    }
}
