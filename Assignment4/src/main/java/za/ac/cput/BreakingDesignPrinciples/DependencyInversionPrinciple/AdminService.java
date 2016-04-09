package za.ac.cput.BreakingDesignPrinciples.DependencyInversionPrinciple;

/**
 * Created by Game330 on 2016/03/25.
 */
public class AdminService {
    public double calculateSalary(Person p, String type)
    {
        if(type=="Manager")
            return new Manager(p).calculateSalary();
        else
           return new Worker(p).calculateSalary();
    }
}
