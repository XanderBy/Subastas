import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Subasta {
	private String objetoPujado;
	private Usuario due�o;
	List <Puja> listadoPuja = new ArrayList<Puja>();

	public Subasta(String objetoPujado, Usuario due�o) {
		this.objetoPujado = objetoPujado;
		this.due�o = due�o;

	}

	
	public String printSubasta() {
		return "Subasta [objetoPujado=" + objetoPujado + ", due�o=" + due�o.getNombre() + "]";
	}

	public String getObjetoPujado() {
		return objetoPujado;
	}

	public void setObjetoPujado(String objetoPujado) {
		this.objetoPujado = objetoPujado;
	}

	public Usuario getDue�o() {
		return due�o;
	}

	public void setDue�o(Usuario due�o) {
		this.due�o = due�o;
	}
}
