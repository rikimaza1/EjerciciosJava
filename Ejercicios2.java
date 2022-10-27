package ejercicios;

import java.security.PublicKey;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Ejercicios2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ejercicio2();
//		ejercicio3();
//		ejercicio4();
//		ejercicio5();
//		ejercicio6();
//		ejercicio29();
		ejercicio31();

	}

	/*
	 * Programa que lea un número entero y muestre si el número es múltiplo de 10
	 * (si el resto de la división entre 10 da 0).
	 */
	public static void ejercicio2() {

		Scanner in = new Scanner(System.in);
		final int multiplo = 10;
		int numero;
		System.out.println("Introduce un numero entero");
		numero = in.nextInt();
		if (numero % multiplo == 0) {
			System.out.println("El numero " + numero + " es multiplo de " + multiplo);
		} else {
			System.out.println("El numero " + numero + " no es multiplo de " + multiplo);
		}
		in.close();

	}

	/*
	 * Programa que lea un carácter por teclado y compruebe si es una letra
	 * mayúscula. Una letra mayúscula es aquella que está entre la ‘A’ y la ‘Z’.
	 * Recuerda que se pueden comparar los caracteres como si fueran números.
	 */
	public static void ejercicio3() {
		Scanner in = new Scanner(System.in);
		char caracter;
		System.out.println("Introduce un carater del abecedario");
		caracter = in.next().charAt(0);
		if (Character.toString(caracter).equals(Character.toString(caracter).toUpperCase())) {
			System.out.println("El caracter esta en mayuscula ");
		} else {
			System.out.println("\"El caracter esta en minuscula ");
		}
		in.close();

	}

	/*
	 * Programa que le pida 2 cadenas de texto al usuario y compruebe si son iguales
	 */
	public static void ejercicio4() {
		Scanner in = new Scanner(System.in);
		String cadena1, cadena2;
		System.out.println("Introduce la primera cadena de caracteres");
		cadena1 = in.next();
		System.out.println("Introduce la segunda cadena de caracteres");
		cadena2 = in.next();
		if (cadena1.equals(cadena2)) {
			System.out.println("Son las mismas cadenas");
		} else {
			System.out.println("Son distintas cadenas");
		}
		in.close();

	}

	/*
	 * . Programa que lea dos números por teclado y muestre el resultado de la
	 * división del primer número por el segundo. Se debe comprobar que el divisor
	 * no puede ser cero.
	 */
	public static void ejercicio5() {
		Scanner in = new Scanner(System.in);
		int numero, divisor;
		System.out.println("Introduce numero");
		numero = in.nextInt();
		System.out.println("Introduce el divisor");
		divisor = in.nextInt();
		if (divisor == 0) {
			System.out.println("Se ha producido un error matematico al dividir entre 0");
		} else {
			System.out.println("El resultado de la division " + numero + "/" + divisor + " es " + numero / divisor);
		}
		in.close();

	}

	/*
	 * Programa que pida al usuario tres números enteros y muestre el mayor de los
	 * tres.
	 */
	public static void ejercicio6() {
		Scanner in = new Scanner(System.in);
		int numero1, numero2, numero3, numeroMayor;
		System.out.println("Introduce primer numero");
		numero1 = in.nextInt();
		System.out.println("Introduce segundo numero");
		numero2 = in.nextInt();
		System.out.println("Introduce tercer numero");
		numero3 = in.nextInt();
		numeroMayor = numero1;
		if (numeroMayor <= numero2) {
			numeroMayor = numero2;
		}
		if (numeroMayor <= numero3) {
			numeroMayor = numero3;
		}
		System.out.println("El numero mayor es " + numeroMayor);
		in.close();

	}

	/*
	 * Programa que pida al usuario una cantidad de horas, de minutos y de segundos
	 * (3 números diferentes). Comprueba que la hora está en el rango de 0 a 23, los
	 * minutos y los segundos de 0 a 59. Si todo es correcto, muestra al usuario la
	 * hora en formato HH:MM:SS (2 cifras para cada parte rellenando con 0 a la
	 * izquierda si es una cifra), y si no, muestra un mensaje de error. Pista:
	 * Repasa la parte de formatear la salida de texto para números enteros.
	 */
	public static void ejercicio7() {
		Scanner in = new Scanner(System.in);
		int hora, minutos, segundos;
		System.out.println("Hora");
		hora = in.nextInt();
		if (hora >= 0 && hora <= 23) {
			System.out.println("Minutos");
			minutos = in.nextInt();
			if (minutos >= 0 && minutos <= 59) {
				System.out.println("Segundos");
				segundos = in.nextInt();
				if (segundos >= 0 && segundos <= 59) {
					System.out.println(new Formatter().format("%02d", hora) + ":"
							+ new Formatter().format("%02d", minutos) + ":" + new Formatter().format("%02d", segundos));
				} else {
					System.err.println("Segundos no tiene un valor valido");
				}
			} else {
				System.err.println("Minutos no tiene un valor valido");
			}
		} else {
			System.err.println("Hora no tiene un valor valido");
		}
	}

	/*
	 * Escribe un programa que declare una variable A de tipo entero y asígnale un
	 * valor. A continuación muestra un mensaje indicando si A es par o impar.
	 * Utiliza el operador ternario ( ? : ) dentro de WriteLine para resolverlo. Si
	 * por ejemplo A = 14 la salida será: 14 es par Si fuese por ejemplo A = 15 la
	 * salida será: 15 es impar
	 */
	public static void ejercicio8() {
		final int A = 5;
		System.out.println(A + ((A % 2 == 0) ? " es par" : " es impar"));
//			String resultado = (A%2 == 0)? "es par":"es impar";
	}

	/*
	 * Programa que lea una variable entera llamada mes y compruebe con una
	 * estructura switch, si el valor corresponde a un mes de 30 días, de 31 o de
	 * 28. Supondremos que febrero tiene 28 días. Se mostrará además de los días, el
	 * nombre del mes. Se mostrará un error cuando el mes no sea válido
	 */
	public static void ejercicio9() {
		Scanner in = new Scanner(System.in);
		int mes;
		System.out.println("Introduce 31, 30 o 28 para mostrar los meses con esos dias");
		mes = in.nextInt();
		in.close();
		switch (mes) {
		case 31:
			System.out.println("Enero, Marzo, Mayo, Julio, Agosto, Octubre, Diciembre");
			break;
		case 30:
			System.out.println("Abril, Junio, Septiembre, Noviembre");
			break;
		case 28:
			System.out.println("Febrero");
			break;
		default:
			System.err.println("El valor no esta entre los parametros");
			break;
		}
	}

	/*
	 * Crea un programa que lea una letra tecleada por el usuario y diga si se trata
	 * de un signo de puntuación (. , ; :), una cifra numérica (del 0 al 9) u otro
	 * carácter, usando "switch" (pista: necesitarás usar un dato de tipo "char")
	 */
	public static void ejercicio10() {

		Scanner in = new Scanner(System.in);
		char caracter;
		System.out.println("Pulse una tecla");
		caracter = in.next().charAt(0);
		in.close();
		switch (caracter) {
		case ',':
		case '.':
		case ';':
		case ':':
			System.out.println("Signo de puntuacion");
			break;
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			System.out.println("Cifra numerica");
			break;
		default:
			System.out.println("Se ha pulsado otro caracter");
			break;
		}
	}

	/*
	 * Pide al usuario 2 números. Después muestra al usuario un menú con las
	 * siguientes opciones: 1. Sumar, 2. Restar, 3. Multiplicar, 4. Dividir.
	 * Comprueba la opción elegida, haz la operación y muestra el resultado de la
	 * misma. Si la operación elegida es la división, comprueba que el segundo
	 * número (divisor) no sea cero antes de hacer la operación.
	 */
	public static void ejercicio11() {
		int num1, num2, opcion;
		Scanner in = new Scanner(System.in);
		System.out.println("Primer numero");
		num1 = in.nextInt();
		System.out.println("Segundo numero");
		num2 = in.nextInt();
		System.out.println("Eliga una opcion del menu\n 1. Sumar\n 2. Restar\n 3. Multiplicar\n 4. Dividir");
		opcion = in.nextInt();
		switch (opcion) {
		case 1:
			System.out.println("la suma de " + num1 + " y " + num2 + " es " + (num1 + num2));
			break;
		case 2:
			System.out.println("la resta de " + num1 + " y " + num2 + " es " + (num1 - num2));
			break;
		case 3:
			System.out.println("la Multiplicacion de " + num1 + " y " + num2 + " es " + (num1 * num2));
			break;
		case 4:
			System.out.println((num2 == 0) ? "Error al dividir por 0"
					: "la division de " + num1 + " y " + num2 + " es " + (num1 / num2));
			break;

		default:
			break;
		}
	}

	/*
	 * Crea una variable con el precio de una entrada que inicialmente valga 50.
	 * Pregunta al usuario su edad. a. Si es menor de edad se le hará un descuento
	 * del 25% en la entrada. b. Si es mayor de edad pero no está jubilado (65
	 * años), pregúntale si es socio. Si el usuario responde “sí” hazle un descuento
	 * del 40%. c. Si está jubilado se le hará un descuento del 75%. d. Finalmente
	 * muéstrale el precio que tiene que pagar por la entrada
	 */
	public static void ejercicio12() {
		double precioEntrada = 50;

		Scanner in = new Scanner(System.in);
		System.out.println("¿Cual es su edad?");
		int edad = in.nextInt();
		in.nextLine();
		if (edad < 18) {
			precioEntrada *= 0.75;
		} else if (edad < 65) {
			System.out.println("¿Es socio?");
			String socio = in.nextLine().toLowerCase();
			if (socio.equalsIgnoreCase("si")) {
				precioEntrada *= 0.6;
			}
		} else {
			precioEntrada *= 0.25;
		}
		in.close();
		System.out.println("El precio de la entrada es: " + precioEntrada);
	}

	/*
	 * Muestra por pantalla los números de 20 al 1 usando un bucle while, y después
	 * hazlo otra vez usando un bucle for.
	 */
	public static void ejercicio13() {
		int numero = 20;
		System.out.println("Bucle while");
		while (numero > 0) {
			System.out.println(numero);
			numero--;
		}
		System.out.println("Bucle for");
		for (int i = 20; i > 0; i--) {
			System.out.println(i);
		}

	}

	/*
	 * Inicializa una variable entera a 0. Después, pregunta al usuario por un
	 * número y súmaselo a la variable inicial. Repite esto hasta que el usuario
	 * introduzca el número cero. Utiliza el bucle do..while.
	 */
	public static void ejercicio14() {
		int suma = 0, num;
		Scanner in = new Scanner(System.in);
		do {
			System.out.println("Introduce un numero - 0 para salir.");
			num = in.nextInt();
			if (num != 0) {
				suma += num;
			}

		} while (num != 0);
		System.out.println(suma);
		in.close();
	}

	/*
	 * Inicializa una variable entera a 0. Después, pregunta al usuario por un
	 * número y súmaselo a la variable inicial. Repite esto hasta que el usuario
	 * introduzca el número cero. Utiliza el bucle do..while.
	 */
	public static void ejercicio15() {
		Scanner in = new Scanner(System.in);
		int numero, cifras = 0;
		System.out.println("di un numero");
		numero = in.nextInt();

		while (numero != 0) {
			numero = numero / 10;
			cifras++;
		}
		System.out.println("Tiene " + cifras);
		in.close();
	}

	/*
	 * . Pide al usuario un número y dibuja una línea con tantos asteriscos como el
	 * número introducido.
	 */
	public static void ejercicio16() {
		Scanner in = new Scanner(System.in);
		int numero;
		System.out.println("Introduce un numero");
		numero = in.nextInt();
		for (int i = numero; i > 0; i--) {
			System.out.print("*");
		}
		in.close();
	}

	/*
	 * Muestra los números del 1 al 30 menos los divisibles entre 3 (resto da cero)
	 */
	public static void ejercicio17() {
		for (int i = 1; i <= 30; i++) {
			if ((i % 3) != 0) {
				System.out.println(i);
			}
		}
	}

	/* Muestra de 5 en 5, los números del 0 al 100. */
	public static void ejercicio18() {
		for (int i = 0; i <= 100; i += 5) {
			System.out.println(i);
		}
	}

	/*
	 * . Pregunta al usuario un número y muestra del 1 hasta ese número, en una
	 * misma línea, separados por comas (debes comprobar cuando es el último y no
	 * poner una coma en ese caso).
	 */
	public static void ejercicio19() {
		Scanner in = new Scanner(System.in);
		int numero;
		System.out.println("Dime un numero");
		numero = in.nextInt();
		for (int i = 1; i <= numero; i++) {
			if (i == numero) {
				System.out.print(i + ".");
			} else {
				System.out.print(i + ", ");
			}

		}

	}

	/*
	 * Repite el ejercicio 2(creo que es el 14) pero con un bucle infinito (la
	 * condición nunca será falsa). En este caso tendrás que comprobar dentro del
	 * bucle cuando el usuario ha introducido un cero para salir (break). Si el
	 * usuario introduce un número negativo no lo sumes (usa continue para saltarte
	 * la suma).
	 * 
	 * (2)Programa que lea un número entero y muestre si el número es múltiplo de 10
	 * (si el resto de la división entre 10 da 0).
	 * 
	 * (14)Inicializa una variable entera a 0. Después, pregunta al usuario por un
	 * número y súmaselo a la variable inicial. Repite esto hasta que el usuario
	 * introduzca el número cero. Utiliza el bucle do..while.
	 */
	public static void ejercicio20() {
		Scanner in = new Scanner(System.in);
		int numero, suma = 0;
		for (;;) {
			System.out.println("Dame numero");
			numero = in.nextInt();
			if (numero == 0) {
				break;
			} else if (numero < 0) {
				continue;
			} else {
				suma = suma + numero;
			}
		}
		System.out.println(suma);

	}

	/*
	 * . Pide al usuario un número y dile los divisores de dicho número (resto da
	 * cero)
	 */
	public static void ejercicio21() {
		Scanner in = new Scanner(System.in);
		int numero;
		System.out.println("Dame numero");
		numero = in.nextInt();
		System.out.print("Divisores de " + numero + " : ");
		for (int i = 1; i <= numero; i++) {
			if ((numero % i) == 0) {
				if (i == numero) {
					System.out.print(i + ".");
				} else {
					System.out.print(i + ",");
				}
			}
		}

	}

	/* Escribe en una misma línea los números del 1 al 9, 5 veces */
	public static void ejercicio22() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.print(j);
			}
		}

	}

	/*
	 * Escribe los números del 1 al 9, después del 1 al 8, del 1 al 7, y así
	 * sucesivamente en líneas diferentes.
	 */
	public static void ejercicio23() {
		for (int i = 9; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

	/*
	 * Pide al usuario un número y dibuja un cuadrado (mismo alto que ancho) con
	 * asteriscos según el número recibido.
	 */
	public static void ejercicio24() {
		Scanner in = new Scanner(System.in);
		int lado;
		System.out.println("lados");
		lado = in.nextInt();
		for (int i = 0; i < lado; i++) {
			for (int j = 0; j < lado; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	/*
	 * Pide al usuario un número y dibuja una escalera de bajada con asteriscos. La
	 * base será igual al número recibido.
	 */
	public static void ejercicio25() {
		Scanner in = new Scanner(System.in);
		int base;
		System.out.println("base");
		base = in.nextInt();
		for (int i = 0; i <= base; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	/*
	 * Haz lo mismo pero con una escalera de subida (para generar los huecos debes
	 * escribir el carácter de espacio).
	 */
	public static void ejercicio26() {
		Scanner in = new Scanner(System.in);
		int base;
		System.out.println("base");
		base = in.nextInt();
		for (int i = 0; i <= base; i++) {
			for (int j = 0; j < base - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	/* Pide al usuario un ancho y un alto y dibuja un rectángulo vacío. */
	public static void ejercicio27() {
		Scanner in = new Scanner(System.in);
		int ancho, alto;
		System.out.println("ancho");
		ancho = in.nextInt();
		System.out.println("alto");
		alto = in.nextInt();
		for (int i = 1; i <= alto; i++) {
			for (int j = 1; j <= ancho; j++) {
				if ((i == 1) || (i == alto) || (j == 1) || (j == ancho)) {
					System.out.print("*");
				} else {

					System.out.print(" ");
				}

			}
			System.out.println();
		}

	}

	/*
	 * Pide al usuario un número que será la altura de una pirámide. Dibuja una
	 * pirámide con asteriscos con dicha altura
	 */
	public static void ejercicio28() {
		Scanner in = new Scanner(System.in);
		System.out.print("Introduce altura");
		int alura = in.nextInt();
		in.close();
		System.out.println();
		for (int altura = 1; altura <= alura; altura++) {
			for (int blancos = 1; blancos <= alura - altura; blancos++) {
				System.out.print(" ");
			}

			for (int asteriscos = 1; asteriscos <= (altura * 2) - 1; asteriscos++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	/* Intenta hacer lo mismo pero con una pirámide hueca: */
	public static void ejercicio29() {
		Scanner in = new Scanner(System.in);
		System.out.print("Introduce altura");
		int alturaIntroducida = in.nextInt();
		;

		int altura = 1;
		int i = 0;
		int espaciosPorDelante = alturaIntroducida - 1;
		int espaciosInternos = 0;

		while (altura < alturaIntroducida) {

			// inserta espacios delante
			for (i = 1; i <= espaciosPorDelante; i++) {
				System.out.print(" ");
			}

			// pinta la línea
			System.out.print("*");
			for (i = 1; i < espaciosInternos; i++) {
				System.out.print(" ");
			}

			if (altura > 1) {
				System.out.print("*");
			}

			System.out.println();
			altura++;
			espaciosPorDelante--;
			espaciosInternos += 2;
		}

		for (i = 1; i < altura * 2; i++) {
			System.out.print("*");
		}

	}

	/* Dibuja ahora una pirámide invertida: */
	public static void ejercicio30() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca numero de filas: ");
		int altura = sc.nextInt();
		sc.close();

		System.out.println();

		for (int blancos = altura - 1, asteriscos = 1; blancos >= 0; blancos--, asteriscos += 2) {
			for (int i = 1; i <= blancos; i++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= asteriscos; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	/*
	 * . Ahora dibuja un rombo (puedes dibujar una pirámide y posteriormente una
	 * pirámide invertida). Pide al usuario el ancho del rombo, que deberá ser un
	 * número impar (sigue pidiéndole un número hasta que introduzca uno impar). Si
	 * quieres hacerlo con 2 pirámides, la altura de la primera sería (ancho + 1) /
	 * 2
	 */
	public static void ejercicio31() {
//		int numero;
//		boolean impar;
//		
//		do {
//			System.out.println("Introduce un numero impar para el ancho del rombo");
//			numero= new Scanner(System.in).nextInt();
//			impar=(numero%2==0)?true:false;
//		} while (impar);
//		   for(int i = 1; i <=numero-1 ; i+=2){
//	            for(int j = 1; j <= 4; j++){
//	                if(i + j < numero ){
//	                    System.out.print(" ");
//	                }else{
//	                    System.out.print(" "+"*");
//
//	                }
//	            }
//
//	            System.out.println();
//	        }
//
//	        for(int i = numero; i >=1 ; i-=2){
//	            for(int j = 1; j <= numero; j++){
//	                if(i + j < 6 ){
//	                    System.out.print(" ");
//	                }else{
//	                    System.out.print("*"+" ");
//
//	                }
//	            }
//	            System.out.println();
//	        }
		int numero;
		boolean impar;
		
		do {
			System.out.println("Introduce un numero impar para el ancho del rombo");
			numero= new Scanner(System.in).nextInt();
			impar=(numero%2==0)?true:false;
		} while (impar);
		   for(int i = 1; i <=numero-1 ; i+=2){
	            for(int j = 1; j <= 4; j++){
	                if(i + j < numero ){
	                    System.out.print(" ");
	                }else{
	                    System.out.print(" "+"*");

	                }
	            }

	            System.out.println();
	        }

	        for(int i = numero; i >=1 ; i-=2){
	            for(int j = 1; j <= numero; j++){
	                if(i + j < 6 ){
	                    System.out.print(" ");
	                }else{
	                    System.out.print("*"+" ");

	                }
	            }
	            System.out.println();
	        }
	}

}
