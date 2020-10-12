1. HW + OS + JVM + App1, App2, ... 
   - CPU : 두뇌 
   - RAM(메모리) : 책상 
   - HDD/SSD : 책꽂이 
   - MainBoard : 방 
   - Card( Graphic, Sound, Ran, ... )
   - 본체/주변기기
   
2. JVM 
   (1) JDK = jdk + jre 
   (2) 환경변수 
       - JAVA_HOME => C:\~~\jdk1.4
	   - Path => %JAVA_HOME%\bin
	   - classpath => .
   (3) API(Application Programming Interface)
       - 참조문서 

3. 실행 메커니즘 
   - 작성(.java) -> 컴파일(javac.exe) -> 실행(java.exe)
   - .java(for Man) -> .class (for Com)

4. 클래스 구조 
   (1) 패키지 선언 
   (2) 임포트 구문 
   (3) 클래스 선언 { 
	   (4) 멤버변수 
	   (5) 생성자 
	   (6) 메소드 
   }
   
   cf) 패키지 컴파일/실행
     #>javac -d . XX.java 
	 #>java aa.bb.B

   ex) day02/B.java 

5. 주석 ( Comment )
   (1) 1라인 //
   (2) 여러라인 
       /*
	      라인1
		  라인2 ... 
	   */
   (3) 문서화주석 
       /**
	      라인1
		  라인2 ...
	   */

	   #> javadoc -d ./api *.java

6. 객체 지향 용어 
   (1) 클래스(Class) : 객체를 만들기위한 틀 
       ex) 붕어빵틀 
   (2) 객체(Object) : 모든 것 or 클래스를 통해 생성된 구현물 
       ex) 붕어빵 
   (3) 생성자(Constructor) : 객체가 생성될때 하는 일(기능)
       ex) 앙코을넣는다
   (4) 메소드(Method) : 객체가 할 수 있는 일(기능)
       ex) 먹힌다, 팔린다, 따뜻하게한다
   (5) 속성(Attribute==Field==멤버변수) : 객체의 특성 
       ( 존재이유: 다양한 객체를 만들기 위해서 )
       ex) 앙꼬, 가격, .. 

7. 클래스 설계 
   붕어빵.java 
   /*
		일상의 어떤 현상을 상상해서.. 
		클래스 설계를 하고 출력(메소드/속성)하시오
	*/
 
   cf) 실행되는 순서 
     ex) day02/B.java 

///////////////////////////////// 숲을 봤다 /////////////////////////////////
8. 변수(Variable) 
	(1) 유효범위 
	   1) 멤버변수(==전역)
	      <1> 클래스소속(==클래스==정적==공유)
		  <2> 객체소속(==객체==동적==인스턴스) 
	   2) 지역변수 
	      <1> 파라미터(==매개)
		  <2> 선언초기화 

		 ex) day04/A.java 

    (2) static 
	   1) 클래스소유 (==클래스==정적==공유) 
	   2) 객체소유 (==동적==객체==인스턴스)

         ex) day04/B.java 

    (3) final 
	   1) 상수( Constance )
	   2) 변수( Variable )
	    
		 ex) day04/C.java

    (4) 메모리 저장방식 
	    1) 기본형변수(==프리미티브==원시형) 8가지 
		   <1> call by value 
		   <2> 형태: 소문자로 시작  
		   <3> 종류 
		       byte(1) ▶ short(2) ▶  int(4) ▶ long(8) ▶ float(4) ▶ double(8) 
			              char(2) ▶ 

			   boolean(1) 
			   
		   <4> 담을 수 있는 값의 범위 
		       1> byte : -2^7  ~ 2^7-1 (경우의수: 2^8)
			   2> short: -2^15 ~ 2^15-1 (경우의수: 2^16)
			   3> char :     0 ~ 2^16-1 (경우의수: 2^16)
			   4> int  : -2^31  ~ 2^31-1 (경우의수: 2^32)
			   5> long : -2^63  ~ 2^63-1 (경우의수: 2^64)
			   6> float: 무한대 
			   7> double: 무한대 
			   8> boolean: false | true 

			     ex) day04/D.java, E.java, F.java, G.java  

            <5> 형변환( Type Casting )
			   1> 자동(Implicit/암시적) by JVM
			      범위가 작은 Type ▶ 큰 Type 
			      
			   2> 강제(Explicit/명시적) by 개발자 
                  범위가 큰 Type ▶ 작은 Type 

		    <6> 예외형변환 
                정수형(byte, short, char, int)끼리의 연산의 결과는 int 
			    ex) day04/H.java

		    <7> 초기값 
			    정수(0), 실수(0.0), 불린(false)
			    ex) day04/I.java 

		    <8> 존재이유 : 실행의 효율성 

			cf) Wrapper class :  Byte, Character, Short, Integer, Long, Float, Double, Boolean 


		2) 레퍼런스변수(==참조)
		   <1> call by reference 
		   <2> 형태: 대문자로 시작 
		   <3> 종류: 8가지를 제외한 모든 타입 
		   <4> 초기값: null
		   <5> 형변환
		       1> 자동(Implicit/암시적) by JVM
			       Object 
				     ▲
				   Human 
				     ▲	
				   SuperMan 
 
			   2> 강제(Explicit/명시적) by 개발자     

	cf) 배열변수: 타입이 배열인 변수         

9. 제어 
	어떤 프로그램이 실행되고 있을 때.. 
	어느 한 시점에서의 CPU연산은 어떤 특정부분의 코드를 실행하고 있을 것이다
	그 코드부분을 '제어점'이라하고, 그 제어점들의 집합을 '제어'라 한다 
	즉, 프로그램의 실행흐름(Line)을 제어라 한다 

	JVM -> main().... -> main() -> JVM 
	cf) 비유: 부메랑 

	ex) day05/A.java 

10. 제어문 
	(1) 조건문 
	   1) if(boolean형){} 문 
	   2) if(boolean형){} else{} 문 
	   3) if(boolean형){} else if(boolean형)... else{} 문 
	   4) switch(정수형){case:... default: } 문 
	      => 정수형 or String , break, default 위치, case 블럭 생략 가능 

	   ex) day05/B.java, C.java  

	(2) 반복문 
	   -> 초기식(밖), 조건식(안), 증감식(안)을 갖추어야 '유한루프'가 돌게 됨 
	   1) while(boolean형){}   //신사 
	   2) do{} while(boolean형);  //조폭 
	   3) for(초기식; 조건식; 증감식){} //신사 

	   ex) day05/D.java 

11. 제어의 이동 
	(1) break
	   1) 반복블럭이나 스위치블럭 안에서만 사용 가능 
	       cf) 반복블럭안에서 사용될 때, 다음 statement가 있을 경우 if문과 함께 사용되어야 함
	   2) 자기를 둘러싼 첫번째 블럭을 '나간다'

	       cf) labeled break

	   ex) day06/A.java 

	(2) continue
	   1) 반복블럭에서만 사용 가능 
	   2) (조건에 맞으면) '건너뛴다'

	      cf) labeled continue

	   ex) day06/B.java 

	(3) return 
	   1) 어디에서나 사용 가능 
	   2) 호출한 곳 or 놈으로 '되돌린다'

	   ex) day06/C.java
	   
12. 연산자( Operator ) 
    (1) (데이터들을) 연산하게 하는 '기호'
	(2) 종류 
	   1) 산술 ex) +, -, *, /, %
	        cf) 연산자 '오버라이딩' 
			  => 좌측의 데이터가 String 타입이면 + 연산자는 '결합'연산자가 됨  
	   2) 증감 ex) ++, --
	   3) 대입 ex) =
	   4) 산술대입 ex) +=, -=, *=, /=, %=
	   5) 비트 ex) &, |, ^, ~, 시프트(<<, >>, >>>)
	   6) 비교 ex) ==, !=, <, >, <=, >=
	   7) 논리 ex) &, &&, |, ||
	   8) 논리대입 ex) &=, |=
	   9) 조건 ex) A? B:C
	   10) instanceof ex) 객체 instanceof 클래스 

	   ex) day06/D.java 

13. 배열( Array ) ( 비유: 냉장고 )
    같은 타입의 데이터 '저장소'로써 생성될 때 크기가 고정되는 "객체" 
    (1) 선언 
	    type 배열변수[];
	    //ex) String items[];
  
    (2) 생성 
	    배열변수 = new type[크기];
		//ex) items = new String[4];

	(3) 초기화 
	    배열변수[인덱스] = 데이터;
	    //ex) items[0] = "봄";

    (4) 선언 및 생성 
	    type 배열변수[] = new type[크기];
	    //ex) String items[] = new String[4];

		ex) day07/A.java 

    (5) 선언 및 생성 및 초기화 
        type 배열변수[] = {데이터1, 데이터2, .. }; 
        //ex) String items[] = {str0, str1, str2, str3};

		cf) 선언 및 생성 및 초기화를 동시에 할 때 선언만을 따로 분리할 수 없음 

	    ex) day07/B.java, C.java 

    (6) 배열의 default 값 
	    정수(0), 실수(0.0), 불린(false), 참조형(null) 

		ex) day07/D.java 

    (7) 형변환 
        형변환이 가능한 데이터라면 형변환되어셔서 입력 됨 
	    //ex) int is[] = {b, s, c, i, (int)f};

        ex) day07/E.java 
     
	(8) 이차원 
	    일차원 배열을 데이터로 갖는 배열 
	    
		ex) day07/F.java 

    (9) 삼차원 
	    이차원 배열을 데이터로 갖는 배열

		ex) day07/G.java

    (10) N차원 
	    (N-1)차원 배열을 데이터로 갖는 배열 

14. 컬렉션( Collection ) 
    ( == 자료구조(Data Structure) == 가변배열 )
    같은 타입의 '참조형'데이터 '저장소'로써 크기가 변할수 있는 '객체'
	
	(1) 종류 
	     1)            java.util.Collection 
		                |                  | 
				   java.util.List       java.util.Set 
				     |        |                | 
				  Vector    ArrayList   TreeSet  HashSet

		 2)       java.util.Map
                        | 
				    Hashtable 
		              

	(2) 특징 
	    1) List 
		     - 순서를 보존 
			 - 중복을 허용 
			 ex) day08/A.java 

		2) Set
		     - 순서를 보존X
			 - 중복을 허용X
			 ex) day08/B.java 

		3) Map 
		     - key와 value 쌍으로 저장 
			 - 순서를 보존X
			 - key는 중복을 허용X ( key가 중복되면 기존의 value을 덮어씀 ) 
			   value는 중복을 허용 

			 ex) day08/C.java

15. OOP(Object Oriented Programming) 특성 
	(1) 상속성( Inheritance ) 
	    부모의 '모든 것'을 자식에서 '상속받는 것'(== 사용할 수 있는 것)

		- 자식객체가 생성되려면 먼저 부모객체가 생성되어야 함 
		- 다른 생성자가 하나도 없을 경우에만 JVM이 기본생성자(default constructor)를 만들어 줌 
		- 모든 생성자 첫라인에는 super();가 생략되어 있음 ( 단, 다른 super(..)있다면 예외 )
		- 모든 객체는 Object 자식 ( 묵시적 상속 )
		- 자식 메소드에서 부모메소드의 내용을 바꿀 수 있음 ( Overriding )
		- 형변환은 상속관계에서만 가능  
		  - 자동 by JVM 
		  - 강제 by 개발자 

		  ex) day09/A.java, B.java, BB.java 

	(2) 다형성( Polimorphism ) 
	     같은 타입 객체의 '동일한 메소드가 다른 일을 하는 것'
		 
		  ex) day09/C.java

	(3) 은닉성( Information Hiding ) 
	     속성값(데이터)을 외부클래스로부터 '감추는 것'

	      ex) day09/D.java 

	(4) 캡슐화( Encapsulation ) 
	     속성값(데이터)을 메소드(getter/setter)를 통해서만 선택적으로 접근하게 하는 것 
		 메소드의 내용을 몰라도 형태(이름,파라미터,리턴타입)를 알면 호출해서 사용할 수 있는 것 

		 ex) day09/D.java

16. (메소드) 오버라이딩( Overriding ) 
    (1) (상속관계)부모 메소드 내용을 '바꾸는 것' 

	(2) 조건 
	    1) 메소드 이름이 같아야 함 
		2) 반환타입이 일치해야 함 
		3) 생성자에서 불가 
		4) 파라미터의 타입과 순서와 갯수가 모두 일치해야 함
		5) 자식메소드의 접근제한자가 부모메소드의 접근제한자보다 같거나 넓어야 함 

    ex) day10/A.java 


17. 오버로딩 ( OverLoading ) 
    (1) 정의: 스스로, 책, 인터넷 
	     - 민서(스): 같은 이름의 메소드가 서로 다른 파라미터를 가지고 같은 기능을 하는 것 
		 - 영준(인/스): 같은 이름의 메소드명이나 생성자명을 매개의 변수를 타입에 따라 호출이 다르게 되는 것 
		 - 주현(스): 이름이 같은 생성자 또는 메소드를 호출할 때 파라미터(매개변수)의 차이를 통해 원하는 것을 호출할 수 있게 하는 것 
		 - 수빈(인/스): 메소드가 같은 이름 갖고 있으나, 인자의 수나 자료형이 다른 경우을 말함 
		 - 혜원(인/스): 같은 클래스내에서 생성자 혹은 메소드의 이름을 동일하게 하고 파라미터 타입과 갯수를 달리하여 
		             공통기능의 생성자 메소드를 여러개 정의할 수 있는 것 
	     - 석호(인/스): 파라미터에 따라 같은 이름의 다른 메소드를 실행하는 것 (생성자를 동일하니 생략)
		 - 다솜(인/스): 매개변수의 타입과 갯수를 변경해서 같은 이름의 메소드나 생성자를 여러개 정의할 수 있도록 하는 기술 

		 - 형수(스): ( 호출시 그 형태에 매핑되어 호출되도록 ) 
		          파라미터의 종류나 순서나 갯수가 다른 생성자나 같은 이름의 메소드를 '여러개 정의하는 것'

    (2) 종류
	    1) 생성자 
		2) 메소드 

    (3) 특징
	    1) 반환타입과 관계가 없음 
		2) 상속관계라면 다른 클래스에서라도 로버로딩이 가능 
		3) 형변환이 가능한 파라미터라도 오버로딩으로 인정 

      ex) day10/B.java 

18. this 와 super 
    (1) this 
        1) 정의: 자신의 객체 또는 생성자를 의미하는 대명사  

		2) 사용예 
		   <1> 지역변수와 이름이 같은 멤버변수를 해당 지역에서 접근할 때 
		   <2> 자신의 생성자를 호출할 때 
		   <3> 자신의 객체를 다른 클래스에게 넘길 때 
	    
        ex) day10/C.java 

    (2) super 
	    1) 정의: 부모의 객체 또는 생성자를 의미하는 대명사 

        2) 사용예 
		   <1> 부모의 생성자를 호출할 때 
		   <2> 오버라이딩되기 전의 부모메소드를 호출할 때 
		   <3> 이름이 같은 부모멤버를 자식에서 호출할 때

		ex) day10/D.java

19. 제한자 ( Modifier )
     클래스, 인터페이스, 변수, 생성자, 메소드 앞에 붙어서 그 기능을 '제한'하는 예약어

    (1) 접근제한자 ( Access Modifier ) 
	    1) 종류 
		   <1> public : 제한이 없음 
		   <2> protected : 같은 패키지 안 or 상속관계 부모의 자원 
		   <3> default ( package == friendly ) : 같은 패키지 안 
		   <4> private : 클래스 안 
		   
	    2) 특성 
		   <1> 클래스나 인터페이스 앞의 접근제한자는 public 과 default 만 가능 
		   <2> public 클래스 이름은 파일이름과 같아야 함

		3) 범위 
		   넓은 순위: public > protected > default > private
		   강력 순위: public < protected < default < private
	    
		ex) day10/E.java

    (2) 소유제한자 ( static )  
	    붙으면 '클래스 소유', 안붙으면 '객체 소유' 

		1) 멤버와 메소드 앞에만 붙을 수 있음 
		2) 자원 접근시 클래스 이름으로 접근함 
		3) 자신의 클래스의 static 메소드에서는 static 자원접근시 클래스이름 생략할 수 있음
		4) static 자원은 메모리에 1개 생성되어 모든 객체에게 공유 됨 
		5) static 메소드내에서는 this 나 super 를 사용할 수 없음
	   
	    ex) day11/A.java , B.java 

    (3) 수정제한자 ( final )
	    붙으면 '수정'을 못하게 함 
        
		1) 클래스, 변수, 메소드 앞에 붙을 수 있음 
		2) 클래스 앞에 붙으면 자식을 '못낳고', 변수앞에 붙으면 초기값을 '못바꾸고', 
		   메소드 앞에 붙으면 '오버라이딩을 못하게 함'
		3) 지역변수에도 붙을 수 있음 

	    ex) day11/C.java

    (4) 추상제한자 ( abstract )
	    붙으면 추상화(化)가 됨 
	    
		1) 클래스와 메소드 앞에서만 붙을 수 있음 
		2) 하나 이상의 '추상메소드'만 가지고 있어도, 그 클래스는 '추상클래스'가 되어야 함 
		3) 추상클래스의 객체는 '완벽한 자식클래스'를 만들고, 그 객체를 '형변환'하여 생성함  

		 - 추상클래스 : abstract 가 붙은 클래스 
		 - 추상메소드 : abstract 가 붙은 메소드( 메소드 body가 없어야 함 )

		ex) day11/D.java 

    (5) 기타 제한자 
	    synchronized ( 쓰레드 ), transient ( 보안 ), native ( OS자원 )


20. 식별자( Identifier )
    '프로그래머가 임의로' 설정하는 패키지, 클래스, 변수, 메소드 '이름'

    (1) 규칙
	    1) 숫자가 맨 앞에 올 수 없음 
		2) 특수문자는 _와 $만 가능 ( 맨 앞에 나와도 됨 ) 
        3) 길이의 제약은 없음

    (2) 관례 
	    1) 클래스와 인터페이스의 첫문자는 대문자 
		2) 상수는 전체 문자를 대문자 
		3) 패키지, 변수, 메소드 이름의 첫문자는 소문자 
		4) 2개 이상의 단어 조합은 다음 단어의 첫문자를 '대문자'로 하거나 '_'로 처리 
		5) _ 와 $ 는 자제함 
		6) 의미있는 단어를 사용 

	    ex) day11/E.java 

21. 패키지 ( Package )
    비슷한 종류의 '기능'이나 '업무'를 가진 '클래스와 인터페이스들의 묶음' 

	(1) 형태 
	    클래스 최상단에 package 라는 예약어를 사용 
		( ex: package soo.aa.bb; )

    (2) 컴파일 
	   #> javac -d . XXX.java //상대경로 
	   #> javac -d ./classes A.java //상대경로 
	   #> javac -d ../ A.java //상대경로 
	   #> javac -d E:\test A.java //절대경로 

	   ex) day12/A.java 

	(3) 실행 
	   #> java soo.aa.bb.A //패키지 최상단 디렉토리로 이동 후 실행 

	(4) 압축 
	   #> jar -cvf p.jar soo 

	   ex) day12/AUser.java

	(5) classpath ( * )
	   1) -classpath 법 ( 범위: javac.exe, java.exe )
	      <1> 디렉토리 
		     #> javac -classpath C:\SOO\Java\day12\classes AUser.java
			 #> java -classpath .;C:\SOO\Java\day12\classes AUser
		      
		  <2> jar 
		     #> javac -classpath C:\SOO\Java\day12\classes\p.jar AUser.java
			 #> java -classpath .;C:\SOO\Java\day12\classes\p.jar AUser

	   2) set classpath 법 ( 범위: cmd )
	      <1> 디렉토리
		     #> set classpath=%classpath%;C:\SOO\Java\day12\classes 
			 #> javac AUser.java
			 #> java AUser 
		  
		  <2> jar
		     #> set classpath=%classpath%;C:\SOO\Java\day12\classes\p.jar
			 #> javac AUser.java
			 #> java AUser 
	   
	   3) 환경변수법 (	범위 : OS )
	      <1> 디렉토리 
			  .;C:\SOO\Java\day12\classes
		  <2> jar 
		      .;C:\SOO\Java\day12\classes\p.jar

			 
		  cf1) build path ( in eclipse ) 
          cf2) 자바 문서 생성  
		     #> javadoc -d ./api *.java
	       
22. 인터페이스 ( interface )
    - jdk7이하: '상수'와 '추상메소드'들로 구성된 '껍데기'
	- jdk8이상: '상수'와 '추상메소드'와 'static메소드'와 'default메소드'로 구성된 '껍데기' 

   (1) 생략 
       1) interface 앞에는 abstract 생략 됨 
       2) 멤버앞에는 public static final 생략됨 
	   3) 메소드앞에는 public abstract 생략됨
	   4) static 메소드에는 public 생략됨 
	   5) default 메소드에는 public 생략됨 

     	   ex) day12/B.java

   (2) 특징 
       1) 객체는 완벽한 자식클래스를 만들어서 그 객체 생성 후 형변환해서 만듬 
       2) 자식 클래스를 만들때는 implements 사용 
       3) interface 의 static 메소드는 인터페이스 이름으로만 접근 가능 

       4) 클래스와 인터페이스간 다중 상속 가능 
	      ( 다중상속: class C implements C1, C2, C3, .. ) 
       5) 인터페이스끼리도 다중 상속 가능
	      ( 다중상속: interface C3 extends C1, C2, .. )
       6) 일반적인 자식클래스의 형태 
	      class Child extends Human implements C1, C2,... 

	       ex) day12/C.java
	
23. 추상클래스와 인터페이스 차이점
   (1) 공통점 
       - 완벽한 자식객체를 생성해서 형변환 
	   - 추상메소드를 가질 수 있음 

   (2) 차이점 
       - 클래스이고 인터페이스 
	   - 추상클래스는 일반멤버와 일반메소드와 생성자를 가질 수 있음 

24. 인터페이스는 왜 사용 ? 
    "SW 독립성" ( 다형성 ) 

25. 예외 처리 
   (1) 예외 ( Exception )
       프로그램이 정상적으로 진행되지 못하게 하는 '돌발 상황'

       ex) 숫자 아닌 형태의 문자를 숫자로 바꾸려할 때 
	       채팅하다가 상대방이 나가버린 경우 
		   온라인 게임하고 있는 데 전원케이블리 빠짐 
		   게임 서버 다운 됨
		   .... 

   (2) 예외처리 목적 
       프로그램 진행시 발생할 수 있는 '돌발 상황'을 예외로 미리 정해놓고, 
	   해당하는 예외가 발생했을 경우 적절한 조치를 취해서, 프로그램이 
	   '정상적으로 작동'하도록 하는 것 

   (3) 계층도  
                           Object 
							 | 
						 Throwable 
					     |       | 
                       Error   Exception  
					           |       | 
				 CheckedException    RuntimeException 
				 CompileException 

				 ( ex: IOException is a CompileException 
				       NumberFormat is a RuntimeException )

		ex) day13/A.java 

   (4) 특징 
       1) throw 로 예외 객체를 발생시킴 
	   2) throws 로 예외 발생할 수 있음을 표식 ( == 호출한 곳/놈에게 '떠넘길 수 있음' )
	   3) try catch 로 직접 잡을 수 있음 ( == 적극적으로 때려 잡음 )
       4) 생성자나 메소드에서만 발생할 수 있음 
       5) 상위 Exception 으로도 처리가 가능함  

	   ex) day13/B.java 

   (5) try절안에서 2개 이상의 예외 발생 
       1) 예외가 상속관계 O 
          [순서존재] 하위예외부터 잡아 줌 
		  catch(MyException me)
		  catch(Exception e)

	   2) 예외가 상속관계 X 
	      [순서존재X] 아무예외나 먼저 잡아 줌
		  catch(MyException me)
		  catch(YourException ye)

   (6) 방법 
       1) 때려 잡는 법
	      try{
			  예외가 발생하는 구문 ( 생성자 or 메소드 )
		  }catch(예외타입 예외객체){  
			  처리 로직 
		  }

	   2) 떠넘기는 법 
			throws 예외타입

    (7) 2이상의 예외를 떠넘길 때 
	   ( ex: throws MyException, YourException, ...,  Exception )

	   ex) day13/C.java

	(8) finally 절 
       1) 항상 수행되는 절 
	      ( 심지어.. return 을 만나더라도 수행되고 리턴 됨 )
       2) try절이 나오면.. 
	      catch절이나 finally절이 나오거나..
		  둘다 나오거나 해야 함 
       3) 얘는 못 이김 
	      System.exit(0); //정상종료
		  System.exit(-1); //비정상종료
	 
	   ex) day13/D.java, E.java 
 
26. 내부 클래스 ( Inner Class )	       
    클래스안의 클래스 

	(1) 객체 생성 방법 
	    1) 외클.내클 변수 = new 외클().new 내클();
		   ex) day14/A.java 
		2) 외클.내클 변수 = new 외클.내클();
		   ex) day14/A.java 
	 
	(2) main 위치 
	    1) 외클에 있는 경우 
		   - 기존 방법과 같음 
		2) 내부에 있는 경우 
           - 생성: 내클 변수 = new 내클();
		   - 실행: java 외클$내클  
	       - static 자원이 하나라도 있으면 static 내부클래스가 되어야 함 
		     ( 따라서.. main이 있으면 static 내부클래스가 되어야 함 )    
		   - 내부클래스에서는 외클의 객체생성없이 외부클래스 자원을 접근할 수 있음  
		     ( static 내부클래스에서는 '외클의 객체생성없이' 외부클래스 static 자원만 접근할 수 있음, 
			   일반 내부클래스에서는 외클의 '객체생성없이 외부클래스' 일반자원과 static 자원을 접근할 수 있음 )
		   ex) day14/B.java 

    (3) 쓰는 이유 
	    외부클래스의 자원을 내부클래스에서 '자기 것'처럼 사용하기위해서 

27. OOP의 관계 
    (1) 'is a' 관계 
        상속관계 

	(2) 'has a' 관계 
	    객체와 속성관계  

28. 쓰레드( Thread )
    프로세스를 구성하는 '제어의 흐름'
   
    (1) Process 와 Thread
	    1) Process: 프로그램 <실행 단위>
		2) Thread : Process 를 구성하는 <작업 단위>

	    ex) day15/A.java
 
	(2) 장점 
	    쓰레드 '경량 프로세스'라 불림 
		이유는 프로세스의 공통 Resource 를 공유하기 때문임 

    (3) 생성법 
	    1) java.lang.Thread 상속법 

		2) java.lang.Runnable 상속법 

		ex) day15/A.java , B.java 

	(4) 시작 
	    th.start();

    (5) 비유 : '피고용인' (Emploee)

	    ex) day15/C.java

    (6) LifeCycle 
	    1) 5가지 상태
		2) 각 상태는 '메소드'나 '스케쥴러'나 '시간'에 의해 이동함 
		3) 한번 돌아가시면 살아나지 못함 

    (7) Priority 
		1) Ready 상태의 쓰레드 중에서 
		   우선적으로 CPU를 점유할 수 있는 쓰레드를 판별하기 위한 LEVEL값 
		2) 범위 
		   1 ~ 10
		3) MAX_PRIORITY //10 
		   MIN_PRIORITY //1
		   NORM_PRIORITY //5
		
		ex) day15/D.java 

	(8) 후손들의 탄생 ( 참고만 할 것! )
	    ex) day15/E.java 

    (9) 동기화 
		1) 하나 이상의 쓰레드가 어떤 연사 or 로직에 동시에 접근했을 때, 
		   그 연산에 대한 값의 무결성을 보장하기 위해서 수행 영역에 대한 
		   lock을 걸어주는 것 
		  
		2) 비유: 화장실 문고리 

		3) 예 
		   int i = 0; 
		   i++; 

		   # CPU 연산 단계 #
		   <1> 현재의 i값을 읽는단계        i==0    i==0
		   <2> i값 증가단계              i==0    i==0
		   <3> 증가된 i값을 i에 저장단계     i==1    i==1

		4) 방법 
		   ex1) synchronized void m(){
			        동기화가 필요한 로직; 
				}
		   ex2) synchronized(this){
					동기화가 필요한 로직;
				}

		    ex) day15/F.java  

////////////////////////// Beginning 끝 //////////////////////////