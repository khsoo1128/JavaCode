import java.net.*;
import java.io.*;

class AClient implements Runnable 
{
	String host = "127.0.0.1"; //localhost
	int port = 2000;
	Socket s;
	OutputStream os;
	PrintWriter pw;
	BufferedReader brKey = new BufferedReader(new InputStreamReader(System.in));

	InputStream is; //추가 
	BufferedReader br; //추가 

	AClient(){
		try{
            s = new Socket(host, port);
			System.out.println("서버와 접속 성공!!");
			os = s.getOutputStream();
            pw = new PrintWriter(os, true);
			is = s.getInputStream();  //추가
			br = new BufferedReader(new InputStreamReader(is)); //추가
			new Thread(this).start(); //추가 

			speak();
		}catch(UnknownHostException un){
			System.out.println("해당 주소의 서버를 찾을 수가 없음");
		}catch(IOException ie){
		}
	}
	public void run(){  //추가
		listen();
	}
	void listen(){ //Socket --> Moniter
		try{
			while(true){
				String msg = br.readLine();
				System.out.println("Server>> " + msg);
			}
		}catch(IOException ie){
			System.out.println("listen() ie: " + ie);
		}finally{
			try{
				closeAll();
			}catch(IOException ie){}
		}
	}
	void speak(){ //KeyBoard --> Socket 
		try{
			while(true){
				String msg = brKey.readLine();
				pw.println(msg);
			}
		}catch(IOException ie){
		}finally{
			try{
				pw.close();
				os.close();
				s.close();
			}catch(IOException ie){}
		}
	}
	private void closeAll() throws IOException {
		if(pw != null) pw.close();
		if(os != null) os.close();
		if(br != null) br.close();
	    if(is != null) is.close();
		if(s != null) s.close();
	}
	public static void main(String[] args) {
		new AClient();
	}
}
