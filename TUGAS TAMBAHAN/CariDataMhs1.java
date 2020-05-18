import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CariDataMhs1
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
		
		cariIndeks();
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
	
	private static void cariIndeks()
	{
		NIM[ukuranLarik+1] = NIMmhs;
		int i = 0;
		boolean ketemu = false;

		while ( (i < ukuranLarik) && (!ketemu) )
		{
			if (NIM[i] == NIMmhs)
			{
				ketemu = true;
			}
			else
			{
				i = i+1;
			}
		}

		if (ketemu)
		{
			idx = i;
			System.out.print("NIM - " + NIMmhs + " Terdapat di Dalam Larik " + idx);
		}
		else
		{
			idx = -1;
			System.out.print(idx);
		}
	}
}