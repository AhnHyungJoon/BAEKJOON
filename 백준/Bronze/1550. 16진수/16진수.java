import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        sc.close();
        int result = Integer.parseInt(a, 16);
        System.out.println(result);
    }
}