import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        각 숫자 사이에는 1cm의 여백이 들어가야한다.
//        1은 2cm의 너비를 차지해야한다. 0은 4cm의 너비를 차지해야한다. 나머지 숫자는 모두 3cm의 너비를 차지한다.
//        호수판의 경계와 숫자 사이에는 1cm의 여백이 들어가야한다.
        String in = "";
        int result = 0;
        ArrayList<String> input = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        // 입력값을 arraylist에 저장
        while (true) {
            in = sc.next();
            if (in.equals("0")){
                break;
            }
            input.add(in);
        }
        // 문자열 lsit의 size만큼 반복
        for (String s : input) {

            // 문자열 길이만큼 반복
            for (int i=0; i < s.length(); i++){

            // if문으로 s.charAt()가 0일 경우 4+1
                if (s.charAt(i) == '0'){
                    result += 5;
                }

            // else if s가 1일 경우 2+1,
                else if (s.charAt(i) == '1') {
                    result += 3;
                }

                // else 나머지는 3+1씩 더해준다.
                else {
                    result += 4;
                }
            }
            // 마지막에 맨 앞에서 더해주지 않은 1을 더해줘야한다.
            result += 1;
            System.out.println(result);
            result = 0;
        }
    }
}
