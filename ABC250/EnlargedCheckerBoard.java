import java.util.Scanner;

public class EnlargedCheckerBoard {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String point = ".";
        String sharp = "#";
        String box;
        String message = "";

        for(int i = 0; i < n; i++){
            for(int j = 0; j < a; j++){
                for(int k = 1; k <= n; k++){
                    if(k % 2 == 0){
                        message += sharp.repeat(b);
                    }else{
                        message += point.repeat(b);
                    }
                }
                System.out.print(message);
                message = "";
                System.out.print('\n');
            }
            box = point;
            point = sharp;
            sharp = box;
        }
    }
}
