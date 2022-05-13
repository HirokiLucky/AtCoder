import java.util.Scanner;

public class Security {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int s = scanner.nextInt();

        int a = s/1000;
        int b = (s/100) % 10;
        int c = (s/10) % 10;
        int d = s % 10;

        if(a == b){
            System.out.println("Bad");
        } else if (b == c) {
            System.out.println("Bad");
        } else if (c == d) {
            System.out.println("Bad");
        }else{
            System.out.println("Good");
        }
    }
}
