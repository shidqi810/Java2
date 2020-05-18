import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Algoritma14x15 {
	static int[][] a = new int[25][25];
	static int nBar;
    static int nKol;

	public static void main(String[] args) {
		System.out.print("inputkan jumlah baris = ");
		nBar = inputData();

        System.out.print("inputkan jumlah kolom = ");
		nKol = inputData();

		bacaMatriks();

        penjumlahanBarisDanKolom();

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
                    System.out.print("Masukan untuk larik" + "[" + i + "][" + j + "]" + " = ");
				    a[i][j] = inputData();
            }
		}
	}

    private static void penjumlahanBarisDanKolom() {
        for(int i = 0; i < nBar; i++) {
            for(int j = 0; j < nKol; j++) {
                    a[i][nKol] =  a[i][nKol] + a[i][j];
            }
		}

		for(int i = 0; i < nKol; i++) {
            for(int j = 0; j < nBar; j++) {
                    a[nBar][j] =  a[nBar][j] + a[i][j];
            }
		}
	}

	private static void cetakMatriks() {
		for(int i = 0; i <= nBar; i++) {
            for(int j = 0; j <= nKol; j++) {
                System.out.print(a[i][j] + "   ");
            }
			System.out.println();
		}
	}
}
