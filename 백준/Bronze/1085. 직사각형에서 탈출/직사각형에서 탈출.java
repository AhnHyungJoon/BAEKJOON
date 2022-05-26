import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int w=sc.nextInt();
        int h=sc.nextInt();

        int result1, result2, result3, result4;
        if (w-x > x) {
            result1 = x;
        }else {
            result1 = w-x;
        }
        if (h-y > y){
            result2 = y;
        }else {
            result2 = h-y;
        }
        System.out.println(Math.min(result1, result2));
    }
}