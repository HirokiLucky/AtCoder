package AtCoder.ABC299;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TrickTaking {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int t = scanner.nextInt();
        ArrayList<Integer> clist = new ArrayList<>();
        ArrayList<Integer> rlist = new ArrayList<>();

        for(int i = 0; i < n; i++){
            clist.add(scanner.nextInt());
        }

        for(int i = 0; i < n; i++){
            rlist.add(scanner.nextInt());
        }

        if(clist.contains(t)){
            int max = 0;
            int count = 0;
            int save = 0;
            for(int temp : clist){
                count++;
                if(temp == t){
                    if(max < rlist.get(count - 1)){
                        max = rlist.get(count - 1);
                        save = count;
                    }
                }
            }
            System.out.print(save);
        }else{
            int max = 0;
            int count = 0;
            int save = 0;
            for(int temp : clist){
                count++;
                if(temp == clist.get(0)){
                    if(max < rlist.get(count - 1)){
                        max = rlist.get(count - 1);
                        save = count;
                    }

                }
            }
            System.out.print(save);
        }


    }
}
