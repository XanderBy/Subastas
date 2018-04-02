

public class Puja {
	private int cantidad;
	private Usuario pujador;
	private String objeto;
	
	public Puja(int cantidad, Usuario pujador, String objeto) {
		this.cantidad = cantidad;
		this.pujador = pujador;
		this.objeto=objeto;
	}

	public String getObjeto() {
		return objeto;
	}

	public void setObjeto(String objeto) {
		this.objeto = objeto;
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
