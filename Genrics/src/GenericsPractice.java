public class GenericsPractice<T>
{
    T data;
    public GenericsPractice(T d)
    {
        this.data=d;
    }
    public T get()
    {
        return data;
    }
    public String toString()
    {
        return "Given Data = "+data+"\nType of Data : "+data.getClass();
    }
}
