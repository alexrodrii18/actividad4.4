/**
 * Clase que representa a una persona
 * @author alexrodrii18
 * @version 1.1.3
 */
public class Persona {
    protected String numeroDeTelefono;

    /**
     * Constructor de la clase que inicializa el atributo numeroDeTelefono
     * @param numeroDeTelefono
     */
    public Persona(String numeroDeTelefono) {
        super();
        this.numeroDeTelefono = numeroDeTelefono;
    }

    /**
     * Getter de numeroDeTelefono
     * @return Numero de telefono de la persona
     */
    public String getNumeroDeTelefono() {
        return numeroDeTelefono;
    }

    /**
     * Setter de numeroDeTelefono
     * @param numeroDeTelefono Numero de telefono de la persona
     */
    public void setNumeroDeTelefono(String numeroDeTelefono) {
        this.numeroDeTelefono = numeroDeTelefono;
    }
}
