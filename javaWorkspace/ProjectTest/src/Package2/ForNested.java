package Package2;

public class ForNested {
	public static void main(String[] args) {
		//구구단
		for(int n=2; n <= 9; n++) {
			for(int dan = 1; dan <= 9; dan++) {
				System.out.println(n + "x" + dan + "=" + n*dan +'\t');			}
		}
		System.out.println();
	}
}
