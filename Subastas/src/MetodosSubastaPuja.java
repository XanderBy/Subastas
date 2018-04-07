import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MetodosSubastaPuja {

	public void pujar(Subasta s, int cantidad, Usuario u) {

		try {
			if (s.listadoPuja.size() > 0) {

				if (cantidad <= u.getSaldo() && u.getNombre() != s.getDueno().getNombre()
						&& cantidad > s.listadoPuja.get(s.listadoPuja.size() - 1).getCantidad()) {
					Puja p = new Puja(cantidad, u, s);
					s.listadoPuja.add(p);
					System.out.println("La puja ha sido realizada");
				} else {

					System.out.println("No ha sido posible pujar");
				}
			} else {
				if (cantidad <= u.getSaldo() && u.getNombre() != s.getDueno().getNombre()) {
					Puja p = new Puja(cantidad, u, s);
					s.listadoPuja.add(p);
					System.out.println("La puja ha sido realizada");
				} else {

					System.out.println("No ha sido posible pujar");
				}
			}
		} catch (NullPointerException e) {
			System.out.println("Ha habido un error");
		}

	}

	public void pujaMayor(Subasta s) {
		try {
			System.out.println(s.listadoPuja.get(s.listadoPuja.size() - 1).getCantidad());
		} catch (NullPointerException e) {
		}
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
	public static boolean cerrarSubasta() throws IOException {
		String respuesta;
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Seguro que quieres cerrar la subasta");
		respuesta= teclado.readLine();
		if(respuesta.equalsIgnoreCase("si")) {
			return true;
		}else {
			System.out.println("La puja a sido cerrada, ya no se permite pujar mas");
			return false;
			
		}
		
		
		
	}

}
