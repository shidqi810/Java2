import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class HitungFrek
{
	static int Larik[] = new int[1000];
	static int n;
	static int modus;
	
	public static void main(String[] args)
	{
		System.out.print("Inputkan Jumlah n Larik = ");
		n = inputData();
	
		bacaLarik();
		
		System.out.println("");
		
		cetakLarik();
		
		System.out.println("");
		
		FungsiModus();
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
		for ( int j=0; j<n; j++ )
		{
			System.out.print("Larik Ke - " + (j+1) + " = ");
			Larik[j] = inputData();
		}
	}
		
	private static void cetakLarik()
	{
		for ( int j = 0; j<n; j++ )
		{
			System.out.println("Larik ke - " + (j+1) + " = " + Larik[j]);
		}
	}
	
	public static void FungsiModus()
	{
		int i, FrekModus, KandidatModus, FrekKandidatModus;
		boolean MasihSama;
		
		FrekModus = 0;
		i = 0;
		while (i<n)
		{
			KandidatModus = Larik[i];
			FrekKandidatModus = 1;
			i = i+1;
			MasihSama = true;
			
			while ((MasihSama) && (i<n))
			{
				if (Larik[i] == KandidatModus)
				{
					FrekKandidatModus = FrekKandidatModus + 1;
					i = i +1;
				}
				else
				{
					MasihSama = false;
				}
			}
			
			if (FrekKandidatModus >= FrekModus)
			{
				modus = KandidatModus;
				FrekModus = FrekKandidatModus;
			}
		}
		
		System.out.println("Modus Dari Data Tersebut Adalah = " + modus);
		System.out.println("Dengan Frekuensinya = " + FrekModus);
	}
}