package ingredientsTests;

import ingredients.Ingredient;
import ingredients.Legume;
import static org.junit.jupiter.api.Assertions.*;

import ingredients.TypeIngredient;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LegumeTest {
    @Test
    @DisplayName("Test legume")
    void Legume(){
        Ingredient legume = new Legume();
        legume.setNom("Carotte");
        legume.setDescription("Orange");
        assertEquals(legume.getDescription(), "Orange");
        assertEquals(legume.getNom(), "Carotte");
        assertEquals(legume.getTypeIngredient(), TypeIngredient.LEGUME);
    }
}