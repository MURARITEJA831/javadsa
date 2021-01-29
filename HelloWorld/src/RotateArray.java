
public class RotateArray {
	
	int gcd(int a, int b)
	{
		if (b == 0)
			return a;
		else
			return gcd(b,a%b);
		
	}
	
	void jagg(int[] arr,int d) 
	{
		int n = arr.length;
		d = d%n;
		int g = gcd(d,n);
		int temp;
		int j,k;
		for(int i=0;i<g;i++)
		{
			temp = arr[i];
			j = i;
			while(true)
			{
				k = j + d;
				if(k >=n)
					k = k-n;
				if (k == i)
					break;
				arr[j] = arr[k];
				j = k;	
			}
			arr[j] = temp;
		}
		
	}
			
	
	public void leftrotate(int[] arr,int d)
	{
		for(int i=0;i<d;i++)
		{
			leftrotatebyone(arr);
		}
	}
	public void leftrotatebyone(int [] arr)
	{
		int temp;
		int n = arr.length;
		temp = arr[0];
		for(int i=0;i<n-1;i++)
		{
			arr[i] = arr[i+1];
		}
		arr[n-1] = temp;
	}
	public void printArray(int [] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args)
	{
		RotateArray rotate = new RotateArray();
		int[] arr = {1,2,3,4,5,6,7,8};
		int d = 2;
		//rotate.leftrotate(arr,d);
		// it will take (n*d) complexity and constant O(1) space
		rotate.jagg(arr,d);
		rotate.printArray(arr);
		//Juggling algorithm takes O(n) time and constant space
	} 
	
}
