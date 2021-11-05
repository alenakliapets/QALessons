import org.testng.Assert;
import org.testng.annotations.Test;

public class UnitTests {
    //a>0 b>0
    @Test
    public void positiveSumTest1() {
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.sum(2, 3), 5, "test comment");
    }

    //a=0 b=0
    @Test
    public void positiveSumTest2() {
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.sum(0, 0), 0);
    }

    //a<0 b>0
    @Test
    public void positiveSumTest3() {
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.sum(-2, 3), 1);
    }

    //a<0 b<0
    @Test
    public void positiveSumTest4() {
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.sum(-2, -3), -5);
    }

    @Test
    public void positiveDivTest(){
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.div(4, 2),2);
    }

    @Test
    public void negativeDivTest(){
        final Calculator calc = new Calculator();
        Assert.assertThrows(java.lang.ArithmeticException.class, () ->calc.div(4,0));
    }

    //HomeWork

    @Test
    public void positiveDivDoubleTest1(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.divDouble(4.5, 1.5),3);
    }


    @Test
    public void positiveDivDoubleTest2(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.divDouble(4.5, 0.0),Double.POSITIVE_INFINITY);
    }

    @Test
    public void positiveDivDoubleTest3(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.divDouble(-4.5, 0.0),Double.NEGATIVE_INFINITY);
    }

    @Test
    public void positiveDivDoubleTest4(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.divDouble(0.0, 0.0),Double.NaN);
    }

    @Test
    public void positiveSquareTest1(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.squareRoot(0),0);
    }

    @Test
    public void positiveSquareTest2(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.squareRoot(1),1);
    }

    @Test
    public void positiveSquareTest3(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.squareRoot(0.25),0.5);
    }

    @Test
    public void positiveSquareTest4(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.squareRoot(-0.25),Double.NaN);
    }
}
