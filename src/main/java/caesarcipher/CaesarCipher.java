package caesarcipher;

public class CaesarCipher {

    public String decryptCipher(String str, int shift) {

        int shiftedCharacter;
        StringBuilder decrypted = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                shiftedCharacter = (int) (str.charAt(i)) + shift;
                if (shiftedCharacter > 90) {
                    decrypted.append((char) (shiftedCharacter - 26));
                }
                decrypted.append((char) (shiftedCharacter));
            }
            if(str.charAt(i) >= 97 && str.charAt(i) <= 122){
                shiftedCharacter = (int) (str.charAt(i)) + shift;
                if (shiftedCharacter > 122) {
                    decrypted.append((char) (shiftedCharacter - 26));
                }
                decrypted.append((char) (shiftedCharacter));
            }
        }
        return decrypted.toString();
    }

}
