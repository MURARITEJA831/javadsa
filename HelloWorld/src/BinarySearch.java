
class BinarySearch {
	int Search(int[] arr,int x,int l,int h)
	{
		if(h>=l)
		{
			int mid = (l+h)/2;
			if(arr[mid] == x)
			{
				return mid+1;
			}
			if (arr[mid] > x)
			{
				return Search(arr,x,l,mid-1);
			}
			else
			{
				return Search(arr,x,mid+1,h);
			}
		}
		return -1;
	}
	
	public static void main(String[] args)
	{
		int arr[] = {1,2,3,4,5,6,7,8};
		int l = 0;
		int h = (arr.length) - 1;
		int x = 12;
		BinarySearch search1 = new BinarySearch();
		System.out.println(search1.Search(arr,x,l,h)+"th position");
	}
}
