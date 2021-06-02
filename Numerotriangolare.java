package numerotriangolare;

import java.util.Scanner;

public class Numerotriangolare {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int num;
		int somma = 0;
		System.out.println("Inserisci un numero");
		num = in.nextInt();
		for (int i = 0; somma < num; i++) {
			somma += 1;

			if (somma == num)
				System.out.println("E' triangolare");
			else
				System.out.println("Non è triangolare");
		}
	}

}
