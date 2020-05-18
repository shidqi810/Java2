import java.util.Scanner;

class kangaro
{	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int X1[] = new int[1000];
		int X2[] = new int[1000];

		int x1 = sc.nextInt();
		int v1 = sc.nextInt();

		int x2 = sc.nextInt();
		int v2 = sc.nextInt();

		for (int i = x1; i <= 100; i+=v1) {
			X1[i] = i;
		}

		for (int j = x2; j <= 100; j+=v2) {
			X2[j] = j;
		}

		boolean bisa = false;
		for (int k=1; k<=100; k++ ) {
			if ( (X1[k] == X2[k]) && (X1[k] != 0) && (X2[k] != 0) )  {
				bisa = true;
				break;
			}
		}

		System.out.println(bisa);
	}
}