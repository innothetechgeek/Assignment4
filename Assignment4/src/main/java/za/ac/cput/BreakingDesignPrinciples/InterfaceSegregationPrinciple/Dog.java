package za.ac.cput.BreakingDesignPrinciples.InterfaceSegregationPrinciple;

/**
 * Created by Game330 on 2016/03/24.
 */
public class Dog implements Animal{

    public void walk() {
        System.out.println("Walking. . .");
    }

    public void swim() {
        System.out.println("Can't swim, drowned");
    }

    public void dive() {
        System.out.println("Can't swim, drowned");
    }

    public void run() {
        System.out.println("Running. . .");
    }
}
