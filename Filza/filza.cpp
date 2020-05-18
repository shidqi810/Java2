#include <iostream.h>
int main()
{
	int n, i, j, k;
	cout << "n = ";
	cin >> n;
	k = 1;
	for ( i = 1; i <= 10; i++ )
	{
		while ( i == n)
		{
			i++;
			cout << "1 2 3 4 5 6 7 8 9";
		}		
		
		for ( j = 1; j <= 9; j++ )
		{
			while ( j == n)
			{
				j++;
				cout << k++ << " ";
			}
		cout << "*" << " ";
		}
		cout << endl;
	}
}