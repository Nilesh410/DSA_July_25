import java.util.*;
public class leetcode_682
{
    public static void main(String args[])
    {
        String s[]={"5","2","C","D","+"};

        System.out.println(calPoint(s));
    }
    public static int calPoint(String s[])
    {
        Stack <Integer> st=new Stack <Integer>();
        for (String ele:s)
        {
            if(ele.equals("C"))
            {
                if(!st.empty())
                    st.pop();
            }
            else if(ele.equals("D"))
            {
                if(!st.empty())
                {
                    st.push(st.peek()*2);
                }
            }
            else if(ele.equals("+"))
            {
                if(st.size()>=2)
                {
                    int last_ele=st.pop();
                    int last_sec_ele=st.peek();
                    st.push(last_ele);
                    st.push(last_ele+last_sec_ele);
                }
            }
            else
            {
                    st.push(Integer.parseInt(ele));
            }
        }
        int result=0;
        while(!st.empty())
        {
            result+=st.pop();
        }
        return result;
    }
}