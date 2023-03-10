import java.util.List;

/**
 * Clase que representa a un profesor y extiende de la clase Persona
 */
public class Profesor extends Persona {
    private String nombre;
    private int edad;
    private List<Prestamo> prestamos;

    /**
     * Constructor de la clase Profesor que inicializa los atributos numeroDeTelefono, nombre y edad
     * @param numeroDeTelefono numeroDeTelefono del profesor
     * @param nombre Nombre del profesor
     * @param edad Edad del profesor
     */
    public Profesor(String numeroDeTelefono, String nombre, int edad) {
        super(numeroDeTelefono);
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Getter de nombre
     * @return Nombre del profesor
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter de nombre
     * @param nombre Nombre del profesor
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter de edad
     * @return Edad del profesor
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Setter de edad
     * @param edad Edad del profesor
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Metodo que printea la informacion personal acerca del profesor
     */
    public void printInformacionPersonal() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Teléfono: " + getNumeroDeTelefono());
    }

    /**
     * * Metodo que printea toda la informacion acerca del profesor
     */
    public void printTodaLaInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Teléfono: " + getNumeroDeTelefono());
        for (Prestamo p : prestamos) {
            System.out.println(p);
        }
    }
}


