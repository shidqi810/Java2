import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class suhu
{
	public static void main(String[] args)
	{
		BufferedReader dataIn = new BufferedReader ( new InputStreamReader (System.in));
		try
		{
			String suhu;
			int s;
			
			System.out.print("Masukkan Suhu Air (Derajat Celcius) = ");
			suhu = dataIn.readLine();
			s = Integer.parseInt(suhu);

			if (s <= 0)
			{
				System.out.println("Dalam Kedaan Padat ");
			}
			else if ( (s > 0) && (s < 100) )
			{
				System.out.println("Dalam Kedaan Cair ");
			}
			else if (s >= 100)
			{
				System.out.println("Dalam Kedaan Gas ");
			}
		}
		catch (IOException e)
		{
			System.out.print("Error!");
		}
	}
}