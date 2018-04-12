import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;

public class MetodosGenerales {

	public MetodosGenerales() {

	}

	public static void guardarDatosSubasta(Usuario u) {
		try {
			FileOutputStream fs = new FileOutputStream("D:\\archivos\\subasta\\subasta.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fs);
			Iterator it = u.listadoSubastas.keySet().iterator();
			while (it.hasNext()) {
				Integer key = (Integer) it.next();
				Subasta s = new Subasta(u.listadoSubastas.get(key).getObjetoPujado(),
						u.listadoSubastas.get(key).getDueno());
				oos.writeObject(s);
			}
			if (oos != null) {
				oos.close();
				fs.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void leerDatosSubasta(Usuario u) {
		try {
			File f = null;
			FileInputStream fe = null;
			ObjectInputStream ois = null;
			try {
				f = new File("D:\\archivos\\subasta\\subasta.txt");
				if (f.exists()) {
					fe = new FileInputStream(f);
					ois = new ObjectInputStream(fe);
					while (true) {
						Subasta s = null;
						s = (Subasta) ois.readObject();
						u.listadoSubastas.put(s.getObjetoPujado(), s);
					}
				}
			} catch (EOFException eof) {
				System.out.println(" --------------------------");
			} catch (FileNotFoundException fnf) {
				System.err.println("Fichero no encontrado " + fnf);
			} catch (IOException e) {
				System.err.println("Se ha producido una IOException");
				e.printStackTrace();
			} catch (Throwable e) {
				System.err.println("Error de programa: " + e);
				e.printStackTrace();
			} finally {
				if (ois != null) {
					ois.close();
					fe.close();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void guardarDatosSubastaGanadas(Usuario u) {
		try {
			FileOutputStream fs = new FileOutputStream("D:\\archivos\\subasta\\subastaGanadas.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fs);
			Iterator it = u.listadoSubastasGanadas.keySet().iterator();
			while (it.hasNext()) {
				Integer key = (Integer) it.next();
				Subasta s = new Subasta(u.listadoSubastasGanadas.get(key).getObjetoPujado(),
						u.listadoSubastasGanadas.get(key).getDueno());
				oos.writeObject(s);
			}
			if (oos != null) {
				oos.close();
				fs.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void leerDatosSubastaGanadas(Usuario u) {
		try {
			File f = null;
			FileInputStream fe = null;
			ObjectInputStream ois = null;
			try {
				f = new File("D:\\archivos\\subasta\\subastaGanadas.txt");
				if (f.exists()) {
					fe = new FileInputStream(f);
					ois = new ObjectInputStream(fe);
					while (true) {
						Subasta s = null;
						s = (Subasta) ois.readObject();
						u.listadoSubastasGanadas.put(s.getObjetoPujado(), s);
					}
				}
			} catch (EOFException eof) {
				System.out.println(" --------------------------");
			} catch (FileNotFoundException fnf) {
				System.err.println("Fichero no encontrado " + fnf);
			} catch (IOException e) {
				System.err.println("Se ha producido una IOException");
				e.printStackTrace();
			} catch (Throwable e) {
				System.err.println("Error de programa: " + e);
				e.printStackTrace();
			} finally {
				if (ois != null) {
					ois.close();
					fe.close();
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void guardarDatosPersona(MetodosUsuario mu) {
		try {
			FileOutputStream fs = new FileOutputStream("D:\\archivos\\subasta\\subastaPersonas.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fs);
			Iterator it = mu.listadoUsuarios.keySet().iterator();
			while (it.hasNext()) {
				Integer key = (Integer) it.next();
				Usuario u = new Usuario(mu.listadoUsuarios.get(key).getSaldo(),
						mu.listadoUsuarios.get(key).getNombre());
				oos.writeObject(u);
			}
			if (oos != null) {
				oos.close();
				fs.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void leerDatosPersona() {

	}

	public void actualizarFichero() {

	}
}
