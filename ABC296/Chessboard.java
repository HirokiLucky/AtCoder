package AtCoder.ABC296;

import java.util.Objects;
import java.util.Scanner;

import static java.lang.System.exit;

public class Chessboard {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        char[] nlist = {'a','b','c','d','e','f','g','h'};

        for(int i = 0; i < 8; i++){
            String str = scanner.next();
            char[] c = str.toCharArray();
            for(int j = 0; j < 8; j++){
                if(c[j] == '*'){
                    int num = 8 - i;
                    char temp = nlist[j];
                    System.out.print(temp);
                    System.out.print(num);
                    exit(0);
                }
            }
        }
    }
}
