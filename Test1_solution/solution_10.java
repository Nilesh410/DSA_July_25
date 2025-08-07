public class solution_10
{
    public static void main(String args[])
    {
        int arr[] = {2,6,5,8,11};
        int target = 14;

        int result[]=new int[2];
        result=target_match(arr,arr.length,target);
        System.out.println("index:"+result[0]+" and "+result[1]);
    }
    public static int [] target_match(int arr[],int n,int target)
    {
        int result[]={-1,-1};
        for(int i=0;i<n-1;i++)
        {
            for (int j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    System.out.println("Yes");
                    result[0]=i;
                    result[1]=j;
                    return result;
                }
            }
        }
        return result;
    }
}