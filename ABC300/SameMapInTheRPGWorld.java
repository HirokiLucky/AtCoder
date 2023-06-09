package AtCoder.ABC300;

import AtCoder.ABC296.Chessboard;

import java.util.ArrayList;
import java.util.Scanner;

public class SameMapInTheRPGWorld {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int h = Integer.parseInt(scanner.next());
        int w = Integer.parseInt(scanner.next());

        ArrayList<ArrayList<Character>> heighta = new ArrayList<>();
        ArrayList<ArrayList<Character>> heightb = new ArrayList<>();


        for(int i = 0; i < h; i++){
            String str = scanner.next();
            ArrayList<Character> width = new ArrayList<>();
            char[] tempList = str.toCharArray();
            for (char temp : tempList){
                width.add(temp);
            }
            heighta.add(width);
        }

        for(int i = 0; i < h; i++){
            String str = scanner.next();
            ArrayList<Character> width = new ArrayList<>();
            char[] tempList = str.toCharArray();
            for (char temp : tempList){
                width.add(temp);
            }
            heightb.add(width);
        }

        for(int i = 0;  i < h; i++){
            for(int j = 0; j < w; j++){
                //Print(h, heighta, heightb);
                if(Check(h, heighta, heightb)){
                    System.out.print("Yes");
                    System.exit(0);
                }else{
                    for(int x = 0; x < h; x++){
                        char tempc = heighta.get(x).get(0);
                        heighta.get(x).add(tempc);
                        heighta.get(x).remove(0);
                    }
                }
            }
            ArrayList<Character> tempArray = heighta.get(0);
            heighta.add(tempArray);
            heighta.remove(0);
        }
        System.out.print("No");
    }

    static boolean Check(int h, ArrayList<ArrayList<Character>> a, ArrayList<ArrayList<Character>> b){
        for(int i = 0; i < h; i++){
            ArrayList<Character> tempa = a.get(i);
            ArrayList<Character> tempb = b.get(i);
            for (int j = 0; j < tempa.size(); j++){
                if(tempa.get(j) != tempb.get(j)){
                    return false;
                }
            }
        }
        return true;
    }

    static void Print(int h, ArrayList<ArrayList<Character>> a, ArrayList<ArrayList<Character>> b){
        for(int i = 0; i < h; i++){
            ArrayList<Character> tempa = a.get(i);
            for (int j = 0; j < tempa.size(); j++){
                System.out.print(tempa.get(j));
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
}
