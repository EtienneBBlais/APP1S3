package menuFactTests;

import menufact.Client;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    @Test
    @DisplayName("Test client")
    void client(){
        Client c1 = new Client(1, "Robert", "1234");
        assertEquals(1, c1.getIdClient());
        assertEquals("Robert", c1.getNom());
        assertEquals("1234", c1.getNumeroCarteCredit());
        c1.setIdClient(2);
        assertEquals(2, c1.getIdClient());
        c1.setNom("Emile");
        assertEquals("Emile", c1.getNom());
        c1.setNumeroCarteCredit("4321");
        assertEquals("4321", c1.getNumeroCarteCredit());

    }
}