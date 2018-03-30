import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {

	public static void MenuPrincipal() throws NumberFormatException, IOException {
		int n=0;
		BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
		do {
		System.out.println(
				"Bienvenido!!!" + "\n¿Qué acciones quieres realizar?" + "\n1.Crear un usuario" + "\n2.Eliminar Usuario" +"\n3.Lista Usuarios"
						+ "\n4.Crear Subasta"+ "\n5.Eliminar Subasta" + "\n6.Pujar" + "\n7.Ver mayor puja" + "\n\n0.Salir de la aplicacion");
		n=Integer.parseInt(teclado.readLine());
		switch(n) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
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
