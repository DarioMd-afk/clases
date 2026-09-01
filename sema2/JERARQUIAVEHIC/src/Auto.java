class Auto extends Vehiculo {
    private int puertas;

    public Auto(String modelo, int año, int puertas) {
        super(modelo, año); // Llamada al constructor base
        this.puertas = puertas;
    }

    public int obtenerPuertas() {
        return puertas;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("  -> Puertas: " + puertas);
    }
}