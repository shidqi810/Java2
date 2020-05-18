import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BiodataMahasiswa
{
	static int NIM[] = new int[25];
	static String NamaMhs[] = new String [25];
	static String KodeMK[] = new  String [25];
	static char Nilai[] = new char [25];
	static int ukuranLarik;
	static int nilaix, idx, i, j;

	public static void main(String[] args)
	{
		System.out.print("Inputkan Jumlah n Larik = ");
		ukuranLarik = inputData();
		
		bacaLarik();
		
		System.out.println("");

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
			System.out.print("Error!");
		}
		
		int Data = Integer.valueOf(angkaInput).intValue();
		return Data;
	}

	public static String inputS()
	{
		BufferedReader dataIn = new BufferedReader ( new InputStreamReader ( System.in));
		
		String angkaInput = null;
		try
		{
			angkaInput = dataIn.readLine();
		}
		catch ( IOException e )
		{
			System.out.print("Error!");
		}
		return angkaInput;
	}	

	public static char inputC()
	{
		BufferedReader dataIn = new BufferedReader ( new InputStreamReader ( System.in));
		
		String angkaInput = null;
		try
		{
			angkaInput = dataIn.readLine();
		}
		catch ( IOException e )
		{
			System.out.print("Error!");
		}
		
		char data = angkaInput.charAt(0);
		return data;
	}
	
	public static void bacaLarik()
	{
		for ( int j=0; j<ukuranLarik; j++ )
		{
			System.out.print("Nama Mahasiswa ke - " + (j+1) + " = ");
			NamaMhs[j] = inputS();
		}

		for ( int j=0; j<ukuranLarik; j++ )
		{
			System.out.print("NIM " + NamaMhs[j] + " = ");
			NIM[j] = inputData();
		}

		for ( int j=0; j<ukuranLarik; j++ )
		{
			System.out.print("Kode Mata Kuliah " + NamaMhs[j] + " = ");
			KodeMK[j] = inputS();
		}

		for ( int j=0; j<ukuranLarik; j++ )
		{
			System.out.print("Nilai " + NamaMhs[j] + " ||| Kode MK - " + KodeMK[j] + " = ");
			Nilai[j] = inputC();
		}
	}

	public static void cetakLarik()
	{
		for ( int j=0; j<ukuranLarik; j++ )
		{
			System.out.println(NamaMhs[j] + "	" + NIM[j] + "	" + KodeMK[j] + "	" + Nilai[j]);
		}
	}
}