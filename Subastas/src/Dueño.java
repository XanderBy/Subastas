import java.util.HashMap;
import java.util.Map;

public class Dueño extends Persona {

	Map<String, Subasta> listadoSubastas = new HashMap<String, Subasta>();

	public Dueño() {

	}

	public Dueño(int saldo, String nombre) {
		super(saldo, nombre);

	}
}
