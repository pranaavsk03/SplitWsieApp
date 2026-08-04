/**
 * It's the package of entry of SplitWise
 */
package app;


import model.Friend;
import model.ExpenseLine;
import java.util.ArrayList;
import java.util.Scanner;
public class SplitWise
{

    /**
     * Main method  in SplitWise.java
     */
    public static void main(String [] args)
    {

        ArrayList<Friend> friendName =new ArrayList<>();

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
                    System.out.println("Enter a amount paid");
                    double totalAmount = sc.nextDouble();
                    int numFriends=friendName.size();
                  ExpenseLine line=new ExpenseLine(payerName,totalAmount);
                    String expenseline = "%s paid  ₹%.2f".formatted(line.Payername(), line.Amount());
                    double perPresonShare = line.Amount() / numFriends;
                    String shareline = "Each person should pay %f".formatted(perPresonShare);
                    System.out.println(shareline);
                    System.out.println(expenseline);
                }
                case 2 ->
                   {
                       System.out.println("Enter a friend name");
                       String name=sc.nextLine();
                   addfriend(friendName,name);
                   }

                case 3 ->
                {
                    if(friendName.isEmpty())
                    {
                        System.out.println("No friend yet");
                    }
                    else
                    {
                        for (Friend friend : friendName)
                        {
                            System.out.println(friendDisplay.listLine(friend) );

                        }
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
    public static void addfriend(ArrayList<Friend> friendName,String name)
    {
        Friend friends=new Friend(name);
        friendName.add(friends);
        System.out.println(friendDisplay.addedmessage(friends));
    }

    /**
     * Static class which inside the SplitWise class to get and display the friends detail
     */
    private static class friendDisplay
   {
       /**
        *
        * @param friend it was with parameter to store the value of friend
        * @return it is the formatted line
        */
       static String listLine(Friend friend)
       {
           return "%d %s".formatted(friend.getid(),friend.getName());
       }

       /**
        *
        * @param friend it was with parameter friend to display the name and id
        * @return its was the formatted line
        */
       static String addedmessage(Friend friend)
       {
           return "Added %s (id %d)".formatted(friend.getName(),friend.getid());
       }
   }
}


