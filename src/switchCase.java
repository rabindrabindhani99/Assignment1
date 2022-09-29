import java.util.Scanner;

public class switchCase
{
    public static void main(String[] args)
    {
        System.out.println("Persons in the database: Rabindra, Prasanta, Narendra, Bibhuti, Sudeep, Saubhagya, Bibhisan, Himanshu, Ashutosh");
        System.out.println("Enter a person name from above to get Juicy details about him:");
        Scanner scan=new Scanner(System.in);
        String name=scan.next();
        switch(name)
        {
            case "Rabindra":
                System.out.println("Girlfriend: Guduli");
                break;
            case "Prasanta":
                System.out.println("Girlfriend: Chinu");
                break;
            case "Narendra":
                System.out.println("Girlfriend: Too many Girl friends. Ex:Sunanda");
                break;
            case "Bibhuti":
                System.out.println("Girlfriend: Tulasi");
                break;
            case "Sudeep":
                System.out.println("Girlfriend: Not available, Ex:Sunanda");
                break;
            case "Saubhagya":
                System.out.println("Girlfriend: Mousumi");
                break;
            case "Bibhisan":
                System.out.println("Girlfriend: Chiraswati");
                break;
            case "Himanshu":
                System.out.println("Girlfriend: Not available, Ex:Lopa");
                break;
            case "Ashutosh":
                System.out.println("Girlfriend: Simi");
                break;

            default:
                System.out.println("The girlfriend name of "+name+" is not available in database");
                scan.close();

        }
    }
}