import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt(); // 앨범에 수록된 곡의 개수
        int I = sc.nextInt();
        Math.ceil(I); // 평균값 (저작권 멜로디 수 / 앨범 멜로디 수)
        int result = 0;
        result = result/A;
        System.out.println(A * (I-1) + 1);
    }
}