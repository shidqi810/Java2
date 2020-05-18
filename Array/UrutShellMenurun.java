import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class UrutShellMenurun
{
	static int Larik[] = new int[25];
	static int n;
	static int start;
	static int step;
	
	public static void main(String[] args)
	{
		System.out.print("Inputkan Jumlah n Larik = ");
		n = inputData();
		
		bacaLarik();
		
		System.out.println("");
		System.out.println("Urutannya Yang Benar Adalah");
		System.out.println("");
		
		urutanShell();
		
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
	
	public static void urutanShell()
	{
		step = n;
		
		while (step > 1)
		{
			step = (step/3)+1;
			for ( start = 0; start < step; start++)
			{
				urutSisip();
			}
		}
	}
	
	public static void urutSisip()
	{
		int i = 0;
		int j = 0;
		int temp = 0;
		boolean ketemu = false;
		
		i = start + step;
		
		while (i < n)
		{
			temp = Larik[i];
			j = i - step;
			ketemu = false;
			
			while ((j >= 0) && (!ketemu))
			{
				if (temp > Larik[j])
				{
					Larik[j+step] = Larik[j];
					j = j - step;
				}
				else
				{
					ketemu = true;
				}
			}
			
			Larik[j+step] = temp;
			i = i + step;
		}
	}
	
	private static void cetakLarik()
	{
		for ( int j = 0; j<n; j++ )
		{
			System.out.println("Larik ke - " + (j+1) + " = " + Larik[j]);
		}
	}
}