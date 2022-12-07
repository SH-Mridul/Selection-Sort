package SelectionSort;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] nums = {5,4,3,2,1};
		SelectionSort(nums);
		System.out.println(Arrays.toString(nums));
	}
	
	
	public static void SelectionSort(int nums[])
	{
		for(int i = 0; i<nums.length; i++)
		{
			int last = nums.length - i -1;
			int maxInd = getMax(nums,0,last);
			swap(nums,maxInd,last);
		}
	}
	
	//find max index
	public static int getMax(int arr[],int start, int end)
	{
		int max = start;
		
		for(int i = start; i<=end; i++)
		{
			if(arr[max]<arr[i])
				max = i;
				
		}
		
		return max;
	}
	
	
	//swap max index with last
	public static void swap(int nums[],int first,int second)
	{
		int temp = nums[first];
		nums[first] = nums[second];
		nums[second] = temp;
	}
}
