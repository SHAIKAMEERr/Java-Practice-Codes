class OverFlowException extends Exception
{
    @Override
    public String toString()
    {
        return "Stack is already full";
    }
    @Override
    public String getMessage()
    {
        return "Stack is full";
    }
}
class UnderFlowException extends Exception
{
    @Override
    public String toString()
    {
        return "Stack is Empty";
    }
    @Override
    public String getMessage()
    {
        return "No element is present inside the stack";
    }
}
class Stack
{
    int size;
    int s[];
    int top=-1;
    Stack(int size)
    {
        this.size=size;
        s=new int[size];
    }
    public void push(int n)throws OverFlowException
    {
        for(int i=0;i<s.length-1;i++)
        {
            if(s[i]<s.length-1)
            {
                s[top]=n;
                top++;
            }
            else
                throw new OverFlowException();
        }
    }
    public void pop()throws UnderFlowException
    {
        if(s[size-1]>=0)
        {
            s[size-1]=0;
            s[size]--;
        }
        else
            throw new UnderFlowException();
    }
}

