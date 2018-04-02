import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

public class MetodosSubasta {

	MetodosUsuario mu=new MetodosUsuario();
	
	public void crearSubasta(Usuario u, String nombre) throws IOException {
		String objeto;
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Escribe el objeto subastado");
		objeto = teclado.readLine();

		Subasta s1 = new Subasta(objeto, u);
		u.listadoSubastas.put(objeto, s1);
		System.out.println("La subasta ha sido creada");
	}

	public static String listadoSubastas(Usuario d) {
		try {
			Iterator it = d.listadoSubastas.keySet().iterator();
			while (it.hasNext()) {
				String key = (String) it.next();
				return d.listadoSubastas.get(key).printSubasta();
			}
			
		}catch(ClassCastException e) {
			
		}
		return "";
		
	}

}
