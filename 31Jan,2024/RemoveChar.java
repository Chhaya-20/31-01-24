import java.util.*;

public class RemoveChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string ");
        String s = sc.nextLine();
        System.out.println("Enter char ");
        // char c = scanner.next.charAt(0);
        char c = sc.next().charAt(0);
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != c) {
                ans = ans + s.charAt(i);
            }
        }
        System.out.println(ans);
        sc.close();

    }
}
