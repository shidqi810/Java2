import java.util.Scanner;

public class Televisi { 
	public static void main(String[] args) {
		int channel =0;
		String saluran[] = new String[100];
		saluran[8] = "CTV";

		Scanner sc = new Scanner(System.in);

		System.out.print("Saluran=");
		int nomorSaluran = sc.nextInt();
		System.out.println(saluran[nomorSaluran]);

		while (nomorSaluran != 0) {
			System.out.print("(n=next)(p=prev)");
			char tombol = sc.next().charAt(0);

			if (tombol == 'n') {
				channel = nomorSaluran + 1;
			}
			else if (tombol == 'p') {
				channel = nomorSaluran - 1;
			}
			System.out.println(channel]);
			System.out.println("Saluran Sekarang = " + saluran[channel]);
		}
	}
}