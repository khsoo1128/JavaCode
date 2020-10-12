package aa.bb; //(1) 패키지 선언 

import java.lang.*;//(2) 임포트 구문

class B //(3) 클래스 선언 
{
	String name = "홍길동"; //(4) 멤버변수(전역변수) 선언 및 초기화
	B(){ //(5) 생성자 
		System.out.println("B()");
	}
    void m(){ //(6) 메소드 
		System.out.println("m()");
	}
	public static void main(String[] args){
		B b = new B();
		b.m();
    }
}


//javac -d . B.java  