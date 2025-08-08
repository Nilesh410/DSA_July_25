public class clmn_index
{
    public static void main(String args[])
    {
        int arr[][]={{4,2,7},{3,4,6},{4,8,6}};

        //To display the array elements
        System.out.println("Matrix elements are=");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }

        // //Transpose of matrix
        // System.out.println("Transpose of matrix=");
        // for(int i=0;i<arr.length;i++)
        // {
        //     for(int j=0;j<arr[0].length;j++)
        //     {
        //         System.out.print(arr[j][i]+" ");
        //     }
        //     System.out.println("");
        // }

        //Return the clmn index that has max no of even no
        System.out.println("Index of clmn that has max no of even ele=");
        int max_count=0;
        int index=-1;
        int max_sum=0;
        int max_sum_index=-1;
        for(int j=0;j<arr[0].length;j++)
        {
            int count=0;
            int sum=0;
            for(int i=0;i<arr.length;i++)
            {
                sum+=arr[i][j];
                if(arr[i][j]%2==0)
                    count++;
            }
            if(max_count<count)
            {
                max_count=count;
                index=j;
            }
            if(max_sum<sum)
            {
                max_sum=sum;
                max_sum_index=j;
            }
          
        }
        System.out.println(index);
        System.out.println(max_sum_index);

    }
}