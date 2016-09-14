package persistent.prestige;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        int a = 10;// 00000000 00000000 00000000 00001010
        printinf(a);
    }
    
    
    private static final void printinf(int a ) {
    	System.out.println(Integer.toBinaryString(a));
    }
}
