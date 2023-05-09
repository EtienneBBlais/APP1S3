package menuFactTests;

import menufact.Menu;
import menufact.exceptions.MenuException;
import menufact.plats.PlatAuMenu;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MenuTest {
    @Test
    @DisplayName("Test menu")
    void menu(){
        PlatAuMenu p1 = new PlatAuMenu(1, "Hamburger", 13.99);
        PlatAuMenu p2 = new PlatAuMenu(2, "Macaroni", 14.99);
        Menu m1 = new Menu("m1");
        assertEquals("m1", m1.getDescription());
        m1.ajoute(p1);
        assertEquals(p1, m1.platCourant());
        m1.ajoute(p2);
        try{
            m1.positionSuivante();
        }
        catch(MenuException me){
            fail();
        }
        assertEquals(p2, m1.platCourant());
        try{
            m1.positionPrecedente();
        }
        catch(MenuException me){
            fail();
        }
        assertEquals(p1, m1.platCourant());
    }
}