//example of linear Search in 'array'

import java.util.*;

public class Main{
    public static int linearSearch(int numbers[] , int key){
        
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        
        return -1;
        
    }
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int numbers[]={2,34,554,23,6,1,67,88,65,7};
	
	int key;
	System.out.print("enter the number : ");
	key = sc.nextInt();
	
	int index = linearSearch(numbers , key);
	
	if(index==-1){
	    System.out.print("not found");
	}else{
	    System.out.print("the key at index " + index);
	}
	
	}
}

// linear Search example by using String

import java.util.*;

public class Main{
    public static int linearSearch(String numbers[] , String key){
        
        for(int i=0;i<numbers.length;i++){
            if(numbers[i].equals(key)){
                return i;
            }
        }
        
        return -1;
        
    }
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	String numbers[]={"apple" , "banana" , "mango" , "pineapple"};
	
	String key;
	System.out.print("enter the word : ");
	key = sc.next();
	
	int index = linearSearch(numbers , key);
	
	if(index==-1){
	    System.out.print("not found");
	}else{
	    System.out.print("the key at index " + index);
	}
	
	}
}

// to find the largest and smallest value from the array...

import java.util.*;

public class Main{
    public static int getlargest_getsmallest(int numbers[]){
        
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        
        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
               largest=numbers[i];
            }
             if(smallest>numbers[i]){
               smallest=numbers[i];
            }   
            
        }
        System.out.println("the smallest number is " + smallest);
        return largest;
        
    }
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int numbers[]={2,4,6,8,5,38,65,3};
	
  System.out.print("the largest number is " + getlargest_getsmallest(numbers));
	}
}

import java.util.*;

public class Main{
    public static int binary_search(int numbers[],int key){
        
     int start=0,end=numbers.length-1;
     
     while(start<=end){
         int mid=(start + end)/2;
         
         if(numbers[mid] == key){
             return mid;
         }
         
         if(numbers[mid] < key){
             start = mid + 1;
         }
         
         if(numbers[mid] > key){
             end =mid-1;
         }
     }
     
     return -1;
        
    }
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int numbers[]={2,4,6,8,10,12,14};
	
	System.out.print("enter the key : ");
	int key=sc.nextInt();
	
  System.out.print("the number is at index " + binary_search(numbers,key));
	}
}....




YAHA SE IMP INTERVIEW QUESTIONS START HO RAHE ALL ARE VERY IMP 

1) two sum 

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        int l=0 , r=numbers.length-1;

        while(l<r){
            int sum = numbers[l] + numbers[r];
            if(sum == target){
                return new int[]{l+1 ,r+1};
            }else if(sum < target){
                l++;
            }else{
                r--;
            }
        }

        return new int[]{-1,-1};
    }

    2) best time to buy and sell stock 

    class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i=0;i<prices.length;i++){
            if(minPrice > prices[i]){
                minPrice = prices[i];
            }else{
                maxProfit = Math.max(maxProfit , prices[i] - minPrice);
            }
        }

        return maxProfit;
    }
}

3) contains duplicate number in array 

class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        for(int i=0 ; i<nums.length ;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                   return true;
                   
                }
            }
        }

        return false;
    }
}

4) product of array except self 

ex: {1,2,3,4}...input
{24,12,8,6}...output

class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        int[] ans = new int[n];

        ans[0] = 1;

        for(int i=1;i<n;i++){
            ans[i] = ans[i-1] * nums[i-1];

        }

        int suffix =1;

        for(int i=n-1;i>=0;i--){
            ans[i] *= suffix;
            suffix *= nums[i];
        }

        return ans;
    }
}

5) maximum subarray by kadane algorithm ....with negative num also

class Solution {
    public int maxSubArray(int[] nums) {
        int ms = nums[0];
        int cs = 0;

        for(int i = 0; i < nums.length; i++){
            cs += nums[i];
            ms = Math.max(ms, cs);

            if(cs < 0){
                cs = 0;
            }
        }

        return ms;
    }
}

6)maximum product subarray 

class Solution {
    public int maxProduct(int[] nums) {

        int max = nums[0];
        int min = nums[0];
        int ans = nums[0];

        for(int i = 1; i < nums.length; i++){

            if(nums[i] < 0){
                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(nums[i], max * nums[i]);
            min = Math.min(nums[i], min * nums[i]);

            ans = Math.max(ans, max);
        }

        return ans;
    }
}

7)find minimum in rotated sorted array

class Solution {
    public int findMin(int[] nums) {
       int low=0 , high=nums.length-1;
       int ans=Integer.MAX_VALUE;

       while(low<=high){
        int mid=(low + high)/2;
        if(nums[low] <= nums[mid]){
            ans=Math.min(ans , nums[low]);
            low = mid + 1;
        }else{
            high = mid -1;
            ans=Math.min(ans,nums[mid]);
        }
       }

       return ans; 
    }
}

8) search in rotated sorted array

class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while(low <= high) {
            int mid = (low + high) / 2;

            if(nums[mid] == target) return mid;

            // left sorted
            if(nums[low] <= nums[mid]) {
                if(nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            // right sorted
            else {
                if(nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }
}

9)3sum

import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++) {
            // skip duplicates for i
            if(i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1;
            int right = nums.length - 1;

            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if(sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    // skip duplicates for left
                    while(left < right && nums[left] == nums[left + 1]) left++;
                    // skip duplicates for right
                    while(left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;
                }
                else if(sum < 0) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return result;
    }
}