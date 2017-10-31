#include "stdafx.h"
#include <iostream>
#include <math.h>
#include<windows.h>

using namespace std;

double count_numerator(double n);
double count_denumerator(double n);

int main()
{
	double Low_border, High_border, Step, Pohubka, Dodanok, Suma, i;
	int  n;
	Suma = 0;
	Dodanok = 0;
	cout << "Please write low border: ";
	cin >> Low_border;
	cout << "Please write hight border: ";
	cin >> High_border;
	cout << "Please write step: ";
	cin >> Step;
	cout << "Please write pohubka: ";
	cin >> Pohubka;
	double numerator = 0;
	double denumerator = 0;
	for (i = Low_border; i - Step <= High_border; i += Step) {
		n = 1;
		Dodanok = 0;
		while (Dodanok <= Pohubka) {
			numerator = count_numerator(n);
			denumerator = count_denumerator(n);
			Dodanok = numerator / denumerator;
			Suma += Dodanok;
			n++;
		}
		cout << "x=" << i << "  result=" << i + Suma << endl;
	}
	system("pause");
	return 0;
}
double count_numerator(double n) {
	double i, result;
	result = 1;
	for (i = 1; i <= (2 * n - 1); i += 2) {
		result = result*i;
	}
	return result;
}
double count_denumerator(double n) {
	double i, result;
	result = 1;
	for (i = 2; i <= (2 * n*(2 * n + 1)); i += 2) {
		result = result*i;
	}
	return result;

}