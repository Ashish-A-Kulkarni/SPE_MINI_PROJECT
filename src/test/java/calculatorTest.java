
import org.example.Main;
import static org.junit.Assert.*;
import org.junit.Test;

public class calculatorTest {

    Main obj=new Main();
    @Test
    public void factorialTruePositive()
    {
        assertEquals("Finding factorial of true positive number ",120.0,obj.factorial(5),5);
        assertEquals("Finding factorial of true positive number ",24.0,obj.factorial(4),5);
    }

    @Test
    public void squareRootNumber()
    {
        assertEquals("Square Root of Number ",2.0,obj.squareRoot(4),5);
        assertEquals("Square Root of Number ",5.0,obj.squareRoot(25),5);
    }

    @Test
    public void naturalLogNumber()
    {
        assertEquals("Natural Log [ln(x)] of Number ",2.30258509299,obj.naturalLog(10),5);
        assertEquals("Natural Log [ln(x)] of Number ",2.99573227355,obj.naturalLog(20),5);
    }

    @Test
    public void powerOfNumber()
    {
        assertEquals("Power of a to b ",9.0,obj.powerFunction(3,2),5);
        assertEquals("Power of a to b ",216.0,obj.powerFunction(6,3),5);
    }

}
