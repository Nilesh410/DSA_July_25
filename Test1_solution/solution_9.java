public class solution_9
{
    public static void main(String args[])
    {
        int arr[]={2,1,3,5};
        System.out.println("Missing ele="+missing_ele(arr,arr.length));
    }
    public static int missing_ele(int arr[],int n)
    {
        int N=n+1;
        int first_n_sum=(N*(N+1))/2;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        return (first_n_sum-sum);
    }
}