package za.ac.cput.testEncapsulation;

import junit.framework.Assert;
import org.junit.Test;
import za.ac.cput.Encapsulation.implementationClass;
import za.ac.cput.Encapsulation.myClass;

/**
 * Created by Game330 on 2016/03/24.
 */
public class testImplementationClass {
    implementationClass _imp;

    public testImplementationClass() {
        _imp = new implementationClass(new myClass("Chips"), 13, 5.75);
    }

    @Test
    public void testSingleCost()
    {
        double expectedValue = 6.555000000000001;
        Assert.assertEquals(_imp.calculateSignleItem(), expectedValue);
    }


    @Test
    public void failTestSingleCost()
    {
        double failValue = 24;
        Assert.assertEquals(_imp.calculateSignleItem(), failValue);
    }

    @Test
    public void testTotalCost()
    {
        double expectedValue = 85.215;
        Assert.assertEquals(_imp.calculateTotalCost(), expectedValue);
    }

    @Test
    public void failTestTotalCost()
    {
        double failValue = 3;
        Assert.assertEquals(_imp.calculateTotalCost(), failValue);
    }


}
