package Tjava.calcolatrice;

public class MainTest {
	public static void main(String[] args) {

		// somma

		System.out.println(CalcoliHelper.somma(5, 5));
		System.out.println(CalcoliHelper.somma(25.5, 1.1));

		// sottrazione

		System.out.println(CalcoliHelper.sottrazione(6, 3));
		System.out.println(CalcoliHelper.sottazione(25.5, 1.1));

		// moltiplicazione

		System.out.println(CalcoliHelper.moltiplicazione(3, 3));

		System.out.println(CalcoliHelper.moltiplicazione(3.3, 3.3));

		// numero assoluto

		System.out.println(CalcoliHelper.moltiplicazione(3.3, 3.3));

		System.out.println(CalcoliHelper.numeroAssoluto(3.3));

		// minimo
		System.out.println(CalcoliHelper.minimo(6, 9));
		System.out.println(CalcoliHelper.minimo(2.5, 3.5));
		// massimo

		System.out.println(CalcoliHelper.massimo(10, 6));

		System.out.println(CalcoliHelper.massimo(6.5, 3.3));

	}
}
