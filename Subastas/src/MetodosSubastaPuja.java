import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MetodosSubastaPuja {
	
	 public void pujar(Subasta s, int cantidad, Usuario u) {
	        try {

	            
	        	
	            System.out.println("La puja ha sido realizada");

	        } catch (NullPointerException e) {

	        }

	    }

	    public void pujaMayor(Subasta s) {
	        try {
	            System.out.println(s.listadoPuja.get(s.listadoPuja.size()-1).getCantidad());
	        } catch (NullPointerException e) {
	        }
	    }

	    public boolean comprobacion(int Cantidad, Usuario u, String nombre) {
	        boolean verdad = false;
	        try {
	            if (Cantidad <= u.getSaldo() && u.getNombre() != u.listadoSubastas.get(nombre).getDueno().getNombre()) {
	                return verdad = true;
	            } else {

	                return verdad = false;
	            }
	        } catch (NullPointerException e) {
	        }
	        return verdad;
	    }
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
