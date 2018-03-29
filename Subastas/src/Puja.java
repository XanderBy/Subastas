
public class Puja {
	private int cantidad;
	private Persona pujador;

	public Puja(int cantidad, Persona pujador) {
		super();
		this.cantidad = cantidad;
		this.pujador = pujador;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Persona getPujador() {
		return pujador;
	}

	public void setPujador(Persona pujador) {
		this.pujador = pujador;
	}

}
