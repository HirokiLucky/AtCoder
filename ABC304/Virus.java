package AtCoder.ABC304;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Virus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double n = scanner.nextDouble();
        double d = scanner.nextDouble();
        double[][] nlist = new double[(int)n][2];
        boolean[] bool = new boolean[(int)n];
        bool[0] =  true;

        for(int i = 0; i < n; i++){
            nlist[i][0] = scanner.nextDouble();
            nlist[i][1] = scanner.nextDouble();
        }

        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int i = 1; i < n; i++){
            double dtemp = Math.sqrt(Math.pow((nlist[0][0] - nlist[i][0]), 2) + Math.pow((nlist[0][1] - nlist[i][1]),2));
            if(d >= dtemp){
                bool[i] = true;
                temp.add(i);
            }
        }


        ArrayList<Integer> temp2 = new ArrayList<>();
        while (temp.size() != 0 || temp2.size() != 0){
            for(int x = 0; x < temp.size(); x++){
                for(int i = 1; i < n; i++){
                    if(bool[i]) continue;
                    double dtemp = Math.sqrt(Math.pow((nlist[temp.get(x)][0] - nlist[i][0]), 2) + Math.pow((nlist[temp.get(x)][1] - nlist[i][1]),2));
                    if(d >= dtemp){
                        bool[i] = true;
                        temp2.add(i);
                    }
                }
            }
            temp.clear();

            for(int x = 0; x < temp2.size(); x++){
                for(int i = 1; i < n; i++){
                    if(bool[i]) continue;
                    double dtemp = Math.sqrt(Math.pow((nlist[temp2.get(x)][0] - nlist[i][0]), 2) + Math.pow((nlist[temp2.get(x)][1] - nlist[i][1]),2));
                    if(d >= dtemp){
                        bool[i] = true;
                        temp.add(i);
                    }
                }
            }
            temp2.clear();
        }


        for(boolean boo : bool){
            if(boo){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
