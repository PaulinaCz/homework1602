package caesarcipher;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CaesarCipherTest {

    CaesarCipher cipher = new CaesarCipher();

   @Test
    public void shouldReturnEmptyStringForEmptyMessage(){
       //given
       String str = "";
       int shift = 5;
       String expectedOutput = "";
       //when
       String result = cipher.decryptCipher(str,shift);
       //then
       assertEquals(expectedOutput, result );
   }

   @Test
    public void shouldDecryptOneWordString(){
       //given
       String str = "AbcdefG";
       int shift = 1;
       String expectedOutput = "BcdefgH";

       //when
       String result = cipher.decryptCipher(str, shift);

       //then
       assertEquals(expectedOutput, result);
   }

}