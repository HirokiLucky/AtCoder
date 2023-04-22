package AtCoder.ABC292;

import java.util.ArrayList;
import java.util.Scanner;

public class FourVariables {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        for(int i = 1; i < n; i++){
            for(int j = 1; j < n; j++){
                if(n > (i * j)){
                    arrayList.add(n - (i * j));
                }
            }
        }

        int sum = 0;

        for(int num : arrayList){
            int element = 0;
            for (int i = 1; i < num + 1; i++) {
                if (num % i == 0) {
                    element++;
                }
            }
            sum += element;
        }
        System.out.println(sum);
    }
}
