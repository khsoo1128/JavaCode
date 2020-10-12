class D {

	D(){
		System.out.println("D-1()");
		m1();
		System.out.println("D-2()");
	}
	void m1(){
		System.out.println("m1-1()");
		m2();
		System.out.println("m1-2()");
	}
	void m2(){
		System.out.println("m2()");
	}
	public static void main(String[] args) 
	{
		System.out.println("main0()");
		D d = new D();
		System.out.println("main1()");
		d.m1();
		System.out.println("main2()");
	}
}
