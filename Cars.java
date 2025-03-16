import java.util.Scanner;
class Cars
{
    public static void main(String[] args)
    {
        Models ml=new Models();
        CylinderCon cyl=new CylinderCon(15.5,7.5);
        System.out.println(cyl.Lidarea());
        System.out.println(ml.car1("Ferrari", "Sports Car", "Diesal"));
    }
}
class Models
{
    String name;
    String type;
    String engine_type;
    String car1(String name,String type,String engine_type)
    {
        this.name=name;
        this.type=type;
        this.engine_type=engine_type;
        return "Car Name : "+name+"\n"+"Car Type : "+type+"\n"+"Engine Type : "+engine_type;
    }
    String car2(String name,String type)
    {
        this.name=name;
        this.type=type;
        return "Car Name : "+name+"\n"+"Car Type : "+type+"\n"+"Engine Type : "+engine_type+"Diesel Engine ";
    }
}