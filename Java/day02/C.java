import java.lang.*;

//전역변수와 지역변수의 유효범위 비교  
class C  
{
	String name = "홍길동"; 
	C(){ 
		//String name = "이순신";
		name = "이순신";
		System.out.println("B() name:"+name);
	}
    void m(){ 
		System.out.println("m() name:"+name);
	}
	public static void main(String args[]){
		C c = new C();
		c.m();
	}
}
