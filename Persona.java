/**
 * @author alexrodrii18
 * @version 1.1.9
 * Esta clase representa a una persona con un número de teléfono.
 */
public class Persona {
    protected String nombre;
    protected int edad;
    protected String telefono;
    /**
     * Constructor que inicializa el numero de teléfono de la persona
     * @param telefono El número de teléfono de la persona.
     * @param nombre El nombre de la persona
     * @param edad Edad de la persona
     */
    public Persona(String nombre, int edad, String telefono) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = this.telefono;
    }

    /**
     * Metodo getter de nombre
     * @return Nombre de la persona
     */

    public String getNombre() {
        return nombre;
    }

    /**
     * Metodo setter de nombre
     * @param nombre Nombre de la persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter de edad
     * @return Edad de la persona
     */
    public int getEdad() {
        return edad;
    }
    /**
     * Setter de edad
     * @return Edad de la persona
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Metodo getter de telefono
     * @return Telefono de la persona
     */
    public String getTelefono() {
        return telefono;
    }
    /**
     * Metodo setter de telefono
     * @return Telefono de la persona
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    /**
     * Metoto sobreescrito toString para dar formato al objeto Persona
     * @return El formato en una cadena
     */
    @Override
    public String toString() {
        return String.format("Nombre: %s, edad %d y su número es %s",nombre,edad, telefono);
    }
}
