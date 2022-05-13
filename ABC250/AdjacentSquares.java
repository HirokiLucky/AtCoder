import java.util.Scanner;

public class AdjacentSquares {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int r = scanner.nextInt();
        int c = scanner.nextInt();

        int north = Math.abs(r - 1);
        int south = Math.abs(r + 1);
        int west = Math.abs(c - 1);
        int east = Math.abs(c + 1);
        int count = 4;

        if(0 >= north){
            count--;
        }
        if(h < south){
            count--;
        }
        if (0 >= west){
            count--;
        }
        if (w < east) {
            count--;
        }
        System.out.println(count);
    }
}
