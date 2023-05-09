package menuFactTests.plats;

import menufact.plats.PlatAuMenu;
import menufact.plats.Recette;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlatAuMenuTest {

    private PlatAuMenu platAuMenu;

    @BeforeEach
    void setUp() {
        platAuMenu = new PlatAuMenu(1, "Steak au broco", 20);
    }

    @Test
    void testGetCode() {
        assertEquals(1, platAuMenu.getCode());
    }

    @Test
    void testSetCode() {
        platAuMenu.setCode(2);
        assertEquals(2, platAuMenu.getCode());
    }

    @Test
    void testGetDescription() {
        assertEquals("Steak au broco", platAuMenu.getDescription());
    }

    @Test
    void testSetDescription() {
        platAuMenu.setDescription("Nouveau plat");
        assertEquals("Nouveau plat", platAuMenu.getDescription());
    }

    @Test
    void testGetPrix() {
        assertEquals(20, platAuMenu.getPrix());
    }

    @Test
    void testSetPrix() {
        platAuMenu.setPrix(25);
        assertEquals(25, platAuMenu.getPrix());
    }

    @Test
    void testGetRecette() {
        assertNotNull(platAuMenu.getRecette());
    }

    @Test
    void testSetRecette() {
        Recette newRecette = new Recette();
        platAuMenu.setRecette(newRecette);
        assertEquals(newRecette, platAuMenu.getRecette());
    }



}
