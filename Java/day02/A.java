//import java.lang.*;

class A { 
	A(){ //������(Constructor)
		//System.out.println("ö�� ź��!!");
	}
	void m(){ //�޼ҵ�(Method)
		System.out.println("�б��� ����");
	}
	String name = "ö��"; //�������(Attribute)
	int age = 20;

	public static void main(String[] args){ //�޼ҵ�(Method) 
		//System.out.println("main����");
		A obj = new A();
		System.out.print("���̰� " + obj.age +"���� " + obj.name+"�� ");
		obj.m();
	}
}
//���̰� ?�� ö���� ?