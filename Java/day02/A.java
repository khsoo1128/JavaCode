//import java.lang.*;

class A { 
	A(){ //생성자(Constructor)
		//System.out.println("철수 탄생!!");
	}
	void m(){ //메소드(Method)
		System.out.println("학교에 간다");
	}
	String name = "철수"; //멤버변수(Attribute)
	int age = 20;

	public static void main(String[] args){ //메소드(Method) 
		//System.out.println("main실행");
		A obj = new A();
		System.out.print("나이가 " + obj.age +"살인 " + obj.name+"가 ");
		obj.m();
	}
}
//나이가 ?인 철수가 ?