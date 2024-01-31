import java.util.*;

public class Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string ");
        String s = sc.nextLine();
        // int i = 0, j = (s.length() - 1);
        Vector<String> ans = new Vector<>();
        for (int i = 0; i < s.length(); i++) {
            String t = "";
            for (int j = i; j < s.length(); j++) {

                t = t + s.charAt(j);
                ans.add(t);

            }
        }
        sc.close();
        System.out.println(ans);
    }

}
