public class char_occ
{
    public static void main(String args[])
    {
        String s="Itview Solution";
        s=s.toLowerCase();
       // int arr[]=new int[26];
        int str_length=s.length();
        int count=0;
        for(int i=0;i<str_length;i++)
        {
            char c=s.charAt(i);
           // if(c>='a'&&c<='z')
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            {
              //arr[c-'a']++;
              count++;
            }   
        }
        System.out.println("count of vowels="+count);
        // for(int i=0;i<arr.length;i++)
        // {
        //     if(arr[i]>0)
        //     {
        //         System.out.println((char)('a'+i)+":"+arr[i]);
        //     }
        // }
    }
}