# Network-Security
![image](https://github.com/Arshiakhan50/Network-Security/assets/142938717/db230e69-d5dc-4ac0-b808-300a9343ec17)

This project provides an implementation of the AES (Advanced Encryption Standard) encryption algorithm in Java. AES is a widely used encryption standard known for its strong security features. This implementation showcases the encryption and decryption process using the AES algorithm.

Conversion Class:

    Converts between hexadecimal and binary representations.
    Handles various bitwise operations (XOR) and provides helper methods for conversion and manipulation.
    Offers functions to perform byte-wise left and right rotations, as well as matrix transposition.

Encryption Class:

    Implements AES encryption operations including SubBytes (substitute bytes using S-box), ShiftRows (byte-wise row shifting), MixColumns (mixing columns using matrix multiplication), and AddRoundKey (XOR with round key).
    Provides methods for both encryption (enCipher) and decryption (deCipher) using the AES algorithm.
    Utilizes helper methods for key mixing, transposition, substitution, and more.

KeyGen Class:

    Generates and manages round keys for the AES algorithm using a key expansion process.
    Implements the expandKey method to generate all 11 round keys from an initial encryption key.
    Uses the getRoundKey method to compute each round key by applying transformations, including left rotations, S-box substitution, and XOR with round constants.

AES Class:

    Contains the main method that serves as the entry point for the program.
    Demonstrates the use of the other classes by creating instances, generating round keys, and performing encryption and decryption.
    Initializes an initial key and message state to demonstrate the AES encryption and decryption process.
