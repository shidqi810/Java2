import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Algoritma16x08 {
	static BufferedReader bfr =  new BufferedReader(new InputStreamReader(System.in));
	static int[] l = new int[25];
	static String input = null;
	static int n, imaks;


	public static void main(String[] args) {

		System.out.print("Inputkan nilai N = ");
		n = Integer.valueOf(inputData()).intValue();

		bacaLarik();

		SelectionSort3();

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


	private static void SelectionSort3() {

		for (int i = (n - 1); i > 0; i--) {
			imaks = 0;

			for (int j = 1; j <= i; j++) {

				if (l[j] > l[imaks]) {
					imaks = j;
				}
			}

			tukar(i);
		}
	}

	private static void tukar(int i) {
		int temp;

		temp = l[i];
		l[i] = l[imaks];
		l[imaks] = temp;
	}

	private static void cetakLarik() {

		for(int i = 0; i < n; i++) {
			System.out.println("Nilai larik L[" + i + "] = " + l[i]);
		}
	}
}
