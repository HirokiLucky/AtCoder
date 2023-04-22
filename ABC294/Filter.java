package AtCoder.ABC294;

import java.util.Scanner;

public class Filter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int num = 0;
        Integer[] nlist = new Integer[n];


        for(int i = 0; i < n; i++){
            int temp = scanner.nextInt();
            if(temp % 2 == 0){
                nlist[num] = temp;
                num++;
            }
        }



        for(int i = 0; i < num; i++){
            System.out.print(nlist[i] + " ");
        }
    }
}
