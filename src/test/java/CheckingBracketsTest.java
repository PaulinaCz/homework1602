import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CheckingBracketsTest {

    CheckingBrackets checkingBrackets = new CheckingBrackets();


    @Test
    public void shouldReturnTrueIfCodeIsEmpty(){
        //given
        String str = " ";

        //when
        boolean result = checkingBrackets.areBracketsClosing(str);

        //then
        assertTrue(result);

    }

}