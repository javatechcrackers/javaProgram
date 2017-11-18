package test;

class ABC extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	ABC(String s){
		super(s);
	}
}
class XYZ extends ABC{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	XYZ(String s){
		super(s);
}
public static class ExceptionMain extends XYZ {

	

	ExceptionMain(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XYZ xyz = new XYZ(null);
		//xyz.serialVersionUID;
	}
	void main1(String s)throws ABC {
		throw new  XYZ("Exception in main");
		// TODO Auto-generated constructor stub
	}
}
}
