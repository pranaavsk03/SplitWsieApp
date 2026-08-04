/**
 * Its record of payer name and how much does paid
 */
package model;


/**
 * Its conical constructor which have two parameter
 * @param Payername its string variable to store the name of payer name
 * @param Amount its double variable to store the amount of payer paid
 */
public record ExpenseLine (String Payername, double Amount)
{

}
