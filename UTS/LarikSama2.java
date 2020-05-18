import java.io.*;

public class LarikSama2 {
	static int a[] = new int[25];
	static int n;

	public static void main(String[] args) {
		System.out.print("Inputkan Jumlah Array = ");
		n = inputData();

		inputanArray();
		System.out.println("");
		cetakArray();
		System.out.println("");
		cekArray();
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

	public static void cekArray(){
		boolean sama = true;
		for (int j = 0; j < (n-1); j++) {
			if (a[j] == a[j+1]) {
				sama = true;
			}
			else{
				sama = false;
			}
		}

		if (sama == true) {
			System.out.println("Matriks Sama");
		}
		else {
			System.out.println("Matriks Tidak Sama");
		}
	}
	
}