package comp127;

import org.junit.Test;
import org.junit.Assert;
import comp127.MethodPractice;

public class MethodPracticeTest {
    @Test
    //Not going to return anything
    public void SquareNumTest(){
        Assert.assertEquals(36, MethodPractice.squareNum(6));
    }
}
