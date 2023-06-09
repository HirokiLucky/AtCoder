package AtCoder.ABC300;

import java.util.Scanner;

public class NChoiceQuestion {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.next());
        int a = Integer.parseInt(scanner.next());
        int b = Integer.parseInt(scanner.next());

        int num  = a + b;

        for(int i = 0; i < n; i++){
            int c = Integer.parseInt(scanner.next());
            if(num == c) System.out.print(i + 1);
        }
    }
}
