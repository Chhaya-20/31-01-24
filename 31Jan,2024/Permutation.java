import java.util.*;

public class Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter strings ");
        String s1 = sc.nextLine().toUpperCase();
        String s2 = sc.nextLine().toUpperCase();

        // APPROACH 1

        // int[] a = new int[100];
        // boolean f = false;
        // if (s1.length() != s2.length()) {
        // System.out.println("Not perm");
        // } else {

        // char str1[] = (s1).toCharArray();
        // char str2[] = (s2).toCharArray();
        // Arrays.sort(str1);
        // Arrays.sort(str2);

        // if (Arrays.equals(str1, str2)) {
        // f = true;

        // }

        // }
        // if (f)
        // System.out.println("Perm");
        // else
        // System.out.println("NO");

        // APPROACH 2

        int[] a = new int[27];
        for (int i = 0; i < 27; i++) {
            a[i] = 0;
        }
        // int a[] = { 0 };
        boolean f = false;
        // System.out.println(ascii - 65);
        for (int i = 0; i < s1.length(); i++) {
            int asc = s1.charAt(i) - 65;
            int asc2 = s2.charAt(i) - 65;
            // System.out.print(asc + " " + asc2);

            a[asc]++;
            a[asc2]--;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (a[i] != 0) {
                f = true;
                break;
            }
        }
        if (!f)
            System.out.println("Perm");
        else
            System.out.println("NO");

        sc.close();

    }
}
