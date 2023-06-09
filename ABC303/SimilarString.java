package AtCoder.ABC303;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class SimilarString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String strs = scanner.next();
        char[] s = strs.toCharArray();

        String strt = scanner.next();
        char[] t = strt.toCharArray();

        for(int i = 0; i < n; i++){
            if(s[i] == t[i]) continue;
            if((s[i] == '1' && t[i] == 'l') || (s[i] == 'l' && t[i] == '1')) continue;
            if((s[i] == '0' && t[i] == 'o') || (s[i] == 'o' && t[i] == '0')) continue;
            System.out.print("No");
            System.exit(0);
        }
        System.out.print("Yes");
    }
}
