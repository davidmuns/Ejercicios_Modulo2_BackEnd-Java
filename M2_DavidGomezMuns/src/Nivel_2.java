import javax.swing.JOptionPane;

public class Nivel_2 {

	public static void main(String[] args) {
		int filas = 0;

		String temp = JOptionPane.showInputDialog("Introduce número de filas:");
		//Capturar excepción si usuario introduce un valor no entero
		try {
			//Convertir de string a entero
			filas = Integer.parseInt(temp);
			//Llamar a métodos
			System.out.println("Pirámide invertida\n******************");
			piramideInvertida(filas);
			
			System.out.println("Escalera de números\n*******************");
			escaleraNumeros(filas);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "No hemos podido procesar su petición");
		}
	}
	//Método para imprimir filas de números en forma de escalera
	public static void escaleraNumeros(int filas) {
		String drawTriangle = "";
		for (int i = 1; i <= filas; i++) { //Filas
			
			for (int j = 1; j <= i; j++) { //Columnas de números
				drawTriangle += String.valueOf(j); //Concatenar valores de 'j' y asignar a variable
				System.out.print(j);
			}
			
			for (int j = filas - i; j >= 0; j--) { //Columnas de espacios 
				drawTriangle += " "; //Concatenar 'espacios' y asignar a variable
				System.out.print(" ");
			}
			
			drawTriangle += "\n"; //Concatenar salto de linea y asignar a variable
			System.out.println();
		}
		//Mostrar resultado en ventana emergente
		JOptionPane.showMessageDialog(null, drawTriangle, "ESCALERA DE NÚMEROS", 1);
	}
	//Método para imprimir filas de asteríscos en forma de pirámide invertida
	public static void piramideInvertida(int filas) {
		String drawPiramid = "";
		for (int i = 0; i < filas; i++) { //Filas
			
			for (int j = 0; j < i; j++) { //Columnas de espacios
				drawPiramid += " "; //Concatenar 'espacios' y asignar a variable
				System.out.print(" ");
			}
			
			for (int j = filas - 1 - i; j >= 0; j--) { //Columnas de asteriscos
				drawPiramid += "* "; //Concatenar asteriscos y asignar a variable
				System.out.print("* ");
			}
			
			drawPiramid += "\n"; //Concatenar salto de linea y asignar a variable
			System.out.println();
		}
		//Mostrar resultado en ventana emergente
		JOptionPane.showMessageDialog(null, drawPiramid, "PIRÁMIDE INVERTIDA", 1);
	}
}
