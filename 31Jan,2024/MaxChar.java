import java.util.*;

public class MaxChar {
    public static void main(String[] args) {
        HashMap<Character, Integer> mp = new HashMap<>();
        System.out.println("Enter string ");
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int n = s.length();

        char ans = '0';

        int cnt = 0;

        for (int i = 0; i < n; i++) {

            char c = s.charAt(i);
            mp.put(c, mp.getOrDefault(c, 0) + 1);

            if (cnt < mp.get(c)) {
                ans = c;
                cnt = mp.get(c);
            }
        }
        System.out.println(ans);
        sc.close();

    }

}
