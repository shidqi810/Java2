import java.io.*;

public class MaksArray2 {
	static int a[] = new int[25];
	static int n;

	public static void main(String[] args) {
		System.out.print("Inputkan Jumlah Array = ");
		n = inputData();

		inputanArray();
		System.out.println("");
		cetakArray();
		System.out.println("");
		methodMaks();
	}

	public static int inputData() {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		String masukkan = null;
		try {
			masukkan = input.readLine();
		}
		catch (IOException e) {
			System.out.print("Error!");
		}

		int pengubah = Integer.valueOf(masukkan).intValue();
		return pengubah;
	}

	public static void inputanArray() {
		for (int i = 0; i < n; i++) {
			System.out.print("Masukkan Aray ke - " + (i+1) + " = ");
			a[i] = inputData();
		}
	}

	public static void cetakArray() {
		for (int i = 0; i < n; i++) {
			System.out.print("Aray ke - " + (i+1) + " = " + a[i]);
			System.out.println("");
		}
	}

	public static void methodMaks() {
		int maks = -99999;
		int maks2 = -99999;
		for (int i = 0; i < n; i++) {
			if (a[i] > maks) {
				maks = a[i];
			}
		}

		for (int i = 0; i < n; i++) {
			if (a[i] > maks2 && a[i] < maks) {
				maks2 = a[i];
			}
		}

		System.out.println("nilai Maksimum pertama adalah = " + maks);
		System.out.println("nilai Maksimum kedua adalah = " + maks2);
	}
}