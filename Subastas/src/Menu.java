import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {

	public static void MenuPrincipal() throws NumberFormatException, IOException {
		int n=0,cantidad;
		String nombre, nombreObjeto;
		Usuario u1=new Usuario();
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
		do {
		System.out.println(
				"Bienvenido!!!" + "\n¿Qué acciones quieres realizar?" + "\n1.Crear un usuario" + "\n2.Eliminar Usuario" +"\n3.Lista Usuarios"
						+ "\n4.Crear Subasta" + "\n5.Pujar" + "\n6.Ver mayor puja" + "\n7.Cerrar Subasta" + "\n\n0.Salir de la aplicacion");
		n=Integer.parseInt(teclado.readLine());
		switch(n) {
		case 1:
			mu.CrearUsuario();
			break;
		case 2:
			mu.listaUsuarios();
			System.out.println("Introduce el nombre del usuario que quieres eliminar");
			nombre=teclado.readLine();
			nombre.toLowerCase();
			mu.eliminarUsuario(nombre);
			break;
		case 3:
			mu.listaUsuarios();
			break;
		case 4:
			mu.listaUsuarios();
			System.out.println("Escribe el nombre del usuario");
			nombre = teclado.readLine();
			
			ms.crearSubasta(mu.listadoUsuarios.get(nombre),nombre);
			break;
		case 5:
			mu.listaUsuarios();
			System.out.println("A que objeto quieres pujar");
			nombreObjeto=teclado.readLine();
			System.out.println("Escribe el nombre del usuario");
			nombre=teclado.readLine();
			System.out.println("Con que cantidad quieres pujar");
			cantidad=Integer.parseInt(teclado.readLine());
			Puja p=new Puja(cantidad, mu.listadoUsuarios.get(nombre), nombreObjeto);
			if(mp.comprobacion(cantidad, mu.listadoUsuarios.get(nombre), nombreObjeto)==true) {
				mp.pujar( mu.listadoUsuarios.get(nombre).listadoSubastas.get(nombreObjeto),  p);
			}else {
				System.out.println("La puja no ha sido aceptada");
			}
			
			
			break;
		case 6:
			System.out.println("De quien es el objeto quieres ver la mayor puja");
			nombre=teclado.readLine();
			System.out.println("De que objeto quieres ver la mayor puja");
			nombreObjeto=teclado.readLine();
			mp.pujaMayor(mu.listadoUsuarios.get(nombre).listadoSubastas.get(nombreObjeto));
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
