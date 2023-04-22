package AtCoder.ABC296;

import java.util.Objects;
import java.util.Scanner;

import static java.lang.System.exit;

public class Alternately {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        String n = scanner.next();

        char[] nlist = n.toCharArray();


        char diff = nlist[0];
        for(int i = 1; i < nlist.length; i++){
            if(diff != nlist[i]){
                diff = nlist[i];
            }else{
                System.out.print("No");
                exit(0);
            }
        }

        System.out.print("Yes");
    }
}
