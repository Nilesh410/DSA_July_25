public class char_occu
{
    public static void main(String args[])
    {
        String s="hello programmer";
        //Find out the each char their occurance --how many times present
        int arr[]=new int [26];
       
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c>='a'&&c<='z')
            {
                arr[c-'a']++;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
            {
               System.out.println("char "+(char)(i+'a')+" count="+arr[i]);
            }
        }
    }
}