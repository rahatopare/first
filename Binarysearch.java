
public class Binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[][] = {{-1,0,3,5,9,12},{-1,1,3,5,9,12}};
		int target =9;
		int numss[] ={-1,0,3,5,9,12};

//		System.out.println(findtarget(nums,target));
		
//		System.out.println(findtargetInArraysMatrix(nums, -2));
		
//		System.out.println(search(numss,target));

	}
	
	
	public static int shipWithinDays(int[] weigths, int days) {
		int low = getMax(weigths);
		int high=getSum(weigths);
		
		while(low<high) {
			int mid = (low+high)/2;
			if(canShip(weigths,days,mid)) {
				high=mid;
			} else {
				low=mid+1;
			}
			
		}
		return low;
	}
	private static boolean canShip(int[] weigths, int days, int capacity) {
		
		int daycount=1,currLoad=0;
		for(int w:weigths) {
			if(currLoad+w > capacity) {
				daycount++;
				currLoad=0;
			}
			currLoad+=w;
			if(daycount > days) return false;
			
		}
		
		
		return true;
	}


	private static int getMax(int[] weigths) {
		
		int max=0;
		for(int w: weigths) {
			max= Math.max(max, w);
		}
		return max;
	}

	private static int getSum(int[] weigths) {
		int sum=0;
		for(int w:weigths) {
			sum+=w;
		}
		return sum;
	}
	public int search(int[] nums,int target) {
		int left=0;
		int right =nums.length-1;
		
		while(left<=right) {
			int mid =(left=right)/2;
			
			if(nums[mid] == target) {
				return mid;
			} else if(nums[mid]>=nums[left]) {
				if(nums[left] <=target && target <= nums[mid]) {
					right=mid-1;
				} else {
					left = mid+1;
				}
			} else {
				if(nums[mid]<=target && target <= nums[right]) {
					left =mid+1;
				} else {
					right =mid-1;
				}
			}
			
		}
		return -1;
		
	}
	private static boolean findtargetInArraysMatrix(int[][] matrix, int target) {
		
		int m  = matrix.length;
		int n = matrix[0].length;
		
		if(m==0) return false;
		int start=0, end = m*n-1;
		
		while(start<=end) {
			int mid = (start+end)/2;
			int element = matrix[mid/n][mid%n];
			if(target==element) {
				return true;
			} else if(target < element) {
				end = mid-1;
			} else  {
				start= mid+1;
			}
		}
		return false;
		
	}

	private static int findtarget(int[] nums, int target) {
		System.out.println("hi");
		int left=0;
		int right=nums.length-1;
		
		while(left<=right) {
			
			int mid = ((left+right)/2 );
			if(target == nums[mid]) {
				return mid;
			}
			else if(target > nums[mid]) {
				 left = mid+1;
			} else {
				right = mid-1;
			}
		}
		
		return -1;
		
		
	}

}
