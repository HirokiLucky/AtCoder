package AtCoder.practice311;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SwapOddAndEven {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String n = scanner.next();
        int leng = n.length();
        char[] nlist = new char[n.length()];


        for(int i = 0; i < leng; i++){
            char temp = n.charAt(i);
            nlist[i] = temp;
        }

        for(int i = 0; i < leng; i = i+2){
            char temp = nlist[i];
            nlist[i] = nlist[i+1];
            nlist[i+1] = temp;
        }

        for(int i = 0; i < leng; i++){
            System.out.print(nlist[i]);
        }
    }
}
