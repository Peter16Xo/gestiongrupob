package ec.edu.tuuniversidad;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
    private Calculadora calculadora;

    @Before
    public void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    public void testSuma() {
        int resultado = calculadora.sumar(4, 6);
        assertEquals(10, resultado);
    }

    @Test
    public void testResta() {
        int resultado = calculadora.restar(10, 3);
        assertEquals(7, resultado);
    }

    @Test
    public void testNumeroPar() {
        assertTrue(calculadora.esPar(8));
    }

    @Test
    public void testNumeroImpar() {
        assertFalse(calculadora.esPar(7));
    }
}
