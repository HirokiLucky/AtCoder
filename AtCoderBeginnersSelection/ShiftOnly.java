import java.util.Scanner;

public class ShiftOnly {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();


        int[] nlist = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++){
            nlist[i] = scanner.nextInt();
        }

        boolean bool = true;
        while (bool){
            for (int i = 0; i < n; i++){
                if(nlist[i] % 2 == 0){
                    continue;
                }else{
                    System.out.println(count);
                    bool = false;
                    break;
                }
            }
            for(int j = 0; j < n; j++){
                nlist[j] = nlist[j]/2;
            }
            count++;
        }
    }
}
