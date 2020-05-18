import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Algoritma14x09 {
	static int[][] a = new int[25][25];
    static int[][] b = new int[25][25];
    static int[][] c = new int[25][25];
	static int nBar;
    static int nKol;

	public static void main(String[] args) {
		System.out.print("input jumlah n Baris = ");
		nBar = inputData();

        System.out.print("input jumlah n Kolom = ");
		nKol = inputData();

		bacaMatriksA();
		System.out.println();

		bacaMatriksB();

		jumlahDuaMatriks();

		System.out.println("hasil penjumlahan adalah = ");

		MatriksC();
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

	private static void bacaMatriksA() {
		for(int i = 0; i < nBar; i++) {
            for(int j = 0; j < nKol; j++) {
                    System.out.print("Masukan matriks ke - " + (i + 1) + " , " + (j + 1) + " = ");
				    a[i][j] = inputData();
            }
		}
	}

	private static void bacaMatriksB() {
		for(int i = 0; i < nBar; i++) {
            for(int j = 0; j < nKol; j++) {
                    System.out.print("Masukan matriks ke - " + (i + 1) + " , " + (j + 1) + " = ");
				    b[i][j] = inputData();
            }
		}
	}

	private static void jumlahDuaMatriks() {
		for(int i = 0; i < nBar; i++) {
            for(int j = 0; j < nKol; j++) {
                    c[i][j] = a[i][j] + b[i][j];
            }
		}
	}

	private static void MatriksC() {
		for(int i = 0; i < nBar; i++) {
            for(int j = 0; j < nKol; j++) {
                System.out.print(c[i][j] + "   ");
            }
			System.out.println();
		}
	}
}
