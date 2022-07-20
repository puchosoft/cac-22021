package modelo;

public class Felino extends Mamifero{
    private static int lastId = 0;
    private int id;
    private String subespecie;
    private int edad;

    public Felino(String subespecie, int edad){
        super("Carnivoro", "Felino");
        this.subespecie = subespecie;
        this.edad = edad;
        this.id = ++lastId;
    }

    public int getId() {
        return id;
    }

    public String getSubespecie() {
        return subespecie;
    }

    public int getEdad() {
        return edad;
    }

    public static int getLastId() {
        return lastId;
    }

    // Implementamos el metodo ABSTRACTO de Mamifero
    public void comunicar() {
        System.out.println("(sonido generico de un felino)");
    }
}
