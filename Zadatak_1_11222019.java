package domaci;

import java.util.Scanner;

public class Zadatak_1_11222019 {
	public static double proizvod(double brojevi[]) {
		double proizvod = 1;
		for (int i = 0; i < 3; i++) {
			proizvod = proizvod * brojevi[i];
		}
		return proizvod;
	}

	public static void minimalniBroj(double brojevi[]) {
		double min = brojevi[0];
		if (brojevi[1] < min)
			min = brojevi[1];
		else if (brojevi[2] < min)
			min = brojevi[2];
		System.out.println("Najmanji broj niza je " + min);
	}

	public static void main(String[] args) {
		/*
		 * Napisati program u kom se unose 3 realna broja i poziva i ispisuje dve
		 * metode(u mainu). Prva metoda vraca proizvod unetih brojeva. Druga metoda
		 * ispisuje najmanji od unesenih brojeva.
		 */

		System.out.println("Unesite 3 realna broja: ");
		int n = 3; // n je duzina niza
		Scanner sc = new Scanner(System.in);
		double[] brojevi = new double[3];
		for (int i = 0; i < 3; i++) {
			brojevi[i] = sc.nextDouble();
		}
		double x = proizvod(brojevi);
		System.out.println("Proizvod brojeva je " + x);
		minimalniBroj(brojevi);

	}

}
