import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class polinom
{
	static int Larik[] = new int[1000];
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

	public static void bacaLarik()
	{
		for ( int j=0; j<n; j++ )
		{
			System.out.print("Larik Ke - " + (j+1) + " = ");
			Larik[j] = inputData();
		}
	}
		
	private static void cetakLarik()
	{
		int k = 0;
		int p = 0;

		while ( ( k < n ) && ( p < n) )
		{
			if (k > 0)
			{
				System.out.println("Larik ke - " + (k+1) + " = " + Larik[k] + "x" + " ^ " + p);				
			}
			else
			{
				System.out.println("Larik ke - " + (k+1) + " = " + Larik[k] + " ^ " + p);
			}
			k++;
			p++;
		}
	}
}