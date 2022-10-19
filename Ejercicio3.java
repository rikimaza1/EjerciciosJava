package ejercicios;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ejercicio1();
//		ejercicio2();
//		ejercicio3();
//		ejercicio4();
//		ejercicio5();
//		ejercicio6();
//		ejercicio7();
//		ejercicio8();
//		ejercicio9();
		ejecicio10("2", "1.6");
//		ejecicio11();
//		ejecicio12();
//		ejercio13();

	}

	/*
	 * Crea un array con los nombres de los meses. A continuación pide al usuario un
	 * número del 1 al 12. Muéstrale el nombre del mes correspondiente sin usar
	 * estructuras condicionales (es decir, a partir de los valores del array).
	 */
	public static void ejercicio1() {
		String[] arrayString = new String[12];
		arrayString[0] = "Enero";
		arrayString[1] = "Febrero";
		arrayString[2] = "Marzo";
		arrayString[3] = "Abril";
		arrayString[4] = "Mayo";
		arrayString[5] = "Junio";
		arrayString[6] = "Julio";
		arrayString[7] = "Agosto";
		arrayString[8] = "Septiembre";
		arrayString[9] = "Octubre";
		arrayString[10] = "Novienbre";
		arrayString[11] = "Diciembre";
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzce numero");
		int numero;
		numero = entrada.nextInt();
		entrada.close();
		System.out.println("Este numero es el mes " + arrayString[numero]);
	}

	/*
	 * Crea un array de enteros con 10 posiciones. A continuación pide al usuario
	 * que vaya introduciendo uno a uno los 10 números por consola. Muestra lo
	 * siguiente: a. La lista de números introducidos b. La suma de los números c.
	 * La media de los números d. El mayor y el menor de los números (crea un máximo
	 * y un mínimo provisional que será igual al primer número del array, después
	 * vas comparando con el resto de posiciones).
	 * 
	 */
	public static void ejercicio2() {
		int[] arrayInt = new int[10];
		Scanner entrada = new Scanner(System.in);
		for (int i = 0; i < arrayInt.length; i++) {
			System.out.println("Introduce el valor del array " + (i + 1));
			arrayInt[i] = entrada.nextInt();
		}
		// Lista
//		for (int i : arrayInt) {
//			System.out.print(i+", ");
//		}
		// Suma foreach
		int suma = 0;
//		for (int i : arrayInt) {
//			suma=suma+i;
//		}
//		System.out.println("La suma del array es "+suma);
		for (int i = 0; i < arrayInt.length; i++) {
			suma = suma + arrayInt[i];
		}
		System.out.println("La suma del array es " + suma);
		System.out.println("La media del array es " + (suma / arrayInt.length));
		int maximo = arrayInt[0], minimo = arrayInt[0];
		for (int i : arrayInt) {
			if (maximo < i) {
				maximo = i;
			}
			if (minimo > i) {
				minimo = i;
			}
		}
		System.out.println("Minimo " + minimo + " maximo " + maximo);

	}

	/*
	 * Pide al usuario 10 números con decimales (double). Usa un array para
	 * almacenarlos. Muestra la media y los números que están por encima de esa
	 * media.
	 */
	public static void ejercicio3() {
		double[] arrayDouble = new double[10];
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < arrayDouble.length; i++) {
			System.out.println("Introduce 10 numeros con decimales " + (i + 1));
			arrayDouble[i] = in.nextDouble();
		}
		in.close();
		for (double d : arrayDouble) {
			System.out.println(d);
		}
		double suma = 0;
		for (double d : arrayDouble) {
			suma = suma + d;
		}
		double media = suma / arrayDouble.length;
		System.out.println("La media es " + media);
	}

	/*
	 * Crea un programa que almacene en una tabla el número de días que tiene cada
	 * mes (de un año no bisiesto), pida al usuario que te indique un mes (ej. 2
	 * para febrero) y un día (ej. el día 15). Muéstrale qué número de día es dentro
	 * del año (por ejemplo, el 15 de febrero sería el día número 46, y el 31 de
	 * diciembre sería el día 365).
	 */
	public static void ejercicio4() {
		Scanner in = new Scanner(System.in);
		int mes, dia = 0, dias = 0;

		int[] meses = new int[12];
		meses[0] = 31;
		meses[1] = 28;
		meses[2] = 31;
		meses[3] = 30;
		meses[4] = 31;
		meses[5] = 30;
		meses[6] = 31;
		meses[7] = 31;
		meses[8] = 30;
		meses[9] = 31;
		meses[10] = 30;
		meses[11] = 31;
		System.out.println("Introduce un mes (1-12)");
		mes = in.nextInt();
		System.out.println("Introduce un dia del (1-" + meses[mes - 1] + ")");
		dia = in.nextInt();
		if (mes == 1) {
			System.out.println("los dias totales son " + dia + ((dia > 1) ? " dias" : " dia"));
		} else {

			for (int i = 0; i < mes - 1; i++) {
				dias = dias + meses[i];
			}
			dias = dias + dia;
			System.out.println("los dias totales son " + dias + ((dias > 1) ? " dias" : " dia"));
		}
		in.close();
	}

	/*
	 * Crea 2 arrays, uno para almacenar notas de alumnos y otro para almacenar sus
	 * nombres. A continuación pregunta al usuario cuántos alumnos hay en total. En
	 * función del número de alumnos pide sus nombres y sus notas y guárdalos en los
	 * respectivos arrays.
	 */
	public static void ejercicio5() {
		String[] nombreAlumnos;
		Double[] notasAlumnos;
		System.out.println("¿Cuantos alumnos tiene?");
		int numeroAlumnos = new Scanner(System.in).nextInt();
		nombreAlumnos = new String[numeroAlumnos];
		notasAlumnos = new Double[numeroAlumnos];
		for (int i = 0; i < notasAlumnos.length; i++) {
			System.out.println("Nombre del alumno " + (i + 1));
			nombreAlumnos[i] = new Scanner(System.in).next();
			System.out.println("Nota del alumno " + (i + 1));
			notasAlumnos[i] = new Scanner(System.in).nextDouble();
		}
		for (int i = 0; i < notasAlumnos.length; i++) {
			System.out.println(nombreAlumnos[i] + " tiene de nota " + notasAlumnos[i]);
		}
	}

	/*
	 * Crea un array de números enteros con 10 posiciones. Pregunta al usuario por
	 * un número y guarda en el array la tabla de multiplicar de dicho número. A
	 * continuación, recorre el array y muestra lo que tienes almacenado. Por
	 * ejemplo, si introducimos 6:
	 */
	public static void ejercicio6() {
		String[] tabla = new String[10];
		System.out.println("Dime un numero");
		int numero = new Scanner(System.in).nextInt();
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = numero + " x " + (i + 1) + " = " + (numero * (i + 1));
		}
		for (String string : tabla) {
			System.out.println(string);
		}
	}

	/*
	 * Crea un programa con 2 arrays que almacenen 10 números cada uno (pon los
	 * valores que quieras). Suma las posiciones de ambos arrays (usa un bucle) en
	 * un tercer array, y al final muestra los resultados:
	 * 
	 */
	public static void ejercicio7() {
		int[] arrayInt1 = new int[10];
		int[] arrayInt2 = new int[10];
		int[] arrayInt3 = new int[10];

		for (int i = 0; i < arrayInt1.length; i++) {
			System.out.println("Introduce el numero " + (i + 1) + " en el primer array ");
			arrayInt1[i] = new Scanner(System.in).nextInt();
		}

		for (int i = 0; i < arrayInt2.length; i++) {
			System.out.println("Introduce el numero " + (i + 1) + " en el segundo array ");
			arrayInt2[i] = new Scanner(System.in).nextInt();
		}
		for (int i = 0; i < arrayInt3.length; i++) {
			arrayInt3[i] = arrayInt1[i] + arrayInt2[i];
		}
		for (int i : arrayInt3) {
			System.out.println(i);
		}

	}

	/*
	 * Crea un array de cadenas con 10 posiciones. Pide al usuario que introduzca 10
	 * nombres. Por cada nombre introducido, debes comprobar que no existe ya en el
	 * array. Si existe, no lo guardes y vuelve a pedirle otro nombre.
	 */
	public static void ejercicio8() {
		String[] arrayCadenas = new String[10];
		for (int i = 0; i < arrayCadenas.length; i++) {

			String nombre;
			do {
				System.out.println("Introduce en nombre numero " + (i + 1));
				nombre = new Scanner(System.in).next();

			} while (Arrays.asList(arrayCadenas).contains(nombre));
			arrayCadenas[i] = nombre;
		}
	}

	/*
	 * Pide al usuario que escriba un nombre y guárdalo. A continuación, muestra las
	 * vocales que contiene ese nombre (debes recorrer la cadena y comparar sus
	 * caracteres).
	 * 
	 */
	public static void ejercicio9() {
		String nombre;
		System.out.println("Introduce un nombre");
		nombre = new Scanner(System.in).nextLine();
		for (int i = 0; i < nombre.length(); i++) {
			if (String.valueOf(nombre.charAt(i)).equalsIgnoreCase("a")
					|| String.valueOf(nombre.charAt(i)).equalsIgnoreCase("e")
					|| String.valueOf(nombre.charAt(i)).equalsIgnoreCase("i")
					|| String.valueOf(nombre.charAt(i)).equalsIgnoreCase("o")
					|| String.valueOf(nombre.charAt(i)).equalsIgnoreCase("u")) {
				System.out.println(nombre.charAt(i));

			}
		}

	}

	/*
	 * Crea un programa que reciba 2 parámetros de entrada. Esos 2 parámetros serán
	 * 2 números que el programa sumará y mostrará el resultado. Se debe comprobar
	 * que se 2 han recibido esos 2 parámetros o mostrar un error. Recuerda que los
	 * parámetros se reciben como cadenas, por lo que hay que convertirlos a número.
	 */
	public static void ejecicio10(String num1, String num2) {
//		 APARTADO 10
		boolean bNum1 = Pattern.compile("-?\\d+(\\.\\d+)?").matcher(num1).matches();
		boolean bNum2 = Pattern.compile("-?\\d+(\\.\\d+)?").matcher(num2).matches();
		if (bNum1) {

			if (bNum2) {
				Double suma = Double.valueOf(num1) + Double.valueOf(num2);
				System.out.println("la suma es " + suma);
			} else {
				System.err.println("El segundo parametro no es un numero");
			}

		} else {
			System.err.println("El primer parametro no es un numero");
		}

	}

	/*
	 * Crea un array de cadenas que almacenará nombres de alumnos, y crea otro array
	 * de enteros de 2 dimensiones. La primera dimensión indicará el alumno (se
	 * corresponderá con la posición del array de nombres) y la segunda sus notas.
	 * Crea 4 alumnos con 4 notas cada uno. A continuación muestra los nombres de lo
	 * alumnos y su nota media.
	 */

	public static void ejecicio11() {
		String[] nombreAlumnos = new String[4];
		nombreAlumnos[0] = "Maria";
		nombreAlumnos[1] = "Mar";
		nombreAlumnos[2] = "Juan";
		nombreAlumnos[3] = "Jose";
		int[][] notasAlumnos = new int[nombreAlumnos.length][nombreAlumnos.length];
		notasAlumnos[0][0] = 5;
		notasAlumnos[0][1] = 7;
		notasAlumnos[0][2] = 3;
		notasAlumnos[0][3] = 8;
		notasAlumnos[1][0] = 2;
		notasAlumnos[1][1] = 10;
		notasAlumnos[1][2] = 7;
		notasAlumnos[1][3] = 6;
		notasAlumnos[2][0] = 3;
		notasAlumnos[2][1] = 3;
		notasAlumnos[2][2] = 10;
		notasAlumnos[2][3] = 4;
		notasAlumnos[3][0] = 5;
		notasAlumnos[3][1] = 5;
		notasAlumnos[3][2] = 5;
		notasAlumnos[3][3] = 5;
		for (int i = 0; i < notasAlumnos.length; i++) {
			int suma = 0;
			for (int j = 0; j < notasAlumnos[i].length; j++) {
				suma = suma + notasAlumnos[i][j];
			}
			System.out
					.println(nombreAlumnos[i] + " tiene una nota media de " + ((double) suma / notasAlumnos[i].length));
		}

	}

	/*
	 * Haz lo mismo que en el ejercicio anterior pero pidiendo al usuario por
	 * consola cuantos alumnos quiere almacenar. Por cada alumno pide su nombre y 4
	 * notas. Muestra los nombres y sus notas medias.
	 */
	public static void ejecicio12() {
		String[] nombreAlumnos;
		System.out.println("Cuantos alumnos desea almacenar?");
		nombreAlumnos = new String[new Scanner(System.in).nextInt()];
		int[][] notasAlumnos = new int[nombreAlumnos.length][4];
		for (int i = 0; i < nombreAlumnos.length; i++) {
			System.out.println("Introduce el nombre del alumno Nº" + (i + 1));
			nombreAlumnos[i] = new Scanner(System.in).next();
			for (int j = 0; j < notasAlumnos[i].length; j++) {
				System.out.println("introduce la nota " + (j + 1) + " de " + nombreAlumnos[i]);
				notasAlumnos[i][j] = new Scanner(System.in).nextInt();
			}
		}
		for (int i = 0; i < notasAlumnos.length; i++) {
			int suma = 0;
			for (int j = 0; j < notasAlumnos[i].length; j++) {
				suma = suma + notasAlumnos[i][j];
			}
			System.out
					.println(nombreAlumnos[i] + " tiene una nota media de " + ((double) suma / notasAlumnos[i].length));
		}

	}

	/*
	 * Crea un array bidimensional de cadenas. En este array almacenaremos productos
	 * con sus respectivos datos. La primera dimensión hará referencia a la posición
	 * de cada producto. Y para cada producto (segunda dimensión), almacenaremos lo
	 * siguiente (son cadenas todo): Nombre, precio y cantidad (3 campos). Recorre
	 * los productos, y muéstralos en formato de tabla, con el nombre, precio,
	 * cantidad y precio total. Ten en cuenta que los datos están almacenados como
	 * cadenas y deberás convertir el precio a número decimal y la cantidad a número
	 * entero. Ejemplo de tabla (formatea con longitud fija para cada campo):
	 */
	public static void ejercio13() {
		final int CAMPOS_PRODUCTO = 3;
		String[][] productos = new String[2][CAMPOS_PRODUCTO];
		productos[0][0] = "Teclado";
		productos[0][1] = "9.99";
		productos[0][2] = "2";
		productos[1][0] = "Raton";
		productos[1][1] = "29.99";
		productos[1][2] = "1";
		String textoFormateado = String.format("\n%-14s%10s%8s%12s\n", "NOMBRE", "PRECIO", "CANT", "TOTAL");
		System.out.print(textoFormateado);
		for (int i = 0; i < textoFormateado.length(); i++) {
			System.out.print("-");
		}
		for (int i = 0; i < productos.length; i++) {

			String nombreProducto = productos[i][0];
			double precio = Double.valueOf(productos[i][1]);
			int cantidad = Integer.valueOf(productos[i][2]);
			Double total = precio * cantidad;
			System.out.printf("\n%-14s%10s%8s%12s\n", nombreProducto, precio, cantidad, total);

		}
	}
}
