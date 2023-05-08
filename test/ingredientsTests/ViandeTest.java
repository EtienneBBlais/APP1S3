package ingredientsTests;

import ingredients.Ingredient;
import ingredients.Viande;
import static org.junit.jupiter.api.Assertions.*;

import ingredients.TypeIngredient;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ViandeTest {
    @Test
    @DisplayName("Test Viande")
    void Viande(){
        Ingredient viande = new Viande();
        viande.setNom("Steak");
        viande.setDescription("Angus");
        assertEquals(viande.getNom(), "Steak");
        assertEquals(viande.getDescription(), "Angus");
        assertEquals(viande.getTypeIngredient(), TypeIngredient.VIANDE);
    }
}