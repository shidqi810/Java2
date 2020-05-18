import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class tukarChar
{
	static char LA[] = new char[25];
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
		BufferedReader dataIn = new BufferedReader ( new InputStreamReader ( System.in));
		
		String angkaInput = null;
		
		for ( int j=0; j<ukuranLarik; j++ )
		{
			System.out.print("Larik Ke - " + (j+1) + " = ");
			try
			{
				angkaInput = dataIn.readLine();
			}
				catch ( IOException e )
			{
				e.printStackTrace();
			}
		
			LA[j] = angkaInput.charAt(0);
		}
	}
	
	public static void tukar()
	{
		char temp;
		temp = LA[ukuranLarik-1];
		LA[ukuranLarik-1] = LA[0];
		LA[0] = temp;
	}
	
	private static void cetakLerak()
	{
		for ( int j = 0; j<ukuranLarik; j++ )
		{
			System.out.println("Larik (A) ke - " + (j+1) + " = " + LA[j]);
		}
	}
}