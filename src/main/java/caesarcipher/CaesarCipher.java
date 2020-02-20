package caesarcipher;

public class CaesarCipher {

    public String decryptCipher(String str, int shift) {

        int shiftedCharacter;
        StringBuilder decrypted = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                shiftedCharacter = (int) (str.charAt(i)) + shift;
                if (shiftedCharacter > 90) {
                    decrypted.append((char) (shiftedCharacter - 26));
                } else {
                    decrypted.append((char) (shiftedCharacter));
                }
            }
            else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                shiftedCharacter = (int) (str.charAt(i)) + shift;
                if (shiftedCharacter > 122) {
                    decrypted.append((char) (shiftedCharacter - 26));
                } else {
                    decrypted.append((char) (shiftedCharacter));
                }
            }
            else {
                decrypted.append(str.charAt(i));
            }
        }
        return decrypted.toString();
    }

}
