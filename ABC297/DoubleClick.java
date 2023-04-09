package AtCoder.ABC297;

import java.util.Scanner;

public class DoubleClick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        int n = Integer.parseInt(scanner.next());
        int d = Integer.parseInt(scanner.next());
        int[] nlist = new int[n];

        for(int i = 0; i < n; i++){
            nlist[i] = Integer.parseInt(scanner.next());
        }

        for(int i = 1; i < n; i++){
            if(nlist[i] - nlist[i - 1] <= d){
                System.out.print(nlist[i]);
                System.exit(0);
            }
        }
        System.out.print(-1);
    }
}
