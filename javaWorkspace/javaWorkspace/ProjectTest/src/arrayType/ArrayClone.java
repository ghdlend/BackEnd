package arrayType;

public class ArrayClone {

	public static void main(String[] args) {
		// Object.clone() 메소
		int[] a = {1,2,3,4};
		int[] b = a.clone();
		
		

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
