/**
 * 
 */
package pkk.Static;

/**
 * @author PrashantK
 *
 */
public class StaticDemo {
static int a=3;
static String name="ravi";

static void  display(){
	System.out.println("static method");
}

	public StaticDemo() {
		System.out.println("Constructor" +  a + " " + name);
	}
 static{
	 System.out.println("Static Blok " + a + " " + name);
 }
	
	public static void main(String[] args) {
	System.out.println(StaticDemo.a);	
	System.out.println(StaticDemo.name);
	StaticDemo.display();
	StaticDemo s= new StaticDemo();
	
	

	}

}
