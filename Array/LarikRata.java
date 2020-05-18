import java.io.*;

public class LarikRata
{
	static int Larik[] = new int[25];
	static int ukuranLarik;
	
	public static void main(String[] args)
	{
		System.out.print("Inputkan Jumlah n Larik = ");
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
		
		for ( int i = 0; i<ukuranLarik; i++ )
		{
			jumlah = jumlah + Larik[i];
		}
		
		rata = jumlah / ukuranLarik;
		
		System.out.println("Rata Rata nya Adalah = " + rata);
	}
}