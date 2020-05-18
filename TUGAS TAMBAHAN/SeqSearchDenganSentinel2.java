import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class SeqSearchDenganSentinel2
{
	static int Larik[] = new int[25];
	static int ukuranLarik;
	static int nilaix, idx, i, j;

	public static void main(String[] args)
	{
		System.out.print("Inputkan Jumlah n Larik = ");
		ukuranLarik = inputData();
		
		bacaLarik();
		
		System.out.print("Inputkan Nilai x yang dicari = ");
		
		nilaix = inputData();
		
		cariIndeks();

		sentinel();
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
			System.out.print("Larik Ke - " + (j+1) + " = ");
			Larik[j] = inputData();
		}
	}
	
	private static void cariIndeks()
	{
		Larik[ukuranLarik+1] = nilaix;
		int i = 0;

		while (Larik[i] != nilaix)
		{
			i = i+1;
		}

		if (i == (ukuranLarik + 1))
		{
			idx = -1;
		}
		else
		{
			idx = i;
		}

	}

	public static void sentinel()
	{
		if (idx != -1)
		{
			System.out.print(nilaix + " Sudah Terdapat di Dalam Larik");
		}
		else
		{
			ukuranLarik = ukuranLarik+1;
			Larik[ukuranLarik-1] = nilaix;
			for (i = 0; i<ukuranLarik; i++ )
			{
				System.out.println("Larik Ke - " + (i+1) + " = " + Larik[i]);
			}
		}
	}
}