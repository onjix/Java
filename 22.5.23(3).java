//22.5.23 ArrayList
import java.util.ArrayList;
import java.util.Scanner;

public class CP3 {
	public static void main(String[] args) {
		ArrayList <String> a = new ArrayList();
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<4;i++) {
			System.out.print("이름을 입력하세요>>");
			a.add(scan.next());
		}
		
		for(int i=0;i<4;i++) {
			System.out.print(a.get(i) + " ");
		}
		
		int big = 0;
		for(int i=0;i<4;i++) {
			if(big < a.get(i).length()) {
				big = i;
			}
		}
		System.out.println("\n가장 긴 이름은 : " +  a.get(big));
		scan.close();
	}
}
