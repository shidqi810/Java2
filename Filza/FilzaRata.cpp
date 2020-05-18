#include <iostream.h>
int main()
{
	int Larik[50];
	int n, i, jumlah, rata, maks;
	cout << "Masukkan Banyaknya n Larik = ";
	cin >> n;

	for (int i = 0; i < n; ++i)
	{
		cout << "Masukkan Nilai Larik Ke - "<<i+1<<" = ";
	}

	cout << "Hasil Dari ";
	for ( i = 0; i<n; i++ )
	{
		cout << Larik[i];
		if (i<n)
		{
			cout << " + ";
		}
	}

	for ( i = 0; i<n; i++ )
	{
		jumlah = jumlah + Larik[i];
	}

	cout << " = " <<jumlah;

	rata = jumlah / n;

	cout << "Rata Rata Nilai = " << rata;

	maks = -9999;
			
	for ( i=0; i<n; i++ )
	{	
		if ( Larik[i] > maks )
		{
			maks = Larik[i];
		}
	}

	cout <<"Nilai Terbesar = " << maks;
}