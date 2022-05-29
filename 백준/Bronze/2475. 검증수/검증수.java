import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int result1 = (int) Math.pow(a, 2);
        int result2 = (int) Math.pow(b, 2);
        int result3 = (int) Math.pow(c, 2);
        int result4 = (int) Math.pow(d, 2);
        int result5 = (int) Math.pow(e, 2);
        int sum = result1 + result2 + result3 + result4 + result5;
        int result = sum % 10;
        System.out.println(result);
    }
}