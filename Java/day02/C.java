import java.lang.*;

//���������� ���������� ��ȿ���� ��  
class C  
{
	String name = "ȫ�浿"; 
	C(){ 
		//String name = "�̼���";
		name = "�̼���";
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
