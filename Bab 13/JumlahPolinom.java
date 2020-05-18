import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class JumlahPolinom
{
	static int Larik[] = new int[1000];
	static int Larik2[] = new int [1000];
	static int jumlah[] = new int [1000];
	static int n, i, j;
	
	public static void main(String[] args)
	{
		System.out.print("Inputkan Jumlah n Larik = ");
		n = inputData();
	
		bacaLarik();
		
		System.out.println("");
		
		cetakLarik();
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

	public static void bacaLarik()
	{
		System.out.println("Larik Pertama = ");
		for ( int j=0; j<n; j++ )
		{
			System.out.print("Larik Ke - " + (j+1) + " = ");
			Larik[j] = inputData();
		}

		System.out.println("");
		System.out.println("Larik Kedua = ");

		for ( int i=0; i<n; i++ )
		{
			System.out.print("Larik Ke - " + (i+1) + " = ");
			Larik2[i] = inputData();
		}
	}
		
	private static void cetakLarik()
	{
		int k = 0;
		int p = 0;

		while ( ( k < n ) && ( p < n) )
		{
			if (k > 0)
			{
				System.out.println("Larik ke - " + (k+1) + " = " + Larik[k] + "x" + " ^ " + p);				
			}
			else
			{
				System.out.println("Larik ke - " + (k+1) + " = " + Larik[k] + " ^ " + p);
			}
			k++;
			p++;
		}

		int l = 0;
		int m = 0;
		while ( ( l < n ) && ( m < n) )
		{
			if (k > 0)
			{
				System.out.println("Larik ke - " + (l+1) + " = " + Larik2[l] + "x" + " ^ " + m);				
			}
			else
			{
				System.out.println("Larik ke - " + (l+1) + " = " + Larik2[l] + " ^ " + m);
			}
			l++;
			m++;
		}

		for (i = 0; i < n; i++ )
		{
			jumlah[i] = Larik[i] + Larik2[i];
		}

		System.out.println("Hasil nya Adalah = ");
		int r = 0;
		int s = 0;
		while ( ( r < n ) && ( s < n) )
		{
			if (r > 0)
			{
				System.out.println("Hasil Tambah = " + jumlah[r] + "x" + " ^ " + s);				
			}
			else
			{
				System.out.println("Hasil Tambah = " + jumlah[r] + " ^ " + s);
			}
			r++;
			s++;
		}
	}
}