package no.hvl.dat100.lab6.matriser;

public class Matriser {

	public static void main(String[] args) {
	
	int [][] mat1 = { {1,2,3}, {4,5,6}, {7,8,9} };
	int [][] mat2 = { {10,11,12}, {13,14,15}, {16,17,18} };
	

	}
	
	
	
	
	// a)
	public static void skrivUt(int[][] matrise) {
		
		// TODO
		throw new UnsupportedOperationException("skrivUt ikke implementert");
	}

	// b)
	public static String tilStreng(int[][] matrise) {
		
		String start = "";
		
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				start += matrise[i][j] + " ";
			}
			start += "\n";
		}
		System.out.println(start);
		return start;

		// TODO
		//throw new UnsupportedOperationException("tilStreng ikke implementert");
		
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		// TODO
		throw new UnsupportedOperationException("skaler ikke implementert");
	
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("erLik ikke implementert");
	}
	
//	 e)
	public static int[][] speile(int[][] matrise) {
		
		int[][] nyMatrise = new int[matrise.length][matrise[0].length];
		String temp = "";
		
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				nyMatrise[i][j] = matrise[j][i];
				temp += nyMatrise[i][j] + " ";
			}
			temp += "\n";
		}
		System.out.println(temp);
		return nyMatrise;
		
		

		// TODO
		//throw new UnsupportedOperationException("speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");
	
	}
}
