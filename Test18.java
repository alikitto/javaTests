package SaraHomeWork;

public class Test18 {
String proverka;
String wordOne;
public static String reverseStringWithCharAt(String inputString) {
        int stringLength = inputString.length();
        String result = "";
        for (int i = 0; i < stringLength; i++) {
            result = inputString.charAt(i) + result;
        }
        return result;
    }
    public static void main(String[] args) {
        String wordOne = "radar";
        String wordProverka = reverseStringWithCharAt(wordOne);
        if (wordOne.equals(wordProverka)){
            System.out.println("Слово " + wordOne +" Можно читать наоборот");
        } else {
            System.out.println("Слово " + wordOne +" НЕ читается наоборот");
        }
    }

}
