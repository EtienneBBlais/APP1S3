package menuFactTests;

import ingredients.Ingredient;
import ingredients.QuantiteIngredient;
import ingredients.TypeIngredient;
import ingredients.exceptions.IngredientException;
import inventaire.Inventaire;
import menufact.Chef;
import menufact.exceptions.MenuException;
import menufact.plats.IPlat;
import menufact.plats.PlatAuMenu;
import menufact.plats.PlatChoisi;
import menufact.plats.Recette;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ChefTest {

    private Chef chef = new Chef();
    private PlatChoisi platChoisi;
    private Inventaire inventaire = Inventaire.getInstance();

    private ByteArrayOutputStream output;




    @Test
    void testUpdate() throws IngredientException, MenuException {
        Ingredient ingredient = new Ingredient("oignon","rouge", TypeIngredient.LEGUME);
        QuantiteIngredient quantiteIngredient = new QuantiteIngredient(ingredient, 1);
        inventaire.ajouter(quantiteIngredient);
        Recette recette = new Recette();
        recette.ajouterIngredient(quantiteIngredient);
        IPlat plat = new PlatAuMenu(1, "oignon", 20);
        plat.setRecette(recette);
        platChoisi = new PlatChoisi(plat, 2);
        chef.update("COMMAND", platChoisi, inventaire);

        int i = inventaire.getSize();

        assertEquals(0, inventaire.getQuantiteIngredient().get(i-1).getQuantite());
    }

    @Test
    void testToString() {
        assertEquals("chef", chef.toString());
    }
}
