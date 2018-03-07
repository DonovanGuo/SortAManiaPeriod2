
public abstract class SortCompetition implements Comparable <SortCompetition> {
	
	
	
	int number;
	double totalTime = 0.0;
	
	public int compareTo(SortCompetition t)
	{
		return (int)(this.totalTime - t.totalTime); 
	}
	
	public void setNumber(int n)
	{
		number = n;
	}
	public int getNum()
	{
		return number;
	}
	
	public void addTime(double avg)
	{
		totalTime += avg;
	}
	
	public abstract int challengeOne(int[] arr);
	
	public abstract int challengeTwo(String[] arr, String query);
	
	public abstract int challengeThree(int[] arr);
	
	public abstract int challengeFour(int[][] arr);
	
	public abstract int challengeFive(Comparable[] arr, Comparable query);
	
	//Add a custom greeting so your sorter can introduce itself
	public abstract String greeting();
	// Insertion Sort Helper methods
	public static void insertionSort(int[]arr)
	{
		for(int i = 2; i < arr.length; i++)
		{
			int j = i;
			while((j> 1) && (arr[j-1] > arr[j]))
			{
				swapInt(arr,j,j-1);
				j= j-1;
			}
		}
	}
	public static void swapInt ( int[]arr, int mama, int mio )
	{
		int store = arr[mama];
		arr[mama]= arr[mio];
		store = arr[mio];
	}
}

