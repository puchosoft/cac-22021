public class Funciones {
    public static void main(String[] args) {
        int a = 15;
        long l;

        mostrarSuma(5, 8);
        l = suma(56, 89);
        System.out.println(l);
        System.out.println(suma(78, 45));

    }

    /**
     * Funcion que muestra por consola el resultado de
     * sumar los parametros a y b
     *
     * @param a primer valor a sumar
     * @param b segundo valor a sumar
     * */
    public static void mostrarSuma(int a, int b){
        System.out.println("La suma de "+ a + " + " + b + " es " + (a+b));
    }

    /**
     * Funcion que devuelve el resultado de
     * sumar los parametros a y b
     *
     * @param a primer valor a sumar
     * @param b segundo valor a sumar
     *
     * @return long - resultado de sumar a+b
     * */
    public static long suma( int a, int b ){
        return (long)(a + b);
    }

}
