package AtCoder.ABC304;

import java.util.Arrays;
import java.util.Scanner;

public class FirstPlayer {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String[] str = new String[n];
        int[] age = new int[n];
        int small = Integer.MAX_VALUE;
        int num = 0;

        for(int i = 0; i < n; i++){
            str[i] = scanner.next();
            age[i] = scanner.nextInt();

            if(age[i] < small){
                num = i;
                small = age[i];
            }
        }

        for(int i = 0; i < n; i++){
            int out = num + i;
            if(num+i >= n){
                out = num + i - n;
            }
            System.out.println(str[out]);
        }
    }
}
