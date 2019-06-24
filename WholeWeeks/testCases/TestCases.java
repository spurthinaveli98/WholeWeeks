
import org.junit.Test;
import org.junit.Assert;

public class TestCases {

    @Test
    public void testcase1(){
        WholeWeeks test = new WholeWeeks();
        int year = 2014;
        String startMonth = "April";
        String endMonth = "May";
        String expectedOutput = "7";
        String actualOutput=test.computeWholeWeeks(year,startMonth,endMonth);
        Assert.assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void testcase2(){
        WholeWeeks test = new WholeWeeks();
        int year = 2019;
        String startMonth = "April";
        String endMonth = "December";
        String expectedOutput = "39";
        String actualOutput=test.computeWholeWeeks(year,startMonth,endMonth);
        Assert.assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void testcase3(){
        WholeWeeks test = new WholeWeeks();
        int year = 2015;
        String startMonth = "January";
        String endMonth = "March";
        String expectedOutput = "12";
        String actualOutput=test.computeWholeWeeks(year,startMonth,endMonth);
        Assert.assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void testcase4(){
        WholeWeeks test = new WholeWeeks();
        int year = 2000;
        String startMonth = "march";
        String endMonth = "October";
        String expectedOutput = "34";
        String actualOutput=test.computeWholeWeeks(year,startMonth,endMonth);
        Assert.assertEquals(expectedOutput,actualOutput);
    }

    @Test
    public void testcase5(){
        WholeWeeks test = new WholeWeeks();
        int year = 2016;
        String startMonth = "January";
        String endMonth = "June";
        String expectedOutput = "25";
        String actualOutput=test.computeWholeWeeks(year,startMonth,endMonth);
        Assert.assertEquals(expectedOutput,actualOutput);
    }

}

