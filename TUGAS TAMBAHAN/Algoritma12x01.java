import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Algoritma12x01 {

	public static void main(String[] args) {
		BufferedReader bfr =  new BufferedReader(new InputStreamReader(System.in));
		String angkaInput = null;
		int x1, x2, x3, x4, x5, x6, u;

		System.out.print("Input nilai x1 = ");

		try {
			angkaInput = bfr.readLine();
		} 
		catch(IOException e) {
			e.printStackTrace();
		}

		x1 = Integer.valueOf(angkaInput).intValue();


		System.out.print("Input nilai x2 = ");

		try {
			angkaInput = bfr.readLine();
		} 
		catch(IOException e) {
			e.printStackTrace();
		}

		x2 = Integer.valueOf(angkaInput).intValue();


		System.out.print("Input nilai x3 = ");

		try {
			angkaInput = bfr.readLine();
		} 
		catch(IOException e) {
			e.printStackTrace();
		}

		x3 = Integer.valueOf(angkaInput).intValue();
		

		System.out.print("Input nilai x4 = ");

		try {
			angkaInput = bfr.readLine();
		} 
		catch(IOException e) {
			e.printStackTrace();
		}

		x4 = Integer.valueOf(angkaInput).intValue();
		

		System.out.print("Input nilai x5 = ");

		try {
			angkaInput = bfr.readLine();
		} 
		catch(IOException e) {
			e.printStackTrace();
		}

		x5 = Integer.valueOf(angkaInput).intValue();
		

		System.out.print("Input nilai x6 = ");

		try {
			angkaInput = bfr.readLine();
		} 
		catch(IOException e) {
			e.printStackTrace();
		}

		x6 = Integer.valueOf(angkaInput).intValue();


		System.out.println("Nilai x1 = " + x1);
		System.out.println("Nilai x2 = " + x2);
		System.out.println("Nilai x3 = " + x3);
		System.out.println("Nilai x4 = " + x4);
		System.out.println("Nilai x5 = " + x5);
		System.out.println("Nilai x6 = " + x6);


		u = (x1 + x2 + x3 + x4 + x5 + x6) / 6;

		System.out.println("Rata - rata = " + u);

		
	}
}