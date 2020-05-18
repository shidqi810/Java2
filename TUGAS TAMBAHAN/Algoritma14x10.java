import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Algoritma14x10 {
	static int[][] a = new int[25][25];
    static int[][] aT = new int[25][25];
	static int nBarA;
    static int nKolA;
    static int nBarB;
    static int nKolB;

	public static void main(String[] args) {
		System.out.print("inputkan jumlah baris = ");
		nBarA = inputData();

        System.out.print("inputkan jumlah kolom = ");
		nKolA = inputData();

		bacaMatriks();

        buatMatriksTranpose();

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
		for(int i = 0; i < nBarA; i++) {
            for(int j = 0; j < nKolA; j++) {
                    System.out.print("Masukan untuk larik" + "[" + i + "][" + j + "]" + " = ");
				    a[i][j] = inputData();
            }
		}
	}

    private static void buatMatriksTranpose() {
        nBarB = nKolA;
        nKolB = nBarA;

		for(int i = 0; i < nBarA; i++) {
            for(int j = 0; j < nKolB; j++) {
                aT[i][j] = a[j][i];
            }
		}
	}

	private static void cetakMatriks() {
		for(int i = 0; i < nBarB; i++) {
            for(int j = 0; j < nKolB; j++) {
                System.out.print(aT[i][j] + "   ");
            }
			System.out.println();
		}
	}
}
