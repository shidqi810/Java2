import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class UrutIPK
{
	static double IPK[] = new double[1000];
	static int NIM[] = new int[1000];
	static int ukuranLarik;
	static String Mahasiswa[] = new String[1000];
	
	public static void main(String[] args)
	{
		System.out.print("Inputkan Jumlah Mahasiswa = ");
		ukuranLarik = inputData();
	
		bacaLarik();
		
		System.out.println("");
		System.out.println("Urutannya Yang Benar Adalah");
		System.out.println("");
		
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
		BufferedReader bfr = new BufferedReader ( new InputStreamReader ( System.in));
		
		for ( int j=0; j<ukuranLarik; j++ )
		{
			System.out.println("Masukkan Nama Mahasiswa Ke - " + (j+1) + " = ");
			try
			{
				Mahasiswa[j] = bfr.readLine();
			}
			catch ( IOException e )
			{
				e.printStackTrace();
			}
			
			System.out.println("NIM " + Mahasiswa[j] + " = ");
			NIM[j] = inputData();
			
			System.out.println("IPK " + Mahasiswa[j] + " = ");
			IPK[j] = inputData();
		}
	}

		
	private static void cetakLarik()
	{
		for ( int j = 0; j<ukuranLarik; j++ )
		{
			if (( IPK[j] > 2) && ( IPK[j] <= 4))
			{
				System.out.println("Mahasiswa ke - " + (j+1) + " = " + Mahasiswa[j]);
				System.out.println("NIM " + Mahasiswa[j] + " = " + NIM[j]);
				System.out.println("IPK " + Mahasiswa[j] + " = " + IPK[j]);
			}
		}
	}
}