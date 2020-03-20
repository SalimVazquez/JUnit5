import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class SumaTest {

    public int a = (int) Math.floor(Math.random()*(1000-0+1)+0);
    public int b = (int) Math.floor(Math.random()*(1000-0+1)+0);
    public int c = (int) Math.floor(Math.random()*(1000-0+1)+0);
    public int d = (int) Math.floor(Math.random()*(1000-0+1)+0);
    public int e = (int) Math.floor(Math.random()*(1000-0+1)+0);
    public int f = (int) Math.floor(Math.random()*(1000-0+1)+0);
    public int g = (int) Math.floor(Math.random()*(1000-0+1)+0);
    public int h = (int) Math.floor(Math.random()*(1000-0+1)+0);
    public int i = (int) Math.floor(Math.random()*(1000-0+1)+0);
    public int j = (int) Math.floor(Math.random()*(1000-0+1)+0);
    public int respuesta;
    Scanner sc = new Scanner(System.in);

    @Test
    void getResultado1() {
        System.out.println("Ingrese el resultado de la suma #1\n" + a + "+" + b + "=");
        respuesta = sc.nextInt();
        Suma s = new Suma(a,b,c,d,e,f,g,h,i,j);
        assertEquals(respuesta, s.getResultado1());
    }

    @Test
    void getResultado2() {
        System.out.println("Ingrese el resultado de la suma #2\n" + c + "+" + d + "=");
        respuesta = sc.nextInt();
        Suma s = new Suma(a,b,c,d,e,f,g,h,i,j);
        assertEquals(respuesta, s.getResultado2());
    }

    @Test
    void getResultado3() {
        System.out.println("Ingrese el resultado de la suma #3\n" + e + "+" + f + "=");
        respuesta = sc.nextInt();
        Suma s = new Suma(a,b,c,d,e,f,g,h,i,j);
        assertEquals(respuesta, s.getResultado3());
    }


    @Test
    void getResultado4() {
        System.out.println("Ingrese el resultado de la suma #4\n" + g + "+" + h + "=");
        respuesta = sc.nextInt();
        Suma s = new Suma(a,b,c,d,e,f,g,h,i,j);
        assertEquals(respuesta, s.getResultado4());
    }

    @Test
    void getResultado5() {
        System.out.println("Ingrese el resultado de la suma #5\n" + i + "+" + j + "=");
        respuesta = sc.nextInt();
        Suma s = new Suma(a,b,c,d,e,f,g,h,i,j);
        assertEquals(respuesta, s.getResultado5());
    }
}