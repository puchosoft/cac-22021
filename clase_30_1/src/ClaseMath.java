public class ClaseMath {

    public static void main(String[] args) {
        // Declaracion de una CONSTANTE
        final double pi = 3.14159;
        System.out.println(pi);
        // pi = 2.0; -> Da error xq intenta modificar una CONSTANTE

        // Math m = new Math(); -> no se pueden instanciar objetos de la clase Math

        System.out.println(Math.PI);
        System.out.println(Math.pow(25,3));
        System.out.println(Math.sqrt(144));

        System.out.println(Math.ceil(7.8));
        System.out.println(Math.floor(7.8));
        System.out.println(Math.round(7.8));
        System.out.println(Math.round(7.1));

    }
}
