class Singleton
{
    static float milk;
    static float water;
    static float sugar;
    static float coffeePowder;
    private static  Singleton coffeeMachine=null;
    private Singleton()
    {
        milk=10.05f;
        water=5.55f;
        sugar=1.23f;
        coffeePowder=0.750f;
    }
    public static Singleton getCoffee()
    {
        if(coffeeMachine==null)
            coffeeMachine=new Singleton();
        return coffeeMachine;
    }
}
