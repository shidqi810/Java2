import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PencarianMatriks
{
	static int matriks[][] = new int [25][25];
	static int ukuranLarik, Baris, Kolom, i, j;
	static int nilaix;

	public static void main(String[] args)
	{
		inputMatriks();

		System.out.println("");

		bacaMatriknya();
		
		System.out.println("");
		
		cariIndeks();
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
			System.out.print("Error!");
		}
		
		int Data = Integer.valueOf(angkaInput).intValue();
		return Data;
	}
	
	public static void inputMatriks()
	{
		System.out.print("Masukkan Jumlah Baris Matriks = ");
		Baris = inputData();
		
		System.out.print("Masukkan Jumlah Kolom Matriks = ");
		Kolom = inputData();

		System.out.println("");

		for ( i = 0; i<Baris; i++ )
		{
			for ( j = 0; j<Kolom; j++ )
			{
				System.out.print("Masukkan Isi Baris Matriks Ke - " + (i+1) + " " + "Kolom ke - " + (j+1) + " = ");
				matriks[i][j] = inputData();
			}	
		}
	}

	public static void bacaMatriknya()
	{
		for ( i = 0; i<Baris; i++ )
		{
			for ( j = 0; j<Kolom; j++ )
			{
				System.out.print(matriks[i][j] + "	");
			}
			System.out.println(" ");
		}
	}
	
	private static void cariIndeks()
	{
		i = 0;
		j = 0;
		boolean ketemu = false;

		System.out.print("Inputkan Nilai x yang dicari = ");
		nilaix = inputData();
		
		for ( i = 0; i<Baris; i++ )
		{
			for ( j = 0; j<Kolom; j++ )
			{
				if ( (matriks[i][j] == nilaix) && (!ketemu) )
				{
					ketemu = true;
				}
			}
		}

		if (ketemu)
		{
			System.out.println("Data Ditemukan");
		}
		else
		{
			System.out.println("Data Tidak Ditemukan");
		}
	}
}