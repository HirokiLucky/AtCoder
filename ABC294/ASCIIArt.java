package AtCoder.ABC294;

import java.util.Scanner;

public class ASCIIArt {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        int j = scanner.nextInt();
        Integer[][] nlist = new Integer[i][j];


        for(int x = 0; x < i; x++){
            for(int y = 0; y < j; y++){
                  nlist[x][y] = scanner.nextInt();
            }
        }


        int temp;
        for(int x = 0; x < i; x++){
            for(int y = 0; y < j; y++){
                if(nlist[x][y] == 0){
                    temp = 46;
                }else{
                    temp = nlist[x][y] + 64;
                }


                System.out.print((char)temp);
            }
            System.out.print("\n");
        }
    }
}
