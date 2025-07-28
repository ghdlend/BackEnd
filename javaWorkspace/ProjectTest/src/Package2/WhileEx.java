package Package2;
import java.util.Scanner;
public class WhileEx {

	public static void main(String[] args) {
		// 사용자가 숫자 7을 입력할 때까지 계속 입력받는 예제
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 입력 : ");
		int num = sc.nextInt();
		
		//while과 for는 반복 시작 전 조건검사
		while(num != 7) {
			System.out.println("다시 입력 : ");
			num = sc.nextInt();
		}
		sc.close();
	}

}
