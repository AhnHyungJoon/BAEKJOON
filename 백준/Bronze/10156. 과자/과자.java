import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt(); // 과자 한 개 가격
        int N = sc.nextInt(); // 사려고 하는 과자 개수
        int M = sc.nextInt(); // 현재 가진 돈의 액수

        // 만약 M >= K*N 이라면 0; 출력
        if(M >= K*N){
            System.out.println(0);
        }
        // 만약 M < K*N 이라면 K*N - M 출력
        else if(M < K*N){
            System.out.println(K*N - M);
        }
    }
}