import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class pangkat
{
	static int Larik[] = new int[1000];
	static int Pangkat[] = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
	static int n, i, j, p, hasil, a;
	
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
		System.out.print("Masukkan Banyaknya pangkat = ");
		p = inputData();

		for (i = 0; i<n ; i++ )
		{
			for (a = 1; a <= p ; a++ )
			{
				Pangkat[i] = Pangkat[i] * Larik[i];
			}
		}

		for ( int j=0; j<n; j++ )
		{
			System.out.println("Larik Ke - " + (j+1) + " = " + Pangkat[j]);
		}
	}
}