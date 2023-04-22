package AtCoder.ABC294;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class MargeSequences {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        Integer[] xlist = new Integer[x];
        Integer[] ylist = new Integer[y];
        Integer[] xylist = new Integer[x + y];


        for(int i = 0; i < x; i++){
            xlist[i] = scanner.nextInt();
        }
        for(int i = 0; i < y; i++){
            ylist[i] = scanner.nextInt();
        }

        System.arraycopy(xlist, 0, xylist, 0, x);
        System.arraycopy(ylist, 0, xylist, x, y);

        Arrays.sort(xylist);

        int xnum = 0;
        int ynum = 0;
        Integer[] xsslist = new Integer[x];
        Integer[] ysslist = new Integer[y];
        for(int i = 0; i < x + y; i++){
            if(Objects.equals(xylist[i], xlist[xnum])){
                xsslist[xnum] = i;
                if(xnum < x - 1) xnum++;

            }else{
                ysslist[ynum] = i;
                ynum++;
            }
        }

        for(int i = 0; i < x; i++){
            System.out.print(xsslist[i] + 1 + " ");
        }
        System.out.print("\n");
        for(int i = 0; i < y; i++){
            System.out.print(ysslist[i] + 1 + " ");
        }
    }
}
