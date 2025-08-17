class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length;

        for(int i=0;i<row;i++)
        {
            if(matrix[i][0]<=target&&target<=matrix[i][col-1])
            {
                return binarySearch(matrix[i],target);
            }
    
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
public class leetcode_74
{
    public static void main(String args[])
    {
        Solution s=new Solution();
        int arr[][]={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        boolean result=s.searchMatrix(arr,20);
        System.out.println(result?"ele presemt":"ele not present");
    }
}