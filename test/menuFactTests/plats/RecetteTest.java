package menuFactTests.plats;

import ingredients.Ingredient;
import ingredients.QuantiteIngredient;
import ingredients.TypeIngredient;
import ingredients.exceptions.IngredientException;
import menufact.exceptions.MenuException;
import menufact.plats.Recette;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RecetteTest {
    @Test@
    DisplayName("Test recette")
    void recette(){
        Recette r1 = new Recette();
        Ingredient i1 = new Ingredient("Patate", "Russet", TypeIngredient.LEGUME);
        QuantiteIngredient qi1 = null;
        try {
            qi1 = new QuantiteIngredient(i1, 2);
        }
        catch(IngredientException ie){
            fail();
        }
        try {
            r1.ajouterIngredient(qi1);
        }
        catch (MenuException me){
            fail();
        }
        assertEquals(i1, r1.getQuantiteIngredient()[0].getIngredient());
        assertEquals(2, r1.getQuantiteIngredient()[0].getQuantite());

    }
}