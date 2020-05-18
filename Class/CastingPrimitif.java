public class CastingPrimitif
{
	public static void main(String[] args)
	{
		int a = 10; //casting implicit
		double b = a; // nilai double b menjadi 10.00
		System.out.println(b);


		double c = 10.98; //casting implicit
		int d = c; //nilai d menjadi 10
		System.out.println(d);


		char valChar = 'C'; //casting explicit
		int valInt = valChar;
		System.out.println(valInt);

		int nilaiAngka = 65; //casting explicit
		char nilaiHuruf = nilaiAngka;
		System.out.println(nilaiHuruf); // char nilaiHuruf menjadi 'C'


		double contohDouble = 10.12; //casting explicit
		int contohInt = (int)contohDouble; //konversi valDouble ke Integer
		System.out.println(contohInt);


		double x = 20.23; // type casting
		int y = 4;
		int hasil = (int)(x/y);
		System.out.println(hasil); //hasil nya menjadi bilangan bulat karena berformat integer


	}
}