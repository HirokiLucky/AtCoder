import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class KagamiMochi {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] nlist = new int[n];
        int count = 0;

        for(int i = 0; i < n; i++){
            nlist[i] = scanner.nextInt();
        }

        Set set = new HashSet();
        for(int i: nlist){
            set.add(i);
        }


        System.out.println(set.stream().count());
    }
}
