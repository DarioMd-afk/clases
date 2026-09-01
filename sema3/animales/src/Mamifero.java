

public class Mamifero extends Animal {
    private int gestacion;

    public Mamifero() {
        super("", "", 0);
    }

    public Mamifero(String nombre, String tipo_alimentacion, int edad, int gestacion) {
        super(nombre, tipo_alimentacion, edad);
        this.gestacion = gestacion;
    }

    public int getGestacion() {
        return gestacion;
    }

    public void setGestacion(int gestacion) {
        this.gestacion = gestacion;
    }

    @Override
    public String toString() {
        return "Mamifero{" +
                "gestacion=" + gestacion +
                "} " + super.toString();
    }
}