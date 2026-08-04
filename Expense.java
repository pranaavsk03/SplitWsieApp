public class Expense {
    private final String payerName;
    private final double amount;

    public Expense(String name,double amount)
    {
        this.payerName=name;
        this.amount=amount;
    }
    public Expense(double amount)
    {
        this("unknow",amount);
    }
    public String getPayerName()
    {
        return payerName;
    }
    public double getAmount()
    {
        return amount;
    }
}
