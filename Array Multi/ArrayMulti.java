public class ArrayMulti
{
	public static void main(String[] args)
	{
		String alamat[][] = {{"Florence", "735-1234", "Manila"},
							{"Joyce", "983-3333", "Quezon city"},
							{"Becca", "456-3322", "Manila"}};
							
		System.out.println("Nama	: " + alamat[0][0]);
		System.out.println("Telpon	: " + alamat[0][1]);
		System.out.println("Alamat	: " + alamat[0][2]);
		System.out.println("");
		System.out.println("Nama	: " + alamat[1][0]);
		System.out.println("Telpon	: " + alamat[1][1]);
		System.out.println("Alamat	: " + alamat[1][2]);
		System.out.println("");
		System.out.println("Nama	: " + alamat[2][0]);
		System.out.println("Telpon	: " + alamat[2][1]);
		System.out.println("Alamat	: " + alamat[2][2]);
	}
}