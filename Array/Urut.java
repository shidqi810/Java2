import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Urut
{
	static int L[] = new int[25];
	static int n;
	static int i, j, k, imin, temp;

	public static void main(String[] args)
	{
		System.out.print("Masukkan Banyak n Larik = ");
		n = inputData();

		bacaLarik();
		System.out.println("");
		urut();
		System.out.println("");
		cetak();
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
	
	public static void bacaLarik()
	{
		for ( int j=0; j<n; j++ )
		{
			System.out.print("Larik Ke - " + (j+1) + " = ");
			L[j] = inputData();
		}
	}
	
	public static void urut()
	{
		for ( i = 0; i < (n-1); i++)
		{
			imin = i;
			for ( j = (i+1); j < n; j++)
			{
				if (L[j] < L[imin])
				{
					imin = j;
				}
			}

			temp = L[i];
			L[i] = L[imin];
			L[imin] = temp;
		}
	}
	
	public static void cetak()
	{
		for ( i = 0; i < n; i++)
		{
			System.out.println(L[i]);
		}
	}
}