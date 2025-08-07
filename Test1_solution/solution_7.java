public class solution_7
{
    public static void main(String args[])
    {
        int arr[]={2,3,5,6};
        System.out.println("arr legnth="+arr.length);
        int result=odd_count(arr,arr.length);
        System.out.println("No of odd ele="+result);
    }

    public static int odd_count(int arr[],int n)
    {
        int count=0;
        for(int i=0;i<n;i++)
        {
            if((arr[i]%2)!=0)
                count++;
        }
        return count;
    }
}