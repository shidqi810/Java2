import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PengurutanGelembung
{
	static int Larik[] = new int[25];
	static int ukuranLarik;
	static int nilaix;

	public static void main(String[] args)
	{
		System.out.print("Inputkan Jumlah n Larik = ");
		ukuranLarik = inputData();
		
		bacaLarik();
		
		System.out.println("");
		System.out.println("Urutannya Yang Benar Adalah");
		System.out.println("");
		
		urutanGelembung();
		
		cetakLerak();
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
		for ( int j=0; j<ukuranLarik; j++ )
		{
			System.out.print("Larik Ke - " + (j+1) + " = ");
			Larik[j] = inputData();
		}
	}
	
	private static void urutanGelembung()
	{
		int temp = 0;
		
		for ( int i = 0; i<(ukuranLarik-1); i++ )
		{	
			for ( int k = (ukuranLarik-1); k>=(i+1); k-- )	
			{
				if ( Larik[k] < Larik[k-1])
				{
					temp = Larik[k];
					Larik[k] = Larik[k-1];
					Larik[k-1] = temp;
				}
			}
		}
		
	}
	
	private static void cetakLerak()
	{
		for ( int j = 0; j<ukuranLarik; j++ )
		{
			System.out.println("Larik ke - " + (j+1) + " = " + Larik[j]);
		}
	}
}