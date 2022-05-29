import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt(); // 1제곱미터 당 사람 수 (1 ≤ L ≤ 10)
        int P = sc.nextInt(); // 파티가 열린 곳의 넓이 (1 ≤ P ≤ 1000)
        int[] article = new int[5];
        for(int i = 0; i<5; i++){
            article[i] = sc.nextInt();
        }
        int result = 0;
        for(int i = 0; i<5; i++){
            result = article[i]-L*P;
            System.out.println(result);
        }
    }
}