import java.util.HashMap;
import java.util.Map;

public class Usuario extends Persona {
	MetodosGenerales mg = new MetodosGenerales();
	Map<String, Subasta> listadoSubastas = new HashMap<String, Subasta>();
	
	public Usuario() {
		
	}
	public Usuario(int saldo, String nombre) {
		super(saldo, nombre);

	}

	public String print(Usuario d) {
		return "Usuario [getSaldo()=" + getSaldo() + ", getNombre()=" + getNombre() + ", Subastas="
				+ mg.listadoSubastas(d) + "]";
	}

}
