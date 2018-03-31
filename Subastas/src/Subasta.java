import java.util.HashMap;
import java.util.Map;

public class Subasta {
	private String objetoPujado;
	private Persona due�o;
	Map<Integer, Puja> listadoPuja = new HashMap<Integer, Puja>();

	public Subasta(String objetoPujado, Persona due�o) {
		this.objetoPujado = objetoPujado;
		this.due�o = due�o;

	}

	
	public String printSubasta() {
		return "Subasta [objetoPujado=" + objetoPujado + ", due�o=" + due�o + "]";
	}

	public String getObjetoPujado() {
		return objetoPujado;
	}

	public void setObjetoPujado(String objetoPujado) {
		this.objetoPujado = objetoPujado;
	}

	public Persona getDue�o() {
		return due�o;
	}

	public void setDue�o(Persona due�o) {
		this.due�o = due�o;
	}
}
