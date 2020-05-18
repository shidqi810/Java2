import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CariDataMhs2
{
	static int NIM[] = new int[25];
	static int ukuranLarik;
	static int nilaix, NIMmhs, idx, i, j;

	public static void main(String[] args)
	{
		System.out.print("Inputkan Jumlah n Larik = ");
		ukuranLarik = inputData();
		
		bacaLarik();
		
		System.out.print("Inputkan NIM yang dicari = ");
		
		NIMmhs = inputData();
		
		bagiDua();
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
	
	public static void bacaLarik()
	{
		for ( int j=0; j<ukuranLarik; j++ )
		{
			System.out.print("Inputkan NIM Ke - " + (j+1) + " = ");
			NIM[j] = inputData();
		}
	}
	
	private static void bagiDua()
	{
		int i = 0;
		int j = ukuranLarik;
		int k = 0;
		boolean ketemu = false;
		while (( i<j) && (!ketemu))
		{
			k = (i+j)/2;
			if ( NIM[k] == NIMmhs)
			{
				ketemu = true;
			}
			else 
			{
				if ( NIM[k] > NIMmhs)
				{
					j = k-1;
				}
				else 
				{
					i = k+1;
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