import java.util.*;

public class pitagoras {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Masukkan Sisi a = ");
		double a = sc.nextDouble();
		System.out.print("Masukkan Sisi b = ");
		double b = sc.nextDouble();

		a = Math.pow(a,2);
		b = Math.pow(b,2);

		double c = Math.sqrt(a+b);

		System.out.print("Hasil sisi c adalah = " + c);
	}
}