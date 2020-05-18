import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Algoritma16x11 {
	static BufferedReader bfr =  new BufferedReader(new InputStreamReader(System.in));
	static int[] l = new int[25];
	static String input = null;
	static int n;


	public static void main(String[] args) {

		System.out.print("Inputkan nilai N = ");
		n = Integer.valueOf(inputData()).intValue();

		bacaLarik();

		insertionSort2();

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

		for (int i = 0; i < n; i++ ) {
			System.out.print("Input nilai larik L[" + i + "] = ");
			l[i] = Integer.valueOf(inputData()).intValue();
		}
	}


	private static void insertionSort2() {
		int y, j;
		boolean found = true;
		
		for (int i = 1; i < n; i++) {
			y = l[i];
			j = i - 1;
			found = false;

			while ((j >= 0) && (!found)) {

				if (y > l[j]) {
					l[j + 1] = l[j];
					j--;
				}
				else {
					found = true;
				}
			}

			l[j + 1] = y;
		}
	}

	private static void cetakLarik() {

		for(int i = 0; i < n; i++) {
			System.out.println("Nilai larik L[" + i + "] = " + l[i]);
		}
	}
}
