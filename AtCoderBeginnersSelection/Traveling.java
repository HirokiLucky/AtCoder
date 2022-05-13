import java.util.Scanner;

public class Traveling {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        int y = 0;
        int lengthx, lengthy, sum;
        int box = 0;
        int oddEven1, oddEven2;
        int n = scanner.nextInt();

        for(int j = 0; j < n; j++){
            int[] nums = new int[3];
            for(int i = 0; i < 3; i++){
                nums[i] = scanner.nextInt();
            }


            lengthx = Math.abs(nums[1] - x);
            lengthy = Math.abs(nums[2] - y);
            sum = lengthx + lengthy;

            if(nums[0] - box == sum){
                x = nums[1];
                y = nums[2];
                box = nums[0];
                continue;
            }else if(nums[0] - box < sum){
                System.out.println("No");
                System.exit(0);
            } else{
                oddEven1 = (nums[0] - box) % 2;
                oddEven2 = sum % 2;
                if(oddEven1 == oddEven2){
                    x = nums[1];
                    y = nums[2];
                    box = nums[0];
                    continue;
                }else {
                    System.out.println("No");
                    System.exit(0);
                }
            }
        }
        System.out.println("Yes");

    }
}
