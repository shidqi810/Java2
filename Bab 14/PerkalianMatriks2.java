import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PerkalianMatriks2
{
	static int MatriksA[][] = new int [25][25];
	static int MatriksB[][] = new int [25][25];
	static int MatriksC[][] = new int [25][25];
	static int BarisA, KolomA, i, j, k, m, n, p, s, t;
	static int BarisB, KolomB;
	static int BarisC, KolomC;
	
	public static void main(String[] args)
	{
		inputMatriks();

		System.out.println("");

		bacaMatriknya();
		
		KaliMatrik();
		
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
		m = inputData();
		
		System.out.print("Masukkan Jumlah Kolom Matriks A = ");
		s = inputData();

		System.out.println("");

		System.out.print("Masukkan Jumlah Baris Matriks B = ");
		t = inputData();
		
		System.out.print("Masukkan Jumlah Kolom Matriks B = ");
		p = inputData();
	}

	public static void bacaMatriknya()
	{
		if ( s == t)
		{
			n = s;
			n = t;
			for ( i = 0; i<m; i++ )
			{
				for ( k = 0; k<n; k++ )
				{
					System.out.print("Masukkan Isi Baris Matriks A Ke - " + (i+1) + " " + "Kolom ke - " + (k+1) + " = ");
					MatriksA[i][k] = inputData();
				}	
			}

			System.out.println("");

			for ( k = 0; k<n; k++ )
			{
				for ( j = 0; j<p; j++ )
				{
					System.out.print("Masukkan Isi Baris Matriks B Ke - " + (k+1) + " " + "Kolom ke - " + (j+1) + " = ");
					MatriksB[k][j] = inputData();
				}	
			}
		}

		else
		{
			System.out.println("Mohon Maaf!");
		}
	}

	public static void KaliMatrik()
	{
		if ( s == t ) 
		{
			n = s;
			n = t;
			BarisC = m;
			KolomC = p;
			for ( i = 0; i<m; i++ )
			{
				for ( j = 0; j<p; j++)
				{
					MatriksC[i][j] = 0;
					for ( k = 0; k<n; k++ )
					{
						MatriksC[i][j] = MatriksC[i][j] + MatriksA[i][k] * MatriksB[k][j];
					}
				}
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
			System.out.println("Matriks Anda tidak bisa di Kalikan");
		}
		
	}
}