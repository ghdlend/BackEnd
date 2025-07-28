package arrayType;
import java.util.*;
public class ArrayCopyOf {

	public static void main(String[] args) {
		// Arrays.copyOf(원본배열, 복사되는 배열의 크기);
		int[] a = {1,2,3,4};
		int[] b = Arrays.copyOf(a,a.length);
		//int[] b = Arrays.copyOf(a,7); //원본보다 길이보다 크게 복사하면 0으로 채움
		//int[] b = Arrays.copyOf(a,2); //원보의 원소 앞에 2개를 복사함
		
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
