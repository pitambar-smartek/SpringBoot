
import java.util.ArrayList;
import java.util.List;


public class ListDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		List list=new ArrayList();
		String st="pita";
		System.out.println(list.add(st));
		System.out.println(list.add("pita"));
		System.out.println(list.add(st));
		
		System.out.println(list.isEmpty());
		List li=null;
		li=new ArrayList();
		li.add(st);
		System.out.println(list.retainAll(li));

	}

}
