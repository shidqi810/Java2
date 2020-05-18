import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class MatrikFungsi
{
	static int array[][] = new int [25][25];
	static int jumlahBaris, jumlahKolom, i, j;
	
	public static void main(String[] args)
	{
		System.out.print("Masukkan Jumlah Baris Matriks = ");
		jumlahBaris = inputData();
		
		System.out.print("Masukkan Jumlah Kolom Matriks = ");
		jumlahKolom = inputData();
		
		bacaMatriknya();
		
		System.out.println("");
		System.out.println("Hasil Matriks Anda Adalah = ");
		System.out.println("");
		
		cetakMatriknya();
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
	
	public static void bacaMatriknya()
	{
		for ( i = 0; i<jumlahBaris; i++ )
		{
			for ( j = 0; j<jumlahKolom; j++ )
			{
				System.out.print("Masukkan Isi Baris Matriks Ke - " + (i+1) + " " + "Kolom ke - " + (j+1) + " = ");
				array[i][j] = inputData();
			}	
		}
	}
	
	private static void cetakMatriknya()
	{
		for ( i = 0; i<jumlahBaris; i++ )
		{
			for ( j = 0; j<jumlahKolom; j++ )
			{
				System.out.print(array[i][j] + " ");
			}
			System.out.println(" ");
		}
	}
}