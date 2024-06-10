package restfulbookertest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Base_test
{
    @BeforeTest
     public void setup()
    {
        System.out.println("welcome to restfulbooker");
    }
    @Test
     public void testrestfulbooker()
    {
        System.out.println("Test for running restfull booker");
    }
@AfterTest
    public void teardown()
{
    System.out.println("End of restfull class");
}
}

