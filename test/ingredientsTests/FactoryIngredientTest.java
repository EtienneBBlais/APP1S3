package ingredientsTests;

import ingredients.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactoryIngredientTest {
    private FactoryIngredient factory = new FactoryIngredient();
    @Test
    @DisplayName("Test factory: Viande")
    void nouveauIngredient_viande(){
        Ingredient i1 = factory.nouveauIngredient("Steak", "Angus", TypeIngredient.VIANDE);
        Viande viande = new Viande();
        assertEquals(i1.getClass(), viande.getClass());
        assertEquals(i1.getNom(), "Steak");
        assertEquals(i1.getDescription(), "Angus");
        assertEquals(i1.getTypeIngredient(), TypeIngredient.VIANDE);
    }

    @Test
    @DisplayName("Test factory: Legume")
    void nouveauIngredient_legume(){
        Ingredient i1 = factory.nouveauIngredient("Brocoli", "Vert", TypeIngredient.LEGUME);
        Legume legume = new Legume();
        assertEquals(i1.getClass(), legume.getClass());
        assertEquals(i1.getNom(), "Brocoli");
        assertEquals(i1.getDescription(), "Vert");
        assertEquals(i1.getTypeIngredient(), TypeIngredient.LEGUME);
    }

    @Test
    @DisplayName("Test factory: Fruit")
    void nouveauIngredient_fruit(){
        Ingredient i1 = factory.nouveauIngredient("Pomme", "Spartan", TypeIngredient.FRUIT);
        Fruit fruit = new Fruit();
        assertEquals(i1.getClass(), fruit.getClass());
        assertEquals(i1.getNom(), "Pomme");
        assertEquals(i1.getDescription(), "Spartan");
        assertEquals(i1.getTypeIngredient(), TypeIngredient.FRUIT);
    }

    @Test
    @DisplayName("Test factory: Laitier")
    void nouveauIngredient_laitier(){
        Ingredient i1 = factory.nouveauIngredient("Fromage", "Cheddar", TypeIngredient.LAITIER);
        Laitier laitier = new Laitier();
        assertEquals(i1.getClass(), laitier.getClass());
        assertEquals(i1.getNom(), "Fromage");
        assertEquals(i1.getDescription(), "Cheddar");
        assertEquals(i1.getTypeIngredient(), TypeIngredient.LAITIER);
    }

    @Test
    @DisplayName("Test factory: Epice")
    void nouveauIngredient_epice(){
        Ingredient i1 = factory.nouveauIngredient("Cayenne", "Broyer", TypeIngredient.EPICE);
        Epice epice = new Epice();
        assertEquals(i1.getClass(), epice.getClass());
        assertEquals(i1.getNom(), "Cayenne");
        assertEquals(i1.getDescription(), "Broyer");
        assertEquals(i1.getTypeIngredient(), TypeIngredient.EPICE);
    }

}