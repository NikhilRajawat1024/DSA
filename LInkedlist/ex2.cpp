#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

// Function to generate the Playfair matrix
void generatePlayfairMatrix(string key, char matrix[5][5]) {
    key.erase(remove_if(key.begin(), key.end(), [](char c) { return !isalpha(c); }), key.end());
    key.erase(remove(key.begin(), key.end(), 'J'), key.end());
    key += "ABCDEFGHIKLMNOPQRSTUVWXYZ";

    int row = 0, col = 0;
    for (char c : key) {
        if (col == 5) {
            col = 0;
            row++;
        }
        matrix[row][col++] = c;
    }
}

// Function to encrypt plaintext using Playfair Cipher
string encryptPlayfairCipher(string plaintext, char matrix[5][5]) {
    plaintext.erase(remove_if(plaintext.begin(), plaintext.end(), [](char c) { return !isalpha(c); }), plaintext.end());
    plaintext.erase(remove(plaintext.begin(), plaintext.end(), 'J'), plaintext.end());
    for (int i = 0; i < plaintext.length(); i += 2) {
        char a = plaintext[i];
        char b = (i + 1 < plaintext.length()) ? plaintext[i + 1] : 'X';

        int rowA, colA, rowB, colB;
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                if (matrix[row][col] == a) {
                    rowA = row;
                    colA = col;
                } else if (matrix[row][col] == b) {
                    rowB = row;
                    colB = col;
                }
            }
        }

        if (rowA == rowB) {
            plaintext[i] = matrix[rowA][(colA + 1) % 5];
            plaintext[i + 1] = matrix[rowB][(colB + 1) % 5];
        } else if (colA == colB) {
            plaintext[i] = matrix[(rowA + 1) % 5][colA];
            plaintext[i + 1] = matrix[(rowB + 1) % 5][colB];
        } else {
            plaintext[i] = matrix[rowA][colB];
            plaintext[i + 1] = matrix[rowB][colA];
        }
    }
    return plaintext;
}

int main() {
    string key, plaintext;
    char matrix[5][5];

    cout << "Enter key: ";
    getline(cin, key);

    // Generate Playfair matrix
    generatePlayfairMatrix(key, matrix);

    cout << "Enter plaintext: ";
    getline(cin, plaintext);

    // Encryption
    string ciphertext = encryptPlayfairCipher(plaintext, matrix);
    cout << "Encrypted text: " << ciphertext << endl;

    return 0;
}
