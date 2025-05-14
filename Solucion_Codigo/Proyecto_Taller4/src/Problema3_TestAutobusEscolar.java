public class Problema3_TestAutobusEscolar {
    public static void main(String[] args) {
        AutobusEscolar autobus = new AutobusEscolar("Ruta A", 10);
        autobus.registrarEstudiante("Juan,5,Ruta A,true");
        autobus.registrarEstudiante("Ana,4,Ruta B,true");
        autobus.registrarEstudiante("Luis,6,Ruta A,false");
        autobus.registrarEstudiante("Maria,5,Ruta A,true");
        autobus.simularIngreso();
        System.out.println(autobus);
    }
}

class AutobusEscolar {
    private String rutaBus;
    private String[] estudiantes;
    private int contador;
    private int aceptados;
    private int rechazados;

    public AutobusEscolar() {
    }
    
    public AutobusEscolar(String rutaBus, int capacidad) {
        this.rutaBus = rutaBus;
        this.estudiantes = new String[capacidad];
        this.contador = 0;
        this.aceptados = 0;
        this.rechazados = 0;
    }

    public void registrarEstudiante(String datosEstudiante) {
        if (contador < estudiantes.length) {
            estudiantes[contador] = datosEstudiante;
            contador++;
        }
    }

    public void simularIngreso() {
        for (int i = 0; i < contador; i++) {
            String[] datos = estudiantes[i].split(",");
            String rutaEstudiante = datos[2];  // Formato: nombre,grado,ruta,permiso
            boolean permiso = Boolean.parseBoolean(datos[3]);
            if (rutaEstudiante.equals(rutaBus) && permiso) {
                aceptados++;
            } else {
                rechazados++;
            }
        }
    }

    @Override
    public String toString() {
        return "Resumen de Ingreso al Autobús:\n" +
               "Total de estudiantes aceptados: " + aceptados + "\n" +
               "Total de estudiantes rechazados: " + rechazados;
    }
}