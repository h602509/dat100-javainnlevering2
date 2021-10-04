package no.hvl.dat100.lab6.matriser;

public class Matriser {

	public static void main(String[] args) {

		int[][] mat1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] mat2 = { { 10, 11, 12 }, { 13, 14, 15 }, { 16, 17, 18 } };

	}

	// a)
	public static void skrivUt(int[][] matrise) {

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				System.out.print(matrise[i][j] + " ");
			}
			System.out.println();
		}
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
		return start;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		int[][] matriseskalert = new int[matrise.length][matrise[0].length];

		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				matriseskalert[i][j] = matrise[i][j] * tall;
			}
		}
		return matriseskalert;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		Boolean lik = true;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				if (a[i][j] != b[i][j]) {
					return lik = false;
				}
			}
		}
		return lik;
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
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {
	int sum = 0;
		int [][]c = new int [a.length][b[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				sum = 0;
				for (int k = 0; k < a[i].length; k++) {
					sum = sum + a[i][k]*b[k][j];
			}
						c[i][j]=sum;
			}	
		}

		return c;
	}
}
