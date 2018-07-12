import java.util.Scanner;

public class Unbalanced 
{
    static class Stack
    {
        int top=-1;
        char[] ch=new char[100];
        
        void push(char x)
        {
            if(top==99)
            {
                System.out.print("stack is full");
            }
            else
            {
                ch[++top]=x;
            }
        }
        char pop()
        {
            if(top==-1)
            {
                System.out.print("underflow error");
                return ' ';
            }
            else
            {
                char ele=ch[top];
                top--;
                return ele;
            }
        }
        boolean isempty()
        {
            if(top==-1)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
    
    public static boolean match(char ch1,char ch2)
    {
        if(ch1=='('&& ch2==')')
        {
            return true;
        }
        else if(ch1=='{' && ch2=='}')
        {
            return true;
        }
        else if(ch1=='['&& ch2==']')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public static boolean balanced(char[] exp,int n)
    {
        Stack st=new Stack();
        for(int i=0;i<n;i++)
        {
            if(exp[i]=='('|| exp[i]=='{'||exp[i]=='[')
            {
                st.push(exp[i]);
            }
            if(exp[i]==')'|| exp[i]==']'|| exp[i]=='}')
            {
                    if(st.isempty())
                    {
                        return false;
                    }
                    else
                    {
                        boolean str=match(st.pop(),exp[i]);
                        if(!str)
                        {
                            return false;
                        }
                    }
            }
        }
        return(st.isempty()?true:false);
    }
    
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] exp=s.toCharArray();
        int n=exp.length;
        boolean res=balanced(exp,n);
        System.out.print((res)?"balanced":"unbalanced");
        sc.close();
    }
}

