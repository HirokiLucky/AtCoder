package AtCoder.ABC299;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Dango {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String str = scanner.next();
        char[] nlist = str.toCharArray();


        int count = 0;
        int stickCount = 0;
        int save = 0;
        boolean bool = false;
        ArrayList<Integer> temp = new ArrayList<>();
        for(char c : nlist){
            if(c == 'o' && stickCount == 0){
                count++;
            }else if(c == '-' && count == 0){
                stickCount++;
            }else if(c == 'o' && stickCount != 0){
                count++;
            }else if(c == '-' && count != 0){
                stickCount++;
            }
        }
    }
}
