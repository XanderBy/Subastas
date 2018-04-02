
public class MetodosPuja {
	public void pujar(Subasta u, Puja p) {
		try {

			u.listadoPuja.add(p);

			System.out.println("La puja ha sido realizada");

		} catch (NullPointerException e) {

		}

	}

	public void pujaMayor(Subasta u) {
		try {
			System.out.println(u.listadoPuja.get(u.listadoPuja.size() - 1).getCantidad());
		} catch (NullPointerException e) {
		}
	}

	public boolean comprobacion(int Cantidad, Usuario u, String nombre) {
		boolean verdad=false;
		try {
			if (Cantidad <= u.getSaldo()) {
				return verdad=true;
			} else {

				return verdad=false;
			}
		} catch (NullPointerException e) {
		}
		return verdad;
	}

}
