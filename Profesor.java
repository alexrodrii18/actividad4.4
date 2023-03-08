import java.util.ArrayList;
import java.util.List;
/**
 * Clase que representa a un Profesor y extiende de la clase Persona
 */
public class Profesor extends Persona {
    protected List<String> prestamos = new ArrayList<>();
    /**
     * Constructor de la clase Profesor que inicializa diferentes atributos
     * @param nombre Nombre del profesor
     * @param edad Edad del profesor
     * @param telefono Telefono del profesor
     */
    public Profesor(String nombre, int edad, String telefono ) {
        super(nombre, edad, telefono);
    }

    /**
     * Metoto sobreescrito toString para dar formato al objeto Profesor
     * @return El formato en una cadena
     */
    @Override
    public String toString() {
        return String.format("Nombre: %s, edad %d, y su telefono %s" , nombre, edad, telefono);

    }
}


