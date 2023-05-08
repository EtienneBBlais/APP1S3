package ingredientsTests;

import ingredients.Ingredient;
import ingredients.IngredientInventaire;
import ingredients.Laitier;
import static org.junit.jupiter.api.Assertions.*;

import ingredients.TypeIngredient;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
class LaitierTest {
    @Test
    @DisplayName("Test Laitier")
    void Laitier(){
        Ingredient laitier = new Laitier();
        laitier.setNom("Fromage");
        laitier.setDescription("Cheddar");
        assertEquals(laitier.getTypeIngredient(), TypeIngredient.LAITIER);
        assertEquals(laitier.getNom(), "Fromage");
        assertEquals(laitier.getDescription(), "Cheddar");
    }
}