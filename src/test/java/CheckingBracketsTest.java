import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CheckingBracketsTest {

    CheckingBrackets checkingBrackets = new CheckingBrackets();


    @Test
    public void shouldReturnTrueWhenStringIsEmpty(){
        //given
        String str = " ";

        //when
        boolean result = checkingBrackets.areBracketsClosing(str);

        //then
        assertTrue(result);

    }
    @Test
    public void shouldReturnTrueWhenStringHasClosingBracketsOnly(){
        //given
        String str = " {} []";

        //when
        boolean result = checkingBrackets.areBracketsClosing(str);

        //then
        assertTrue(result);

    }

    @Test
    public void shouldReturnFalseWhenStringHasOpenBracketsOnly(){
        //given
        String str = " { ( {";

        //when
        boolean result = checkingBrackets.areBracketsClosing(str);

        //then
        assertFalse(result);
    }

    @Test
    public void shouldReturnTrueIfBracketsClosedAroundOtherCharacters(){
        //given
        String str = "{To jest [kod] }";

        //when
        boolean result = checkingBrackets.areBracketsClosing(str);

        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseIfBracketsOpenAroundOtherCharacters(){
        //given
        String str = "{To jest [kod }";

        //when
        boolean result = checkingBrackets.areBracketsClosing(str);

        assertFalse(result);
    }

    @Test
    public void shouldReturnTrueForClosedMixedBrackets(){
        String str = "{Ten [kod bedzie juz (bardziej) skompikowany]}";

        //when
        boolean result = checkingBrackets.areBracketsClosing(str);

        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseForWrongBracketsClosings(){
        String str = "{Ten} [kod) bedzie juz {bardziej) skompikowany]}";

        //when
        boolean result = checkingBrackets.areBracketsClosing(str);

        assertFalse(result);
    }

}