package org.pkk.demopart;

public  class Abstract extends Abstract1 implements Interface1{

	


	public static void main(String[] args) {
		Interface1 i = new Abstract();
		Abstract1 a = new Abstract();
		i.xyz();
		i.xyz1();
		i.xyz2();
		a.xyz3();
		a.xyz2();
		}

		@Override
	public void xyz2() {
		// TODO Auto-generated method stub
		System.out.println("xyz2");
	}

	@Override
	public void xyz() {
		// TODO Auto-generated method stub
		System.out.println("xyz");
	}

	@Override
	public void xyz1() {
		// TODO Auto-generated method stub
		System.out.println("xyz1");
	}



}
