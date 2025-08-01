package GenericCollection.sec08;
import java.util.*;
public class LinkedListEx {

	public static void main(String[] args) {
		//성능비교
		//1.List = ArrayList	2.List = LinkedList 
		//3.ArrayList = ArrayList	4.LinkedList = LinkedList
		
		List<String> listArrList = new ArrayList<String>();
		List<String> listLinkedList = new LinkedList<String>();
		
		ArrayList<String> arrayList = new ArrayList<String>();
		LinkedList<String> linkedList = new LinkedList<String>();
		
		//1.List = ArrayList
		long startTime = System.nanoTime();
		
		for(int i = 0;i<10000;i++) {
			listArrList.add(0,String.valueOf(i));
		}
		long endTime = System.nanoTime();
		System.out.println("listArrList 소요시간 : "+ (endTime - startTime)+" ns");
		
		//2.List = LinkedList 
		startTime = System.nanoTime();
		
		for(int i = 0;i<10000;i++) {
			listLinkedList.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("listLinkedList 소요시간 : "+ (endTime - startTime)+" ns");
		
		//3.ArrayList = ArrayList
		startTime = System.nanoTime();
		
		for(int i = 0;i<10000;i++) {
			arrayList.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("arrayList 소요시간 : "+ (endTime - startTime)+" ns");
		
		//4.LinkedList = LinkedList
		startTime = System.nanoTime();
		
		for(int i = 0;i<10000;i++) {
			linkedList.add(0,String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 소요시간 : "+ (endTime - startTime)+" ns");
		
	}

}
