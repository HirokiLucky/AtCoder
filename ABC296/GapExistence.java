package AtCoder.ABC296;

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.exit;

public class GapExistence {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int x = scanner.nextInt();

        ArrayList<Integer> nlist = new ArrayList<>();


        for(int i = 0; i < n; i++){
            int temp = scanner.nextInt();
            nlist.add(temp);
        }


        for(int i: nlist){
            if(nlist.contains(i - x)) {
                System.out.print("Yes");
                exit(0);
            }
        }

        System.out.println("No");
    }
}