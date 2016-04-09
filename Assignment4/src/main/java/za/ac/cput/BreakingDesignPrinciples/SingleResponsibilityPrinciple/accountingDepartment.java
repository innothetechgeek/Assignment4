package za.ac.cput.BreakingDesignPrinciples.SingleResponsibilityPrinciple;

/**
 * Created by Game330 on 2016/03/24.
 */
public class accountingDepartment extends incorrectPrincipleMethods{

    double salary, rate = 25.5 ;
    int daysWorked = 20;

    public void setRate()
    {
        ratePerHour = rate;
    }

    public void updateSalary()
    {
        promotion(30.5);
    }

    public void getSalary()
    {
        salary = calculatePayment(daysWorked);
    }

    public void displayPayslip()
    {
        System.out.println("Your salary is R" + salary + " per month.");
    }
}
