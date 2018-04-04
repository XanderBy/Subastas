

public class Puja {
	private int cantidad;
	private Usuario pujador;
	private Subasta subasta;
	
	public Puja(int cantidad, Usuario pujador, Subasta subasta) {
		this.cantidad = cantidad;
		this.pujador = pujador;
		this.subasta=subasta;
	}


	public Subasta getSubasta() {
		return subasta;
	}


	public void setSubasta(Subasta subasta) {
		this.subasta = subasta;
	}


	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Usuario getPujador() {
		return pujador;
	}

	public void setPujador(Usuario pujador) {
		this.pujador = pujador;
	}

}
