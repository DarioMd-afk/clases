class Vehiculo {
    // Atributos con modificador protected (# en UML)
    protected String modelo;
    protected int año;
    protected double velocidad;

    // Constructor
    public Vehiculo(String modelo, int año) {
        this.modelo = modelo;
        this.año = año;
        this.velocidad = 0.0;
    }

    // Métodos
    public void acelerar() {
        this.velocidad += 10.0;
        System.out.println(modelo + " acelera a " + velocidad + " km/h.");
    }

    public void frenar() {
        this.velocidad = Math.max(0, this.velocidad - 10.0);
        System.out.println(modelo + " frena a " + velocidad + " km/h.");
    }

    public String obtenerModelo() {
        return modelo;
    }

    public void mostrarDetalles() {
        System.out.println("Modelo: " + modelo + " | Año: " + año + " | Velocidad actual: " + velocidad + " km/h");
    }
}