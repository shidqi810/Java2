import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class diet
{
	static String nama;
	static double kelamin, tinggi, tinggi2, berat, nasi, ayam, bayam;
	static double BMR, BMI, BBI1, BBI2, AF, TEF, KET;
	static int umur, aktifitas;

	public static void main(String[] args)
	{
		BufferedReader dataIn = new BufferedReader ( new InputStreamReader ( System.in));

		masukan();
		hitung1();
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

	public static void masukan(){
		System.out.print("Masukkan Nama Anda = ");
		nama = in();
		
		System.out.println("");
		System.out.println("1 = Laki Laki	2 = Perempuan");
		System.out.print("Jenis Kelamin Anda = ");
		kelamin = inputData();

		System.out.print("Masukkan Umur Anda = ");
		umur = inputData();

		System.out.print("Masukkan Tinggi Anda = ");
		tinggi = inputData();
		tinggi2 = tinggi / 100;

		System.out.print("Masukkan Berat Badan Anda = ");
		berat = inputData();
	}

	public static void hitung1(){
		if (kelamin == 1)
		{
			BMI = berat / (tinggi2*tinggi2);

			if (BMI > 29.9)
			{
				BBI1 = (tinggi - 100) - (0.1 * (tinggi-100));
				BBI2 = ( (berat - BBI1) * 0.25 ) + BBI1;
				BMR = 66.5 + (13.7 * BBI2) + (5 * tinggi) - (6.8 * umur);
			}
			else if ( (BMI >= 25) && (BMI <= 29.9) )
			{
				BBI1 = (tinggi - 100) - (0.1 * (tinggi-100));
				BMR = 66.5 + (13.7 * BBI1) + (5 * tinggi) - (6.8 * umur);
			}
			else if (BMI < 25)
			{
				BMR = 66.5 + (13.7 * berat) + (5 * tinggi) - (6.8 * umur);
			}

			System.out.println("");
			System.out.println("1 = Berat	2 = Sedang	3 = Ringan");
			System.out.print("Bagaimana Tingkat Aktifitas Anda? = ");
			aktifitas = inputData();

			if (aktifitas == 1)
			{
				AF = BMR * 1.11;
			}
			else if (aktifitas == 2)
			{
				AF = BMR * 1.25;
			}
			else if (aktifitas == 3)
			{
				AF = BMR * 1.48;
			}

			TEF = AF * 0.1;
			KET = AF + TEF;
		}
		else if (kelamin == 2)
		{
			BMI = berat / (tinggi2*tinggi2);

			if (BMI > 29.9)
			{
				double BBI1, BBI2;
				BBI1 = (tinggi - 100) - (0.1 * (tinggi-100));
				BBI2 = ( (berat - BBI1) * 0.25 ) + BBI1;
				BMR = 65.5 + (9.6 * BBI2) + (1.8 * tinggi) - (4.7 * umur);
			}
			else if ( (BMI >= 25) && (BMI <= 29.9) )
			{
				BBI1 = (tinggi - 100) - (0.1 * (tinggi-100));
				BMR = 65.5 + (9.6 * BBI1) + (1.8 * tinggi) - (4.7 * umur);
			}
			else if (BMI < 25)
			{
				BMR = 65.5 + (9.6 * berat) + (1.8 * tinggi) - (4.7 * umur);
			}

			System.out.println("");
			System.out.println("1 = Berat	2 = Sedang	3 = Ringan");
			System.out.print("Bagaimana Tingkat Aktifitas Anda? = ");
			aktifitas = inputData();

			if (aktifitas == 1)
			{
				AF = BMR * 1.12;
			}
			else if (aktifitas == 2)
			{
				AF = BMR * 1.27;
			}
			else if (aktifitas == 3)
			{
				AF = BMR * 1.45;
			}

			TEF = AF * 0.1;
			KET = AF + TEF;
		}

		System.out.println("KET Adalah = " + KET);
	}
}