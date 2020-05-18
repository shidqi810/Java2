import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CariIndeks
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
			System.out.print("Larik Ke - " + (j+1) + " = ");
			Larik[j] = inputData();
		}
	}
	
	private static void cariIndeks()
	{
		int k = 0;
		while((k<ukuranLarik) && ( Larik[k]!=nilaix))
		{
			k = k+1;
		}
		
		if (Larik[k]== nilaix)
		{
			System.out.println("Data Ditemukan");
		}
		else
		{
			System.out.println("Data Tidak Ditemukan");
		}
	}
}