package za.ac.cput.ObeyingDesignPrinciples.InterfaceSegregationPrinciple;

/**
 * Created by Game330 on 2016/03/24.
 */
public class Cat implements LandAnimal {

    public void walk() {
        System.out.println("Walking. . .");
    }

    public void run() {
        System.out.println("Running. . .");
    }
}
