package aa.bb; //(1) ��Ű�� ���� 

import java.lang.*;//(2) ����Ʈ ����

class B //(3) Ŭ���� ���� 
{
	String name = "ȫ�浿"; //(4) �������(��������) ���� �� �ʱ�ȭ
	B(){ //(5) ������ 
		System.out.println("B()");
	}
    void m(){ //(6) �޼ҵ� 
		System.out.println("m()");
	}
	public static void main(String[] args){
		B b = new B();
		b.m();
    }
}


//javac -d . B.java  