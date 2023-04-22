package AtCoder.ABC291;

import javax.swing.*;
import java.util.*;

import static java.lang.System.exit;

public class LRUDInstructions2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String str = scanner.next();

        int x = 0;
        int y = 0;

        int[] xlist = new int[n + 2];
        int[] ylist = new int[n + 2];
        xlist[0] = 0;
        ylist[0] = 0;

        char[] chars = str.toCharArray();
        int num = 1;
        for(char i : chars){
            if(i == 'U') y++;
            if(i == 'D') y--;
            if(i == 'R') x++;
            if(i == 'L') x--;
            for(int j = 0; j < num; j++){
                if(xlist[j] == x && ylist[j] == y){
                    System.out.print("Yes");
                    exit(0);
                }
            }
            xlist[num] = x;
            ylist[num] = y;
            num++;
        }

        System.out.print("No");
    }
}
