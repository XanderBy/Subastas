
public class Usuario extends Persona {

	public Usuario(int saldo, String nombre) {
		super(saldo, nombre);
		
	}

	public String print() {
		return "Usuario [getSaldo()=" + getSaldo() + ", getNombre()=" + getNombre() + "]";
	}
	
	

}
