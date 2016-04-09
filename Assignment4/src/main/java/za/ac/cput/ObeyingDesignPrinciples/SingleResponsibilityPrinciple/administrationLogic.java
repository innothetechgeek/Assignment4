package za.ac.cput.ObeyingDesignPrinciples.SingleResponsibilityPrinciple;

/**
 * Created by Game330 on 2016/03/24.
 */
public abstract class administrationLogic {
    public String employeeName, employeeSurname;

    public void addEmployee(String name, String surname)
    {
        this.employeeName = name;
        this.employeeSurname = surname;
    }

    public void updateName(String newName){
        employeeName = newName;
    }

    public void updateSurname(String surname)
    {
        employeeSurname = surname;
    }
}
