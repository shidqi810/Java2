import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Algoritma12x25 {
	static BufferedReader bfr =  new BufferedReader(new InputStreamReader(System.in));
	static String input = null;
	static int[] nilUjian = new int[25];
	static char[] indeks = new char[25];
	static int n;

	public static void main(String[] args) {

		System.out.print("Inputkan nilai N = ");
		n = Integer.valueOf(bacaLarik()).intValue();

		for (int i = 0; i < n; i++) {
			System.out.print("Inputkan nilai ke-" + (i + 1) + " : ");
			nilUjian[i] = Integer.valueOf(bacaLarik()).intValue();
		}

		hitungIndeksNilai();

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

	private static void hitungIndeksNilai() {
		for (int i = 0; i < n; i++) {
			
			if (nilUjian[i] >= 80) {
				indeks[i] = 'A';
			}
			else if ((nilUjian[i] >= 70) && (nilUjian[i] < 80)) {
				indeks[i] = 'B';
			}
			else if ((nilUjian[i] >=55) && (nilUjian[i] < 70)) {
				indeks[i] = 'C';
			}
			else if ((nilUjian[i] >= 45) && (nilUjian[i] < 55)) {
				indeks[i] = 'D';
			}
			else {
				indeks[i] = 'E';
			}
		}
	}

	private static void cetakLarik() {
		System.out.println("Cetak Data :");

		for(int i = 0; i < n; i++) {
			System.out.println("Nilai " + nilUjian[i] + " : " + indeks[i]);
		}
	}
}
