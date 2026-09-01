class Moto extends Vehiculo {
    private boolean tieneSidecar;

    public Moto(String modelo, int año) {
        super(modelo, año);
        this.tieneSidecar = false;
    }

    public void agregarSidecar() {
        this.tieneSidecar = true;
        System.out.println("Se le ha agregado un sidecar a la moto " + modelo);
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("  -> Tiene Sidecar: " + (tieneSidecar ? "Sí" : "No"));
    }
}