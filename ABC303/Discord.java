package AtCoder.ABC303;

import java.util.Arrays;
import java.util.Scanner;

public class Discord {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        boolean[][] lists = new boolean[n][n];
        int[] nlist = new int[n];

        for(int i = 0; i < m; i++){
            for(int q = 0; q < n; q++){
                nlist[q] = scanner.nextInt();
            }
            for(int x = 0; x < n; x++){
                if(x == 0){
                    lists[nlist[x] - 1][nlist[x+1] - 1] = true;
                }else if(x == (n - 1)){
                    lists[nlist[x] - 1][nlist[x-1] - 1] = true;
                }else{
                    lists[nlist[x] - 1][nlist[x+1] - 1] = true;
                    lists[nlist[x] - 1][nlist[x-1] - 1] = true;
                }
            }
        }

        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(!lists[i][j])count++;
            }
        }

        int result = (count - n)/2;
        System.out.print(result);

    }
}
