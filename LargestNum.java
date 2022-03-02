package edu.wku.largestnum;

public class LargestNum {

	public static void main(String[] args) {
		System.out.println(
				findLargestNum(new int[]{1,2,3})==3);
		System.out.println(
				findLargestNum(new int[]{-2,-9,-1,-4})==-1);
		System.out.println(
				findLargestNum(new int[]{10,-15,-1,16,98,-100,0})==98);
		System.out.println(
				findLargestNum(new int[]{})==-1);
	}

	private static int findLargestNum(int[] nums) {
		//array is empty
		if(nums.length==0) {
			return -1;
		}
		//array is not empty
		else { int largestnum = nums[0];
		for (int i=0;i<nums.length;i++) {
			if (nums[i]>largestnum) {
				largestnum=nums[i];
			}
		
		}
		return largestnum;
	}

}
}