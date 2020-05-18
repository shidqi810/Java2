import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Algoritma16x14 {
	static BufferedReader bfr =  new BufferedReader(new InputStreamReader(System.in));
	static String input = null;
	static int[] l1 = new int[25];
	static int[] l2 = new int[25];
	static int[] l3 = new int[25];	
	static int n1, n2, n3, k1, k2, k3;


	public static void main(String[] args) {

		System.out.print("Inputkan nilai N larik 1 = ");
		n1 = Integer.valueOf(bacaLarik()).intValue();

		for (int i = 0; i < n1; i++) {
			System.out.print("Input nilai larik 1 [" + i + "] = ");
			l1[i] = Integer.valueOf(bacaLarik()).intValue();
		}

		System.out.println(" ");

		System.out.print("Inputkan nilai N larik 2 = ");
		n2 = Integer.valueOf(bacaLarik()).intValue();

		for (int i = 0; i < n2; i++) {
			System.out.print("Input nilai larik 2 [" + i + "] = ");
			l2[i] = Integer.valueOf(bacaLarik()).intValue();
		}

		System.out.println(" ");

		arrayMerge();

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


	private static void arrayMerge() {

		n3 = n1 + n2;
		k1 = 0;
		k2 = 0;
		k3 = 0;

		while ((k1 < n1) && (k2 < n2)) {

			if (l1[k1] <= l2[k2]) {
				l3[k3] = l1[k1];
				k1++;
			}
			else {
				l3[k3] = l2[k2];
				k2++;
			}

			k3++;

			while (k1 < n1) {
				l3[k3] = l1[k1];
				k1++;
				k3++;
			}

			while (k2 < n2) {
				l3[k3] = l2[k2];
				k2++;
				k3++;
			}
		}
	}


	private static void cetakLarik() {

		for(int i = 0; i < n3; i++) {
			System.out.println("Nilai larik 3 [" + i + "] = " + l3[i]);
		}
	}
}
