package za.ac.cput.testInheritance;

import org.testng.Assert;
import org.testng.annotations.Test;
import za.ac.cput.Inheritance.Cameras;
import za.ac.cput.Inheritance.DigitalCamera;

/**
 * Created by Game330 on 2016/03/24.
 */
public class testCameras {

    @Test
    public void testDigitalCamera()
    {
        String newAction = "Picture Taken";
        DigitalCamera camera = new DigitalCamera();
        camera.performAction();
        camera.action = newAction;
        String result = camera.performAction();
        Assert.assertEquals(result, newAction);
    }

    @Test
    public void testVideoCamera()
    {
        String newAction = "Recording";
        DigitalCamera camera = new DigitalCamera();
        camera.performAction();
        camera.action = newAction;
        String result = camera.performAction();
        Assert.assertEquals(result, newAction);
    }

    @Test
    public void failTestDigitalCamera()
    {
        String newAction = "Picture Taken";
        DigitalCamera camera = new DigitalCamera();
        String oldAction = camera.performAction();
        camera.action = newAction;
        String result = camera.performAction();
        Assert.assertEquals(result, oldAction);
    }

    @Test
    public void failTestVideoCamera()
    {
        String newAction = "Recording";
        DigitalCamera camera = new DigitalCamera();
        String oldAction = camera.performAction();
        camera.action = newAction;
        String result = camera.performAction();
        Assert.assertEquals(result, oldAction);
    }
}
