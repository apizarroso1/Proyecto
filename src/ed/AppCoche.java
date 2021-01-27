package ed;
import daw.com.Teclado;
import daw.com.Pantalla;

public class AppCoche {

	public static void main(String[] args) {
		String color, matricula, fabricante;
		int edad;
		Coche c = new Coche();
		
		//Lectura de valores mediante el teclado
		color = Teclado.leerString("Teclee el color del coche");
		matricula = Teclado.leerString("Teclee la matrícula del coche en formato 1111 AAA");
		fabricante = Teclado.leerString("Teclee el fabricante del coche");
		edad = Teclado.leerInt("Teclee la edad del coche en años");
		
		//Aplicación de esos valores al objeto
		c.setColor(color);
		c.setMatricula(matricula);
		c.setFabricante(fabricante);
		c.setEdad(edad);
		
		//Menú para acceder a las opciones
		int opcion = 0;
		while ((opcion != 1) && (opcion != 2) && (opcion != 3) && (opcion != 4)) {
			opcion = Teclado.leerInt("Teclee su opción: 1 para valorar su coche; 2 para conducirlo; 3 para valorarlo y venderlo; 4 para salir");
			if (opcion == 1) {
				c.valorarCoche(edad);
			}
			if (opcion == 2) {
				c.conducirCoche();
			}
			if (opcion == 3) {
				int valor = c.valorarCoche(edad);
				c.venderCoche(valor);
			}
		}

	}

}
