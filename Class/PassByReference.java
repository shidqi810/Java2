public class PassByReference
{
	public static void main(String[] args) 
	{
		int ages[] = {10, 20, 30};

		for (int i =0; i < ages.length; i++)
		{
			System.out.println(ages[i]);
		}

		test(ages);

		for (int i = 0; i < ages.length; i++)
		{
			System.out.println(ages[i]);
		}
	}


	public static void test(int[] arr)
	{
		//merubah nilai array
		for (int i = 0; i<arr.length; i++) 
		{
			arr[i] = i + 50;
		}
	}

}