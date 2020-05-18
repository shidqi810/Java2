import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Algoritma14x11 {
	static int[][] m = new int[25][25];
	static int nBar, nKol;

	public static void main(String[] args) {
		System.out.print("input jumlah n baris = ");
		nBar = inputData();

        System.out.print("input jumlah n kolom = ");
		nKol = inputData();

		bacaMatriks();

		System.out.println("hasil cetak adalah dibawah ini :");
		cetakMatriks();
	}

	private static int inputData() {
		BufferedReader bfr =  new BufferedReader(new InputStreamReader(System.in));

		String angkaInput = null;
		try {
			angkaInput = bfr.readLine();
		} 
		catch(IOException e) {
			e.printStackTrace();
		}

		int Data = Integer.valueOf(angkaInput).intValue();
		return Data;
	}

	private static void bacaMatriks() {
		for(int i = 0; i < nBar; i++) {
            for(int j = 0; j < nKol; j++) {
                    System.out.print("Masukan matriks ke - " + (i + 1) + " , " + (j + 1) + " = ");
				    m[i][j] = inputData();
            }
		}
	}

	private static void cetakMatriks() {
		for(int i = 0; i < nBar; i++) {
            for(int j = 0; j < nKol; j++) {
                System.out.print(m[i][j] + "   ");
            }
			System.out.println();
		}
	}
}
