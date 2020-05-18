import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Algoritma16x15 {
	static BufferedReader bfr =  new BufferedReader(new InputStreamReader(System.in));
	static int[] nim = new int[25];
	static String[] nama = new String[25];
	static String[] kodeMK = new String[25];
	static char[] nilai = new char[25];
	static String input = null;
	static int n, imaks;


	public static void main(String[] args) {

		System.out.print("Inputkan nilai N = ");
		n = Integer.valueOf(inputData()).intValue();

		bacaLarik();

		sortDataMhs();

		cetakLarik();
	}


	private static String inputData() {

		try {
			input = bfr.readLine();
		} 
		catch(IOException e) {
			e.printStackTrace();
		}

		return input;
	}


	private static void bacaLarik() {

		for (int i = 0; i < n; i++) {
			System.out.print("Inputkan NIM ke-" + (i +1) + " = ");
			nim[i] = Integer.valueOf(inputData()).intValue();
		}
	}


	private static void sortDataMhs() {

		for (int i = (n - 1); i > 0; i--) {
			imaks = 0;

			for (int j = 1; j <= i; j++) {

				if (nim[j] > nim[imaks]) {
					imaks = j;
				}
			}

			tukar(i);
		}
	}

	private static void tukar(int i) {
		int temp;

		temp = nim[i];
		nim[i] = nim[imaks];
		nim[imaks] = temp;
	}

	private static void cetakLarik() {

		for(int i = 0; i < n; i++) {
			System.out.println("Nilai larik [" + i + "] = " + nim[i]);
		}
	}
}
