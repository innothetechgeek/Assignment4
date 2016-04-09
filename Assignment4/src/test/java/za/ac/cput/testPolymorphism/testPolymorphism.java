package za.ac.cput.testPolymorphism;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import za.ac.cput.Inheritance.Cameras;
import za.ac.cput.Inheritance.DigitalCamera;
import za.ac.cput.Inheritance.VideoCamera;
import za.ac.cput.Polymorphism.Sandal;
import za.ac.cput.Polymorphism.Shoe;
import za.ac.cput.Polymorphism.Sneaker;

/**
 * Created by Game330 on 2016/03/24.
 */
public class testPolymorphism {

    private Shoe sneaker= new Sneaker(), sandal= new Sandal();

    @Test
    public void testSneaker()
    {
        String newAction = "Running";
        sneaker.performAction();
        sneaker.setAction(newAction);
        String result = sneaker.performAction();
        Assert.assertEquals(result, newAction);
    }

    @Test
    public void testSandal()
    {
        String newAction = "Walking";
        sandal.performAction();
        sandal.setAction(newAction);
        String result = sandal.performAction();
        Assert.assertEquals(result, newAction);
    }

    @Test
    public void failTestSneaker()
    {
        String newAction = "Running";
        String oldAction = sneaker.performAction();
        sneaker.setAction(newAction);
        String result = sneaker.getAction();
        Assert.assertEquals(result, oldAction);
    }

    @Test
    public void failTestSandal()
    {
        String newAction = "Walking";
        String oldAction = sandal.performAction();
        sandal.setAction(newAction);
        String result = sandal.getAction();
        Assert.assertEquals(result, oldAction);
    }
}
