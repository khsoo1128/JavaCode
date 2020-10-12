import java.net.*;
import java.io.*;

class AServer implements Runnable 
{
	int port = 2000;//0~65535  [ Well Known Port : 0~1023 ] 
	ServerSocket ss;
	Socket s;
	InputStream is;
	BufferedReader br;
	String ipClient;

	OutputStream os; //추가
	PrintWriter pw; //추가
	BufferedReader brKey = new BufferedReader(new InputStreamReader(System.in)); //추가

	AServer(){
		try{
			ss = new ServerSocket(port);
			System.out.println(port+"번에서 서버 대기중..");
			s = ss.accept();
			ipClient = s.getInetAddress().getHostAddress();
			is = s.getInputStream(); 
			br = new BufferedReader(new InputStreamReader(is));
			os = s.getOutputStream(); //추가
            pw = new PrintWriter(os, true); //추가
 			System.out.println("클라이언트(IP:"+ipClient+") 접속 성공!!");

			new Thread(this).start();

			speak();
		}catch(IOException ie){
			System.out.println("ie: " + ie);
		}
	}
	void listen(){ //Socket --> Moniter
		try{
			while(true){
				String msg = br.readLine();
				System.out.println("Client("+ipClient+")>> " + msg);
			}
		}catch(IOException ie){
			System.out.println("listen() ie: " + ie);
		}finally{
			try{
				closeAll();
			}catch(IOException ie){}
		}
	}
	public void run(){
		listen();
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
				closeAll();
			}catch(IOException ie){}
		}
	}
	private void closeAll() throws IOException {
		if(pw != null) pw.close();
		if(os != null) os.close();
		if(br != null) br.close();
	    if(is != null) is.close();
		if(s != null) s.close();
		if(ss != null) ss.close();
	}
	public static void main(String[] args) {
		new AServer();
	}
}
