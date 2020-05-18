import java.io.*;

public class FilzaBarang
{
	static int Larik[] = {100000, 750000, 150000, 200000, 75000};
	static int mouse, keyboard, speaker, headset, cooling, i, j, totalbayar;
	
	public static void main(String[] args)
	{
		System.out.println("1. Mouse Optik (" + Larik[0] + ")");
		System.out.println("2. Keyboard (" + Larik[1] + ")");
		System.out.println("3. Speaker (" + Larik[2] + ")");
		System.out.println("4. Headset (" + Larik[3] + ")");
		System.out.println("5. Cooling (" + Larik[4] + ")");

		System.out.println("");

		System.out.print("Mau Beli Mouse Optik berapa buah? = ");
		mouse = inputData();

		System.out.print("Mau Beli Keyboard berapa buah? = ");
		keyboard = inputData();

		System.out.print("Mau Beli Speaker berapa buah? = ");
		speaker = inputData();

		System.out.print("Mau Beli Headset berapa buah? = ");
		headset = inputData();

		System.out.print("Mau Beli Cooling berapa buah? = ");
		cooling = inputData();	

		totalbayar =( (Larik[0]*mouse) + (Larik[1]*keyboard) + (Larik[2]*speaker) + (Larik[3]*headset) + (Larik[4]*cooling) );

		System.out.println("");
		
		System.out.println("Total Bayar = " + totalbayar);
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
	
}