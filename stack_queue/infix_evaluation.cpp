#include<iostream>
#include<stack>
#include<math.h>
using namespace std;

int precedence(char op)
{
    if(op=='+'|| op=='-')return 1;
    else if(op=='*'|| op=='/')return 2;
    else if(op=='^')return 3;
    else return 0;

}
int applyOp(int no1,int no2,char op)
{
    switch(op)
    {
        case '+':return no1+no2;
        case '-':return no1-no2;
        case '*':return no1*no2;
        case '/':return no1/no2; //assume no2!=0
        case '^':return pow(no1,no2);
    }
    return 0;
}
int evaluate(string exp)
{
    stack<int>operands;
    stack<char>oper;

    for(int i=0;i<exp.length();i++)
    {
        if(exp[i]==' ')
            continue;
        else if(isdigit(exp[i]))
        {
            int value=0;
            while(i<exp.length()&& isdigit(exp[i]))
            {
                value=(value*10)+(exp[i]-'0');
                i++;
            }
            operands.push(value);
            i--;
        }
        else if(exp[i]=='(')
        {
            oper.push(exp[i]);
        }
        else if(exp[i]==')')
        {
            while(!oper.empty()&&oper.top()!='(')
            {
                int no1=operands.top();
                operands.pop();
                int no2=operands.top();
                operands.pop();
                char op=oper.top();
                oper.pop();
                operands.push(applyOp(no2,no1,op));
            }
            if(!oper.empty())
                oper.pop(); //remove ')'
        }
    
        else 
        {
            while(!oper.empty()&& precedence(oper.top())>=precedence(exp[i]))
            {
                int no1=operands.top();
                operands.pop();
                int no2=operands.top();
                operands.pop();
                char op=oper.top();
                oper.pop();
                operands.push(applyOp(no2,no1,op));
            }
            oper.push(exp[i]);
        }
    }
    while(!oper.empty())
    {
               int no1=operands.top();
                operands.pop();
                int no2=operands.top();
                operands.pop();
                char op=oper.top();
                oper.pop();
                operands.push(applyOp(no2,no1,op));
    }
    return operands.top();
}
int main()
{
    string exp;
    cout<<"Enter the infix expression=";
    getline(cin,exp);
    cout<<"result="<<evaluate(exp)<<endl;
    return 0;
}