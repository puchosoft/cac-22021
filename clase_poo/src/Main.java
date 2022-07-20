import modelo.Persona;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Persona p1 = new Persona("Carlos", "Garcia");
        Persona p2 = new Persona("Julieta", "Perez");

        // p1.nombre = "Carlos";
        //p1.apellido = "Garcia";
        p1.setDni(40564897);
        p1.setFechaNac("30/02/2000");
        p1.mostrarDatos();

        p2.setDni(35634218);
        p2.mostrarDatos();

        Persona p456 = new Persona("Maria", "Venegas");

        System.out.println("Personas instanciadas al momento: " + Persona.getUltimoId() );

        //System.out.println(p2.getNombre()+" "+p2.getApellido()+" "+p2.getDni());

        Scanner entrada = new Scanner(System.in);

        // int dni = entrada.nextInt();
        /*
        System.out.print("DNI: ");
        int dni = Integer.valueOf(entrada.nextLine());
        System.out.print("Altura: ");
        double altura = Double.valueOf(entrada.nextLine());
        System.out.print("Fecha Nac.: ");
        String fechaNac = entrada.nextLine();

        p456.setDni(dni);
        p456.setFechaNac(fechaNac);
        p456.mostrarDatos();
 */
        Persona p78 = new Persona("Carlos", 34587457);
        p78.mostrarDatos();
    }
}
