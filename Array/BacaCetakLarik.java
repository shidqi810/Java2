import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BacaCetakLarik
{
	static int Larik[] = new int[25];
	static int ukuranLarik;
	
	public static void main(String[] args)
	{
		System.out.print("Inputkan Jumlah n Larik = ");
		ukuranLarik = inputData();
		
		int baca;
		bacaLarik();
		
		System.out.println("Hasil Cetak Adalah di bawah ini = ");
		
		cetakLarik();
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
	
	private static void cetakLarik()
	{
		for ( int j=0; j<ukuranLarik; j++ )
		{
			System.out.println("Larik Ke - " + j + " = " + Larik[j]);
		}
	}
}