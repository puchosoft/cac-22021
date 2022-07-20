import modelo.*;

public class Principal {
    public static void main(String[] args) {

        // Instanciamos un objeto de la clase Leon
        Leon clarence = new Leon(7);
        System.out.println(clarence.getId());
        System.out.println(clarence.getGrupo());
        System.out.println(clarence.getSubgrupo());
        System.out.println(clarence.getDieta());
        System.out.println(clarence.getEspecie());
        System.out.println(clarence.getSubespecie());
        clarence.comunicar();
        System.out.println();

        // Instanciamos un objeto de la clase Gato
        Gato silvestre = new Gato(5);
        System.out.println(silvestre.getId());
        System.out.println(silvestre.getGrupo());
        System.out.println(silvestre.getSubgrupo());
        System.out.println(silvestre.getDieta());
        System.out.println(silvestre.getEspecie());
        System.out.println(silvestre.getSubespecie());
        silvestre.comunicar();
        System.out.println();

        // Instanciamos un objeto de la clase Felino
        // Observemos que al ser una clase generica
        // no tiene una implementacion adaptada de comunicar()
        Felino tigger = new Felino("Tigre", 10);
        System.out.println(tigger.getId());
        System.out.println(tigger.getGrupo());
        System.out.println(tigger.getSubgrupo());
        System.out.println(tigger.getDieta());
        System.out.println(tigger.getEspecie());
        System.out.println(tigger.getSubespecie());
        tigger.comunicar();
        System.out.println();

        // Mamifero perro = new Mamifero(); NO SE PUEDE INSTANCIAR UNA CLASE ABSTRACTA

    }
}
