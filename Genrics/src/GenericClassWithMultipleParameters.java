public class GenericClassWithMultipleParameters <T, E>
{
    T data;
    E input;
    public GenericClassWithMultipleParameters(T d,E i)
    {
        this.data=d;
        this.input=i;
    }
    public T getData()
    {
        return data;
    }
    public E getInput()
    {
        return input;
    }
    public String toString()
    {
        return "Value Of Data = "+data+"\nClass of Given Data = "+data.getClass()+"\nValue of Input ="+input+"\nClass of given Input = "+input.getClass();
    }
}
