package demo_package;

public class mobile {
      //instance variable/global variable
     //execution start always in main method body
       static String network;
        final int rh=40;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b;//local variable
	
	//class name object = new class name();
		mobile syntel = new mobile();
		mobile xiomi = new mobile();
		xiomi.addition(); // if we declared method as satatic we can call funuaction by using object name and class name
		xiomi.addition(23);
		mobile.addition(45);
		//access the method:
		//objectname.datavariable
		//objectname.fuctionname
		System.out.println("the value of final argument is"+syntel.rh);
syntel.addition();
syntel.addition(2,3); 
syntel.addition(2,3,4);
int s=syntel.addition(2,3,4,5);
System.out.println(s);
System.out.println("the value of s is" +s);
System.out.println("the value of s is "+s+" which confirm the addition of four arguments");//run time string concatination
String h=syntel.network("LTE",424);
System.out.println("the network type is" +h);
}
	//return type method name(arguments){body of the function}
   void addition()
   {
	   System.out.println(4+2);
	   
}
	void addition(int a,  int b)//method declared variable can use only this method(it have same name and value)
	{
		System.out.println(a+b);
}
    void addition(int a, int b,int c)
    {
    	System.out.println(a+b+c);
    }
    int addition(int a, int b,int c,int d)
    {
    return(a+b+c+d);
    }
    String network(String subtype,int modelno) 
    {
    	return "4G"+subtype;
    }
    static void addition(int memory) {
    	System.out.println(memory);
    	
    }
}
    	
    	
    	
    	
    	
    	
    	
    	
    	
  