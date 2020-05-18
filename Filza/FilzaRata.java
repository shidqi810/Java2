import java.io.*;

public class FilzaRata
{
	static double Larik[] = new double[20];
	static int ukuranLarik, i, j;
	
	public static void main(String[] args)
	{
		System.out.print("Masukkan Banyaknya Nilai <Max.20> = ");
		ukuranLarik = inputData();
		bacaLarik();
		
		hitungratarata();
	}
	
	private static int inputData()
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
	
	private static void bacaLarik()
	{
		for ( int j=0; j<ukuranLarik; j++ )
		{
			System.out.print("Masukkan Nilai ke - " + (j+1) + " = ");
			Larik[j] = inputData();
		}
	}
	
	private static void hitungratarata()
	{
		double jumlah = 0.0;
		double rata = 0.0;
		
		System.out.print("Hasil Dari ");
		for ( int i = 0; i<ukuranLarik; i++ )
		{
			System.out.print(Larik[i]);
			if (i<ukuranLarik)
			{
				System.out.print(" + ");
			}
		}

		for ( int i = 0; i<ukuranLarik; i++ )
		{
			jumlah = jumlah + Larik[i];
		}
		System.out.println(" = " +jumlah);

		rata = jumlah / ukuranLarik;
		
		System.out.println("Rata Rata Nilai = " + rata);

		double maks = -9999;
			
		for ( i=0; i<ukuranLarik; i++ )
		{	
			if ( Larik[i] > maks )
			{
				maks = Larik[i];
			}
		}

		System.out.println("Nilai Terbesar = " + maks);

	}
}