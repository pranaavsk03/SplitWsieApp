import java.util.ArrayList;
import java.util.Scanner;
public class SplitWise
{

    public static void main(String [] args)
    {

        ArrayList<String> friendName =new ArrayList<>();
        boolean runninng =true;
        while(runninng) {
            Scanner sc = new Scanner(System.in);
            System.out.println("==menu==");
            System.out.println("1 record");
            System.out.println("2 Add friend");
            System.out.println("3 List friends");
            System.out.println("0 exit");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1 ->
                {
                   if(friendName.isEmpty())
                   {
                       break;
                   }

                    System.out.println("==SplitWiseApp-console==");
                    System.out.println("Track shared with friends");
                    System.out.println("");
                    String payerName;
                    System.out.println("Ready for more feauters its coming on next lesson");
                    System.out.println("Enter payer name");
                    payerName = sc.nextLine();
                    friendName.add(payerName);
                    int numFriends=friendName.size();
                    System.out.println("Enter a amount paid");
                    double totalAmount = sc.nextDouble();
                    String expenseline = "%s paid  ₹%.2f".formatted(payerName, totalAmount);
                    double perPresonShare = totalAmount / numFriends;
                    String shareline = "Each person should pay %f".formatted(perPresonShare);
                    System.out.println(shareline);
                    System.out.println(expenseline);
                }
                case 2 ->

                   addfriend(sc,friendName);

                case 3 ->
                {
                    for (String name : friendName)
                    {
                        System.out.println(name);
                    }
                }
                case 0->
                {
                    runninng=false;
                    System.out.println("Goodbye!");
                }
                default ->
                    System.out.println("Enter correct choice");
            }
        }
    }
    public static void addfriend(Scanner sc,ArrayList<String> friendName)
    {
        System.out.println("Enter a friend name");
        String name=sc.nextLine();
        friendName.add(name);
    }
}


