package za.ac.cput.ObeyingDesignPrinciples.DependencyInversionPrinciple;

/**
 * Created by Game330 on 2016/03/25.
 */
public class Worker extends Person implements IAdministration{
    private double overTimeRate, overTimeHours;

    public Worker(Person p)
    {
        setName(p.getName());
        setSurname(p.getSurname());
        setHours(p.getHours());
        setRate(p.getRate());
    }

    public Worker(){

    }

    public Worker(Person p, double overTime, double hours)
    {
        setName(p.getName());
        setSurname(p.getSurname());
        setHours(p.getHours());
        setRate(p.getRate());
        setoverTimeHours(hours);
        setOverTimeRate(overTime);
    }

    public double getOverTimeRate() {
        return overTimeRate;
    }

    public void setOverTimeRate(double overTimeRate) {
        this.overTimeRate = overTimeRate;
    }

    public double getoverTimeHours() {
        return overTimeHours;
    }

    public void setoverTimeHours(double overTimeHours) {
        this.overTimeHours = overTimeHours;
    }

    public double calculateSalary()
    {
        return (overTimeHours*overTimeRate) + calculateBasic();
    }
}
