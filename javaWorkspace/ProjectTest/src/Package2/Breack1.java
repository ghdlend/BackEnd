package Package2;

public class Breack1 {
	public static void main(String[] args) {
		//숫자를 출력하면서 출력되는 숫자가 20 초과면 출력을 종료
		int i = 0;
		
		while(true) {
			i+=3;
			
			if(i>20)
				break;
			
			System.out.println(i);
		}	
	}
}
