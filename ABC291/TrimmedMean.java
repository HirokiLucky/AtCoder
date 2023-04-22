package AtCoder.ABC291;

import java.util.Arrays;
import java.util.Scanner;

public class TrimmedMean {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double n = scanner.nextDouble();
        double[] numList = new double[(int) (5 * n)];

        for(int i = 0; i < 5*n; i++){
            numList[i] = scanner.nextDouble();
        }

        Arrays.sort(numList);
        double sum = 0;
        for(double i = 0; i < 3*n; i++){
            sum += numList[(int) (n + i)];
        }

        System.out.println(sum / (3*n));
    }
}
