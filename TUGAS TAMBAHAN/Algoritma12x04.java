import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Algoritma12x04 {
	static int[] a = new int[25];
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

		inisialisasiLarik2();

		cetakLarik();
	}

	private static void inisialisasiLarik2() {
		for (int i = 0; i < n; i++) {
			a[i] = (i + 1);
		}
	}

	private static void cetakLarik() {
		for(int i = 0; i < n; i++) {
			System.out.println("Nilai larik A[" + i + "] = " + a[i]);
		}
	}
}
