import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class CardGameForTwo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        Integer[] nlist = new Integer[n];

        int alice = 0;
        int bob = 0;
        int sub;

        for(int i = 0; i < n; i++){
            nlist[i] = scanner.nextInt();
        }

        Arrays.sort(nlist, Collections.reverseOrder());

        for (int i = 1; i <= n; i++){
            if(i % 2 == 0){
                bob += nlist[i - 1];
            }else{
                alice += nlist[i - 1];
            }
        }

        sub = alice - bob;
        System.out.println(sub);
    }
}
