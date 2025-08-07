import java.util.*;
public class reverse_string
{
    public static void main(String args[])
    {
        String s="Hello Programmer";
        System.out.println("String before reverse:"+s);
        System.out.println("Reverse String:"+reverse_string_func(s));
    }
    public static String reverse_string_func(String s)
    {
        Stack <String> st=new Stack<String>();
        s+=" ";
        String str="";
        int i;
        for (i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                st.push(str);
                str="";
            }
            else
            {
                str+=s.charAt(i);
            }
        }
        String ans="";
        while(st.size()!=1)
        {
            ans+=st.peek()+" ";
            st.pop();
        }
        ans+=st.peek();
        return ans;
    }
}