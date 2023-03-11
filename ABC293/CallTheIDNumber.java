package AtCoder.practice311;

import java.util.ArrayList;
import java.util.Scanner;

public class CallTheIDNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        boolean[] nlist = new boolean[n];

        for(int i = 0; i < n; i++){
            nlist[i] = true;
        }

        for(int i = 0; i < n; i++){

            int temp = scanner.nextInt();
            if(nlist[i]){
                nlist[temp - 1] = false;
            }
        }

        int temp = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(nlist[i]){
                temp++;
                arrayList.add(i + 1);
            }
        }

        System.out.println(temp);
        for(int i = 0; i < arrayList.size(); i++){
            System.out.print(arrayList.get(i) + " ");
        }
    }
}
