package za.ac.cput.BreakingDesignPrinciples.SingleResponsibilityPrinciple;

/**
 * Created by Game330 on 2016/03/24.
 */
public class adminDepatment extends incorrectPrincipleMethods{

    String name = "Innocent", surname = "Mphokeli";

    public void saveEmployeeDetails(){
        addEmployee(name, surname);
    }

    public void updateEmployee(String name, String surname)
    {
        updateName(name);
        updateSurname(surname);
    }
}
