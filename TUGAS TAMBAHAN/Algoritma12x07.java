import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Algoritma12x07 {
	static BufferedReader bfr =  new BufferedReader(new InputStreamReader(System.in));
	static String angkaInput = null;
	static String jawab = null;
	static int[] a = new int[25];
	static int i = -1;
	static int n, x;

	public static void main(String[] args) {

		bacaLarikVersi3();

		cetakLarik();
	}

	private static void bacaLarikVersi3() {
		System.out.print("Input nilai x = ");

		try {
			angkaInput = bfr.readLine();
		} 
		catch(IOException e) {
			e.printStackTrace();
		}

		x = Integer.valueOf(angkaInput).intValue();

		while(x != 9999) {
			i = i + 1;

			a[i] = x;
			System.out.print("Input nilai x = ");

			try {
				angkaInput = bfr.readLine();
			} 
			catch(IOException e) {
				e.printStackTrace();
			}

		x = Integer.valueOf(angkaInput).intValue();
		}

		n = i + 1;
	}

	private static void cetakLarik() {
		System.out.println("Nilai N = " + n);
		for(int i = 0; i < n; i++) {
			System.out.println("Nilai larik A[" + i + "] = " + a[i]);
		}
	}
}
