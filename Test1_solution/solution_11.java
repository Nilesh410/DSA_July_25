public class solution_11
{
    public static void main(String args[])
    {
        int arr[]={2,2,1,1,2};
        int count=0;
        int ele=0;
        for(int i=0;i<arr.length;i++)
        {
            if(count==0)
            {
                ele=arr[i];
            }
            count+=(ele==arr[i])?1:-1;
        }
        System.out.println("majority ele="+ele);
    }
}