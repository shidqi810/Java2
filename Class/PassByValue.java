public class PassByValue
{
	public static void main(String[] args)
	{
		int i = 10;
		System.out.println(i);
		//mencetak nilai i

		//memanggil method test
		//passing i pada method test
		test(i);

		//mencetak nilai i
		System.out.println(i);
	}

	public static void test(int j)
	{
		//merubah nilai j
		j = 30;
	}
}