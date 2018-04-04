
import java.util.ArrayList;
import java.util.List;

public class Subasta {
	
	private String objetoPujado;
	private Usuario dueno;
	List<Puja> listadoPuja = new ArrayList<Puja>();
	
	public Subasta(String objetoPujado, Usuario dueno) {
		this.objetoPujado = objetoPujado;
		this.dueno = dueno;
	}

	
	public String printSubasta() {
		return "Subasta [objetoPujado=" + getObjetoPujado() + ", dueno=" + dueno.getNombre() + "]";
	}

	public String getObjetoPujado() {
		return objetoPujado;
	}

	public void setObjetoPujado(String objetoPujado) {
		this.objetoPujado = objetoPujado;
	}

	public Usuario getDueno() {
		return dueno;
	}

	public void setDueno(Usuario dueno) {
		this.dueno = dueno;
	}


}
