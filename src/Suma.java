public class Suma {

    public int dato1;
    public int dato2;
    public int dato3;
    public int dato4;
    public int dato5;
    public int dato6;
    public int dato7;
    public int dato8;
    public int dato9;
    public int dato10;
    public int resultado1;
    public int resultado2;
    public int resultado3;
    public int resultado4;
    public int resultado5;

    public Suma(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j) {
        this.dato1 = a;
        this.dato2 = b;
        this.dato3 = c;
        this.dato4 = d;
        this.dato5 = e;
        this.dato6 = f;
        this.dato7 = g;
        this.dato8 = h;
        this.dato9 = i;
        this.dato10 = j;
    }

    public int getResultado1() {
        resultado1 = dato1+dato2;
        return resultado1;
    }

    public int getResultado2() {
        resultado2 = dato3+dato4;
        return resultado2;
    }

    public int getResultado3() {
        resultado3 = dato5+dato6;
        return resultado3;
    }

    public int getResultado4() {
        resultado4 = dato7+dato8;
        return resultado4;
    }

    public int getResultado5() {
        resultado5 = dato9+dato10;
        return resultado5;
    }
}
