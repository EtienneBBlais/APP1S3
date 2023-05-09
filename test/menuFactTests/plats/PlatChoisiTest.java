package menufact.plats;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PlatChoisiTest {

    private PlatChoisi platChoisi;
    private IPlat plat;

    @BeforeEach
    void setUp() {
        plat = new PlatAuMenu(1, "Steak au broco", 20);
        platChoisi = new PlatChoisi(plat, 2);
    }

    @Test
    void testGetQuantite() {
        assertEquals(2, platChoisi.getQuantite());
    }

    @Test
    void testSetQuantite() {
        platChoisi.setQuantite(3);
        assertEquals(3, platChoisi.getQuantite());
    }

    @Test
    void testGetPlat() {
        assertEquals(plat, platChoisi.getPlat());
    }

    @Test
    void testGetEtat() {
        assertTrue(platChoisi.getEtat() instanceof CommanderEtat);
    }

    @Test
    void testChangeState() {
        PlatEtat newState = new ServiEtat(platChoisi);
        platChoisi.changeState(newState);
        assertTrue(platChoisi.getEtat() instanceof ServiEtat);
    }
}
