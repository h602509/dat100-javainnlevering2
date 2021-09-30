package no.hvl.dat100.lab5.tabeller;

public class Tabeller {
	
	public static void main(String[] args) {
		
		int[] heltall = {10, 20, 30, 40};
		int[] stringTekst = {42, 67, 89};
		int[] tab1 = {1,2,3};
		int[] tab2 = {4,5,6};
		
		
		
		skrivUt(heltall);
		summer (heltall);
		reverser(heltall);
		tilStreng(stringTekst);
		posisjonTall(heltall, 40);
		settSammen(tab1,tab2);
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
		
		String start = "[";
		String slutt = "]";
		
		for (int i = 0; i < tabell.length; i++) {
			start += tabell[i];
			if (tabell.length > i + 1) {
				start += ",";
			}
		}
		System.out.println(start + slutt);
		
		return start + slutt;
		
		
		
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
		return false;
//		// TODO
//		throw new UnsupportedOperationException("finnesTall ikke implementert");
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		
		for (int i = 0; i < tabell.length; i++) {
			if(tabell[i] == tall) {
				System.out.println(i);
				return i;
			}
		}
		System.out.println("-1");
		return -1;
		
		
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
		System.out.println(i+" ");
	}
		return revers;
		
		
//		// TODO
//		throw new UnsupportedOperationException("reverser ikke implementert");
	
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		return false;

//		// TODO
//		throw new UnsupportedOperationException("erSortert ikke implementert");
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
		
		for (int i = 0; i<nyTab.length; i++) {
			System.out.print(nyTab[i] + " ");
		}

		return nyTab;

		
//		// TODO
//		throw new UnsupportedOperationException("settSammen ikke implementert");
	}
}