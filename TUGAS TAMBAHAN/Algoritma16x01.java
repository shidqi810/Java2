import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Algoritma16x01 {
	static BufferedReader bfr =  new BufferedReader(new InputStreamReader(System.in));
	static String input = null;
	static int[] l = new int[25];	
	static int n;


	public static void main(String[] args) {

		System.out.print("Inputkan nilai N = ");
		n = Integer.valueOf(bacaLarik()).intValue();

		for (int i = 0; i < n; i++) {
			System.out.print("Input nilai larik [" + i + "] = ");
			l[i] = Integer.valueOf(bacaLarik()).intValue();
		}

		System.out.println(" ");

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


	private static void cetakLarik() {

		for(int i = 0; i < n; i++) {
			System.out.println("Nilai larik [" + i + "] = " + l[i]);
		}
	}
}
