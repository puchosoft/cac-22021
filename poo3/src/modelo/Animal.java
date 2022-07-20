package modelo;

public class Animal {
    private String grupo;
    private String subgrupo;

    Animal(String grupo, String subgrupo){
        this.grupo = grupo;
        this.subgrupo = subgrupo;
    }

    public String getGrupo() {
        return grupo;
    }

    public String getSubgrupo() {
        return subgrupo;
    }
}
