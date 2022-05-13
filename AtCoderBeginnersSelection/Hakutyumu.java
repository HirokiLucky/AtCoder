import java.util.Scanner;

public class Hakutyumu {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();


        while (!s.equals("")){
            String s5 = "";
            String s6 = "";
            String s7 = "";
            String s8 = "";
            String s9 = "";
            if(s.length() == 5){
                s5 = s.substring(0, 5);
            }else if(s.length() == 6){
                s6 = s.substring(0, 6);
            }else if(s.length() == 7){
                s7 = s.substring(0, 7);
            }else if(s.length() < 5){
                System.out.println("NO");
                System.exit(0);
            }else{
                s5 = s.substring(0, 5);
                s6 = s.substring(0, 6);
                s7 = s.substring(0, 7);
                s8 = s.substring(5, 8);
                s9 = s.substring(5, 6);
            }


            if ("dream".equals(s5)) {
                if("dre".equals(s8)){
                    s = s.substring(5);
                }else if("era".equals(s8)){
                    s = s.substring(5);
                }else if("ere".equals(s8)){
                    s = s.substring(7);
                }else if("erd".equals(s8)){
                    s = s.substring(7);
                }else if("".equals(s8)){
                    break;
                }else{
                    System.out.println("NO");
                    System.exit(0);
                }
            }else if("erase".equals(s5)){
                if("d".equals(s9)){
                    s = s.substring(5);
                }else if("e".equals(s9)){
                    s = s.substring(5);
                }else if("r".equals(s9)){
                    s = s.substring(6);
                }else if("".equals(s9)){
                    break;
                }else{
                    System.out.println("NO");
                    System.exit(0);
                }
            }else if("eraser".equals(s6)){
                s = s.substring(6);
            }else if("dreamer".equals(s7)){
                s = s.substring(7);
            }else{
                System.out.println("NO");
                System.exit(0);
            }
        }
        System.out.println("YES");
    }
}
