import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class UrutShell
{
	static int Larik[] = new int[25];
	static int n;
	static int start = 0;
	static int step = 0;
	
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
		System.out.println("Step 1 = " + step);
		while (step > 1)
		{
			step = (step/3)+1;
			System.out.println("Step 2 = " + step);
			for ( start = 0; start < step; start++)
			{
				System.out.println("start 1 = " + start);
				System.out.println("Step 3 = " + step);
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
		System.out.println("i 1 = " + i);
		while (i < n)
		{
			temp = Larik[i];
			j = i - step;							// nilai j berfungsi untuk membuat j menjadi kebelakang i
			System.out.println("temp 1 = " + temp);
			System.out.println("j 1 = " + j);
			ketemu = false;
			
			while ((j >= 0) && (!ketemu))
			{
				if (temp < Larik[j])
				{
					Larik[j+step] = Larik[j];
					System.out.println("Larik [j+step] = " + Larik[j+step]);
					j = j - step;
					System.out.println("j 2 = " + j);
				}
				else
				{
					ketemu = true;
				}
			}
			
			Larik[j+step] = temp;
			i = i + step;					// i ini untuk memajukan data (j) selanjutnya		karena j = i - step
			System.out.println("Larik[j+step] = " + Larik[j+step]);
			System.out.println("i 2 = " + i);
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