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
		while (it.hasNext()) {
			String key = (String) it.next();
			System.out.println(listadoUsuarios.get(key).print(listadoUsuarios.get(key)));
		}

	}

	public void crearSubasta(Usuario u, String nombre) throws IOException {
		String objeto;
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Escribe el objeto subastado");
		objeto = teclado.readLine();

		Subasta s1 = new Subasta(objeto, listadoUsuarios.get(nombre));
		u.listadoSubastas.put(objeto, s1);

	}

	public String listadoSubastas(Usuario d) {
		Iterator it = d.listadoSubastas.keySet().iterator();
		while (it.hasNext()) {
			String key = (String) it.next();
			return d.listadoSubastas.get(key).printSubasta();
		}
		return "";
	}

	public void pujar(int cantidad, Usuario u) {
		
	}

	public void pujaMayor() {

	}

	public void actualizarFichero() {

	}
}
