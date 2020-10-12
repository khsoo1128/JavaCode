1. IO ( Input Output )
   (1) 스트림 ( Stream ) : "데이터 흐름"
       Data Source(근원지) ----------> Data Destination (목적지)

   (2) 스트림 특징 
        1) FIFO ( First In First Out )
	    2) 지연성 
	    3) 단방향성 
	    4) 유연성 

   (3) 표준입력 / 표준출력 
       키보드(System.in) ------------> 모니터(System.out)

   (4) 구분 
		1) 읽고쓰는단위 
		   <1> 바이트(Byte) 스트림 ( 1 byte Stream )
		       ex: XXXStream 

		   <2> 문자(Character) 스트림 ( 2 byte Stream )
		       ex: XXXReader, XXXWriter 

		2) 특성 
		   <1> 근본 스트림 ( Node Stream )
		       ex: System.in, System.out, .. 

			   ex) day01/A.java 

		   <2> 다리 스트림 ( Bridge Stream )
		       ex: InputStreamReader, OutputStreamWriter 

		   <3> 목적(응용) 스트림 ( Filter Stream ) 
               ex: BufferedReader, PrintWriter, PrintStream .... 

		3) 입출력 
		   <1> 입력 
		       ex: XXXInputStream , XXXReader

		   <2> 출력 
		       ex: XXXOutputStream, XXXWriter
	    
   (4) 주요 클래스 
       1) InputStream / OutputStream 
	         ex) day01/A~D.java 

	   2) FileInputStream / FileOutputStream 
	   3) BufferedInputStream / BufferedOutputStream
	         ex) day02/A.java 
	   4) DataInputStream / DataOutputStream 
	         ex) day02/B.java 

	   5) Reader / Writer 
	   6) FileReader / FileWriter
	   7) InputStreamReader / OutputStreamWriter 
	         ex) day02/C.java 
       8) BufferedReader / PrintWriter 
	         ex) day02/D.java 

       9) ByteArrayInputStream ByteArrayOutputStream
	         ex) day03/A.java 
     
	  10) ObjectInputStream ObjectOutputStream 
             ex) day03/B.java 

cf) java.io.File : '파일'과 '디렉토리'를 모델링한 클래스 
	      
		
		


