import java.util.Scanner;

public class ArrayMulti2
{
	public static void main(String[] args)
	{
		int array[][] = new int [25][25];
		int jumlahBaris, jumlahKolom, i, j;

		Scanner masukan = new Scanner(System.in);
		
		System.out.print("Masukkan Jumlah Baris Matriks = ");
		jumlahBaris = masukan.nextInt();
		
		System.out.print("Masukkan Jumlah Kolom Matriks = ");
		jumlahKolom = masukan.nextInt();
		
		for ( i = 0; i<jumlahBaris; i++ )
		{
			for ( j = 0; j<jumlahKolom; j++ )
			{
				System.out.print("Masukkan Isi Baris Matriks Ke - " + (i+1) + " " + "Kolom ke - " + (j+1) + " = ");
				array[i][j] = masukan.nextInt();
			}	
		}
		
		System.out.println();
		System.out.println("Bentuk Matriksnya Adalah = ");
		for ( i = 0; i<jumlahKolom; i++ )
		{
			j = 0;
			while (j < jumlahKolom) {
				System.out.print(array[i][j] + " ");
				j++;
			}
			System.out.println(" ");
		}

		char a = 'p';
		char b = 'i';
		while (a == b) {
			System.out.println("A dan B sama");
		}

	}
}