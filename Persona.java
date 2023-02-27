import java.util.List;
/**
 * @author alexrodrii18
 * Esta clase representa a una persona con un número de teléfono.
 */
public class Persona {
    protected String telefono;
    /**
     * Constructor que inicializa el numero de teléfono de la persona
     * @param telefono El número de teléfono de la persona.
     */
    public Persona(String telefono){
        this.telefono = telefono;
    }

    /**
     * Obtiene el número de telefono de la persona.
     * @return El número de telefono de la persona.
     */
    public String getTelefono() {
        return telefono;
    }
    /**
     * Establece el número de teléfono de la persona
     * @param telefono El nuevo número de teléfono de la persona.
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}