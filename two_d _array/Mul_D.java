public class Mul_D
{
    public static void main(String args[])
    {
        int arr[][]={{2,1},{4,2},{5,2}};
        System.out.println("arr="+arr);

        System.out.println("Array elements are=");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}