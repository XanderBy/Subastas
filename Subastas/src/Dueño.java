import java.util.HashMap;
import java.util.Map;

public class Due�o extends Persona {

	Map<String, Subasta> listadoSubastas = new HashMap<String, Subasta>();

	public Due�o() {

	}

	public Due�o(int saldo, String nombre) {
		super(saldo, nombre);

	}
}
