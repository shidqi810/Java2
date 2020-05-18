import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CariMaksimum
{
	static int Matriks[][] = new int [25][25];
	static int Baris, Kolom, i, j, maks;
	
	public static void main(String[] args)
	{
		inputBarisKolom();

		InputIsiMatriknya();

		BacaMatriknya();
		
		CekMaks();
	}
	
	public static int inputData()
	{
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
	
	public static void inputBarisKolom()
	{
		System.out.print("Masukkan Jumlah Baris Matriks = ");
		Baris = inputData();

		System.out.print("Masukkan Jumlah Kolom Matriks = ");
		Kolom = inputData();

		System.out.println("");
	}

	public static void InputIsiMatriknya()
	{		
		for ( i = 0; i<Baris; i++ )
		{
			for ( j = 0; j<Kolom; j++ )
			{
				System.out.print("Masukkan Isi Baris Matriks Ke - " + (i+1) + " " + "Kolom ke - " + (j+1) + " = ");
				Matriks[i][j] = inputData();
			}	
		}
		System.out.println("");
	}

	public static void BacaMatriknya()
	{
		if (Baris == Kolom)
		{
			for ( i = 0; i<Baris; i++ )
			{
				for ( j = 0; j<Kolom; j++ )
				{
					System.out.print(Matriks[i][j] + "	");
				}
				System.out.println("");
			}

			System.out.println("");
		}
	}
	
	public static void CekMaks()
	{
		maks = -9999;

		for ( i = 0; i<Baris; i++ )
		{
			for ( j = 0; j<Kolom; j++ )
			{
				if (Matriks[i][j] > maks)
				{
					maks = Matriks[i][j];
				}
			}
		}

		System.out.println("Nilai Maksimal = " + maks);
	}
}