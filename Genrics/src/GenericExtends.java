public class GenericExtends <T extends CustomArrayList<T>>
{
    public void showMethods()
    {
        CustomArrayList.class.getMethods();
    }
    public void showFields()
    {
        CustomArrayList.class.getDeclaredFields();
    }
}
