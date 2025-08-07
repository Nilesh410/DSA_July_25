public class char_ele
{
    public static void main(String args[])
    {
        int num[]=new int[256];
        String s="ITVIEW";
        for(int i=0;i<s.length();i++)
        {
            num[s.charAt(i)]++;
        }
        for(int i=0;i<256;i++)
        {
            System.out.print(num[i]+" ");
        }
    }
}