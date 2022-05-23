//22.5.23 Vector컬렉션(2)
import java.util.Vector;

class Point {
	int x, y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "("+x+", "+y+")";
	}
}
public class CP2 {
	public static void main(String[] args) {
		Vector <Point> v = new Vector();
		
		v.add(new Point(2, 3));
		v.add(new Point(-5, 20));
		v.add(new Point(30, -8));
		
		v.remove(1);
		
		for(int i=0;i<v.size();i++) {
			System.out.println(v.get(i));
		}
	}
}
