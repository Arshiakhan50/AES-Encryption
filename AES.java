package Text;

public class AES{
	

	public static void main(String[] args) {
		// Put custom message and key
		String key = "2B7E151628AED2A6ABF7158809CF4F3C";
		String message= "3243F6A8885A308D313198A2E0370734";
		key = key.toUpperCase();
		message = message.toUpperCase();
		KeyGen kg = new KeyGen();
		Conversion conv = new Conversion();
		kg.expandKey(key);
		
		Encryption enc = new Encryption();
		message = enc.enCipher(message, kg.roundKey);
		enc.deCipher(message, kg.roundKey);
		
		
	}

}
