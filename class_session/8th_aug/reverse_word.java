import java.util.*;
public class reverse_word
{
    public static void main(String args[])
    {
        String str="Itview Solution";

        str+=" ";
        String s="";
        Stack <String> st=new Stack<String>();

        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(c==' ')
            {
               st.push(s);
               s="";
            }
            else
            {
                s+=c;
            }
        }
        String reverse="";
        while(st.size()!=1)
        {
            reverse+=st.peek()+" ";
            st.pop();
        }
        reverse+=st.peek();
        System.out.println("reverse string by word="+reverse);
    }
}