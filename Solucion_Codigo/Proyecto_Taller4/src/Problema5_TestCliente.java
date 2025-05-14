public class Problema5_TestCliente {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Carlos", "cardio",     30.0, true);
        Cliente c2 = new Cliente("Lucía",  "fuerza",      45.0, false);
        Cliente c3 = new Cliente("Miguel", "estiramiento",20.0, true);
        Cliente c4 = new Cliente("Sofía",  "cardio",      25.0, true);

        c1.registrarCumplimiento();
        System.out.println(c1 + "\n");

        c2.registrarCumplimiento();
        System.out.println(c2 + "\n");

        c3.registrarCumplimiento();
        System.out.println(c3 + "\n");

        c4.registrarCumplimiento();
        System.out.println(c4 + "\n");

        System.out.println("=== Resumen Gym ===");
        System.out.println("Clientes que completaron rutina: "
                           + Cliente.getContadorCumplidos());
        System.out.printf("Tiempo promedio (min): %.2f%n",
                          Cliente.getTiempoPromedio());
    }
}

 class Cliente {
    public String nombre;
    public String tipoEjercicio;
    public double duracion;
    public boolean cumplio;
    public static int contadorCumplidos = 0;
    public static double tiempoTotal = 0.0;

    public Cliente() {
    }
    
    public Cliente(String nombre, String tipoEjercicio,
                   double duracion, boolean cumplio) {
        this.nombre = nombre;
        this.tipoEjercicio = tipoEjercicio;
        this.duracion = duracion;
        this.cumplio = cumplio;
    }

    public void registrarCumplimiento() {
        if (this.cumplio) {
            contadorCumplidos++;
            tiempoTotal += this.duracion;
        }
    }

    public static int getContadorCumplidos() {
        return contadorCumplidos;
    }

    public static double getTiempoPromedio() {
        if (contadorCumplidos == 0) return 0.0;
        return tiempoTotal / contadorCumplidos;
    }

    @Override
    public String toString() {
        return "Cliente {\n" +
               "  nombre         = " + nombre + ",\n" +
               "  tipoEjercicio  = " + tipoEjercicio + ",\n" +
               "  duracion       = " + duracion + " min,\n" +
               "  cumplioRutina  = " + (cumplio ? "Sí" : "No") + "\n" +
               "}";
    }
}
