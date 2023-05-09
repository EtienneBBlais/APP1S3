package menuFactTests;

import ingredients.Ingredient;
import ingredients.QuantiteIngredient;
import ingredients.TypeIngredient;
import ingredients.exceptions.IngredientException;
import inventaire.Inventaire;
import menufact.Client;
import menufact.MenuFactController;
import menufact.exceptions.MenuException;
import menufact.facture.Facture;
import menufact.facture.FactureEtat;
import menufact.facture.exceptions.FactureException;
import menufact.plats.*;
import org.junit.jupiter.api.Test;
import menufact.Menu;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;

class MenuFactControllerTest {
    @Test
    @DisplayName("Test sur les plats")
    void testPlat(){
        MenuFactController menuController = new MenuFactController();
        PlatAuMenu p1 = new PlatAuMenu(1, "Steak Frite", 25.99);
        IPlat p2 = new PlatAuMenu(2, "Salade Cesar", 18.99);
        PlatSante p3 = new PlatSante(p2, 23.0, 12.0, 98.0);
        Menu m1 = new Menu("m1");
        menuController.ajouterMenu(m1);
        menuController.ajouterPlat(p1);
        menuController.ajouterPlat(p3);
        assertEquals(p1, menuController.getPlatCourant());
        try{
            menuController.platSuivant();
        }
        catch(MenuException me){
            fail();
        }
        assertEquals(p3, menuController.getPlatCourant());
        try{
            menuController.platPrecedent();
        }
        catch(MenuException me){
            fail();
        }
        assertEquals(p1, menuController.getPlatCourant());
    }

    @Test
    @DisplayName("Test sur les menus")
    void testMenu(){
        MenuFactController menuController = new MenuFactController();
        PlatAuMenu p1 = new PlatAuMenu(1, "Steak Frite", 25.99);
        IPlat p2 = new PlatAuMenu(2, "Salade Cesar", 18.99);
        PlatSante p3 = new PlatSante(p2, 23.0, 12.0, 98.0);
        Menu m1 = new Menu("m1");
        Menu m2 = new Menu("m2");
        menuController.ajouterMenu(m1);
        menuController.ajouterMenu(m2);
        menuController.positionMenu(0);
        menuController.ajouterPlat(p1);
        menuController.ajouterPlat(p3);
        m1.ajoute(p1);
        m1.ajoute(p3);
        assertEquals(m1, menuController.getMenuCourant());
        try{
            menuController.menuSuivant();
        }
        catch(MenuException me){
            fail();
        }
        assertEquals(m2, menuController.getMenuCourant());
        try{
            menuController.menuPrecedent();
        }
        catch(MenuException me){
            fail();
        }
        assertEquals(m1, menuController.getMenuCourant());
    }

    @Test
    @DisplayName("Test sur les factures")
    void testFacture(){
        MenuFactController menuController = new MenuFactController();
        Ingredient i1 = new Ingredient("Steak", "Angus", TypeIngredient.VIANDE);
        QuantiteIngredient qi1 = new QuantiteIngredient();
        Recette r1 = new Recette();
        try {
            qi1 = new QuantiteIngredient(i1, 2);
            r1.ajouterIngredient(qi1);
        }
        catch(IngredientException ie){
            fail();
        }
        catch(MenuException me){
            fail();
        }
        Inventaire inventaire = Inventaire.getInstance();
        inventaire.ajouter(qi1);


        Facture f1 = new Facture("f1");
        f1.setInventaire(inventaire);
        Facture f2 = new Facture("f2");
        PlatAuMenu p1 = new PlatAuMenu(1, "Spag", 23.99);
        PlatChoisi pc1 = new PlatChoisi(p1, 2);
        Client c1 = new Client(1, "Robert", "1234");
        menuController.ajouterFacture(f1);
        menuController.ajouterFacture(f2);
        try {
            menuController.ajouterPlatFacture(pc1);
        }
        catch (FactureException fe){
            fail();
        }
        assertEquals(2, menuController.getPlatFactureCourant().getQuantite());
        assertEquals(p1, menuController.getPlatFactureCourant().getPlat());
        menuController.associerClient(c1);
        Client c2 = menuController.getFactureCourant().getClient();
        assertEquals(c1.getIdClient(), c2.getIdClient());
        menuController.positionFacture(0);
        assertDoesNotThrow(()->{
            menuController.factureSuivant();
        });
        assertDoesNotThrow(()->{
            menuController.facturePrecedent();
        });
        menuController.payerFacture();
        assertEquals(FactureEtat.PAYEE, menuController.getFactureCourant().getEtat());
    }

}