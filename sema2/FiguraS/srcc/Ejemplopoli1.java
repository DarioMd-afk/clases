

public class Ejemplopoli1 {
    public static void main(String[] args) {
        Triangulo fig = new Triangulo();
        Cuadro fig2 = new Cuadro();
        Circulo fig3 = new Circulo();

        fig.dibujar();
        fig2.dibujar();
        fig3.dibujar();

        Figura [] figus = new Figura[3];
        figus[0] = new Figura();
        figus[1] = new Figura();
        figus[2] = new Figura();

        for (Figura f : figus){
            f.dibujar();
        }
    }
}