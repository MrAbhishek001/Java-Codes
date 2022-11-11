#include <iostream>
using namespace std;

int AP(int n);
int main()
{
    int n;
    cout << "Enter any Number : ";
    cin >> n;
    int ans = AP(n);
    cout << ans << endl;
}

int AP(int n)
{
    return (3 * n) + 7;
}