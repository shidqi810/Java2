import java.io.*;

public class awal
{	
	public static void main(String[] args)
	{
		inputData();
	}
	
	public static void inputData()
	{
		BufferedReader dataIn = new BufferedReader ( new InputStreamReader ( System.in));
		
		String Input = null;
		try
		{
			Input = dataIn.readLine();
		}
		catch ( IOException e )
		{
			System.out.print("Error!");
		}
		System.out.println(Input);
	}
}