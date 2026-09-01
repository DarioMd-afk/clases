public class Main {
    public static void main(String[] args) {
        // Crear un arreglo de Vehiculos
        Vehiculo[] flota = new Vehiculo[4];

        // Llenar con diferentes tipos (Polimorfismo)
        flota[0] = new Auto("Sedán Toyota", 2022, 4);
        flota[1] = new AutoDeportivo("Ferrari F8", 2024, 2, 340.0);
        flota[2] = new Moto("Yamaha MT-07", 2023);
        flota[3] = new Camion("Volvo FH16", 2021, 25.0);

        System.out.println("=== MOSTRANDO DETALLES DE LA FLOTA ===\n");

        // Recorrer el array y mostrar detalles
        for (Vehiculo v : flota) {
            v.mostrarDetalles();
            v.acelerar();
            
            // Acciones específicas según el tipo
            if (v instanceof AutoDeportivo) {
                ((AutoDeportivo) v).turbo();
            } else if (v instanceof Moto) {
                ((Moto) v).agregarSidecar();
            } else if (v instanceof Camion) {
                ((Camion) v).cargar(18.5);
            }
            
            System.out.println("----------------------------------------");
        }
    }
}