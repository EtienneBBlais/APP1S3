package ingredientsTests;

import ingredients.Fruit;
import ingredients.Ingredient;
import ingredients.TypeIngredient;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FruitTest {
    @Test
    @DisplayName("Test Fruit")
    void Fruit(){
        Ingredient fruit = new Fruit();
        fruit.setDescription("Jaune");
        fruit.setNom("Banane");
        assertEquals(fruit.getNom(), "Banane");
        assertEquals(fruit.getDescription(), "Jaune");
        assertEquals(fruit.getTypeIngredient(), TypeIngredient.FRUIT);
    }

}