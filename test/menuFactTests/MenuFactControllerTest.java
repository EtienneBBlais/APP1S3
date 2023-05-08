package menuFactTests;

import menufact.MenuFactController;
import menufact.plats.IPlat;
import menufact.plats.PlatAuMenu;
import menufact.plats.PlatSante;
import org.junit.jupiter.api.Test;
import menufact.Menu;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeAll;
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
    }
}