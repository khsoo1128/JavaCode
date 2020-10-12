class Human extends Object implements java.io.Serializable{
	/*Human(){
	}*/
	String name = "홍길동";
		Human(String name){
		this.name = name;
	}
	void move(){
		System.out.println("걷는다");
	}
}
class SuperMan extends Human {
	transient int power;
	SuperMan(){
		super("클럭");
	}
	SuperMan(String name, int power){
		//super()
		super(name);
		this.power = power;
	}
	void shotBeam(){
		System.out.println("광선을 쏜다");
	}
	void move(){ //오버라이딩  
		System.out.println("난다");
	}
}
class PepsiMan extends Human {
	//String name = "배현철";->자식이 이겨서 배현철이 찍힘
	int speed;
	PepsiMan(int speed){
		super("펩시맨");
		this.speed = speed;
	}
	void move(){ //오버라이딩  
		System.out.println("달린다");
	}
}