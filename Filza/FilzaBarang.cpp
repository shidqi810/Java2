#include <iostream.h>
int main()
{
	int barang[] = {100000, 750000, 150000, 200000, 75000};
	int mouse, keyboard, speaker, headset, cooling, totalbayar;
	cout << "1. Mouse Optik ("<<barang[0]<<")";
	cout << "2. Keyboard ("<<barang[1]<<")";
	cout << "3. Speaker ("<<barang[2]<<")";
	cout << "4. Headset ("<<barang[3]<<")";
	cout << "5. Cooling ("<<barang[4]<<")";
	cout << endl;

	cout << "Mau Beli Mouse Optik berapa buah? = ";
	cin >> mouse;

	cout << "Mau Beli Keyboard berapa buah? = ";
	cin >> keyboard;

	cout << "Mau Beli Speaker berapa buah? = ";
	cin >> speaker;

	cout << "Mau Beli Headset berapa buah? = ";
	cin >> headset;

	cout << "Mau Beli Cooling berapa buah? = ";
	cin >> cooling;

	totalbayar =( (barang[0]*mouse) + (barang[1]*keyboard) + (barang[2]*speaker) + (barang[3]*headset) + (barang[4]*cooling) );

	cout << "Total Bayar = "<<totalbayar;
}