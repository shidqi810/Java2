import java.util.*;

public class jumlah2
{	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		char lagi;
		int n;

		int jumlah = 0;
		int i = 1;
		do
		{
			System.out.print("Masukkan Nilai N = ");
			n = sc.nextInt();
			jumlah = jumlah + n;

			i++;

			System.out.print("Lagi ? = ");
			lagi = sc.next().charAt(0);
		} while (( lagi != 't') && ( lagi == 'y'));

		System.out.println("");
		System.out.println("Jumlahnya adalah = " + jumlah);
	}
}