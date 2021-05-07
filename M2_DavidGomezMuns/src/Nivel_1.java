import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;


public class Nivel_1 {
	//Campos de clase
	private static char[] charArrayName, charArraySurname;
	private static List<Character> charListName, charListSurname, charListFullName;
	private static Map<Character, Integer> charMap;
	
	//Constructor de clase
	public Nivel_1(String nombre, String apellido) {
		charArrayName = nombre.toCharArray();
		charArraySurname = apellido.toCharArray();
		charListName = new ArrayList<Character>();
		charListSurname = new ArrayList<Character>();
		charListFullName = new ArrayList<Character>();
		charMap = new HashMap<Character, Integer>();
		
	}
	//Método main
	public static void main(String[] args) {
		
		try {
			//Capturar datos usuario
			String nombre = JOptionPane.showInputDialog("Introduce nombre:");
			String apellido = JOptionPane.showInputDialog("Introduce apellido:");
			
			//Instanciar clase para inicializar campos de clase
			Nivel_1 n1 = new Nivel_1(nombre, apellido);
					
			//Llamar métodos de clase
			System.out.println("FASE 1\n******");
			fase_1();
			System.out.println();
			System.out.println("FASE 2\n******");
			fase_2();
			System.out.println();
			System.out.println("FASE 3\n******");
			fase_3();
			System.out.println();
			System.out.println("FASE 4\n******");
			fase_4();
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "No hemos podido procesar su petición");
		}
			
	}
	//Método para imprimir array de caracteres
	public static void fase_1() {
		for(int i = 0; i < charArrayName.length; i++) {
			System.out.print(charArrayName[i]);
		}
		System.out.println();
	}
	//Método para detectar vocales, consonantes y caracteres numéricos en una lista e imprimir resultado
	public static void fase_2() {
		//Añadir elementos de array a lista
		for(int i = 0; i < charArrayName.length; i++) {
			charListName.add(charArrayName[i]);
		}
		int cont = 0;
		//Recorrer lista para encontrar caracteres numéricos e incrementar contador en caso afirmativo 
		for(int i = 0; i < charListName.size(); i++) {
			if(Character.isDigit(charListName.get(i))) cont++; 
		}
		
		//Si la lista no contiene carcateres numéricos (contador igual a cero), recorrer lista
		if(cont == 0) {
			//Buscar vocales
			for(int i = 0; i < charListName.size(); i++) {
				//Si el caracter es una vocal imprimir 'vocal'
				if(charListName.get(i).equals('A') || charListName.get(i).equals('a') || charListName.get(i).equals('E') ||
				   charListName.get(i).equals('e') || charListName.get(i).equals('I') || charListName.get(i).equals('i') || 
				   charListName.get(i).equals('O') || charListName.get(i).equals('o') ||
				   charListName.get(i).equals('U') || charListName.get(i).equals('u')) 
				{			
					System.out.println(charListName.get(i) + " vocal");
				//Si el caracter no es una vocal imprimir 'consonante'
				}else{
					System.out.println(charListName.get(i) + " consonante");
				}
			}
		//Si la lista contiene algún caracter numérico, imprimir mensaje correspondiente
		}else {
			System.out.println("Los nombres de personas no contienen números");
		}
		
	}
	//Método pra añadir elementos de una lista a un mapa
	public static void fase_3() {
		//Recorrer lista
		for (int i = 0; i < charListName.size(); ++i){
		    //Si el caracter no existe, añadir elemento de la lista al HashMap con un valor de 1
		    if (!charMap.containsKey(charListName.get(i))){		       
		        charMap.put(charListName.get(i), 1);
		    }
		    //Si el caracter existe, añadir elemento de la lista al HashMap remplazando el carcater anterior 
		    //e incrementar el valor en uno
		    else{ 
		        charMap.put(charListName.get(i), charMap.get(charListName.get(i)) + 1);
		    }
		}
		//Recorrer e imprimir HashMap
		for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
		    System.out.println("Clave = " + "'" + entry.getKey() + "'" + ", " + "Valor = " + entry.getValue());
		}
		//Añadir un espacio al final de la lista
		charListName.add(' ');
	}
	//Método para añadir elementos de una lista a otra
	public static void fase_4() {
		//Añadir elementos de array a lista
		for(int i = 0; i < charArraySurname.length; i++) {
			charListSurname.add(charArraySurname[i]);
		}
		//Añadir todos los elementos de la lista apellido a la lista nombre
		charListName.addAll(charListSurname);
		
		//Añadir todos los elementos de la lista nombre a la lista nombre completo
		charListFullName.addAll(charListName);
		
		//Imprimir lista nombre completo
		System.out.println(charListFullName);
	}
}
