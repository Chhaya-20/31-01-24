import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string ");
        String s = sc.nextLine();
        int i = 0, j = (s.length() - 1);
        Boolean f = true;
        while (i <= j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                f = false;
                break;
            }

        }
        // System.out.println(f);
        if (!f) {
            System.out.println("Not palindrome ");
        } else {
            System.out.println("Palindrome");
        }
        sc.close();
    }

}
