import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Algoritma12x24 {
	static BufferedReader bfr =  new BufferedReader(new InputStreamReader(System.in));
	static String input = null;
	static int[] nim = new int[25];
	static String[] nama = new String[25];
	static int[] kodeMK = new int[25];
	static int[] nilai = new int[25];
	static int n;

	public static void main(String[] args) {
		
		bacaData2();

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

	private static void bacaData2(){
		int k = 0;

		System.out.print("Inputkan nilai N = ");
		n = Integer.valueOf(bacaLarik()).intValue();

		for (int i = 0; i < n; i++) {
			System.out.println("Data ke-" + (i + 1));

			System.out.print("NIM : ");
			nim[i] = Integer.valueOf(bacaLarik()).intValue();

			System.out.print("Nama : ");
			nama[i] = bacaLarik();

			System.out.println(" ");

			for (int j = 0; j < 4; j++) {
				System.out.println("Mata kuliah " + nama[i] + " " + nim[i] + " ke-" + (j + 1));

				System.out.print("Kode mata kuliah : ");
				kodeMK[j + k] = Integer.valueOf(bacaLarik()).intValue();

				System.out.print("Nilai : ");
				nilai[j + k] = Integer.valueOf(bacaLarik()).intValue();

				System.out.println(" ");
			}

			k = k + 4;
		}
	}

	private static void cetakLarik() {
		int k = 0;

		System.out.println("Cetak Data :");

		for(int i = 0; i < n; i++) {
			System.out.println("Data ke-" + (i + 1));
			System.out.println("NIM : " + nim[i]);
			System.out.println("Nama : " + nama[i]);
			System.out.println(" ");

			for (int j = 0; j < 4; j++) {
				System.out.println("Mata kuliah " + nim[i] + " ke-" + (j + 1));
				System.out.println("Kode mata kuliah : " + kodeMK[j]);
				System.out.println ("Nilai : " + nilai[j]);
				System.out.println(" ");
			}

			k = k + 4;
		}
	}
}
