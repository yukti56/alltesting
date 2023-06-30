package demo_package;

public class constructor {
	
	int a;
	String name;
	
	//return type function name(arrgument)
	//classname (argument){}
	
	constructor(){
		a=35;
		 name="nill";
		System.out.println("this is no argument constructor");
	}
	
	constructor(int v,String d){
		a=v;
		name=d;
		
		System.out.println("this is argument constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		constructor obj= new constructor();
		System.out.println(obj.a);
		System.out.println(obj.name);
		//constructor obj1= new constructor(54,"devil");
		//System.out.println(obj1.a);
		//System.out.println(obj1.name);
		
		

	}

}
