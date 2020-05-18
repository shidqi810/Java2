import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Gizi
{
	static String nama, kelamin;
	static double umur, tinggi, berat, nasi, ayam, bayam;
	static double BMR, BMI;

	public static void main(String[] args)
	{
		BufferedReader dataIn = new BufferedReader ( new InputStreamReader ( System.in));
		
		System.out.print("Masukkan Nama Anda = ");
		nama = in();
		
		System.out.print("Jenis Kelamin Anda = ");
		kelamin = in();

		System.out.print("Masukkan Umur Anda = ");
		umur = inputData();

		System.out.print("Masukkan Tinggi Anda = ");
		tinggi = inputData();

		System.out.print("Masukkan Berat Badan Anda = ");
		berat = inputData();

		hitung();
		
	}
	

	private static int inputData()	{
		BufferedReader dataIn = new BufferedReader ( new InputStreamReader ( System.in));
		
		String angkaInput = null;
		try
		{
			angkaInput = dataIn.readLine();
		}
		catch ( IOException e )
		{
			e.printStackTrace();
		}
		
		int Data = Integer.valueOf(angkaInput).intValue();
		return Data;
	}
	
	private static String in()	{
		BufferedReader dataIn = new BufferedReader ( new InputStreamReader ( System.in));
		
		String input = null;
		try
		{
			input = dataIn.readLine();
		}
		catch ( IOException e )
		{
			e.printStackTrace();
		}
		return input;
	}

	public static void hitung()
	{
		if (kelamin.equalsIgnoreCase("pria"))
		{
			BMR = 88.362 + (13.397 * berat) + (4.799 * tinggi) - (5.677 * umur);
			BMI = berat / (tinggi*tinggi);
		}
		else if (kelamin.equalsIgnoreCase("wanita"))
		{
			BMR = 447.593 + (9.247 * berat) + (3.098 * tinggi) - (4.330 * umur);
			BMI = berat / (tinggi*tinggi);
		}
		System.out.println("");
		System.out.println("BMR Anda Adalah = " + BMR);
		System.out.println("BMI Anda Adalah = " + BMI);
	}
}