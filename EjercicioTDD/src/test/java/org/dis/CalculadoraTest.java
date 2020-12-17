package org.dis;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CalculadoraTest {
    @Test
    public void testSumar() {
        Calculadora cal=new Calculadora();

        double suma=cal.sumar(4,-2);

        assertEquals(2,suma);
    }
    @Test
    public void testRestar() {
        Calculadora cal=new Calculadora();

        double resta=cal.restar(4,-2);

        assertEquals(6,resta);
    }
    @Test
    public void testMulti() {
        Calculadora cal=new Calculadora();

        double multi=cal.multip(4,-2);

        assertEquals(-8,multi);
    }
    @Test
    public void testDivide() {
        Calculadora cal=new Calculadora();

        double divide=cal.dividir(4,-2);

        assertEquals(-2,divide);
    }

}
