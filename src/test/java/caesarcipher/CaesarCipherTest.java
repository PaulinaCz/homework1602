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


   @Test
    public void shouldDecryptFullInput(){
       //given
       String str = "Ala ma kota!";
       int shift = 1;
       String expectedOutput = "Bmb nb lpub!";

       //when
       String result = cipher.decryptCipher(str, shift);

       //then
       assertEquals(expectedOutput, result);
   }
   @Test
   public void shouldDecryptFullInputOfASCIIHighValueLetters(){
      //given
      String str = "WXYZ!";
      int shift = 7;
      String expectedOutput = "DEFG!";

      //when
      String result = cipher.decryptCipher(str, shift);

      //then
      assertEquals(expectedOutput, result);
   }

}