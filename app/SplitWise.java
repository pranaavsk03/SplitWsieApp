package app;
import java.util.Scanner;
public class SplitWise
{
    public static void main(String[]args)
    {
        String EXPENSE_DESCRIPTION = "Dinner";
        double TOTAL_AMOUNT = 1200.0;
        int NUMBER_OF_PEOPLE = 4;
        System.out.println("=== Splitwise Console Backend ===");
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("1-Add expense");
            System.out.println("2-View expense");
            System.out.println("3-Exit");
             int choice=sc.nextInt();
             if(choice==1)
            {
                System.out.println("Expense was recording");
            }
             else if(choice==2)
             {
                 double individualShare = TOTAL_AMOUNT / NUMBER_OF_PEOPLE;
                 System.out.println("Expense description: " + EXPENSE_DESCRIPTION);
                 System.out.println("Total amount: " + TOTAL_AMOUNT);
                 System.out.println("Number of people: " + NUMBER_OF_PEOPLE);
                 System.out.println("Each person should pay: " + individualShare);
                 System.out.println();
                 System.out.println("Feature status: Basic calculation completed.");
             }
             else if(choice==3)
             {
                 break;
             }
             else {
                 System.out.println("Input in invalid");
             }
        }
        System.out.println( "Goodbye!");
        sc.close();

    }
}