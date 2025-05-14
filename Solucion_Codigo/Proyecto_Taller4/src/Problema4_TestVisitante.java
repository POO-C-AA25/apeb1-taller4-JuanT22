public class Problema4_TestVisitante {
    public static void main(String[] args) {
        final int EDAD_MINIMA     = 12;
        final double ALTURA_MINIMA = 1.40;

        Visitante v1 = new Visitante("Ana", 10, 1.35);
        Visitante v2 = new Visitante("Luis", 13, 1.50);
        Visitante v3 = new Visitante("María", 12, 1.40);
        Visitante v4 = new Visitante("Pedro", 15, 1.30);

        v1.determinarAcceso(EDAD_MINIMA, ALTURA_MINIMA);
        System.out.println(v1 + "\n");

        v2.determinarAcceso(EDAD_MINIMA, ALTURA_MINIMA);
        System.out.println(v2 + "\n");

        v3.determinarAcceso(EDAD_MINIMA, ALTURA_MINIMA);
        System.out.println(v3 + "\n");

        v4.determinarAcceso(EDAD_MINIMA, ALTURA_MINIMA);
        System.out.println(v4 + "\n");

        System.out.println("=== Resumen Diario ===");
        System.out.println("Número de visitantes que cumplen todos los requisitos: "
                           + Visitante.getContadorCumplen());
    }
}

class Visitante {
    public String nombre;
    public int edad;
    public double altura;
    public boolean puedeAcceder;
    public static int contadorCumplen = 0;

    public Visitante() {
    }

    public Visitante(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.puedeAcceder = false;
    }

    public void determinarAcceso(int edadMin, double alturaMin) {
        if (this.edad >= edadMin && this.altura >= alturaMin) {
            this.puedeAcceder = true;
            contadorCumplen++;
        } else {
            this.puedeAcceder = false;
        }
    }

    public static int getContadorCumplen() {
        return contadorCumplen;
    }

    @Override
    public String toString() {
        return "Visitante {\n" +
               "  nombre       = " + nombre + ",\n" +
               "  edad         = " + edad + " años,\n" +
               "  altura       = " + altura + " m,\n" +
               "  puedeAcceder = " + (puedeAcceder ? "Sí" : "No") + "\n" +
               "}";
    }
}

