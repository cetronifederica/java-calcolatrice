package java.calcolatrice;

public class CalcoliHelper {

	// attributi

	private int numero;
	private int numero2;

	// costruttore
	private CalcoliHelper() {
		this.numero = numero;
		this.numero2 = numero;
	}

	// metodi
	// somma tra due numeri interi
	public static int somma(int numero, int numero2) {
		return numero + numero2;
	}

	// sottrazione tra due numeri interi
	public static int sottrazione(int numero3, int numero4) {
		return numero3 - numero4;
	}

	// moltiplicazione tra due numeri interi
	public static int moltiplicazione(int numero5, int numero6) {
		return numero5 * numero6;
	}

	// numero assoluto
	// math
	public static int numeroAssoluto(int numero7) {
		int numero1 = Math.abs(numero7);
		return numero7;
	}

	// minimo tra due numeri interi
	public static int minimo(int numero8, int numero9) {
		if (numero8 < numero9) {
			return numero8;
		} else {
			return numero9;
		}
	}

	// massimo tra due numeri interi
	public static int massimo(int numero10, int numero11) {
		if (numero10 > numero11) {
			return numero10;
		} else {
			return numero11;
		}
	}

}
