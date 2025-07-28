package Package2;

public class Continue {

	public static void main(String[] args) {
		// 짝수만 출력하고 홀수는 skip
		for(int i =1; i<=10;i++) {
			if(i%2 != 0) {
				continue;
			}
			System.out.println(i);
		}

	}

}
