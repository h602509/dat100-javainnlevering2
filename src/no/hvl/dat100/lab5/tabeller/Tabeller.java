package no.hvl.dat100.lab5.tabeller;

import java.util.Arrays;

public class Tabeller {

	public static void main(String[] args) {

		int[] heltall = { 10, 20, 30, 40 };
		int[] stringTekst = { 42, 67, 89 };
		int[] tab1 = { 1, 2, 3 };
		int[] tab2 = { 4, 5, 6 };

//	a)
//		skrivUt(heltall);
//	b)
//		System.out.println(tilStreng(stringTekst));
//	c)	
//		System.out.println("Summen av heltall er " + summer(heltall));
//	d)
//		System.out.println(finnesTall(tab1, 2));
//	e)	
//		System.out.println(posisjonTall(heltall, 10));
//	f) 	
//		System.out.println(Arrays.toString(tab2) + Arrays.toString(reverser(tab2)));
//	g)
//		System.out.println(erSortert(tab1));
//	h)
//		System.out.println(Arrays.toString(settSammen(tab1, tab2)));
//		
	}

	// a)
	public static void skrivUt(int[] tabell) {

		for (int i = 0; i < tabell.length; i++) {
			System.out.println(tabell[i]);
		}
	}

	// b)
	public static String tilStreng(int[] tabell) {

		String start = "[";
		String slutt = "]";

		for (int i = 0; i < tabell.length; i++) {
			start += tabell[i];
			if (tabell.length > i + 1) {
				start += ",";
			}
		}
		return start + slutt;
	}

	// c)
	public static int summer(int[] tabell) {

		int sum = 0;
		for (int i = 0; i < tabell.length; i++) {
			sum = sum + tabell[i];
		}
		int sum2 = 0;
		int i = 0;
		while (i < tabell.length) {
			sum2 = sum2 + tabell[i];
			++i;
		}
		System.out.println(sum2);
		int sum3 = 0;
		for (int tall : tabell)
			sum3 = sum3 + tall;

		return sum3;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean lik = false;
		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall)
				lik = true;
		}
		return lik;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		for (int i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {
				return i;
			}
		}
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] revers = new int[tabell.length];

		for (int i = 0; i < tabell.length; i++) {
			revers[i] = tabell[tabell.length - 1 - i];

		}
		for (int i : revers) {
			System.out.println(i + " ");
		}
		return revers;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		
		boolean stigende = true;
		for (int i = 0; i < tabell.length-1; i++) {
		
			if(tabell[i] > tabell[i+1]) {
				stigende = false;
			}
		}
		return stigende;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int lengde = tabell1.length + tabell2.length;

		int[] nyTab = new int[lengde];
		int pos = 0;

		for (int i : tabell1) {
			nyTab[pos] = i;
			pos++;
		}

		for (int i : tabell2) {
			nyTab[pos] = i;
			pos++;
		}

		for (int i = 0; i < nyTab.length; i++) {
		}

		return nyTab;
	}
}