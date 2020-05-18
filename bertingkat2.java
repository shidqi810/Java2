import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class bertingkat
{
	public static void main(String[] args)
	{
		BufferedReader dataIn = new BufferedReader ( new InputStreamReader (System.in));
		try
		{
			String input;
			int n, i, j, k;
			
			System.out.print("n = ");
			input = dataIn.readLine();
			n = Integer.parseInt(input);
			k = 1;
			for ( i = 1; i <= 10; i++ )
			{
				while ( i == n)
				{
					i++;
					System.out.print("1 2 3 4 5 6 7 8 9");
				}
			
				for ( j = 1; j <= 9; j++ )
				{
					while ( j == n)
					{
						j++;
						System.out.print(k++ + " ");
					}
					System.out.print("* ");
				}
				System.out.println("");
			}
		}
		catch (IOException e)
		{
			System.out.print("Error!");
		}
	}
}