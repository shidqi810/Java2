import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PenjumlahanMatriks
{
	static int MatriksA[][] = new int [25][25];
	static int MatriksB[][] = new int [25][25];
	static int MatriksC[][] = new int [25][25];
	static int BarisA, KolomA, i, j;
	static int BarisB, KolomB;
	static int BarisC, KolomC;
	
	public static void main(String[] args)
	{
		inputMatriks();

		System.out.println("");

		bacaMatriknya();
		
		TambahMatrik();
		
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
	
	public static void inputMatriks()
	{
		System.out.print("Masukkan Jumlah Baris Matriks A = ");
		BarisA = inputData();
		
		System.out.print("Masukkan Jumlah Kolom Matriks A = ");
		KolomA = inputData();

		System.out.println("");

		System.out.print("Masukkan Jumlah Baris Matriks B = ");
		BarisB= inputData();
		
		System.out.print("Masukkan Jumlah Kolom Matriks B = ");
		KolomB = inputData();
	}

	public static void bacaMatriknya()
	{
		if ((BarisA == BarisB) && (KolomA == KolomB))
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
			System.out.println("Mohon Maaf!");
		}
		
	}
	
	public static void TambahMatrik()
	{
		if ((BarisA == BarisB) && (KolomA == KolomB))
		{
			BarisC = BarisA;
			KolomC = KolomA;

			for ( i = 0; i<BarisC; i++ )
			{
				for ( j = 0; j<KolomC; j++ )
				{
					MatriksC[i][j] = MatriksA[i][j] + MatriksB[i][j];
				}
				System.out.println(" ");
			}

			System.out.println("");
			System.out.println("Hasil Matriks Anda Adalah = ");
			System.out.println("");
	
			for ( i = 0; i<BarisC; i++ )
			{
				for ( j = 0; j<KolomC; j++ )
				{
					System.out.print(MatriksC[i][j] + "   ");
				}
				System.out.println("	");
			}
		}
			
		else
		{
			System.out.println("Matriks Anda tidak bisa dijumlahkan!");
		}
	}
}