package arrayType;
import java.util.Arrays;
public class ArrayCopyOfRange {

	public static void main(String[] args) {
		// Arrays.copyOfRange(원본배열, 시작인덱스, 끝인덱스+1) 
		int a[] = {1,2,3,4};
		int[] b = Arrays.copyOfRange(a,1,3);
		
		// 원본 배열 출력
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        // 복사본 배열 출력
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+ " ");
        }
        System.out.println();

        // 복사본 값 변경
        b[0] = 10;

        // 변경 후 원본 배열 출력 (변경 없음)
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+ " ");
        }
        System.out.println();

        // 변경 후 복사본 배열 출력 (변경 반영)
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+ " ");
        

	}
	}

}
