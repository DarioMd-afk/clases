
public class Caballo extends Mamifero {
    private String comida;
    private int ejercicio = 1;

    public Caballo() {
        super();
    }

    public Caballo(String nombre, String tipo_alimentacion, int edad, int gestacion, String comida, int ejercicio) {
        super(nombre, tipo_alimentacion, edad, gestacion);
        this.comida = comida;
        this.ejercicio = ejercicio;
    }
}