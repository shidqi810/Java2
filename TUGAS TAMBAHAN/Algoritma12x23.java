import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Algoritma12x23 {
	static BufferedReader bfr =  new BufferedReader(new InputStreamReader(System.in));
	static String input = null;
	static int[] nim = new int[25];
	static String[] nama = new String[25];
	static int[] ipk = new int[25];
	static int n;

	public static void main(String[] args) {

		bacaData();

		cetakLarik();
	}

	private static String bacaLarik() {
		try {
			input = bfr.readLine();
		} 
		catch(IOException e) {
			e.printStackTrace();
		}

		return input;
	}

	private static void bacaData() {
		System.out.print("Inputkan nilai N = ");
		n = Integer.valueOf(bacaLarik()).intValue();

		for (int i = 0; i < n; i++) {
			System.out.println("Data ke-" + (i + 1));

			System.out.print("NIM : ");
			nim[i] = Integer.valueOf(bacaLarik()).intValue();

			System.out.print("Nama : ");
			nama[i] = bacaLarik();

			System.out.print("IPK : ");
			ipk[i] = Integer.valueOf(bacaLarik()).intValue();

			System.out.println(" ");
		}
	}

	private static void cetakLarik() {
		System.out.println("Cetak Data :");

		for(int i = 0; i < n; i++) {
			System.out.println("Data ke-" + (i + 1));
			System.out.println("NIM : " + nim[i]);
			System.out.println("Nama : " + nama[i]);
			System.out.println("IPK : " + ipk[i]);
			System.out.println(" ");
		}
	}
}
