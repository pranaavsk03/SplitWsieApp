package app;

public class SplitWise
{
    public static void main(String[]args)
    {
        String EXPENSE_DESCRIPTION = "Dinner";
        double TOTAL_AMOUNT = 1200.0;
        int NUMBER_OF_PEOPLE = 4;
        System.out.println("=== Splitwise Console Backend ===");
        double individualShare = TOTAL_AMOUNT / NUMBER_OF_PEOPLE;
        System.out.println("Expense description: " + EXPENSE_DESCRIPTION);
        System.out.println("Total amount: " + TOTAL_AMOUNT);
        System.out.println("Number of people: " + NUMBER_OF_PEOPLE);
        System.out.println("Each person should pay: " + individualShare);
        System.out.println();
        System.out.println("Feature status: Basic calculation completed.");
    }
}