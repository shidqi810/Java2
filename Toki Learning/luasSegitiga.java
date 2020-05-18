import java.util.Scanner;
import java.text.DecimalFormat;

class luasSegitiga {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double A = sc.nextDouble();
		double T = sc.nextDouble();

		double luas = A * T / 2;

		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println(df.format(luas));
	}
}