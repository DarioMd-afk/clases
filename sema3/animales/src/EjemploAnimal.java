

public class EjemploAnimal {
    public static void main(String[] args) {
        Perro perro = new Perro("Teddy", "Croquetas", 5, 2, "Pastor Alemán");
        Gato gato = new Gato("Pelusa", "Pescado", 3, 2, "Siames");
        Caballo caballo = new Caballo("Rayo", "Pasto", 7, 11, "Heno", 2);

        System.out.println(perro);
        System.out.println(gato);
    }
}