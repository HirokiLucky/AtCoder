import java.util.Scanner;

public class BiteEating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int l = scanner.nextInt();

        int[] nlist = new int[n];

        for(int i = 0; i < n; i++){
            nlist[i] = l + (i + 1) - 1;
        }

        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += nlist[i];
        }

        int min;
        int abs;
        int box = Integer.MAX_VALUE;
        int boxmin = 0;
        for(int i = 0; i < n; i++){
            min = sum - nlist[i];
            abs = Math.abs(sum - min);
            if(box > abs){
                box = abs;
                boxmin = min;
            }
        }

        System.out.println(boxmin);
    }
}