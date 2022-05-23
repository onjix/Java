//22.5.23 Iterator
 import java.util.Vector;
 import java.util.Iterator;
 
public class CP4 {
	public static void main(String[] args) {
		var v = new Vector<Integer>();
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2, 100);
		
		int sum = 0;
		Iterator <Integer> it = v.iterator();
		while(it.hasNext()) {
			int n = it.next();
			System.out.println(n);
			sum += n;
		}
		
		System.out.print("백터에 있는 정수 합 : " + sum);
	}
}
