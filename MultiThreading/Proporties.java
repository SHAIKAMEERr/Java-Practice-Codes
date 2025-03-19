import java.util.Scanner;
class Proporties
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Product pt=new Product(123,(short) 10);
        Customer ch=new Customer("10 th Cross, BLR",12345678909l);
        System.out.println("enter the class no which you want to access : ");
        System.out.println("1. Product Class");
        System.out.println("2. Customer Class");
        int choice=sc.nextInt();
        if(choice==1)
        {
            System.out.println("Product Id ="+pt.getItem());
            System.out.println("Product Name = "+pt.getName());
            System.out.println("Product Price = "+pt.getPrice());
            System.out.println("Product Quality = "+pt.getQuality());
        }
        else if(choice==2)
        {
            
            System.out.println("Customer Id ="+ch.getId());
            System.out.println("Customer Name = "+ch.getName());
            System.out.println("Customer Address = "+ch.getAdress());
            System.out.println("PCustomer PhoneNo = "+ch.getPhoneno());
        }
        else
        {
            System.out.println("Your choice is wrong ");
        }
    }
}
class Product
{
    private int itemno;
    private String name;
    private double price;
    private short quality;
    public int getItem()
    {
        return itemno;
    }
    public String getName()
    {
        return name;
    }
    public double getPrice()
    {
        return price;
    }
    public void setPrice(double p)
    {
        price=p;
    }
    public int getQuality()
    {
        return quality;
    }
    public void setQuality(short q)
    {
        quality=q;
    }    
    public Product()
    {
        itemno=10;
        name="Ameer";
        price=100;
        quality=12;
    }
    public Product(int p,short q)
    {
        itemno=10;
        name="Ameer";
        price=p;
        quality=q;
    }
    public Product(int p)
    {
        itemno=10;
        name="Ameer";
        price=p;
        quality=12;
    }
    public Product(short s)
    {
        itemno=10;
        name="Ameer";
        price=1200;
        quality=s;
    }
}
class Customer
{
    private String custId;
    private String name;
    private String address;
    private long phoneno;
    public String getId()
    {
        return custId;
    }
    public String getName()
    {
        return name;
    }
    public String getAdress()
    {
        return address;
    }
    public void setAdress(String s)
    {
        address=s;
    }
    public long getPhoneno()
    {
        return phoneno;
    }
    public Customer()
    {
        custId="21601F";
        name="Bablu";
        address="14/45G-B1";
        phoneno=9876543210l;
    }
    public Customer(String s)
    {
        custId="21601F";
        name="Bablu";
        address=s;
        phoneno=9876543210l;
    }
    public Customer(String s,long l)
    {
        custId="21601F";
        name="Bablu";
        address=s;
        phoneno=l;
    }
}