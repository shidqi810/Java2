import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BinarySearch
{
	static int Larik[] = new int[25];
	static int ukuranLarik, idx;
	static int nilaix, k;

	public static void main(String[] args)
	{
		System.out.print("Inputkan Jumlah n Larik = ");
		ukuranLarik = inputData();
		
		bacaLarik();
		
		System.out.print("Inputkan Nilai x yang dicari = ");
		
		nilaix = inputData();
		
		bagiDua();
	}
	
	private static int inputData()
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
			Larik[j] = inputData();
		}
	}
	
	private static void bagiDua()
	{
		int i = 0;
		int j = (ukuranLarik-1);
		boolean ketemu = false;
		while (( i<=j) && (!ketemu))
		{
			k = (i+j)/2;
			if ( Larik[k] == nilaix)
			{
				ketemu = true;
			}
			else 
			{
				if ( Larik[k] < nilaix)
				{
					i = k+1;
				}
				else 
				{
					j = k-1;
				}
			}
		}
		
		if (ketemu)
		{
			idx = k;
			System.out.println("Data Ditemukan Terletak Pada Index = " + idx);
		}
		else 
		{
			idx = -1;
			System.out.println("Data Tidak Ditemukan / Pada Index = " + idx);
		}
		
	}
}