package GenericCollection.sec06;
import java.util.*;
public class ArrayListExample {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList();
		
		for(int i = 0;i<4;i++) {
			System.out.print("단어를 입력하세요 >> ");
			Scanner sc = new Scanner(System.in);
			String inputStr = sc.next();
			list.add(inputStr);  
		}
		System.out.println("------------------------------");
		
		for(String word : list) {
			System.out.print(word+ " ");
		}
		System.out.println();
		String longest = "";
		for(String word : list) {
			if(longest.length()<word.length()) {
				longest = word;
			}
		}
		System.out.println("가장 긴 문자열는?" + longest);
		System.out.println("가장 긴 문자열의 수는?"+longest.length());
		
		
	}
	
}
