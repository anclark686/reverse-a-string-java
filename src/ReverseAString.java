import java.util.Scanner;
import java.util.Arrays;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        char[] chrArray = str.toCharArray();
        String newStr = "";
        for (int i = chrArray.length; i > 0; i--) {
            newStr += chrArray[i-1];
        }
        System.out.println(newStr);
//        System.out.println(Arrays.toString(chrArray));
    }
}
