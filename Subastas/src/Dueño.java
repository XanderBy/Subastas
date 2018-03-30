import java.util.HashMap;
import java.util.Map;

public class Dueño extends Persona {

	public Dueño(int saldo, String nombre) {
		super(saldo, nombre);
		Map<String, Subasta> listadoSubastas = new HashMap<String, Subasta>();
	}
}
