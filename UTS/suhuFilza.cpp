#include <iostream.h>
int main()
{
	int suhu;
	cout << "Masukkan Suhu Air (Derajat Celcius) = ";
	cin >> suhu;
	if (suhu <= 0)
	{
		cout << "Dalam Kedaan Padat"<<endl;
	}
	else if (suhu > 0 && suhu < 100)
	{
		cout << "Dalam Kedaan Cair"<<endl;
	}
	if (suhu >= 100)
	{
		cout << "Dalam Kedaan gas"<<endl;
	}
}

PROGRAM Suhu
{Mendefinisikan Jenis Bahan Berdasarkan Suhu Air Yang Di Inputkan}

Deklarasi:
	suhu : integer {angka yang di baca}

Algoritma:
	write ("Masukkan Suhu Air")
	read(suhu)

	if (suhu <= 0) then
		write ("Dalam Kedaan Padat")
	else if (suhu > 0 && suhu < 100) then
		write ("Dalam Kedaan Cair")
	else if (suhu >= 100) then
		write ("Dalam Kedaan Gas")
	end if
	end if
	end if