package AtCoder.ABC304;

import java.util.Arrays;
import java.util.Scanner;

public class Subscribers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String str  = scanner.next();
        char[] c = str.toCharArray();

        if(c.length >= 4){
            for(int i = 0; i < c.length - 3; i++){
                c[i + 3] = '0';
            }
        }

        for(char cc : c){
            System.out.print(cc);
        }

    }
}
