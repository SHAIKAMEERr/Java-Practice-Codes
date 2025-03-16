public class CustomArrayList<T>
{
    int size=0;
    int default_size=10;
    Object[] list=new Object[default_size];
    public void add(T element)
    {
        if(isFull())
        {
            reSize();
        }
        list[size++]=element;
    }
    public Boolean isFull()
    {
        return size==list.length;
    }
    public void reSize()
    {
        Object []temp=new Object[list.length*2];
        for(int i=0;i<list.length;i++)
        {
            temp[i]=list[i];
        }
        list=temp;
    }
    public int length()
    {
        return list.length;
    }
    public void set(int index,T data)
    {
        list[index]=data;
    }
    public Object get(int index)
    {
        return list[index];
    }
    public void remove(int index)
    {
       if((list[index])!=null)
       {
           list[index]=list[index++];
       }
    }
    public void removeAll()
    {
        list=null;
    }
    public void getAll()
    {
        System.out.print("[ ");
        for (int i=0;i<list.length;i++)
        {
            if(list[i]!=null)
            {
                System.out.print(list[i] + " ");
            }
        }
        System.out.print("]");
        System.out.println();
    }
}