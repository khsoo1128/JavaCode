class Human extends Object implements java.io.Serializable{
	/*Human(){
	}*/
	String name = "ȫ�浿";
		Human(String name){
		this.name = name;
	}
	void move(){
		System.out.println("�ȴ´�");
	}
}
class SuperMan extends Human {
	transient int power;
	SuperMan(){
		super("Ŭ��");
	}
	SuperMan(String name, int power){
		//super()
		super(name);
		this.power = power;
	}
	void shotBeam(){
		System.out.println("������ ���");
	}
	void move(){ //�������̵�  
		System.out.println("����");
	}
}
class PepsiMan extends Human {
	//String name = "����ö";->�ڽ��� �̰ܼ� ����ö�� ����
	int speed;
	PepsiMan(int speed){
		super("��ø�");
		this.speed = speed;
	}
	void move(){ //�������̵�  
		System.out.println("�޸���");
	}
}