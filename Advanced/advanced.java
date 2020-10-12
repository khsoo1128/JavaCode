1. IO ( Input Output )
   (1) ��Ʈ�� ( Stream ) : "������ �帧"
       Data Source(�ٿ���) ----------> Data Destination (������)

   (2) ��Ʈ�� Ư¡ 
        1) FIFO ( First In First Out )
	    2) ������ 
	    3) �ܹ��⼺ 
	    4) ������ 

   (3) ǥ���Է� / ǥ����� 
       Ű����(System.in) ------------> �����(System.out)

   (4) ���� 
		1) �а��´��� 
		   <1> ����Ʈ(Byte) ��Ʈ�� ( 1 byte Stream )
		       ex: XXXStream 

		   <2> ����(Character) ��Ʈ�� ( 2 byte Stream )
		       ex: XXXReader, XXXWriter 

		2) Ư�� 
		   <1> �ٺ� ��Ʈ�� ( Node Stream )
		       ex: System.in, System.out, .. 

			   ex) day01/A.java 

		   <2> �ٸ� ��Ʈ�� ( Bridge Stream )
		       ex: InputStreamReader, OutputStreamWriter 

		   <3> ����(����) ��Ʈ�� ( Filter Stream ) 
               ex: BufferedReader, PrintWriter, PrintStream .... 

		3) ����� 
		   <1> �Է� 
		       ex: XXXInputStream , XXXReader

		   <2> ��� 
		       ex: XXXOutputStream, XXXWriter
	    
   (4) �ֿ� Ŭ���� 
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

cf) java.io.File : '����'�� '���丮'�� �𵨸��� Ŭ���� 
	      
		
		


