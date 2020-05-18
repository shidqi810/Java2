import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class poli
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

		pangkat();
		
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
	
	public static void pangkat()
	{
		System.out.print("Masukkan Nilai X = ");
		p = inputData();

		for (i = 0; i<n ; i++ )
		{
			for (a = 1; a <= i ; a++ )
			{
				Pangkat[i] = Pangkat[i] * p;
			}
		}
	}	
	private static void cetakLarik()
	{
		hasil = 0;
		for ( int j=0; j<n; j++ )
		{
			hasil = hasil + (Larik[j] * Pangkat[j]);
		}
		System.out.print("Hasil nya Adalah = " + hasil);
	}
}