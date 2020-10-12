import java.io.*;

//File -> 배열객체 -> File   
class A 
{
	String fName = "C:/SOO/Java/자료실/EditPlus 4.1.zip";
	byte save[];

	void w(){ //File -> 배열객체
		FileInputStream fis = null; //Node
		BufferedInputStream bis = null; //Filter 

		ByteArrayOutputStream baos = null; //Filter 
	    try{
			fis = new FileInputStream(fName);
			bis = new BufferedInputStream(fis, 2048);
			baos = new ByteArrayOutputStream();
            
			int i = 0;
			byte bs[] = new byte[512];
			while((i = bis.read(bs)) != -1){
				baos.write(bs, 0, i);
			}
			baos.flush();

			save = baos.toByteArray(); //중요
			System.out.println("배열 저장 완료("+save.length+"bytes)");
		}catch(IOException ie){
		}finally{
			try{
				baos.close();
				bis.close();
				fis.close();
			}catch(IOException ie){}
		}
	}
	void r(){ //배열객체 -> File
		ByteArrayInputStream bais = new ByteArrayInputStream(save);	
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try{
			fos = new FileOutputStream("EditPlus 4.1_copy.zip");
			bos = new BufferedOutputStream(fos, 2048);

			int i = 0;
			byte bs[] = new byte[512];
			while((i=bais.read(bs)) != -1){
				bos.write(bs, 0, i);
			}
			bos.flush();
			System.out.println("메모리(배열)객체로부터 파일쓰기 완료");
		}catch(IOException ie){
		}finally{
			try{
				bais.close();
				bos.close();
				fos.close();
			}catch(IOException ie){}
		}
	}
	public static void main(String[] args) {
		A a = new A();
		a.w();
		a.r();
	}
}
