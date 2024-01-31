import java.util.*;

public class RemoveConsecutive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string ");
        String s = sc.nextLine();
        String ans = "";
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                ans = ans + s.charAt(i - 1);

            }
        }
        int l = ans.length();
        if (ans.charAt(l - 1) != s.charAt(s.length() - 1)) {
            ans = ans + s.charAt(s.length() - 1);
        }
        System.out.println(ans);
        sc.close();
    }
}
