#include <iostream>
#include <vector>
#include <string>
#include <cmath>

using namespace std;

int c2n(char c) { return c - 'A'; }
char n2c(int n) { return n + 'A'; }
int det(vector<vector<int>> &k) { return k[0][0] * k[1][1] - k[0][1] * k[1][0]; }
void inv(vector<vector<int>> &k)
{
    int d = det(k), d_i = -1;
    for (int x = 1; x < 26; x++)
        if ((d * x) % 26 == 1)
        {
            d_i = x;
            break;
        }
    if (d_i == -1)
        return;
    int t = k[0][0];
    k[0][0] = k[1][1];
    k[1][1] = t;
    k[0][1] = (k[0][1] * -1) % 26;
    if (k[0][1] < 0)
        k[0][1] += 26;
    k[1][0] = (k[1][0] * -1) % 26;
    if (k[1][0] < 0)
        k[1][0] += 26;
    for (int i = 0; i < 2; i++)
        for (int j = 0; j < 2; j++)
        {
            k[i][j] = (k[i][j] * d_i) % 26;
            if (k[i][j] < 0)
                k[i][j] += 26;
        }
}
string enc(string p, vector<vector<int>> &k)
{
    string c = "";
    int n = k.size(), pad = n - (p.length() % n);
    if (pad != n)
        for (int i = 0; i < pad; i++)
            p += 'X';
    for (int i = 0; i < p.length(); i += n)
    {
        vector<int> b;
        for (int j = 0; j < n; j++)
            b.push_back(c2n(p[i + j]));
        for (int j = 0; j < n; j++)
        {
            int s = 0;
            for (int k1 = 0; k1 < n; k1++)
                s += k[j][k1] * b[k1];
            c += n2c(s % 26);
        }
    }
    return c;
}
string dec(string c, vector<vector<int>> &k)
{
    string p = "";
    int n = k.size();
    vector<vector<int>> k_i = k;
    inv(k_i);
    for (int i = 0; i < c.length(); i += n)
    {
        vector<int> b;
        for (int j = 0; j < n; j++)
            b.push_back(c2n(c[i + j]));
        for (int j = 0; j < n; j++)
        {
            int s = 0;
            for (int k = 0; k < n; k++)
                s += k_i[j][k] * b[k];
            p += n2c(s % 26);
        }
    }
    return p;
}

int main()
{
    string pt = "HELLO";
    vector<vector<int>> key = {{3, 2}, {5, 7}};
    string et = enc(pt, key);
    cout << "Encrypted: " << et << endl;
    string dt = dec(et, key);
    cout << "Decrypted: " << dt << endl;
    return 0;
}
