import java.util.*;

public class jumlah
{	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Masukkan Nilai N = ");
		int n = sc.nextInt();

		int jumlah = 0;
		for (int i = 1; i <= n; i++)
		{
			jumlah = jumlah + i;
		}

		for (int i = 1; i <= n; i++)
		{
			System.out.print(i + " ");
		}

		System.out.println("");
		System.out.println("Jumlahnya adalah = " + jumlah);
	}
}