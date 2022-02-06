import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UnitTests {
    @Description("a>0 b>0")
    @Severity(SeverityLevel.CRITICAL)
    @TmsLink("1")
    @Issue("2")
    @Link(value = "#_testng", url = "https:docs.qameta.io/allure/#_testng")
    @Feature("ClassWork")
    @Story("SumTest")
    @Test
    public void positiveSumTest1() {
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.sum(2, 3), 5, "test comment");
    }

    @Description("a=0 b=0")
    @Severity(SeverityLevel.MINOR)
    @TmsLink("1")
    @Issue("2")
    @Link(value = "#_testng", url = "https:docs.qameta.io/allure/#_testng")
    @Feature("ClassWork")
    @Story("SumTest")
    @Test
    public void positiveSumTest2() {
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.sum(0, 0), 0);
    }

    @Severity(SeverityLevel.NORMAL)
    @TmsLink("1")
    @Issue("2")
    @Link(value = "#_testng", url = "https:docs.qameta.io/allure/#_testng")
    @Feature("ClassWork")
    @Story("SumTest")
    @Test(description = "a<0 b>0")
    public void positiveSumTest3() {
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.sum(-2, 3), 1);
    }

    @Severity(SeverityLevel.NORMAL)
    @TmsLink("1")
    @Issue("2")
    @Link(value = "#_testng", url = "https:docs.qameta.io/allure/#_testng")
    @Feature("ClassWork")
    @Story("SumTest")
    @Test(description = "a<0 b<0")
    public void positiveSumTest4() {
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.sum(-2, -3), -5);
    }
    @Severity(SeverityLevel.CRITICAL)
    @TmsLink("1")
    @Issue("2")
    @Link(value = "#_testng", url = "https:docs.qameta.io/allure/#_testng")
    @Feature("ClassWork")
    @Story("DivTest")
    @Test
    public void positiveDivTest(){
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.div(4, 2),2);
    }
    @Severity(SeverityLevel.MINOR)
    @TmsLink("1")
    @Issue("2")
    @Link(value = "#_testng", url = "https:docs.qameta.io/allure/#_testng")
    @Feature("ClassWork")
    @Story("DivTest")
    @Test
    public void negativeDivTest(){
        final Calculator calc = new Calculator();
        Assert.assertThrows(java.lang.ArithmeticException.class, () ->calc.div(4,0));
    }

    //HomeWork

    @Severity(SeverityLevel.MINOR)
    @TmsLink("1")
    @Issue("2")
    @Link(value = "#_testng", url = "https:docs.qameta.io/allure/#_testng")
    @Feature("HomeWork")
    @Story("DivTest")
    @Test
    public void positiveDivDoubleTest1(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.divDouble(4.5, 1.5),3);
    }

    @Severity(SeverityLevel.CRITICAL)
    @TmsLink("1")
    @Issue("2")
    @Link(value = "#_testng", url = "https:docs.qameta.io/allure/#_testng")
    @Feature("HomeWork")
    @Story("DivTest")
    @Test
    public void positiveDivDoubleTest2(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.divDouble(4.5, 0.0),Double.POSITIVE_INFINITY);
    }

    @Severity(SeverityLevel.NORMAL)
    @TmsLink("1")
    @Issue("2")
    @Link(value = "#_testng", url = "https:docs.qameta.io/allure/#_testng")
    @Feature("HomeWork")
    @Story("DivTest")
    @Test
    public void positiveDivDoubleTest3(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.divDouble(-4.5, 0.0),Double.NEGATIVE_INFINITY);
    }

    @Severity(SeverityLevel.MINOR)
    @TmsLink("1")
    @Issue("2")
    @Link(value = "#_testng", url = "https:docs.qameta.io/allure/#_testng")
    @Feature("HomeWork")
    @Story("DivTest")
    @Test
    public void positiveDivDoubleTest4(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.divDouble(0.0, 0.0),Double.NaN);
    }

    @Severity(SeverityLevel.CRITICAL)
    @TmsLink("1")
    @Issue("2")
    @Link(value = "#_testng", url = "https:docs.qameta.io/allure/#_testng")
    @Feature("HomeWork")
    @Story("SquareTest")
    @Test
    public void positiveSquareTest1(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.squareRoot(0),0);
    }

    @Severity(SeverityLevel.NORMAL)
    @TmsLink("1")
    @Issue("2")
    @Link(value = "#_testng", url = "https:docs.qameta.io/allure/#_testng")
    @Feature("HomeWork")
    @Story("SquareTest")
    @Test
    public void positiveSquareTest2(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.squareRoot(1),1);
    }

    @Severity(SeverityLevel.NORMAL)
    @TmsLink("1")
    @Issue("2")
    @Link(value = "#_testng", url = "https:docs.qameta.io/allure/#_testng")
    @Feature("HomeWork")
    @Story("SquareTest")
    @Test
    public void positiveSquareTest3(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.squareRoot(0.25),0.5);
    }

    @Severity(SeverityLevel.CRITICAL)
    @TmsLink("1")
    @Issue("2")
    @Link(value = "#_testng", url = "https:docs.qameta.io/allure/#_testng")
    @Feature("HomeWork")
    @Story("SquareTest")
    @Test
    public void positiveSquareTest4(){
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.squareRoot(-0.25),Double.NaN);
    }
}
