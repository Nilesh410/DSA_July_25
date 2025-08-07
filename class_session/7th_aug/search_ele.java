public class search_ele
{
    public static void main(String args[])
    {
        int arr[][]={{3,2,1},{4,5,6},{7,8,9}};
        int key=4;
        int flag=0;
        //difference between length and length()
        //length-> no of ele in array
        // length()-> no of char in string
        //arr.length-> no of rows in 2D array
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                if(arr[i][j]==key)
                {
                    System.out.println("Element present in array",i,j);
                    flag=1;
                }
            }
        }
        if(flag==0)
            System.out.println("Element is not present");
    }
}