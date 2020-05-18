import java.io.*;

public class Median {
	static int a[] = new int[25];
	static int n;

	public static void main(String[] args) {
		System.out.print("Inputkan Jumlah Array = ");
		n = inputData();

		inputanArray();
		System.out.println("");
		cetakArray();
		System.out.println("");
		methodMedian();
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

	public static void methodMedian() {
		double me;

		if (n % 2 == 0) {
			me = 0.5 * (a[(n-1)/2] + a[n/2]);
		}
		else {
			me = a[n/2];
		}

		System.out.println("Median = " + me);
	}
}