import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class NomorSepuluh {
	static int[] larik = new int[25];
	static int ukuranLarik;
	static int nilaiX;
	static int start = 0;
	static int step = 0;

	public static void main(String[] args) {
		System.out.print("input jumlah n larik = ");
		ukuranLarik = inputData();

		bacaLarik();

		urutShell();

		cetakMedian();
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

	private static void bacaLarik() {
		for(int j = 0; j<ukuranLarik; j++) {
			System.out.print("Masukan Larik ke - " + (j +1) + " = ");
				larik[j] = inputData();
		}
	}

	private static void urutShell() {		
		step = ukuranLarik;

		while (step > 1) {
			step = (step / 3) + 1;
			
			for(int start = 0; start < step; start++) {
				urutSisip();
			}
		}
	}

	private static void urutSisip() {
		int i = 0;
		int j = 0;
		int temp = 0;
		boolean ketemu = false;

		i = start + step;

		while (i < ukuranLarik) {
			temp = larik[i];
			j = i - step;
			ketemu = false;

			while ((j >= 0) && (!ketemu)) {
				if (temp < larik[j]) {
					larik[j + step] = larik[j];
					j = j - step;
				}
				else {
					ketemu = true;
				}
			}

			larik[j + step] = temp;
			i = i + step;
		}
	}


	private static void cetakMedian() {
		int k = ukuranLarik / 2;
        int sisaBagi = ukuranLarik % 2;
        double demian = 0;

        if (sisaBagi == 0) {
            demian = (larik[k - 1] + larik[k]) / 2;
        }
        else {
            demian = larik[k];
        }

        System.out.println("Nilai tengahnya adalah  = " + demian);
}
