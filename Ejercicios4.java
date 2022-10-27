package ejercicios;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ejercicios4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Ejercicio1();
//		Ejercicio1();
//		Ejercicio1();
//		Ejercicio2("hola", 1, 2);
//		Ejercicio2("hola", 2, 4);
//		Ejercicio3('x', 5);
//		Ejercicio4("Laura", "Ni�era", "Dependienta", "Porgramadora");
//		System.out.println(Ejercicio5(55));
//		System.out.println(Ejercicio7(new String[] { "Hola", "Maria", "Que", "Tal" }));
//		System.out.println(Ejercicio8(1,2,3,4,5));

		System.out.println("here\n" + Ejercicio10("Hola que tal", 'x', 3));//Necesidad de mejorar error al a�adir o contar la ultima posicion de un string o array (length)
//		System.out.println(Ejercicio11("5.3;10;5"));
//		String[] nombre = { "Lola", "Juan", "Paco", "Ana", "Bea", "Zacarias", "Mateo" };
//		String[] nombreOrde = Ejercicio12(nombre);
//		for (String string : nombreOrde) {
//			System.out.print(string + " |");		
//		}
//		int []numero= {1,10,3,5,6,12,12,5,5,0};
//		System.out.println(	Ejercicio13(numero,5));
//		LocalDateTime d = LocalDateTime.now();
//		System.out.println(Ejercicio14(d));
//		System.out.println(Ejercicio15("04-07-2019"));

	}

	/*
	 * Crea una funci�n que te dibuje una fila de 20 asteriscos usando un bucle.
	 * Ll�mala desde el main 3 veces.
	 * 
	 */
	public static void Ejercicio1() {

		for (int i = 0; i < 20; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

	/*
	 * Crea una funci�n que reciba una cadena y 2 n�meros enteros por par�metro y te
	 * imprima si la longitud de la cadena est� entre los 2 n�meros o no. Ll�mala al
	 * menos 2 veces, una en la que s� est� en el rango, y otra en la que no
	 */
	public static void Ejercicio2(String string, int integer1, int integer2) {
		System.out.println((string.length() >= integer1 && string.length() <= integer2)
				? "Esta enntre los valores " + integer1 + " y " + integer2
				: "No esta enntre los valores " + integer1 + " y " + integer2);
	}

	/*
	 * Crea una funci�n que reciba un car�cter y un n�mero, dibuja un cuadrado
	 * usando ese car�cter cuyo ancho y alto sea igual al n�mero recibido. Prueba la
	 * funci�n.
	 */
	public static void Ejercicio3(char c, int numero) {
		for (int i = 0; i < numero; i++) {
			for (int j = 0; j < numero; j++) {
				System.out.print(c);
			}
			System.out.println();
		}

	}

	/*
	 * Crea una funci�n con 2 par�metros. El primero ser� una cadena y representa al
	 * nombre de una persona, mientras que el segundo contendr� al resto de
	 * par�metros recibidos (�), que ser�n cadenas con los trabajos que la persona
	 * ha realizado. Imprime por consola el nombre de la persona seguido de la lista
	 * de trabajos realizados por la misma. Si no hay ning�n trabajo, indica que no
	 * ha trabajado nunca. Prueba la funci�n varias veces, al menos una de ellas no
	 * le pases ning�n trabajo.
	 * 
	 */
	public static void Ejercicio4(String nombreTrabajador, String... trabajos) {
		if (trabajos.length == 0) {
			System.out.println(nombreTrabajador + " no ha realizado ningun trabajo");
		} else {
			System.out.println(nombreTrabajador + "ha trabajado de " + String.join(", ", trabajos));
		}

	}

	/*
	 * Crea una funci�n que reciba un n�mero y devuelva un booleano indicando si el
	 * n�mero recibido es primo o no. Llama a la funci�n varias veces y muestra el
	 * resultado devuelto. Recuerda que un n�mero primo es aquel que solo es
	 * divisible (resto == 0) entre 1 y �l mismo.
	 */
	public static boolean Ejercicio5(int numero) {
		int divisores = 0;
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				divisores++;
			}
		}
		return (divisores > 2) ? false : true;

	}

	/*
	 * Crea una funci�n que reciba un array de n�meros y devuelva su media.
	 */
	public static double Ejercicio6(int[] numeros) {
		double suma = 0;
		for (int i = 0; i < numeros.length; i++) {
			suma = suma + numeros[i];
		}
		return suma / numeros.length;

	}

	/*
	 * Crea una funci�n que reciba un array de cadenas por par�metro y devuelva una
	 * de las cadenas al azar. Pista: puedes generar un n�mero aleatorio entre 0 y
	 * la �ltima posici�n del array usando new Random().nextInt(array.length). A
	 * continuaci�n pide al usuario que adivine la palabra seleccionada (tiene 3
	 * intentos, usa un bucle). Si la acierta felic�tale, y si no, dile cual era la
	 * correcta.
	 */
	public static String Ejercicio7(String[] array) {
		int intentos = 3;
		boolean acertado = false;
		String cadena = array[new Random().nextInt(array.length)];
		String palabra = null;
		do {
			System.out.println("Adivina la palabra tienes " + intentos + ((intentos != 1) ? " intentos" : " intento"));
			Scanner scanner = new Scanner(System.in);
			palabra = scanner.next();
			if (palabra.equalsIgnoreCase(cadena)) {
				acertado = true;
				System.out.print("Felicidades has acertado la palabra era ");
			} else {

				intentos--;
				if (intentos == 0) {
					System.out.println("Se te agotaron los intentos la palabra: era");
				}
			}

		} while (intentos > 0 && !acertado);
		return cadena;

	}

	/*
	 * Crea una funci�n que reciba un n�mero indeterminado de par�metros enteros y
	 * devuelva el m�ximo. Ten en cuenta que si recibes cero n�meros, debes devolver
	 * cero tambi�n.
	 */
	public static int Ejercicio8(int... numeros) {
		if (numeros.length == 0) {
			return 0;
		} else {
			int maximo = numeros[0];
			for (int i : numeros) {
				if (i > maximo) {
					maximo = i;
				}
			}
			return maximo;
		}
	}

	/*
	 * Crea una funci�n que reciba una cadena y una subcadena por par�metro y
	 * devuelva cuantas veces aparece la subcadena dentro de la cadena. Para ello
	 * debes saber que como segundo par�metro a indexOf le puedes pasar la posici�n
	 * a partir de la cual buscar (empezar�amos en cero). Cuando te devuelva -1 es
	 * que ya no la ha encontrado (utiliza un bucle).
	 */
	public static int Ejercicio9(String cadena, String subcadena) {
		int coincidencias = 0, i = 0;

		do {
			i = cadena.indexOf(subcadena, i);
			if (i != -1) {
				coincidencias++;
				i++;
			}

		} while (i != -1);
		return coincidencias;
	}

	/*
	 * Crea una funci�n que reciba una cadena, un separador (char) y un n�mero n. La
	 * funci�n insertar� el separador dentro de la cadena cada n caracteres (ten en
	 * cuenta que al insertar el separador, la siguiente posici�n se incrementa en
	 * 1.
	 */
	public static String Ejercicio10(String cadena, char caracter, int num) {
		int i = 0;
		int num2 = num;
		String cadenaCaracter = "";
		do {
			if (num != 0) {
				cadenaCaracter = cadenaCaracter + cadena.charAt(i);
				num--;
				i++;
			} else {

				if (num == 0 && i == cadena.length() - 1) {
					num = num2;
					cadenaCaracter = cadenaCaracter + caracter;
				} else {
					num = num2;
					cadenaCaracter = cadenaCaracter + caracter;
				}
			}
		} while (i < cadena.length());
		return cadenaCaracter;//
	}

	/*
	 * Crea una funci�n que reciba una cadena con una serie de n�meros separados por
	 * punto y coma �;�, y devuelva la media de dichos n�meros.
	 */
	public static double Ejercicio11(String cadena) {
		String[] cadenaSplit = cadena.split(";");
		double[] numero = new double[cadenaSplit.length];
		for (int i = 0; i < cadenaSplit.length; i++) {
			numero[i] = Double.valueOf(cadenaSplit[i]);
		}
		double suma = 0;
		for (double d : numero) {
			suma += d;
		}
		return suma / numero.length;
	}

	/*
	 * Crea una funci�n que reciba un array de cadenas y te lo devuelva ordenado
	 * alfab�ticamente de la �z� a la �a�
	 */
	public static String[] Ejercicio12(String[] arr) {
		List<String> arrL = Arrays.asList(arr);
		Collections.sort(arrL);
		arr = arrL.toArray(new String[0]);
		return arr;
	}

	/*
	 * Crea una funci�n que reciba un array de n�meros y un n�mero. y te devuelva
	 * cuantas veces aparece ese n�mero en el array.
	 * 
	 */
	public static int Ejercicio13(int[] numeros, int numero) {
		int cantidad = 0;
		for (int i : numeros) {
			if (i == numero) {
				cantidad++;
			}
		}
		return cantidad;
	}

	/*
	 * . Crea una funci�n que a partir de una fecha (LocalDateTime) que reciba por
	 * par�metro, te devuelva una cadena con la fecha en el siguiente formato:
	 * 
	 */
	public static String Ejercicio14(LocalDateTime lDT) {
		String[] dias = { "Lunes", "Martes", "Mi�rcoles", "Jueves", "Viernes", "S�bado", "Domingo" };
		String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };
		return dias[lDT.getDayOfWeek().getValue() - 1] + ", " + lDT.getDayOfMonth() + " de "
				+ meses[lDT.getMonthValue() - 1] + " de " + lDT.getYear();

	}

	/*
	 * Crea una funci�n que reciba una fecha en formato dd-mm-yyyy, convi�rtela a
	 * fecha (LocalDate) utilizando la funci�n subString o split para extraer el
	 * d�a, mes y a�o, o usa el DateTimeFormatter, s�male 2 a�os, 3 meses y 5 d�as,
	 * y muestra la fecha resultante.
	 */
	public static String Ejercicio15(String fecha) {
		String[] fString = fecha.split("-");
		String format = fString[2] + "-" + fString[1] + "-" + fString[0];
//		 LocalDate.of(Integer.valueOf(fString[0]), Integer.valueOf(fString[1]), Integer.valueOf(fString[2]));
		LocalDate lD = LocalDate.parse(format);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY");

		return formatter.format(lD.plusDays(5).plusMonths(3).plusYears(2));
	}

}
