package menuFactTests.plats;

import menufact.plats.IPlat;
import menufact.plats.PlatAuMenu;
import menufact.plats.PlatSante;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PlatSanteTest {

    private PlatSante platSante;
    private IPlat plat;

    @BeforeEach
    void setUp() {
        plat = new PlatAuMenu(1, "Steak au broco", 20);
        platSante = new PlatSante(plat, 500, 50, 30);
    }

    @Test
    void testGetKcal() {
        assertEquals(500, platSante.getKcal());
    }

    @Test
    void testGetChol() {
        assertEquals(50, platSante.getChol());
    }

    @Test
    void testGetGras() {
        assertEquals(30, platSante.getGras());
    }


}
