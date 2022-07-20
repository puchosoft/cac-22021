package modelo;

public class Persona {

    private static int ultimoId = 0;
    private int id;
    private String nombre;
    private String apellido;
    private int dni;
    private String fechaNac; // "dd/mm/aa"

    // Constructores
    public Persona(String nombre, String apellido){
        this.id = ++ultimoId;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(String nombre, int dni){
        this.id = ++ultimoId;
        this.nombre = nombre;
        this.dni = dni;
    }

    // Setters
    public void setDni(int d){
        this.dni = d;
    }

    public void setFechaNac(String f) {
        this.fechaNac = f;
    }

    // Getters
    public int getDni(){
        return this.dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public int getId() {
        return id;
    }

    public static int getUltimoId() {
        return ultimoId;
    }

    public void mostrarDatos(){
        System.out.println("ID = " + this.id);
        System.out.println("Nombre = " + this.nombre);
        System.out.println("Apellido = " + this.apellido);
        System.out.println("DNI = " + this.dni);
        System.out.println("Fecha Nac. = " + this.fechaNac +"\n");
    }
}
