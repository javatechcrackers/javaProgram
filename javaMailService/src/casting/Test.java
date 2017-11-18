package casting;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		System.out.println("1.Animal - Animal\t");
		a.display();
		Dog a1 = new Dog();
		System.out.println("2. Dog - Dog\t");
		a1.display1();
		a1.display();
		
		Animal a2 = new Dog();    //upcasting
		System.out.println("3.Animal - Dog\t");
		a2.display();
		
		Dog d= new Dog();   //downcast
		Animal an =(Dog) d;
		
		Dog d1 = (Dog) an;
		
		System.out.println("4.Dog - Animal \t");
		d1.display();
		d1.display1();
		
		Dog d9 = (Dog) new Animal();
		System.out.println("Dog - Animal \t");
		d9.display();
		
		Animal an1 =new Dog();
		Dog d10 = (Dog) an;
		
		
		
	}

}
