package persistent.prestige;

import java.util.HashMap;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

//		int a = 10;// 00000000 00000000 00000000 00001010
//		printinf(a);
		
		
		HashMap a = new HashMap();
		a.put("test", "test");
		
		
		
		
		System.out.println("end");
		
	}

	private static final void printinf(int a) {
		System.out.println(Integer.toBinaryString(a));
	}
}
