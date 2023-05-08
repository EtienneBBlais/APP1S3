package ingredientsTests;

import ingredients.Ingredient;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IngredientTest {

    @Test
    @DisplayName("Test Constructeur defaut")
    void Ingredient(){
        Ingredient ingredient = new Ingredient();
        assertEquals(ingredient.getTypeIngredient(), null);
        assertEquals(ingredient.getNom(), "Ingredient inconnu");
        assertEquals(ingredient.getDescription(), " ");
    }


}