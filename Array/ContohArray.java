public class ContohArray
{
	public static void main(String[] args)
	{
		int i;
		int A [] = new int[8];
		A[0] = 1;
		A[1] = 2;
		A[2] = 3;
		A[3] = 4;
		A[4] = 5;
		//Array[4] Berarti mempunyai 5 kamar
		//karena kamar Array dimulai Dari Kamar bernomor 0
		
		for ( i = 0; i<A.length; i++)		
		{
			System.out.print(i + " ");
			System.out.println( A[i] );
		}
	}
}