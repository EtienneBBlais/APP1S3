package menuFactTests;


import menufact.facture.Facture;
import menufact.facture.exceptions.FactureException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeAll;
import menufact.*;
import menufact.exceptions.MenuException;


class MenuFactTest {


    /*
    @BeforeAll
    void setup(){


    }

     */


    @Test
    @DisplayName("Test ajouter menu")
    void ajouterMenu(){
        Menu m1 = new Menu("m1");
        MenuFact menuFact = new MenuFact();
        menuFact.ajouteMenu(m1);
        assertEquals(m1,menuFact.menuCourant());
    }

    @Test
    @DisplayName("Test mouvement menu")
    void mouvementMenu(){
        Menu m1 = new Menu("m1");
        Menu m2 = new Menu("m2");
        MenuFact menuFact = new MenuFact();
        menuFact.ajouteMenu(m1);
        menuFact.ajouteMenu(m2);
        assertEquals(m1,menuFact.menuCourant());
        try{
            menuFact.positionSuivanteMenu();
        }
        catch(MenuException me){
            fail();
        }
        assertEquals(m2,menuFact.menuCourant());
        try{
            menuFact.positionPrecedenteMenu();
        }
        catch(MenuException me){
            fail();
        }
        assertEquals(m1,menuFact.menuCourant());
    }

    @Test
    @DisplayName("Test ajouter facture")
    void ajouterFacture(){
        Facture f1 = new Facture("f1");
        MenuFact menuFact = new MenuFact();
        menuFact.ajouteFacture(f1);
        assertEquals(f1,menuFact.FactureCourant());
    }

    @Test
    @DisplayName("Test mouvement facture")
    void mouvementFacture(){
        Facture f1 = new Facture("f1");
        Facture f2 = new Facture("f2");
        MenuFact menuFact = new MenuFact();
        menuFact.ajouteFacture(f1);
        menuFact.ajouteFacture(f2);
        assertEquals(f1,menuFact.FactureCourant());
        menuFact.positionFacture(0);
        try{
            menuFact.positionSuivanteFacture();
        }
        catch(FactureException fe){
            fail();
        }
        assertEquals(f2,menuFact.FactureCourant());
        try{
            menuFact.positionPrecedenteFacture();
        }
        catch(FactureException fe){
            fail();
        }
        assertEquals(f1,menuFact.FactureCourant());
    }

}