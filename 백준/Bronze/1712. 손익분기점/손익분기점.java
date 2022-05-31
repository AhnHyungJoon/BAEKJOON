import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger A = BigInteger.valueOf(sc.nextInt()); // 고정비용 (한번만 더함)
        BigInteger B = BigInteger.valueOf(sc.nextInt()); // 가변비용 (노트북 한 대마다 더함)
        BigInteger C = BigInteger.valueOf(sc.nextInt()); // 노트북 가격
        // 만약 손익분기점이 존재하지 않으면 -1 출력 (C<=B)
        // A / (C - B) + 1 == 손익분기점
        if(C.compareTo(B) == -1){ // C가 B보다 작은 경우
            System.out.println(-1);
        }
        else if(C.compareTo(B) == 0){ // C와 B가 같은 경우
            System.out.println(-1);
        }else{
            BigInteger same = A.divide(C.subtract(B));
            System.out.println(same.add(BigInteger.valueOf(1)));
        }
    }
}