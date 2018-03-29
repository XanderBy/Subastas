
public class Subasta {
	private String objetoPujado;
	private Persona dueño;

	public Subasta(String objetoPujado, Persona dueño) {
		this.objetoPujado = objetoPujado;
		this.dueño = dueño;
	}

	public String getObjetoPujado() {
		return objetoPujado;
	}

	public void setObjetoPujado(String objetoPujado) {
		this.objetoPujado = objetoPujado;
	}

	public Persona getDueño() {
		return dueño;
	}

	public void setDueño(Persona dueño) {
		this.dueño = dueño;
	}
}
