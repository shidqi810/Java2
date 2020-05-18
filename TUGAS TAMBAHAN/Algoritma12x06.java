import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Algoritma12x06 {
	static BufferedReader bfr =  new BufferedReader(new InputStreamReader(System.in));
	static String angkaInput = null;
	static String jawab = null;
	static int[] a = new int[25];
	static int i = -1;
	static int n;

	public static void main(String[] args) {

		bacaLarikVersi2();

		cetakLarik();
	}

	private static void bacaLarikVersi2() {
		do {
			i = i + 1;

			System.out.print("Input nilai larik A[" + i + "] = ");

			try {
				angkaInput = bfr.readLine();
			} 
			catch(IOException e) {
				e.printStackTrace();
			}

			a[i] = Integer.valueOf(angkaInput).intValue();



			System.out.print("Lagi data larik?(y/t) : ");
			try {
				jawab = bfr.readLine();
			}
			catch(IOException e) {
				System.out.println("Error!");
			}
			System.out.println("");

		} while(jawab.equalsIgnoreCase("Y"));

		n = i + 1;
	}

	private static void cetakLarik() {
		System.out.println("Nilai N = " + n);
		for(int i = 0; i < n; i++) {
			System.out.println("Nilai larik A[" + i + "] = " + a[i]);
		}
	}
}
