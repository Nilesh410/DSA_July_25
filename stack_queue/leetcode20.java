import java.util.*;
public class leetcode20
{
    public static void main(String args[])
    {
        String s="{[(])}";
        boolean result=isValidParentheses(s);
        if(result)
            System.out.println("It is valid parentheses");
        else
            System.out.println("It is not valid parentheses");
    }

    public static boolean isValidParentheses(String s)
    {
        Stack <Character> st=new Stack<Character>();

        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='{'||c=='['||c=='(')
                st.push(c);
            else
            {
                if(st.empty())
                    return false;
                else
                {
                    char peek=st.peek();
                    if((c=='}'&&peek=='{')||(c==')'&&peek=='(')||(c==']'&&peek=='['))
                        st.pop();
                    else
                        return false;
                }
            }
        }
        return st.empty();
    }
}