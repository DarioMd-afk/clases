// Definimos una clase abstracta llamada "Figura"
abstract class Figura {
    // Método abstracto que debe ser implementado por las subclases
    abstract double calcularArea();

    // Otro método común que puede ser implementado en la clase abstracta
    void mostrarNombre() {
        System.out.println("Esta es una figura.");
    }
}

// Creamos una subclase que hereda de Figura
class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    // Implementamos el método abstracto calcularArea para Circulo
    @Override
    double calcularArea() {
        return Math.PI * radio * radio;
    }
}

// Creamos otra subclase que hereda de Figura
class Rectangulo extends Figura {
    private double longitud;
    private double anchura;

    public Rectangulo(double longitud, double anchura) {
        this.longitud = longitud;
        this.anchura = anchura;
    }

    // Implementamos el método abstracto calcularArea para Rectangulo
    @Override
    double calcularArea() {
        return longitud * anchura;
    }
}

// Clase principal para probar el código
public class Main {
    public static void main(String[] args) {
        Figura miCirculo = new Circulo(5.0);
        Figura miRectangulo = new Rectangulo(4.0, 6.0);

        miCirculo.mostrarNombre();
        System.out.println("Área del círculo: " + miCirculo.calcularArea());

        miRectangulo.mostrarNombre();
        System.out.println("Área del rectángulo: " + miRectangulo.calcularArea());
    }
}