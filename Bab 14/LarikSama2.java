import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class LarikSama2
{
	static int MatriksA[][] = new int[1000][1000];
	static int MatriksB[][] = new int[1000][1000];
	static int BarisA, KolomA, BarisB, KolomB, i, j;
	
	public static void main(String[] args)
	{	
		inputBarisKolom();
		System.out.println("");

		InputIsiMatriknya();
		
		System.out.println("");		
		BacaMatriknya();
	}
	
	public static int inputData()
	{
		BufferedReader bfr = new BufferedReader ( new InputStreamReader ( System.in));
		
		String angkaInput = null;
		try
		{
			angkaInput = bfr.readLine();
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
		System.out.print("Masukkan Jumlah Baris Matriks A = ");
		BarisA = inputData();

		System.out.print("Masukkan Jumlah Kolom Matriks A = ");
		KolomA = inputData();

		System.out.println("");

		System.out.print("Masukkan Jumlah Baris Matriks B = ");
		BarisB = inputData();

		System.out.print("Masukkan Jumlah Kolom Matriks A = ");
		KolomB = inputData();
		
		System.out.println("");
	}

	public static void InputIsiMatriknya()
	{
		if ( (BarisA == BarisB) && (KolomA == KolomB) )
		{
			for ( i = 0; i<BarisA; i++ )
			{
				for ( j = 0; j<KolomA; j++ )
				{
					System.out.print("Masukkan Isi Baris Matriks A Ke - " + (i+1) + " " + "Kolom ke - " + (j+1) + " = ");
					MatriksA[i][j] = inputData();
				}	
			}
			System.out.println("");

			for ( i = 0; i<BarisB; i++ )
			{
				for ( j = 0; j<KolomB; j++ )
				{
					System.out.print("Masukkan Isi Baris Matriks B Ke - " + (i+1) + " " + "Kolom ke - " + (j+1) + " = ");
					MatriksB[i][j] = inputData();
				}	
			}
		}
		else
		{
			System.out.println("Mohon Maaf Matriks Tidak Sama!");
		}	
	}

	public static void BacaMatriknya()
	{
		boolean sama = true;
		if ( (BarisA == BarisB) && (KolomA == KolomB) )
		{
			for ( i = 0; i<BarisA; i++ )
			{
				for ( j = 0; j<KolomA; j++ )
				{
					System.out.print(MatriksA[i][j] + "	");
				}
				System.out.println("");
			}

			System.out.println("");

			for ( i = 0; i<BarisB; i++ )
			{
				for ( j = 0; j<KolomB; j++ )
				{
					System.out.print(MatriksB[i][j] + "	");
				}
				System.out.println("");
			}

			System.out.println("");

			i = 0;
			while ( ( i < BarisA ) && (sama) )
			{
				j = 0;
				while ( ( j < KolomA) && (sama) )
				{
					if (MatriksA[i][j] != MatriksB[i][j])
					{
						sama = false;
					}
					else
					{
						j = j+1;
					}
				}
				if (sama)
				{
					i = i+1;
				}
			}
			System.out.println(sama);
		}
	}
	
}