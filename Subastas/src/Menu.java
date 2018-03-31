import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {

	public static void MenuPrincipal() throws NumberFormatException, IOException {
		int n=0;
		String nombre;
		MetodosGenerales mg=new MetodosGenerales();
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
		do {
		System.out.println(
				"Bienvenido!!!" + "\n¿Qué acciones quieres realizar?" + "\n1.Crear un usuario" + "\n2.Eliminar Usuario" +"\n3.Lista Usuarios"
						+ "\n4.Crear Subasta" + "\n5.Pujar" + "\n6.Ver mayor puja" + "\n\n0.Salir de la aplicacion");
		n=Integer.parseInt(teclado.readLine());
		switch(n) {
		case 1:
			mg.CrearUsuario();
			break;
		case 2:
			mg.listaUsuarios();
			System.out.println("Introduce el nombre del usuario que quieres eliminar");
			nombre=teclado.readLine();
			nombre.toLowerCase();
			mg.eliminarUsuario(nombre);
			break;
		case 3:
			mg.listaUsuarios();
			break;
		case 4:
			mg.crearSubasta();
			break;
		case 5:
			break;
		case 6:
			break;
		case 7:
			break;
		case 0:
			System.exit(0);
			break;
			default:
				System.out.println("Has cometido un error");
				break;
				
		}
		}while(n!=10);
	}
}
