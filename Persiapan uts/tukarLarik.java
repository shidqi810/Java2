import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class tukarLarik
{
	static int LA[] = new int[25];
	static int LB[] = new int[25];
	static int ukuranLarik;

	public static void main(String[] args)
	{
		System.out.print("Inputkan Jumlah n Larik = ");
		ukuranLarik = inputData();
		
		bacaLarik();
		
		System.out.println("");
		System.out.println("Urutannya Yang Benar Adalah");
		System.out.println("");
		
		tukar();
		
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
			System.out.print("Larik (A) Ke - " + (j+1) + " = ");
			LA[j] = inputData();
		}
		
		System.out.println("");
		
		for ( int j=0; j<ukuranLarik; j++ )
		{
			System.out.print("Larik (B) Ke - " + (j+1) + " = ");
			LB[j] = inputData();
		}
	}
	
	public static void tukar()
	{
		int temp;
		for ( int i = 0; i<ukuranLarik; i++ )
		{
			temp = LA[i];
			LA[i] = LB[i];
			LB[i] = temp;
		}
	}
	
	private static void cetakLerak()
	{
		for ( int j = 0; j<ukuranLarik; j++ )
		{
			System.out.println("Larik (A) ke - " + (j+1) + " = " + LA[j]);
		}
		
		System.out.println("");
		for ( int j = 0; j<ukuranLarik; j++ )
		{
			System.out.println("Larik (B) ke - " + (j+1) + " = " + LB[j]);
		}
	}
}