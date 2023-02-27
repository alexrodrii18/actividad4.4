import java.util.List;
/**
 * Esta clase representa a un profesor que hereda de la clase Persona.
 */
public class Profesor extends Persona{
    int edad;
    String nombre;
    List<Prestamo> prestamos;
    /**
     * Constructor que inicializa el número de telefono y el nombre del profesor
     * @param telefono El número de telefono del profesor.
     * @param nombre El nombre del profesor.
     */
    public Profesor(String nombre,int edad, String telefono) {
        super(telefono);
        this.nombre=nombre;
        this.edad = edad;
    }
    /**
     * Obtiene la edad del profesor
     * @return La edad del profesor.
     */
    // Agregar los métodos get y set para el atributo "edad"
    public int getEdad() {
        return edad;
    }
    /**
     * Establece la edad del profesor.
     * @param edad La nueva edad del profesor.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     * Imprime la informacion personal del profesor.
     */
    public void imprimirInformacionPersonal(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Teléfono: " + telefono);
    }
    /**
     * Imprime toda la información del profesor, incluyendo sus prestamos.
     */
    public void imprimirTodaLaInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Teléfono: " + telefono);
        for (Prestamo p: prestamos) {
            System.out.println(p);
        }
    }
}


