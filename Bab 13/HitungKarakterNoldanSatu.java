import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class HitungKarakterNoldanSatu
{
	static int Larik[] = new int[25];
	static int n, i, j;
	
	public static void main(String[] args)
	{
		inputBanyakLarik();

		InputLarik();
		
		cetak();
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

	public static double input()
	{
		BufferedReader dataIn = new BufferedReader ( new InputStreamReader ( System.in));
		
		String Input = null;
		try
		{
			Input = dataIn.readLine();
		}
		catch ( IOException e )
		{
			e.printStackTrace();
		}
		
		double data = Double.parseDouble(Input);
		return data;
	}
	
	public static void inputBanyakLarik()
	{
		System.out.print("Masukkan Jumlah n Larik = ");
		n = inputData();
	}

	public static void InputLarik()
	{
		for ( i = 0; i<n; i++ )
		{	
			System.out.print("Masukkan Isi Larik Ke - " + (i+1) + " = ");
			Larik[i] = inputData();
		}
	}
	
	public static void cetak()
	{
		int m1 = 0;
		int m2  = 0;

		for ( i=0; i<n; i++ )
		{
			System.out.println("Larik Ke - " + (i+1) + " = " + Larik[i]);
		}

		for ( i=0; i<n; i++ )
		{
			if (Larik[i] == 1)
			{
				m1 = m1+1;
			}
			else if (Larik[i] == 0)
			{
				m2 = m2+1;
			}
		}
		System.out.println("");
		System.out.print("Banyaknya Nilai 1 Di dalam Larik Adalah = " + m1);
		System.out.println("");
		System.out.print("Banyaknya Nilai 0 Di dalam Larik Adalah = " + m2);
	}
}