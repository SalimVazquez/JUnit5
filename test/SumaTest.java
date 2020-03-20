import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class SumaTest {

    public int a = (int) Math.floor(Math.random()*(1000-0+1)+0);
    public int b = (int) Math.floor(Math.random()*(1000-0+1)+0);
    public int c = (int) Math.floor(Math.random()*(1000-0+1)+0);
    public int d = (int) Math.floor(Math.random()*(1000-0+1)+0);
    public int e = 10;
    public int f = 11;
    public int g = 80;
    public int h = 1;
    public int i = 5;
    public int j = 10;
    public int respuesta;

    @Test
    void getResultado1() {
        respuesta = (int) Math.floor(Math.random()*(1000-0+1)+0);
        Suma s = new Suma(a,b,c,d,e,f,g,h,i,j);
        assertEquals(respuesta, s.getResultado1());
    }

    @Test
    void getResultado2() {
        respuesta = (int) Math.floor(Math.random()*(1000-0+1)+0);
        Suma s = new Suma(a,b,c,d,e,f,g,h,i,j);
        assertEquals(respuesta, s.getResultado2());
    }

    @Test
    void getResultado3() {
        respuesta = 21;
        Suma s = new Suma(a,b,c,d,e,f,g,h,i,j);
        assertEquals(respuesta, s.getResultado3());
    }


    @Test
    void getResultado4() {
        respuesta = 81;
        Suma s = new Suma(a,b,c,d,e,f,g,h,i,j);
        assertEquals(respuesta, s.getResultado4());
    }

    @Test
    void getResultado5() {
        respuesta = 15;
        Suma s = new Suma(a,b,c,d,e,f,g,h,i,j);
        assertEquals(respuesta, s.getResultado5());
    }
}