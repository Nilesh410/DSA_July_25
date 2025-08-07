public class solution_8
{
    public static void main(String args[])
    {
        int arr[]={1,1,0,0,1,1,1};
        System.out.println("consecutive ones="+consecutive_one(arr,arr.length));
    }
    public static int consecutive_one(int arr[],int n)
    {
        int count=0;
        int max_count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==1)
                count++;
            else
                count=0;
            
            if(max_count<count)
            {
                max_count=count;
            }
        }
        return max_count;
    }
}