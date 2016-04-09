package za.ac.cput.ObeyingDesignPrinciples.SingleResponsibilityPrinciple;

/**
 * Created by Game330 on 2016/03/24.
 */
public abstract class accountingLogic {

    public double ratePerHour;

    public double calculatePayment(int daysWorked)
    {
        return ratePerHour * daysWorked;
    }

    public void promotion(double newRate)
    {
        ratePerHour = newRate;

    }
}
