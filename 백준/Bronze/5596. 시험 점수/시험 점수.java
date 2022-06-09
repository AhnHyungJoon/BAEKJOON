import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sums = 0;
        int sumt = 0;
        // 민국이의 총점을 구하는 코드
        for (int i = 0; i < 4; i++){
            int S = sc.nextInt(); // 민국이의 점수 입력
            sums = sums + S;
        }
        // 만세의 총점을 구하는 코드
        for (int i = 0; i < 4; i++){
            int T = sc.nextInt(); // 만세의 점수 입력
            sumt = sumt + T;
        }
        // 출력
        // 서로 동점이거나 민국이의 점수가 더 높을 경우
        if(sums >= sumt){
            System.out.println(sums);
        }
        // 만세의 점수가 더 높을 경우
        else {
            System.out.println(sumt);
        }
    }
}
