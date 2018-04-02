import java.util.ArrayList;
import java.util.List;

public class Subasta {
	private String objetoPujado;
	private Usuario dueño;
	List<Puja> listadoPuja = new ArrayList<Puja>();
	
	public Subasta(String objetoPujado, Usuario dueño) {
		this.objetoPujado = objetoPujado;
		this.dueño = dueño;
	}

	
	public String printSubasta() {
		return "Subasta [objetoPujado=" + getObjetoPujado() + ", dueño=" + dueño.getNombre() + "]";
	}

	public String getObjetoPujado() {
		return objetoPujado;
	}

	public void setObjetoPujado(String objetoPujado) {
		this.objetoPujado = objetoPujado;
	}

	public Usuario getDueño() {
		return dueño;
	}

	public void setDueño(Usuario dueño) {
		this.dueño = dueño;
	}


}
