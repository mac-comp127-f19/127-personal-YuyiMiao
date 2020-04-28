package sortingArrays;

import org.hamcrest.core.IsEqual;
import org.hamcrest.core.IsNot;
import org.junit.Test;

//import static activityStarterCode.sortingArrays.ArraySort.sort;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class ArraySortTest {

    @Test
    public void testSingleElement() {
        assertArrayEquals(
                new String[]{"7"},
                //sort(new String[]{"7"})
                ArraySort.sort(new String[]{"7"})
        );
    }

    @Test
    public void testEmptyArray() {
        assertArrayEquals(
                new String[]{},
                ArraySort.sort(new String[]{})
        );
    }

    @Test
    public void testNullArray() {
        assertArrayEquals(
                new String[]{null},
                ArraySort.sort(new String[]{null} )
        );
    }

    @Test
    public void testTwoElements() {
        assertArrayEquals(
                new String[]{"order","out"},
                ArraySort.sort(new String[]{"out","order"})
        );
    }

    @Test
    public void testThreeElements() {
        assertArrayEquals(
                new String[]{"of","order","out"},
                ArraySort.sort(new String[]{"out","of","order"})
        );
    }

    @Test
    public void testCaseSorting(){
        assertThat(
                new String[]{"Aardvark","Canary","bear","deer"},
                IsNot.not(IsEqual.equalTo(ArraySort.sort(new String[]{"bear","Canary","Aardvark","deer"})))
        );
    }


}
