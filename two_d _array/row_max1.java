public class row_max1
{
    public static void main(String args[])
    {
        int arr[][]={{1,0,1},{1,0,0},{1,1,1}};
        System.out.println("Array elements are:=");
        int max_count=0;
        int index=-1;
        for(int i=0;i<arr.length;i++)
        {
            int current_count=0;
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]==1)
                {
                    current_count++;
                }     
            }
            if(max_count<current_count)
                {
                    index=i;
                    max_count=current_count;
                }
        }
        System.out.println("row index have max no of 1="+index);
    }

}