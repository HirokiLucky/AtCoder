import java.util.Scanner;

public class PlacingMarbles {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();

        int count = 0;
        for (int i = 0; i < 3; i++){
            char b = a.charAt(i);
            if(b == '1'){
                count++;
            }
        }

        System.out.println(count);
    }
}
