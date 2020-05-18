import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class IndeksNilai
{
	static int Nilai[] = new int[25];
	static char Indeks[] = new char[25];
	static int ukuranLarik;
	
	public static void main(String[] args)
	{
		System.out.println("PROGRAM MENCARI INDEKS NILAI!");
		System.out.println(" ");
		System.out.print("Inputkan Jumlah n Larik = ");
		ukuranLarik = inputData();
		
		bacaLarik();


		HitungIndeksNilai();
		
		System.out.println("");
		System.out.println("Nilainya Adalah = ");
		
		cetakLarik();
		luas(10, 30);
	}

	static int luas(int lebar, int panjang);
	{
		int luasPersegi = lebar * panjang;
		return luasPersegi;
	}
	
	static int inputData()
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
	
	private static void bacaLarik()
	{
		for ( int j=0; j<ukuranLarik; j++ )
		{
			System.out.print("Larik Ke - " + (j+1) + " = ");
			Nilai[j] = inputData();
		}
	}
	
	private static void HitungIndeksNilai()
	{
		for ( int i=0; i<ukuranLarik; i++ )
		{
			if ( Nilai[i] >= 85 )
			{
				Indeks[i] = 'A';
			}
			else if (( Nilai[i] < 85 ) && ( Nilai[i] >=75 ))
			{
				Indeks[i] = 'B';
			}
			else if (( Nilai[i] < 75 ) && ( Nilai[i] >=65 ))
			{
				Indeks[i] = 'C';
			}
		}
	}
	
	private static void cetakLarik()
	{
		for ( int j=0; j<ukuranLarik; j++ )
		{
			System.out.println("Larik Ke - " + j + " , Dengan Nilai " + Nilai[j] + " = " + Indeks[j]);
		}
	}
}