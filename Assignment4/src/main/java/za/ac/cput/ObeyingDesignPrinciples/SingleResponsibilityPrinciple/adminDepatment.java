package za.ac.cput.ObeyingDesignPrinciples.SingleResponsibilityPrinciple;

/**
 * Created by Game330 on 2016/03/24.
 */
public class adminDepatment extends administrationLogic{

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
