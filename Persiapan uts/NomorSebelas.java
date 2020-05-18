import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class NomorSebelas
{
	static int []Larik = new int [25];
	static int ukuranLarik;
	static int nilaiX;
	
	public static void main(String[] args){
		System.out.print("Input jumlah n Larik = ");
		ukuranLarik = inputData();
		
		bacaLarik();
		
		CetakLarik ();
		
	}
	
	private static int inputData()
	{
		BufferedReader bfr = new BufferedReader
		( new InputStreamReader(System.in));
		
		String angkaInput = null;
		try {
			angkaInput = bfr.readLine();
		} catch (IOException e){
			e.printStackTrace();
		}
		
		int Data = Integer.valueOf(angkaInput).intValue();
		return Data;
	}
											
	private static void bacaLarik()
	{
		for(int j=0; j < ukuranLarik; j++){
			System.out.print("Masukan Larik ke - " + (j+1) +" = ");
			Larik[j] = inputData();
				
			}
		}
	
	private static void CetakLarik()
	{
		boolean sama = false;

		for ( int j = 0; j <ukuranLarik; j++ )
		{
			System.out.println(" Larik ke - " + (j+1) + " = " + Larik[j]);
		
		}

		for ( int j = 0; j <ukuranLarik; j++ )
		{
			if ((Larik[j] != Larik[j+1]) && (!sama))		
			{
				sama = true;
			}
			else
			{
				sama = false;
			}
		}

		if (sama)
		{
			System.out.print("Larik Sama");
		}
		else
		{
			System.out.print("Larik Tidak Sama");
		}

	}
}