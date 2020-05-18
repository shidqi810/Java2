import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class latihan
{
	public static void main(String[] args)
	{
		BufferedReader dataIn = new BufferedReader ( new InputStreamReader (System.in));
		try
		{
			int a, b, temp;
			a = 8;
			b = 5;

			temp = a;
			a = b;
			b = temp;

			System.out.println("Nilai a = " + a);
			System.out.println("Nilai b = " + b);

		}
		catch ( Exception e)
		{
			System.out.print("Error!");
		}
	}
}