package randomEx;

public class RandomNum1 {

	public static void main(String[] args) {
		// 랜던숫자 생성 - 1.Math.random();
		for(int i = 1;i<=10;i++) {
			double num = Math.random();
			int num1 = (int)(Math.random() * 10);
			int num2 = (int)(Math.random() * 10 +1);
			System.out.println(num);
			System.out.println(num1);
			System.out.println(num2);
		}

	}

}
