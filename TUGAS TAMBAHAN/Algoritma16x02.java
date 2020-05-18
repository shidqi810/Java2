import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Algoritma16x02 {
	static BufferedReader bfr =  new BufferedReader(new InputStreamReader(System.in));
	static int[] l = new int[25];
	static String input = null;
	static int n;


	public static void main(String[] args) {

		System.out.print("Inputkan nilai N = ");
		n = Integer.valueOf(inputData()).intValue();

		bacaLarik();

		bubbleSort1();

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


	private static void bubbleSort1() {
		int temp;

		for (int i = 0; i < (n - 1); i++) {
			for (int k = (n - 1); k > i; k--) {
				
				if (l[k] < l[k - 1]) {
					temp = l[k];
					l[k] = l[k - 1];
					l[k - 1] = temp;
				}
			}
		}
	}

	private static void cetakLarik() {

		for(int i = 0; i < n; i++) {
			System.out.println("Nilai larik L[" + i + "] = " + l[i]);
		}
	}
}
