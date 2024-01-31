import java.util.*;

public class CompressString {
    public static void main(String[] args) {
        System.out.println("Enter string ");
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String ans = "";
        char c = s.charAt(0);
        int cnt = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                cnt++;
            } else {
                ans = ans + c + cnt;
                cnt = 1;
                c = s.charAt(i);

            }

        }
        ans = ans + c + cnt;
        System.out.println(ans);
        sc.close();
    }

}
