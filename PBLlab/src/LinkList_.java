import java.util.Iterator;
import java.util.LinkedList;

public class LinkList_ {

	public static void main(String[] args) {
		LinkedList<Integer> obj = new LinkedList<>();
		obj.add(43);
        obj.add(41);
		obj.add(42);
		obj.add(43);
		obj.add(44);
		obj.add(43);

		
		Iterator<Integer> it = obj.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("Clearing elements");
		
		obj.remove(2);
		if(obj.contains(43)) {
			obj.removeFirstOccurrence(43);
			obj.removeFirstOccurrence(43);
			obj.removeFirstOccurrence(43);
			obj.removeFirstOccurrence(43);
			obj.removeFirstOccurrence(43);
		
		}
		System.out.println(obj.getFirst());//getting first element
		System.out.println(obj.clone());
		
	}

}
