package ec.edu.tuuniversidad;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class AppTest {
    @Test
    public void pruebaUno() {
        assertTrue(true);
    }

    @Test
    public void pruebaDos() {
        int suma = 2 + 3;
        assertEquals(5, suma);
    }
}
