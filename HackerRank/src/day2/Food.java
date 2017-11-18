package day2;

import java.util.Scanner;

class Food {
	public void serveFood(){
		 System.out.println("I'm serving Food");
	}
	Integer f;
	String [] arr = new String[size];
	
}
class FastFood extends Food {
    public void serveFood()
    {
        System.out.println("I'm serving FastFood");
    }
}
class Fruit extends Food {
     public void serveFood()
    {
        System.out.println("I'm serving Fruit");
    }
}

class FoodFactory extends Food {
    Food f;
    public Food getFood(String fo){
        if("FastFood".equals(fo)){
            f = new FastFood();
        }
        if("Fruit".equals(fo)){
            f =  new Fruit();
        }
         return f;
    }
   
}

