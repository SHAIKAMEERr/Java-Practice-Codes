import java.util.*;
class SwitchThree
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter URL : ");
        String url=sc.nextLine();
        String protocal=url.substring(0,url.indexOf(":"));
        String domineName=url.substring(url.indexOf(".")+1,url.lastIndexOf("."));
        String typeOfWebsite=url.substring(url.lastIndexOf("."),url.length());
        System.out.println("DomineName = "+domineName);
        switch(protocal)
        {
            case "http":
            System.out.println("Hyper Text Transfer Protocal ");
            break;
            case "https":
            System.out.println("Hyper Text Transfer Protocal's ");
            break;
            case "ftp":
            System.out.println("File Transfer Protocal ");
            break;
            case "smtp":
            System.out.println("S M  Transfer Protocal ");
            break;
            default:
            System.out.println("Invalid ");
            break;
        }
    }
}