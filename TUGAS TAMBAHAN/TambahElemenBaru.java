import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TambahElemenBaru
{
	static int Larik[] = new int[25];
	static int ukuranLarik;
	static int nilaix, idx, i;

	public static void main(String[] args)
	{
		System.out.print("Inputkan Jumlah n Larik = ");
		ukuranLarik = inputData();
		
		bacaLarik();
		
		System.out.print("Inputkan Nilai x yang dicari = ");
		
		nilaix = inputData();
		
		SeqSearch2();

		temu();
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
	
	private static void SeqSearch2()
	{
		int i = 0;
		while (( i<ukuranLarik) && (Larik[i] != nilaix))
		{
			i = i+1;
		}
		
		if (Larik[i] == nilaix)
		{
			idx = i;
		}
		else
		{
			idx = -1;
		}

	}

	public static void temu()
	{
		if (idx != -1)
		{
			System.out.println(nilaix + " Sudah Terdapat Di Dalam Larik");
		}
		else
		{
			ukuranLarik = ukuranLarik + 1;
			Larik[ukuranLarik-1] = nilaix;

			for (i = 0; i<ukuranLarik; i++ )
			{
				System.out.println("Larik Ke - " + (i+1) + " = " + Larik[i]);
			}
		}
	}
}