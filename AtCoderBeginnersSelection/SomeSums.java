import java.util.Scanner;

public class SomeSums {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int count = 0;

        for(int i = 1; i <= n; i++){
            //各桁
            int sum = 0;
            int i1 = i;
            boolean bool = true;
            while (i1 != 0){
                sum = sum + i1 % 10;
                i1 = i1 / 10;
            }

            if(a <= sum && b >= sum){
                count = count + i;
            }
        }

        System.out.println(count);
    }
}
