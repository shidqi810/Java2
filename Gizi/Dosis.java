import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Dosis
{
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
	
	public static void main(String[] args)
	{
		BufferedReader dataIn = new BufferedReader ( new InputStreamReader ( System.in));
		
		double dosis, umur, hasil, pemakaian;
			
		System.out.println("Program Hitung Dosis Pemakaian");
		System.out.println("");
		System.out.print("Masukkan Nama Anda = ");
		String nama = null;
		try
		{
			nama = dataIn.readLine();
		}
		catch ( IOException e )
		{
			e.printStackTrace();
		}
		
		System.out.println("");
		System.out.print("Masukkan Umur Anda = ");
		umur = inputData();
		
		System.out.println("");
		System.out.print("Masukkan Jumlah Pemakaian Anda = ");
		pemakaian = inputData();
		
		if (( umur >= 0) && ( umur <= 8))
		{
			dosis =	(umur+12)*pemakaian;
		}
		else
		{
			dosis = (umur/20)*pemakaian;
		}
		
		System.out.println("");
		System.out.println("Dosis nya adalah = " + dosis);
	}
}