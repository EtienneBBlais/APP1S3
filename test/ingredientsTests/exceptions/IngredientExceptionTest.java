package ingredientsTests.exceptions;

import ingredients.Ingredient;
import ingredients.QuantiteIngredient;
import ingredients.QuantiteIngredient;
import ingredients.exceptions.IngredientException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IngredientExceptionTest {
    @Test
    @DisplayName("Test des exceptions ingredients")
    void IngredientException(){
        Ingredient i1 = new Ingredient();
        assertThrows(IngredientException.class, ()->{
            QuantiteIngredient liste = new QuantiteIngredient(i1, -1);
        });
        assertThrows(IngredientException.class, ()->{
           QuantiteIngredient liste = new QuantiteIngredient(i1, 12);
           liste.setQuantite(-23);
        });
    }

}