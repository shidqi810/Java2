import java.util.Scanner;

class bagibebek
{	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int N,M,bagi,sisa;
		
		N = sc.nextInt();
		M = sc.nextInt();
		bagi = N / M;
		sisa = N % M;
		
		System.out.println("masing-masing " + bagi);
		System.out.println("bersisa " + sisa);
	}
}