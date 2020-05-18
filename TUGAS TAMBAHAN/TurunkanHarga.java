import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class TurunkanHarga
{
	static double harga[] = new double[25];
	static int n, i, j;
	static double diskon;
	
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
			System.out.print("Masukkan Harga Larik Ke - " + (i+1) + " = ");
			harga[i] = input();
		}
	}
	
	public static void cetak()
	{
		System.out.print("Masukkan Berapa Persen Diskon = ");
		double p = input();
	
		for (i = 0; i < n ; i++ )
		{
			diskon = (p/100)*harga[i];
			harga[i] = harga[i] - diskon;
		}

		System.out.println("");
		System.out.println("Harga Harga nya Menjadi = ");
		for ( int a=0; a<n; a++ )
		{
			System.out.println("Larik Ke - " + (a+1) + " = " + harga[a]);
		}
	}
}