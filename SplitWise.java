import java.util.Scanner;
public class SplitWise {

    public static void main(String [] args)
    {
        boolean runninng =true;
        while(runninng) {
            Scanner sc = new Scanner(System.in);
            System.out.println("==menu==");
            System.out.println("1 record");
            System.out.println("0 exit");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {

                case 1 -> {

                    System.out.println("==SplitWiseApp-console==");
                    System.out.println("Track shared with friends");
                    System.out.println("");
                    String payerName;
                    System.out.println("Ready for more feauters its coming on next lesson");
                    System.out.println("Enter payer name");
                    payerName = sc.nextLine();
                    System.out.println("Enter a amount paid");
                    double totalAmount = sc.nextDouble();
                    String expenseline = "%s paid  ₹%.2f".formatted(payerName, totalAmount);
                    System.out.println(expenseline);
                    int numFriends = 3;
                    double perPresonShare = totalAmount / numFriends;
                    String shareline = "Each person should pay %f".formatted(perPresonShare);
                    System.out.println(shareline);
//        System.out.println(payerName);
//        System.out.println(numFriends);
//        System.out.println(totalAmount);
//        System.out.println(perPresonShare);
//        System.out.println(payerName+" paid ₹"+totalAmount);
//        System.out.println("Each person paid : ₹" + perPresonShare);
                }
                case 0->
                {
                    runninng=false;
                    System.out.println("Goodbye!");
                }
                default ->
                {
                    System.out.println("Enter correct choice");
                }
            }
        }
    }
}


