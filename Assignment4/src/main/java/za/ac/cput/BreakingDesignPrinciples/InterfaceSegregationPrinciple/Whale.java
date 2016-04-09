package za.ac.cput.BreakingDesignPrinciples.InterfaceSegregationPrinciple;

/**
 * Created by Game330 on 2016/03/24.
 */
public class Whale implements Animal{

    public void walk() {
        System.out.println("Can't Walk");
    }

    public void swim() {
        System.out.println("Swimming. . .");
    }

    public void dive() {
        System.out.println("Dove.");
    }

    public void run() {
        System.out.println("Can't Run");
    }
}
