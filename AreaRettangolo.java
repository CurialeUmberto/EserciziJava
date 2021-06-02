import java.util.Scanner;

public class AreaRettangolo {

	public static void main(String[] args) {

		int altezza;
		int base;
		int area;
		Scanner leggi = new Scanner(System.in);
		System.out.println("Inserisci l'altezza del rettangolo : ");
		altezza = leggi.nextInt();
		System.out.println("Inserisci la base del rettangolo :");
		base = leggi.nextInt();

		area = base * altezza / 2;

		System.out.println("L'area del rettangolo è : " + area);

	}
}
