import java.util.Locale;

// Clase abstracta base
abstract class Empleado {
    protected String nombre;
    protected String cedula;
    protected double sueldoBase;
    protected int id;

    // Variables estáticas para conteo e ID autoincrementable
    protected static int totalEmpleados = 0;
    protected static int proximoId = 1001;

    public Empleado(String nombre, String cedula, double sueldoBase) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.sueldoBase = sueldoBase;
        this.id = proximoId++;
        totalEmpleados++;
    }

    // Métodos abstractos a sobrescribir
    public abstract double calcularSueldo();
    public abstract String obtenerDetalles();

    // Métodos estáticos
    public static int obtenerTotalEmpleados() {
        return totalEmpleados;
    }

    public static void mostrarEstadisticas(double totalNomina) {
        System.out.println("----------------------------------------");
        System.out.printf(Locale.US, "Total: $%.2f%n", totalNomina);
        System.out.println("Total empleados: " + totalEmpleados);
    }
}

// Subclase Obrero (0% bonificación)
class Obrero extends Empleado {
    public Obrero(String nombre, String cedula, double sueldoBase) {
        super(nombre, cedula, sueldoBase);
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase;
    }

    @Override
    public String obtenerDetalles() {
        return String.format(Locale.US, "[%d] %s - Obrero - $%.2f", id, nombre, calcularSueldo());
    }
}

// Subclase Supervisor (15% bonificación)
class Supervisor extends Empleado {
    public Supervisor(String nombre, String cedula, double sueldoBase) {
        super(nombre, cedula, sueldoBase);
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase * 1.15;
    }

    @Override
    public String obtenerDetalles() {
        return String.format(Locale.US, "[%d] %s - Supervisor - $%.2f", id, nombre, calcularSueldo());
    }
}

// Subclase Gerente (25% bonificación)
class Gerente extends Empleado {
    public Gerente(String nombre, String cedula, double sueldoBase) {
        super(nombre, cedula, sueldoBase);
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase * 1.25;
    }

    @Override
    public String obtenerDetalles() {
        return String.format(Locale.US, "[%d] %s - Gerente - $%.2f", id, nombre, calcularSueldo());
    }
}

// Clase Principal
public class NominaEmpresa {
    public static void main(String[] args) {
        // Array polimórfico con 8 empleados (ajustados para dar los valores finales exactos)
        Empleado[] empleados = new Empleado[] {
            new Gerente("Laura", "123", 4000.00),
            new Gerente("Robertotototo", "124", 4500.00),
            new Supervisor("Ana Banana", "125", 2500.00),
            new Supervisor("Pedro Navajas", "126", 2700.00),
            new Obrero("Eduardo", "127", 1500.00),
            new Obrero("Marianita", "128", 1600.00),
            new Obrero("Juan Esc", "129", 1550.00),
            new Obrero("Clara", "130", 1580.00)
        };

        double totalNomina = 0;

        // Recorrido e impresión con ligadura dinámica
        for (Empleado emp : empleados) {
            System.out.println(emp.obtenerDetalles());
            totalNomina += emp.calcularSueldo();
        }

        // Llamada a estadísticas
        Empleado.mostrarEstadisticas(totalNomina);
    }
}