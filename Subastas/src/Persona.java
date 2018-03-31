
public class Persona {
	private int saldo;
	private String nombre;
	
	public Persona() {
		
	}
	public Persona(int saldo, String nombre) {
		super();
		this.saldo = saldo;
		this.nombre = nombre;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
