import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 도형 1개일 때 둘레 4
        // 도형 3개일 때 둘레 8
        // 도형 6개일 때 둘레 12
        // 도형 10개일 때 둘레 16
        // 도형 15개일 때 둘레 20
        // 한 변에 *4를 해주면 둘레가 된다.
        Scanner sc = new Scanner(System.in);
        BigInteger n = BigInteger.valueOf(sc.nextInt()); // 가장 아랫부분 정사각형 개수 (1 ≤ n ≤ 109)
        System.out.println(n.multiply(BigInteger.valueOf(4)));
    }
}