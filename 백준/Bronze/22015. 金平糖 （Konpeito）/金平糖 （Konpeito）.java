import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); // 아오이가 먹은 金平糖 개수
        int B = sc.nextInt(); // 린이 먹은 金平糖 개수
        int C = sc.nextInt(); // 리에 선생님이 먹은 金平糖 개수
        int eat, num1, num2 = 0; // 제일 많이 먹은 개수
        int result = 0;

        // 먹은 금평당의 개수가 동일하기 위해 몇개를 더 먹어야하는지를 출력해라

        if (A>=B && A>=C){
            eat = A;
        } else if (B>=A && B>=C) {
            eat = B;
        } else {
            eat = C;
        }

        if (eat == A){
            num1 = A - B;
            num2 = A - C;
        } else if (eat == B) {
            num1 = B - A;
            num2 = B - C;
        } else {
            num1 = C - A;
            num2 = C - B;
        }
        result = num1 + num2;
        System.out.println(result);
    }
}
