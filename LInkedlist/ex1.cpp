#include <iostream>
#include <string>

using namespace std;

// Function to encrypt plaintext using Caesar Cipher
string encryptCaesarCipher(string plaintext, int shift) {
    string ciphertext = "";
    for (char &c : plaintext) {
        if (isalpha(c)) {
            char shifted = (islower(c)) ? 'a' + (c - 'a' + shift) % 26 : 'A' + (c - 'A' + shift) % 26;
            ciphertext += shifted;
        } else {
            ciphertext += c; // non-alphabetic characters remain unchanged
        }
    }
    return ciphertext;
}

// Function to decrypt Caesar Cipher ciphertext
string decryptCaesarCipher(string ciphertext, int shift) {
    return encryptCaesarCipher(ciphertext, 26 - shift); // decryption is simply encryption with opposite shift
}

int main() {
    string plaintext, ciphertext;
    int shift;

    cout << "Enter plaintext: ";
    getline(cin, plaintext);

    cout << "Enter shift (positive integer): ";
    cin >> shift;

    // Encryption
    ciphertext = encryptCaesarCipher(plaintext, shift);
    cout << "Encrypted text: " << ciphertext << endl;

    // Decryption
    string decryptedText = decryptCaesarCipher(ciphertext, shift);
    cout << "Decrypted text: " << decryptedText << endl;

    return 0;
}
