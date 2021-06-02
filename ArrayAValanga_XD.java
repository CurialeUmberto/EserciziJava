import java.util.Scanner;

public class ArrayAValanga_XD {

	public static void main(String[] args) {
		int[] a = new int[10];
		Scanner in = new Scanner(System.in);
		// Riempimento array
		for (int i = 0; i < a.length; i++) {
			System.out.println("Inserisci il " + (i + 1) + " elemento dell' array: ");
			a[i] = in.nextInt();
		}
		// massimo
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max)
				max = a[i];
		}
		System.out.println("Il massimo del nostro array è :" + max);

		// minimo
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] < min)
				min = a[i];
		}
		System.out.println("Il minimo del nostro array è :" + min);

		// somma
		int somma = 0;// accumulatore
		for (int i = 0; i < a.length; i++) {
			somma += a[i];
		}

		// media
		double media = somma / a.length;
		System.out.println("La media del nostro array è : " + media);
		System.out.println("La somma dei valori del nostro array è :" + somma);
	}
}
