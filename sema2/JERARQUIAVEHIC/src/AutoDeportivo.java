class AutoDeportivo extends Auto {
    private double velocidadMaxima;

    public AutoDeportivo(String modelo, int año, int puertas, double velocidadMaxima) {
        super(modelo, año, puertas); // Uso de super() apuntando a Auto
        this.velocidadMaxima = velocidadMaxima;
    }

    public void turbo() {
        this.velocidad += 50.0; // Acceso directo a velocidad por ser 'protected'
        System.out.println("¡" + modelo + " activó el TURBO! Nueva velocidad: " + velocidad + " km/h.");
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("  -> Vel. Máxima: " + velocidadMaxima + " km/h (Deportivo)");
    }
}
