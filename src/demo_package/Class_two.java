package demo_package;

public class Class_two extends class_one {
	
	int c=78;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		class_one obj1 = new class_one();
		System.out.println(obj1.a);
		//System.out.println(obj1.c);
		obj1.add();
		class_one obj2 = new Class_two();
		Class_two obj3 = new Class_two();
		System.out.println(obj2.a);
		System.out.println(obj3.a);
		//System.out.println(obj2.c);// we can not access child class data in same child class
		System.out.println(obj3.c);
		

	}
	//void add()
	//{
		//System.out.println("this is addtion of class_one");
	//}

	
}
