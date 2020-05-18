import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CariIndeksBagi2
{
	static int Larik[] = new int[25];
	static int ukuranLarik;
	static int nilaix;

	public static void main(String[] args)
	{
		System.out.print("Inputkan Jumlah n Larik = ");
		ukuranLarik = inputData();
		
		bacaLarik();
		
		System.out.println("Inputkan Nilai x yang dicari = ");
		
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
		int i = 1;
		int j = ukuranLarik;
		int k = 0;
		boolean ketemu = false;
		while (( i<j) && (!ketemu))
		{
			k = (i+j)/2;
			if ( Larik[k] == nilaix)
			{
				ketemu = true;
			}
			else 
			{
				if ( Larik[k]!=nilaix)
				{
					j = k+1;
				}
				else 
				{
					i = k+1;
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