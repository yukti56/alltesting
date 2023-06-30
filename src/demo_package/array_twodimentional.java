package demo_package;

public class array_twodimentional {
	int[][] arr=  new int[2][2];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		array_twodimentional obj = new array_twodimentional();
		
		obj.arr[0][0]=45;
		obj.arr[0][1]=52;
		obj.arr[1][0]=87;
		obj.arr[1][1]=25;
		
		System.out.println(obj.arr.length);
		for(int i=0; i<obj.arr.length;i++) { 
			for(int j=0;j<obj.arr.length;j++)
			{
				System.out.println("The value of "+i+" and "+j+" index is" +obj.arr[i][j]);
			}
		}
		
		

	}

}
