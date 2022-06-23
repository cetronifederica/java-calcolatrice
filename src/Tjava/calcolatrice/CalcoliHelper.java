package Tjava.calcolatrice;

public class CalcoliHelper {

	// PRINCIPIO DELL'OVERLOAD

	// costruttore
	private CalcoliHelper() {
	}

	// metodi

	// somma tra due numeri interi
	public static int somma(int numero, int numero2) {
		return (int) somma((double) numero, (double) numero2);
	}

	public static double somma(double numero, double numero2) {
		return numero + numero2;
	}

	// sottrazione tra due numeri interi
	public static int sottrazione(int numero, int numero2) {
		return numero - numero2;
	}

	public static double sottazione(double numero, double numero2) {
		return numero - numero2;
	}

	// moltiplicazione tra due numeri interi
	public static int moltiplicazione(int numero, int numero2) {
		return (int) moltiplicazione((double) numero, (double) numero2);
	}

	public static double moltiplicazione(double numero, double numero2) {
		return numero * numero2;
	}

	// numero assoluto
	// math
	public static int numeroAssoluto(int numero) {
		int numero1 = Math.abs(numero);
		return numero;
	}

	public static double numeroAssoluto(double numero) {
		double numero4 = Math.abs(numero);
		return numero;
	}

	// minimo tra due numeri interi
	public static int minimo(int numero, int numero2) {
		return (int) minimo((double) numero, (double) numero2);
	}

	public static double minimo(double numero, double numero2) {
		if (numero < numero2) {
			return numero;
		} else {
			return numero2;
		}
	}

	// massimo tra due numeri interi
	public static int massimo(int numero, int numero2) {
		if (numero > numero2) {
			return numero;
		} else {
			return numero2;
		}
	}

	public static double massimo(double numero, double numero2) {
		if (numero > numero2) {
			return numero;
		} else {
			return numero2;
		}
	}
}
