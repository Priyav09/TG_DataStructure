import java.util.Vector;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vec = new Vector<String>();
		vec.add("First");
		vec.add("Second");
		vec.add("Third");
		vec.add("Random");
		
		String[] strArray = new String[vec.size()];
		vec.toArray(strArray);								// converts vector into string array
		
		System.out.println("Elements in String Array");
		for(String s : strArray) {
			System.out.println(s);
		}
	}

}
