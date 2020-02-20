public class Main {
    public static void main(String[] args) {

        CheckingBrackets checkingBrackets = new CheckingBrackets();

        System.out.println(checkingBrackets.areBracketsClosing("{] (}"));
        System.out.println(checkingBrackets.areBracketsClosing("{} ([])"));
        System.out.println(checkingBrackets.areBracketsClosing("{czy[ ten} ([kod) {]jest poprawny?}"));
        System.out.println(checkingBrackets.areBracketsClosing("(To {jest} [kod])"));
        System.out.println(checkingBrackets.areBracketsClosing("{A)l{e]nie]dziala[]"));
    }
}
