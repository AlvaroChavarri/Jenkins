package org.dis;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CalificacionTest {
    @Test
    public void testNota() {
        Calificacion cal=new Calificacion(8,"COCO");
        Calificacion cal1=new Calificacion(7,"COCO");
        boolean misma=cal.mismasig(cal1);

        assertEquals(true,misma);
    }

}
