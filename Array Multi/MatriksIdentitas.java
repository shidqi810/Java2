import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MatriksIdentitas
{
	static int Matriks[][] = new int [25][25];
	static int Baris, Kolom, i, j;
	
	public static void main(String[] args)
	{
		inputBarisKolom();

		InputIsiMatriknya();

		BacaMatriknya();
		
		BacaDiagonal();
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
		if (Baris == Kolom)
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
		else
		{
			System.out.println("Mohon Maaf!");
		}
		
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
	
	public static void BacaDiagonal()
	{
		if (Baris == Kolom)
		{
			for ( i = 0; i<Baris; i++ )
			{
				for ( j = 0; j<Kolom; j++ )
				{
					if (i == j)
					{
						if (Matriks[i][j] != 1)
						{
							System.out.println("Bukan Identitas");
							break;
						}
					}
				}
			}
			System.out.println("Identitas");
		}
		else
		{
			System.out.println("Matriks Anda tidak Simetris");
		}
	}
}