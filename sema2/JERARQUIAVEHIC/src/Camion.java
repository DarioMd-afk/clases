class Camion extends Vehiculo {
    private double cargaMaxima;

    public Camion(String modelo, int año, double cargaMaxima) {
        super(modelo, año);
        this.cargaMaxima = cargaMaxima;
    }

    public void cargar(double peso) {
        if (peso <= cargaMaxima) {
            System.out.println(modelo + " cargó " + peso + " toneladas correctamente.");
        } else {
            System.out.println(modelo + " no puede cargar " + peso + " toneladas. Excede el límite de " + cargaMaxima + " t.");
        }
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("  -> Carga Máxima: " + cargaMaxima + " toneladas");
    }
}