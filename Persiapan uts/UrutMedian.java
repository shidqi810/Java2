import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class UrutMedian
{
	static double Larik[] = new double[1000];
	static int n;
	
	public static void main(String[] args)
	{
		System.out.print("Inputkan Jumlah n Larik = ");
		n = inputData();
	
		bacaLarik();
		
		System.out.println("");
		System.out.println("Urutannya Yang Benar Adalah");
		System.out.println("");
		
		urutanSisip();
		
		cetakLarik();
		
		median();
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
	
	public static void urutanSisip()
	{
		for ( int i = 0; i<n; i++)	
		{							
			double temp = Larik[i];
			int j = i - 1;				// j adalah nilai untuk membuat dia kebelakang i
			boolean ketemu = false;
			
			while (( j >=0 ) && (!ketemu))
			{
				if ( temp < Larik[j])
				{
					Larik[j+1] = Larik[j]; //untuk menukar data i nya ke belakang (j)
					j = j - 1;			// nilai j nya sudah kembali ke semula.
				}
				else
				{
					ketemu = true;
				}
				Larik[j+1] = temp;		// jadi nilai j yg ini untuk membuat data di sebelum i menjadi kedepan
			}
		}
	}
	
	private static void cetakLarik()
	{
		for ( int j = 0; j<n; j++ )
		{
			System.out.println("Larik ke - " + (j+1) + " = " + Larik[j]);
		}
	}
	
	public static void median()
	{	
		if ( n%2 == 0 )
		{
			double tengah = (Larik[(n/2)-1] + Larik[(n/2)]) / 2;
			System.out.println("Mediannya Adalah = " + tengah);
		}		
		else if ( n%2 != 0)
		{
			System.out.println("Mediannya Adalah = " + Larik[(n/2)]);
		}
	}
}