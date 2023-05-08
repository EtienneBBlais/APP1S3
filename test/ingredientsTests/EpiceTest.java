package ingredientsTests;

import ingredients.Epice;
import ingredients.Ingredient;
import static org.junit.jupiter.api.Assertions.*;

import ingredients.TypeIngredient;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class EpiceTest {
    @Test
    @DisplayName("Test Epice")
    void Epice(){
        Ingredient epice = new Epice();
        epice.setNom("Poivre");
        epice.setDescription("Rose");
        assertEquals(epice.getNom(), "Poivre");
        assertEquals(epice.getDescription(), "Rose");
        assertEquals(epice.getTypeIngredient(), TypeIngredient.EPICE);
    }
}