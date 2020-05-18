import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Palindrom
{
	static char Larik[] = new char[1000];
	static int n, i, j;
	
	public static void main(String[] args)
	{
		System.out.print("Inputkan Jumlah n Larik = ");
		n = inputData();
	
		bacaLarik();
		
		System.out.println("");
		
		cetakLarik();
	}
	
	public static int inputData()
	{
		BufferedReader bfr = new BufferedReader ( new InputStreamReader ( System.in));
		
		String angkaInput = null;
		try
		{
			angkaInput = bfr.readLine();
		}
		catch ( IOException e )
		{
			e.printStackTrace();
		}
		
		int Data = Integer.valueOf(angkaInput).intValue();
		return Data;
	}

	public static char in()
	{
		BufferedReader bfr = new BufferedReader ( new InputStreamReader ( System.in));
		
		String Input = null;
		try
		{
			Input = bfr.readLine();
		}
		catch ( IOException e )
		{
			e.printStackTrace();
		}		
		char data = Input.charAt(0);
		return data;
	}
	
	public static void bacaLarik()
	{
		for ( int j=0; j<n; j++ )
		{
			System.out.print("Larik Ke - " + (j+1) + " = ");
			Larik[j] = in();
		}
	}
		
	private static void cetakLarik()
	{
		for ( int k = 0; k<n; k++ )
		{
			System.out.println("Larik ke - " + (k+1) + " = " + Larik[k]);
		}

		i = 0;
		j = n-1;
		while ( (i <= j) && (Larik[i] == Larik[j] ) )
		{
			i = i + 1;
			j = j - 1;
		}

		if ( i > j )
		{
			System.out.print("Palindrom");
		}
		else
		{
			System.out.print("Bukan Palindrom");
		}
	}
}