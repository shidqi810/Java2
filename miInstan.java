public class miInstan {
	public static void main(String[] args) {
		int minyak, air, gas, kompor, kuali, tirisan, bumbu, mie, uang, piring, hargaMie, beli;

		//semua dalam satuan Liter

		minyak = 10;
		air = 20;

		gas = 1;
		kompor = 1;
		kuali = 1;
		tirisan = 1;
		bumbu = 2;
		mie = 1;

		uang = 10000;
		hargaMie = 2500;
		piring = 1;

		beli = uang - hargaMie;

		int masak = beli + air + kompor + gas + kuali + mie;

		int jadi = masak + tirisan + bumbu;

		int hidangan = jadi + piring;

		System.out.print(hidangan);
	}
}