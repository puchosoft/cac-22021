package modelo;

public class Gato extends Felino{
    public Gato(int edad){
        super("Gato", edad);
    }

    // Aplicamos POLIMORFISMO al método de Felino
    @Override
    public void comunicar() {
        System.out.println("Miau..!");
    }
}
