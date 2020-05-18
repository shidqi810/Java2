import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class notigaUTS
{
	static int [] Larik = new int [25];
	static int ukuranLarik;
	static int nilaiX;
	
	public static void main(String[] args){
		System.out.print("Input jumlah n Larik = ");
		ukuranLarik = inputData();
		
		bacaLarik();
		
		urutsisip();
		
		CetakLarik ();
		
	}
	
	private static int inputData(){
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
	
	private static void bacaLarik(){
		for(int j=0; j < ukuranLarik; j++){
			System.out.print("Masukan Larik ke - " + (j+1) +" = ");
				Larik[j] = inputData();
				
			}
		}
	
	private static void urutsisip ()
	{
		int j = 0;
		int y = 0;
		boolean ketemu = false;
			
		for(int i=0; i <= (ukuranLarik-1); i++)
		{
			y = Larik[i];
			j = i-1;
			ketemu = false;
			
			while ((j>=0) && (!ketemu))
			{
			
				if (y > Larik [j])
				{
				 Larik[j+1] = Larik[j];
				 j = j-1;
				}
				else 
				{
					ketemu = true;
				}
			Larik [j+1] = y;
			}
		}
	}

	private static void CetakLarik(){
		for ( int j = 0; j <ukuranLarik; j++ )
		{
			System.out.println(" Larik ke - " + (j+1) + " = " + Larik[j]);
		
		}
		System.out.println ("Nilai Terbesar Pertama = " + Larik[0]);
		System.out.println ("Nilai Terbesar Kedua =   " + Larik[1]);
	}
}