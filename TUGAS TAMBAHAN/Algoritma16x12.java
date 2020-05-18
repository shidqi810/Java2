import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Algoritma16x12 {
	static BufferedReader bfr =  new BufferedReader(new InputStreamReader(System.in));
	static int[] l = new int[25];
	static String input = null;
	static int start, step, n;


	public static void main(String[] args) {

		System.out.print("Inputkan nilai N = ");
		n = Integer.valueOf(inputData()).intValue();

		bacaLarik();

		insSort();

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


	private static void insSort() {
		int j = 0;
		int i, y;
		boolean found = true;

		start = 0;
		step = 1;
		i = start + step;

		while (i < n) {
			y = l[i];
			j = i - step;
			found = false;

			while ((j >= 0) && (!found)) {
				if (y < l[j]) {
					l[j + step] = l[j];
					j = j - step;
				}
				else {
					found = true;
				}
			}

			l[j + step] = y;
			i = i + step;
		}
	}

	private static void cetakLarik() {

		for(int i = 0; i < n; i++) {
			System.out.println("Nilai larik L[" + i + "] = " + l[i]);
		}
	}
}
