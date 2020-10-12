import java.io.*;

//B.java -> File -> B.java 
class B {
	String fName = "save.obj";
	FileOutputStream fos; //Node
	ObjectOutputStream oos; //Filer 

    FileInputStream fis; //Node
	ObjectInputStream ois; //Filer 
	B(){
		try{
			fos = new FileOutputStream(fName);
			oos = new ObjectOutputStream(fos);

			fis = new FileInputStream(fName);
			ois = new ObjectInputStream(fis);
		}catch(IOException ie){}
	}
	void wObj(){ //B.java -> File
		Object obj = new SuperMan("ÀÌ¼öºó", 19);
		try{
			oos.writeObject(obj);
			oos.flush();
			System.out.println("°´Ã¼ ¾²±â ¿Ï·á");
		}catch(IOException ie){
			System.out.println("°´Ã¼ ¾²±â ½ÇÆÐ ie: " + ie);
		}finally{
			try{
				oos.close();
				fos.close();
			}catch(IOException ie){}
		}
	}
	void rObj(){ //File -> B.java
		try{
			Object obj = ois.readObject();
			SuperMan sm = (SuperMan)obj;
			System.out.println("name: " + sm.name);
			System.out.println("power: " + sm.power);
			sm.move();
			sm.shotBeam();
		}catch(IOException ie){
		}catch(ClassNotFoundException cnfe){
		}finally{
			try{
				ois.close();
				fis.close();
			}catch(IOException ie){}
		}
	}
	public static void main(String[] args) {
		B b= new B();
		b.wObj();
		b.rObj();
	}
}
