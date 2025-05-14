public class Problema2_TestEmpleado {
    public static void main(String[] args) {

        Empleado[] empleados = new Empleado[4];
        empleados[0] = new Empleado("Ana", 2500, 30);
        empleados[1] = new Empleado("Luis", 1800, 25);
        empleados[2] = new Empleado("Marta", 3000, 45);
        empleados[3] = new Empleado("Carlos", 1500, 28);

        System.out.println("=== Empleados ===");
        for (Empleado emp : empleados) {
            System.out.println(emp);
        }

        double suma = 0;
        int contador = 0;
        while (contador < empleados.length) {
            suma += empleados[contador].salario;
            contador++;
        }
        double promedio = suma / empleados.length;

        int i = 0;
        do {
            if (empleados[i].salario < promedio) {
                empleados[i].aplicarAumento(15);
            }
            i++;
        } while (i < empleados.length);

        System.out.println("\n=== Empleados con Aumento ===");
        for (Empleado emp : empleados) {
            System.out.println(emp);
        }
    }
}

class Empleado {
    public String nombre;
    public double salario;
    public int edad;

    public Empleado() {
    }
    
    public Empleado(String nombre, double salario, int edad) {
        this.nombre = nombre;
        this.salario = salario;
        this.edad = edad;
    }

    public void aplicarAumento(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100);
    }   

    @Override
    public String toString() {
        return "Empleado{" +
               "nombre='" + nombre + '\'' +
               ", salario=" + salario +
               ", edad=" + edad +
               '}';
    }
}