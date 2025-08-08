//JAVA :- 
// 1. Declare the string 
// 2. Initialize the string 
// 3. Print string char in forward direction
// 4. Print char in reverse order
// (without and with modify the original string)

public class string1
{
    public static void main(String args[])
    {
        String s="Hello Programmer";
        System.out.println("s="+s); //to print the string 

        //Length of the string
        System.out.println("length="+s.length()); 

        for(int i=s.length()-1;i>=0;i--)
        {
            System.out.println(s.charAt(i));
        }
    }
}