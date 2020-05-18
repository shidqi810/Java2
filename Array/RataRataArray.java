import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class RataRataArray
{
	public static void main(String[] args)
	{
		BufferedReader dataIn = new BufferedReader ( new InputStreamReader ( System.in));
		try
		{
			double x[] = new double [10];
			int n, i;
			double rata, jumlah;
			String nilai = ""; 
			String nilaix = "";
			
			System.out.println("Program Rata Rata");
			System.out.println("");
			System.out.print("Inputkan Banyaknya Nilai n = ");
			nilai = dataIn.readLine();
			n = Integer.parseInt(nilai);
			
			jumlah = 0;
			for ( i=1; i<=n; i++)
			{
				System.out.print("Masukkan Nilai Ke " + i + " = ");
		
				nilaix = dataIn.readLine();
				
				x[i] = Double.parseDouble(nilaix);
				jumlah = jumlah + x[i];
			}
			
			rata = jumlah / n;
			
			System.out.println("");
			System.out.println("Rata - Rata Nya Adalah = " + rata);
			System.out.println("");
		}
		catch ( IOException x )
		{
			System.out.println("Error!");
		}
		
	}
}