import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Algoritma12x02 {

	public static void main(String[] args) {
		BufferedReader bfr =  new BufferedReader(new InputStreamReader(System.in));
		String angkaInput = null;
		int[] x = new int[6];
		int jumlah = 0;
		int u;

		for (int i = 0; i < 6; i++) {
			System.out.print("Input nilai x" + (i + 1) + " = ");

			try {
				angkaInput = bfr.readLine();
			} 
			catch(IOException e) {
				e.printStackTrace();
			}

			x[i] = Integer.valueOf(angkaInput).intValue();
		}

		for (int i = 0; i < 6; i++) {
			System.out.println("Nilai x" + (i + 1) + " = " + x[i]);
		}

		for (int i = 0; i < 6; i++) {
			jumlah = jumlah + x[i];
		}

		u = jumlah / 6;

		System.out.println("Rata - rata = " + u);
	}
}
