package AtCoder.ABC299;

import java.util.Scanner;

public class TreasureChest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String str = scanner.next();
        char[] nlist = str.toCharArray();

        int count = 0;
        for(char c : nlist){
            if(c == '*' && count == 1){
                System.out.print("in");
                System.exit(0);
            }else if(c == '|'){
                count++;
            }
        }
        System.out.print("out");
    }
}
