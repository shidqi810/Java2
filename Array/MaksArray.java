import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MaksArray
{
	public static void main(String[] args)
	{
		BufferedReader dataIn = new BufferedReader ( new InputStreamReader ( System.in));
		try
		{	
			int n, i, maks;			
			int x[] = new int [20];
			
			String nilai = "";
			String nilaix = "";
			
			System.out.println("PROGRAM NILAI MAKS ARRAY");
			System.out.println("");
			System.out.print("Inputkan Banyaknya Nilai n = ");
			
			nilai = dataIn.readLine();
			n = Integer.parseInt(nilai);
		
			maks = -9999;
			for ( i=1; i<=n; i++ )
			{
				System.out.print("Masukkan Nilai Ke " + i + " = ");
			
				nilaix = dataIn.readLine();

				x[i] = Integer.parseInt(nilaix);
				
				if ( x[i] > maks )
				{
					maks = x[i];
				}

			}
			
			System.out.println("");
			System.out.print("Nilai Terbesar Nya Adalah = " + maks);				
		}
		
		catch ( IOException e )
		{
			System.out.print("Error!");
		}
		
	}
}