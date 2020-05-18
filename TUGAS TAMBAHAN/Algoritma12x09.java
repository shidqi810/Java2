import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Algoritma12x09 {
	static BufferedReader bfr =  new BufferedReader(new InputStreamReader(System.in));
	static String angkaInput = null;
	static int[] a = new int[25];
	static int jumlah = 0;
	static int n, u;

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

		hitungRataRata();
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
	}

	private static void hitungRataRata() {
		for(int i = 0; i < n; i++) {
			jumlah = jumlah + a[i];
		}

		u = jumlah / n;

		System.out.println("Rata - rata = " + u);
	}
}
