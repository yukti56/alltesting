package demo_package;

public class String_function { 
	
	int a=10;
	int b=10;
	String e = "Anil";

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
      //**charAt
	   String myStr = "Hello";
		char result = myStr.charAt(0);
		System.out.println(result);
		
		//**compareTo
		//-------------------
		String myStr1 = "Hello";
		String myStr2 = "Hello";
		System.out.println(myStr1.compareTo(myStr2)); // Returns 0 because they are equal
		
		//**compareToIgnorecase
		//....................

		String myStr3 = "HELLO";
		String myStr4 = "HELLO";
		System.out.println(myStr3.compareToIgnoreCase(myStr4));
		
		//**Concat
		//..................
		String firstName = "John ";
		String lastName = "Doe";
		System.out.println(firstName +" " + lastName);
		//System.out.println(firstName.concat(lastName));
		
		//**  contentEquals
		
		String myStr5 = "Hello"; 
		System.out.println(myStr5.contentEquals("Hello")); // true
		 System.out.println(myStr5.contentEquals("e")); // false
		 System.out.println(myStr5.contentEquals("Hi")); // false 
		 
		 //**contains
		 
		 String myStr6 = "Hello";
		 System.out.println(myStr6.contains("Hel"));   // true
		 System.out.println(myStr6.contains("e"));     // true
		 System.out.println(myStr6.contains("Hi"));    // false 
         
		 //**equals
		 
		 String myStr7 = "Hello";
		 String myStr8 = "Hello";
		 String myStr9 = "Another String";
		 System.out.println(myStr7.equals(myStr8)); // Returns true because they are equal
		 System.out.println(myStr7.equals(myStr9)); // false
		 
		 //**endswith
		 
		 String myStr10 = "Hello";
		 System.out.println(myStr10.endsWith("Hel"));   // false
		 System.out.println(myStr10.endsWith("llo"));   // true
		 System.out.println(myStr10.endsWith("o")); //true
		 
		 //**equalsIgnorecase
		 
		 String myStr11 = "Hello";
		 String myStr12 = "HELLO";
		 String myStr13 = "Another String";
		 System.out.println(myStr11.equalsIgnoreCase(myStr12)); // true
		 System.out.println(myStr11.equalsIgnoreCase(myStr13)); // false
		 
		 //**indexofequal
		 
		 String myStr14= "Hello planet earth, you are a great planet.";
		 System.out.println(myStr14.indexOf("planet")); 
		 
		 //**lastindexof
		 
		 String myStr15 = "Hello planet earth, you are a great planet."; 
		 System.out.println(myStr15.lastIndexOf("planet")); 
		 
		 //** length
		 
		 String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 

		 System.out.println(txt.length()); 
		 
		 //** replace
		 
		 String myStr16 = "Hello"; 
		 System.out.println(myStr16.replace('l', 'p'));
		 
		 //**
		 
		 String text = "Java is a fun programming language"; 
		// split string from space
		//String[] result = text.split(" "); 
		System.out.print("result = "); 
		//for (String str : result)
		 {
		 //System.out.print(str + ", ");
		 } 

   //**startswith
		 
		 String myStr17 = "Hello";
		 System.out.println(myStr17.startsWith("Hel"));   // true
		 System.out.println(myStr17.startsWith("llo"));   // false
		 System.out.println(myStr17.startsWith("o"));     // false
		 
		 //***
		 
		 String s="SachinTendulkar";    
		 System.out.println("Original String: " + s);  
		 System.out.println("Substring starting from index 6: " +s.substring(6));//Tendulkar    
		 System.out.println("Substring starting from index 0 to 6: "+s.substring(0,6)); //Sachin 

		 //**upper and lower
		 
		 String txt1 = "Hello World";
		 System.out.println(txt1.toUpperCase());
		 System.out.println(txt1.toLowerCase());
		 
		 //***trim
		 
		 String myStr20 = "       Hello World!       ";
		 System.out.println(myStr20);
		 System.out.println(myStr20.trim());
















	}

}
