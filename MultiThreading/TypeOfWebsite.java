import java.util.*;
class TypeOfWebsite
{
    public static void main(String args[])
    {
        System.out.println("Java program to find the type of a website : ");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter URL you want to check :");
        String url=s.nextLine();
        int i=url.indexOf(':');
        String prototype=url.substring(0,i);
        int n=url.indexOf('.');
        int x=url.lastIndexOf('.');
        String websiteName=url.substring((n+1),x);
        int len=url.length();
        String websiteType=url.substring((x+1),len);
        System.out.println("Your website name is : "+websiteName);
        switch(prototype)
        {
            case "http":
            System.out.println("Your website is in Hypertext Transfer Protocal");
            break;
            case "https":
            System.out.println("Your website is in Hypertext Transfer Secured Protocal");
            break;
            case "tcp":
            System.out.println("Your website is in Transfered Control Protocal");
            break;
            default:
            System.out.println("Your website is in unrecogonised protocal :");
        }
        switch(websiteType)
        {
            case "com":
            System.out.println("Commercial website");
            break;
            case "edu":
            System.out.println("Educational website");
            break;
            case "org":
            System.out.println("Orginisation website");
            break;
            case "gov":
            System.out.println("Government website");
            break;
            case "in":
            System.out.println("Indian website ");
            break;
            case "us":
            System.out.println("Us website");
            break;
            default:
            System.out.println("Other type of website");
        }
    }
}