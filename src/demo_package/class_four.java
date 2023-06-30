package demo_package;

public class class_four {
	
	int a= 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class_four obj = new class_four();
				obj.add(23);

	}
	public void add(int a) {
		System.out.println(a);
		System.out.println(this.a);
	}

}
