package modelo;

public abstract class Mamifero extends Animal{
    private String dieta;
    private String especie;

    public Mamifero(String dieta, String especie){
        super("Vertebrado", "Mamifero");
        this.dieta = dieta;
        this.especie = especie;
    }

    public String getDieta(){
        return dieta;
    }

    public String getEspecie() {
        return especie;
    }

    // Obligamos a implementar este metodo en las subclases
    public abstract void comunicar();
}
