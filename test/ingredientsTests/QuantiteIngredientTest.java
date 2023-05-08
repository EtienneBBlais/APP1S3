package ingredientsTests;

import ingredients.Ingredient;
import ingredients.QuantiteIngredient;
import static org.junit.jupiter.api.Assertions.*;

import ingredients.TypeIngredient;
import ingredients.exceptions.IngredientException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class QuantiteIngredientTest {
    static Ingredient i1;
    static Ingredient i2;

    @BeforeAll
    static void setup(){
        i1 = new Ingredient("Fromage", "Chedar", TypeIngredient.LAITIER);
        i2 = new Ingredient("Pomme", "Verte", TypeIngredient.FRUIT);
    }

    @Test
    @DisplayName("Test ListeIngredient")
    void ListeIngredient(){
        try{
            QuantiteIngredient liste = new QuantiteIngredient(i1, 50);
        }
        catch(IngredientException ie){
            fail("Not suppose to throw a execption");
        }

    }

}