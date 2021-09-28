package no.hvl.dat100.lab5.tabeller;

public class Tabeller {
	
	public static void main(String[] args) {
		
		int[] heltall = {10, 20, 30, 40};
		String [] stringTekst = {"[42, 67, 89]"};
		
		skrivUt(heltall);
		summer (heltall);
		reverser(heltall);
		
		}
	
	
	// a)
	public static void skrivUt(int[] tabell) {

		for (int i = 0; i<tabell.length; i++) {
			System.out.println(tabell[i]);	
		}
		
			
//	// TODO
//	throw new UnsupportedOperationException("skrivUt ikke implementert");

	}

	// b)
	public static String tilStreng(int[] tabell) {
		
		
		
//		// TODO
//		throw new UnsupportedOperationException("tilStreng ikke implementert");
		
	}

	// c)
	public static int summer(int[] tabell) {
		
		int sum = 0;
		for (int i=0; i < tabell.length; i++) {
			sum = sum + tabell[i];	
		}
	
		System.out.println("Summen av heltall er " + sum);
	
		int sum2 = 0;
		int i = 0;
		while(i < tabell.length ) {
			sum2 = sum2 + tabell[i];
			++i;
		}
		System.out.println(sum2);
		
		int sum3 = 0;
		for(int tall: tabell)
			sum3 = sum3 + tall;
			
		System.out.println(sum3 + " ");
		
		return sum;
	
		
//		// TODO
//		throw new UnsupportedOperationException("summer ikke implementert");
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

//		// TODO
//		throw new UnsupportedOperationException("finnesTall ikke implementert");
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

//		// TODO
//		throw new UnsupportedOperationException("posisjonTall ikke implementert");

	}

	// f)
	public static int[] reverser(int[] tabell) {
		
	int[] revers = new int[tabell.length];
	
	for(int i = 0; i < tabell.length; i++) {
		revers [i] = tabell[tabell.length-1 -i];
		
	}
	for(int i: revers) {
		System.out.print(i+" ");
	}
		return revers;
		
		
//		// TODO
//		throw new UnsupportedOperationException("reverser ikke implementert");
	
	}

	// g)
	public static boolean erSortert(int[] tabell) {

//		// TODO
//		throw new UnsupportedOperationException("erSortert ikke implementert");
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

//		// TODO
//		throw new UnsupportedOperationException("settSammen ikke implementert");
	}
}
