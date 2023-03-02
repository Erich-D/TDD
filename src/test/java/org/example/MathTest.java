package org.example;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class MathTest {
    static Math math;
    @BeforeClass
    public static void setUp(){
        math = new Math();
    }

    @Test
    public void testGCF(){
        int gcf = math.GCF(117,63);
        Assert.assertEquals(9,gcf);
    }

    @Test
    public void testAreaRectangle(){
        int area = math.areaRectangle(5,8);
        Assert.assertEquals(40,area);
    }

    @Test
    public void testAreaTriangle(){
        double area = math.areaTriangle(5,8);
        Assert.assertEquals(20,area,0.0001);
    }

    @Test
    public void testAreaCircle(){
        double area = math.areaCircle(10);
        Assert.assertEquals(314.159,area,0.001);
    }

    @Test
    public void testFactorial(){
        int factorial = math.factorial(7);
        Assert.assertEquals(5040,factorial);
    }

}
