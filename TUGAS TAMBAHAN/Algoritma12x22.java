import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Algoritma12x22 {
	static BufferedReader bfr =  new BufferedReader(new InputStreamReader(System.in));
	static String angkaInput = null;
	static int[] a = new int[25];
	static int[] b = new int[25];
	static int n;

	public static void main(String[] args) {

		System.out.print("Inputkan nilai N = ");
		try {
			angkaInput = bfr.readLine();
		} 
		catch(IOException e) {
			e.printStackTrace();
		}

		n = Integer.valueOf(angkaInput).intValue();

		bacaLarik();

		System.out.println(apakahSama());
	}

	private static void bacaLarik() {
		for (int i = 0; i < n; i++) {
			System.out.print("Input nilai larik A[" + i + "] = ");

			try {
				angkaInput = bfr.readLine();
			} 
			catch(IOException e) {
				e.printStackTrace();
			}

			a[i] = Integer.valueOf(angkaInput).intValue();
		}

		System.out.println(" ");

		for (int i = 0; i < n; i++) {
			System.out.print("Input nilai larik B[" + i + "] = ");

			try {
				angkaInput = bfr.readLine();
			} 
			catch(IOException e) {
				e.printStackTrace();
			}

			b[i] = Integer.valueOf(angkaInput).intValue();
		}
	}

	private static boolean apakahSama() {
		int i = 0;
		boolean sama = true;

		while ((i < n) && sama) {

			if (a[i] == b[i]) {
				i++;
			}
			else {
				sama = false;
			}
		}

		return sama;
	}
}
