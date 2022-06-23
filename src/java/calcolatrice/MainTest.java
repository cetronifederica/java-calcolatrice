package java.calcolatrice;

public class MainTest {
	public static void main(String[] args) {

		// somma
		int somma = CalcoliHelper.somma(3, 5);
		System.out.println(somma);

		// sottrazione
		int sottrazione = CalcoliHelper.sottrazione(6, 3);
		System.out.println(sottrazione);

		// moltiplicazione
		int moltiplicazione = CalcoliHelper.moltiplicazione(3, 3);
		System.out.println(moltiplicazione);

		// numero assoluto
		int numeroAssoluto = CalcoliHelper.numeroAssoluto(6);
		System.out.println(numeroAssoluto);

		// minimo
		int minimo = CalcoliHelper.minimo(6, 9);
		System.out.println(minimo);

		// massimo
		int massimo = CalcoliHelper.massimo(10, 6);
		System.out.println(massimo);

	}
}
