package menuFactTests.plats;

import menufact.plats.IPlat;
import menufact.plats.PlatAuMenu;
import menufact.plats.PlatEnfant;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PlatEnfantTest {

    private PlatEnfant platEnfant;
    private IPlat plat;

    @BeforeEach
    void setUp() {
        plat = new PlatAuMenu(1, "Steak au broco", 20);
        platEnfant = new PlatEnfant(plat, 0.5);
    }

    @Test
    void testGetProportion() {
        assertEquals(0.5, platEnfant.getProportion());
    }
}
