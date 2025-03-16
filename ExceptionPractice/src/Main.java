class Main {
    public static void main(String[] args) throws Exception
    {
        Stack s = new Stack(5);
        try
        {
            s.push(29);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
