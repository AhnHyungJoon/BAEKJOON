import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger(); //가진 돈
        BigInteger m = sc.nextBigInteger(); // 돈을 받으러 온 생명체의 수
        sc.close();
        System.out.println(n.divide(m));
        System.out.println(n.remainder(m));

    }
}