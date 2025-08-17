class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        //int col=matrix[0].length;

        for(int i=0;i<row;i++)
        {
            boolean flag = binarySearch(matrix[i], target);
            if (flag) 
                return true;
    
        }
        return false;
    }
    public boolean binarySearch(int []arr,int target)
    {
        int size=arr.length;
        int low=0,high=size-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==target)
                return true;
            else if(arr[mid]>target)
                high=mid-1;
            else
                low=mid+1;
        }
        return false;
        
    }
}
public class leetcode_240
{
    public static void main(String args[])
    {
        Solution s=new Solution();
        int arr[][]={{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19},
        {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24},
        {18, 21, 23, 26, 30}
    };
        boolean result=s.searchMatrix(arr,16);
        System.out.println(result?"ele presemt":"ele not present");
    }
}