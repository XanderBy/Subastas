import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MetodosGenerales {
	Map<String, Usuario> listadoUsuarios = new HashMap<String, Usuario>();

	public MetodosGenerales() {

	}

	public void CrearUsuario() throws IOException {
		String nombre;
		int credito;
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Escribe tu nombre de usuario");
		nombre = teclado.readLine();
		nombre.toLowerCase();
		System.out.println("Escribe tu credito");
		credito = Integer.parseInt(teclado.readLine());
		Usuario u1 = new Usuario(credito, nombre);
		guardarUsuario(nombre, u1);
	}

	public void guardarUsuario(String nombre, Usuario u) {
		listadoUsuarios.put(nombre, u);

	}

	public void eliminarUsuario(String nombre) {
		listadoUsuarios.remove(nombre);
	}

	public void guardarDatosSubasta() {

	}

	public void leerDatosSubasta() {

	}

	public void guardarDatosPersona() {

	}

	public void leerDatosPersona() {

	}

	public void listaUsuarios() {
		Iterator it = listadoUsuarios.keySet().iterator();
		while(it.hasNext()){
		Integer key = (Integer) it.next();
		System.out.println("Clave: " + key + " -> Valor: " + listadoUsuarios.get(key));
		}

	}

	public void crearSubasta() {
	}

	public void eliminarSubasta() {

	}

	public void pujar() {

	}

	public void pujaMayor() {

	}

	public void actualizarFichero() {

	}
}
