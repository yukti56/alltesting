package demo_package;

public class array_one {
	int[] arr = new int[5];
	char[] arr1= new char[5];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		array_one obj= new array_one();
		
		obj.arr[0]=10;
		obj.arr[1]=14;
		obj.arr[2]=9;
		obj.arr[3]=23;
		obj.arr[4]=1;
		
		System.out.println(obj.arr[3]);
		
		//for(int i=0;i<obj.arr.length;i++)
		{
		//	System.out.println("The "+(i+1)+" postion of array has value "+obj.arr[i]);
		}
		
		
		for(int i=0;i<obj.arr.length;i++)
		{
		  for(int j=(i+1); j<obj.arr.length;j++)
		  {
			if (obj.arr[i]<obj.arr[j])
			{
				int g=obj.arr[i];
				obj.arr[i]=obj.arr[j];
				obj.arr[j]=g;
			}
			
			for(int i1=0;i1<obj.arr.length;i1++)
			{
				System.out.println("The "+(i1+1)+" postion of array has value "+obj.arr[i1]);
			}
			
		  }
			  
		  }
		

	}

}
