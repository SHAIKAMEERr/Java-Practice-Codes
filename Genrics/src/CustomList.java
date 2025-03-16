public class CustomList <T>
{
    int size=0;
    int default_size=10;
    T[] list=(T[])new Object[default_size];
    public void add(T element)
    {
        if(isFull())
        {
            reSize();
        }
            list[size++]=element;
    }
    public boolean isFull()
    {
        return size==list.length;
    }
    public void reSize()
    {
        T[] demo=(T[])new Object[size*2];
        for(int i=0;i<list.length;i++)
        {
            demo[i]=list[i];
        }
        list=demo;
    }
    public T get(int index)
    {
        return list[index];
    }
    public T get(T element)
    {
        T index = null;
        for(int i=0;i<list.length;i++)
        {
            if(element==list[i])
            {
                index=list[i];
            }
        }
        return index;
    }
    public void getAll()
    {
        System.out.print("[ ");
        for(int i=0;i<list.length;i++)
        {
            if(list[i]!= null)
            {
                System.out.print(list[i]);
                if(i< list.length-2)
                {
                    System.out.print(", ");
                }
            }
        }
        System.out.print("]");
    }
    public int length()
    {
        return list.length;
    }
    public void remove(int index)
    {
        list[index]=list[++index];
    }
    public void remove(T data)
    {
        for(int i=0;i< list.length;i++)
        {
            if(list[i]==data)
            {
                list[i]=list[++i];
            }
        }
    }
    public void removeAll()
    {
        list=null;
    }
}
