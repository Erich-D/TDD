package org.example;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CarTest {
    Car car;

    @Before
    public void setUp() {
        car = new Car(10,24);
    }

    @After
    public void cleanUp() {

    }

    @Test
    public void testCar(){
        Assert.assertEquals(10,car.getMileage());
        Assert.assertEquals(24,car.getGas(),0.001);
    }

    @Test
    public void testSetMileage(){
        car.setMileage(15);
        Assert.assertEquals(15,car.getMileage());
    }

    @Test
    public void testSetGas(){
        car.setGas(5.5);
        Assert.assertEquals(5.5,car.getGas(),0.001);
    }

    @Test
    public void testGetGas(){
        double gas = car.getGas();
        Assert.assertEquals(24,car.getGas(),0.001);
    }

    @Test
    public void testGetMileage(){
        int mileage = car.getMileage();
        Assert.assertEquals(10,car.getMileage());
    }

    @Test
    public void testDrive(){
        int miles = car.drive(5);
        Assert.assertEquals(5,miles);
        Assert.assertEquals(23.5,car.getGas(),0.001);
        miles = car.drive(250);
        Assert.assertEquals(235,miles);
        Assert.assertEquals(0,car.getGas(),0.001);
    }

    @Test
    public void testFill(){
        car.fill(12);
        Assert.assertEquals(36,car.getGas(),0.001);
    }

    @Test
    public void testToString(){
        String string = car.toString();
        Assert.assertTrue(string.compareTo("Exercise3{mileage=10, gas=24.0}")==0);
    }
}
