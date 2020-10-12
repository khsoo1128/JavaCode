class ºØ¾î»§ {
	String ¾Ó²¿ = "ÆÏ";
    int °¡°Ý = 300;

	ºØ¾î»§(){}
	ºØ¾î»§(String ¾Ó²¿){
		this.¾Ó²¿ = ¾Ó²¿;
	}
	ºØ¾î»§(int °¡°Ý){
		this.°¡°Ý = °¡°Ý;
	}
	ºØ¾î»§(String ¾Ó²¿, int °¡°Ý){
		this.¾Ó²¿ = ¾Ó²¿;
		this.°¡°Ý = °¡°Ý;
	}
	void ¸ÔÈù´Ù(){
		System.out.println("¸ÔÈù´Ù");
	}
}
class ¾ÆÁÖ¸Ó´Ï {
	int age = 50;
	ºØ¾î»§ ºØ1, ºØ2, ºØ3, ºØ4;

	void ±Á´Â´Ù(){
		ºØ1 = new ºØ¾î»§(); 
        ºØ2 = new ºØ¾î»§("¼³ÅÁ");   
		ºØ3 = new ºØ¾î»§(500);
		ºØ4 = new ºØ¾î»§("°í±¸¸¶", 1000);
		System.out.println("¾Ó²¿°¡ " + ºØ1.¾Ó²¿ + "ÀÌ°í, °¡°ÝÀÌ "+ºØ1.°¡°Ý+"ÀÎ ºØ¾î»§ÀÌ ±¸¿öÁ³´Ù");
		System.out.println("¾Ó²¿°¡ " + ºØ2.¾Ó²¿ + "ÀÌ°í, °¡°ÝÀÌ "+ºØ2.°¡°Ý+"ÀÎ ºØ¾î»§ÀÌ ±¸¿öÁ³´Ù");
		System.out.println("¾Ó²¿°¡ " + ºØ3.¾Ó²¿ + "ÀÌ°í, °¡°ÝÀÌ "+ºØ3.°¡°Ý+"ÀÎ ºØ¾î»§ÀÌ ±¸¿öÁ³´Ù");
		System.out.println("¾Ó²¿°¡ " + ºØ4.¾Ó²¿ + "ÀÌ°í, °¡°ÝÀÌ "+ºØ4.°¡°Ý+"ÀÎ ºØ¾î»§ÀÌ ±¸¿öÁ³´Ù");
	}
	void ÆÇ¸ÅÇÑ´Ù(ºØ¾î»§ ºØ){
		System.out.println("¾ÆÀÌ¿¡°Ô ¾Ó²¿°¡ "+ ºØ.°¡°Ý + "ÀÎ ºØ¾î»§À» ÆÇ¸ÅÇÑ´Ù");
	}
}


