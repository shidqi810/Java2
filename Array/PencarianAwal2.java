import java.io.*;

public class PencarianAwal2 {
	static int a[] = new int[25];
	static int n;

	public static void main(String[] args) {
		System.out.print("Inputkan Jumlah Array = ");
		n = inputData();

		inputanArray();
		System.out.println("");
		cetakArray();
		System.out.println("");
		cariData();
	}

	public static int inputData() {
		BufferedReader iniObjectMasukkan = new BufferedReader(new InputStreamReader(System.in));
		// Buffered Reader kelebihan nya besar

		// Buffered Reader Hanya menerima string
		String masukkan = "inis";
		try {
			masukkan = iniObjectMasukkan.readLine();
		}
		catch (IOException e) {
			System.out.print("Error!");
		}

		// konverter (pengubah)
		int pengubah = Integer.valueOf(masukkan).intValue();
		return pengubah;
	}
	public static void inputanArray() {
		// DRY (Don't Repeat Yourself)
		// for digunakan untuk pengulangan yg pasti angkanya

		for (int i = 0; i < n; i++) {
			System.out.print("Masukkan Aray ke - " + (i+1) + " = ");
			a[i] = inputData();
		}
	}
	public static void cetakArray() {
		// DRY (don't repeat yourself)

		// jumlah pengulangan sudah pasti
		for (int i = 0; i < n; i++) {
			System.out.print("Aray ke - " + (i+1) + " = " + a[i]);
			System.out.println("");
		}
	}

	public static void cariData() {
		int i = 0;
		int idx;

		// untuk yg di cari
		System.out.print("Masukkan Nilai yg ingin di cari = ");
		int x = inputData();

		while ( i < n && a[i] != x) {
			i = i + 1;
		}

		if (a[i] == x) {
			idx = i;
			System.out.println("Nilai " + x + " ada pada index " + idx);
		}
		else {
			idx = -1;
			System.out.println("Nilai " + x + " Tidak ditemukan");
		}
	}
}