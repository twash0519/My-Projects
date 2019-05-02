package coreJavaProject0328;

public class TempPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//swap
		int[] nums = {2,7,8,0};
		//int temp = nums[0];//2
		//nums[0] = nums[3];//0
		//nums[3] = temp;
		


		int temp2 = nums[0+1];//7
		nums[0+1] = nums[3-1];//0
		nums[3-1] = temp2;
		//reverse array
		//inplace reverse array
		for(int i=0,j=nums.length-1;i<nums.length/2; i++,j--) {
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
			
		}

	}

}
