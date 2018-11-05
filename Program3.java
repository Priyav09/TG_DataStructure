import java.util.LinkedList;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> arrl = new LinkedList<String>();
		arrl.add("First");
		arrl.add("Second");
		arrl.add("Third");
		arrl.add("Random");
		System.out.println(arrl);
		
		arrl.push("Zero");							//push the string
		System.out.println(arrl);
		
		arrl.pop();									//pop the element from linkedlist 
		System.out.println(arrl);
		
	}
}
