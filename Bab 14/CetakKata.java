import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CetakKata
{
	static char Matriks[][] = new char [25][25];
	static int Baris, Kolom, i, j;
	
	public static void main(String[] args)
	{
		inputBarisKolom();

		InputIsiMatriknya();

		BacaMatriknya();
		
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

	public static char in()
	{
		BufferedReader dataIn = new BufferedReader ( new InputStreamReader ( System.in));
		
		String Input = null;
		try
		{
			Input = dataIn.readLine();
		}
		catch ( IOException e )
		{
			e.printStackTrace();
		}
		
		char data = Input.charAt(0);
		return data;
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
				Matriks[i][j] = in();
			}	
		}
			System.out.println("");
	}

	public static void BacaMatriknya()
	{
		for ( i = 0; i<Baris; i++ )
		{
			for ( j = 0; j<Kolom; j++ )
			{
				System.out.print(Matriks[i][j] + "	");
			}
			System.out.println("");
		}
	}
}