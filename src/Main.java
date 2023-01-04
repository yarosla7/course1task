import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

        String toCut = "коты";
        toCut = toCut.replace(" ", "");
        char[] twoWords = toCut.toCharArray();

        for (int i = 0; i < twoWords.length / 2; i++) {
            System.out.print(twoWords[i]);
        }
        System.out.print(" ");
        for (int i = twoWords.length / 2; i <= twoWords.length - 1; i++) {
            System.out.print(twoWords[i]);
        }
    }
}