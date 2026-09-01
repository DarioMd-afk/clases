

public class Gato extends Mamifero {
    private String pedigri;

    public Gato() {
        super();
    }

    public Gato(String nombre, String tipo_alimentacion, int edad, int gestacion, String pedigri) {
        super(nombre, tipo_alimentacion, edad, gestacion);
        this.pedigri = pedigri;
    }

    public String getPedigri() {
        return pedigri;
    }

    public void setPedigri(String pedigri) {
        this.pedigri = pedigri;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "pedigri='" + pedigri + '\'' +
                "} " + super.toString();
    }
}