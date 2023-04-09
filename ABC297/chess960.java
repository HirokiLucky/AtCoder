package AtCoder.ABC297;

import java.util.Scanner;

public class chess960 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        String str = scanner.next();
        char[] strlist = str.toCharArray();

        int b = 0, r1 = 10, r2 = 0, k = 0;

        for(int i = 0; i < strlist.length; i++){
            if(strlist[i] == 'B'){
                b += i;
            }else if(strlist[i] == 'K'){
                k = i;
            }else if(strlist[i] == 'R' && r1 == 10){
                r1 = i;
            }else if(strlist[i] == 'R' && r1 != 10){
                r2 = i;
            }
        }

        if(b % 2 == 1){
            if(r1 < k && k < r2){
                System.out.print("Yes");
                System.exit(0);
            }
        }
        System.out.print("No");
    }
}
