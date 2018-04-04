import java.util.ArrayList;
import java.util.HashMap;

import java.util.Map;

public class Usuario {
	private int saldo;
	private String nombre;
	Map<String, Subasta> listadoSubastas = new HashMap<String, Subasta>();
	Map<String, Subasta> listadoSubastasGanadas = new HashMap<String, Subasta>();


	public Usuario() {

	}

	public Usuario(int saldo, String nombre) {
		this.saldo = saldo;
		this.nombre = nombre;

	}

	public static String print(Usuario d) {
		return "Usuario [getSaldo()=" + d.getSaldo() + ", getNombre()=" + d.getNombre() + ", SubastasPropias="
				+ MetodosSubasta.listadoSubastas(d) + ", Subastas ganadas=" + "]";
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
