import java.io.*;

public class sisip2 {
	static int a[] = new int[25];
	static int n;

	public static void main(String[] args) {
		System.out.print("Inputkan Jumlah Array = ");
		n = inputData();

		inputanArray();
		System.out.println("");
		cetakArray();
		System.out.println("");
		methodSisip();

		System.out.println("");
		cetakArray();
	}

	public static int inputData() {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		// Buffered Reader kelebihan nya besar

		// Scanner mudah
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

	public static void methodSisip() {
		for (int i = 0; i < n; i++) {
			int y = a[i]; // ini nilai yang sekarang
			int j = i -1; // ini untuk ke belakang index i
			boolean found = false;

			while (j >= 0 && !found) {
				if (y < a[j]) { // apakah nilai yg sekarang lebih kecil dari nilai di index sebelumny
					a[j+1] = a[j];	// ini untuk mengganti nilai
					j = j - 1;
				}
				else {
					found = true;
				}
				a[j+1] = y;		// menyisipkan nilai y di posisi yg seharusnya
			}
			
		}
	}
}