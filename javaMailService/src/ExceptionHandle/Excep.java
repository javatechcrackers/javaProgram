package ExceptionHandle;

public class Excep {
	
	@SuppressWarnings("finally")
	public int display(){
		try{
			//System.out.println("retrun 4");
			return 4;
			}
		catch(Exception e){
		return (Integer) null;
		}
		finally{
		//	System.out.println("retrun 5");
			return 5;
		}
	}
	
	public static void main(String[] args) {
		
		int i = new Excep().display();
		System.out.println(i);
	}

}
