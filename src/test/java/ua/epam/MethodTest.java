package ua.epam;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

/**
 * Created by Dmytro_Rybin on 9/14/2016.
 */
public class MethodTest {
    @Rule
    public final ExpectedException exp = ExpectedException.none();

    @Test
    public void testFinderOneVal() {
        Method m = new Method();
        int arr[] = {1,6,5,3};
        int value = 3;
        int res[] = m.finder(arr, value);
        Assert.assertArrayEquals(new int[]{3}, res);
    }

    @Test
    public void testFinderManyVal() {
        Method m = new Method();
        int arr[] = {3,6,3,3};
        int value = 3;
        int res[] = m.finder(arr, value);
        Assert.assertArrayEquals(new int[]{0, 2, 3}, res);
    }

    @Test
    public void testFinderZeroVal() {
        Method m = new Method();
        int arr[] = {1,6,5,2};
        int value = 3;
        int res[] = m.finder(arr, value);
        Assert.assertArrayEquals(new int[0], res);
    }

    @Test
    public void testFinderZeroArr() {
        Method m = new Method();
        int arr[] = {};
        int value = 3;
        int res[] = m.finder(arr, value);
        Assert.assertArrayEquals(new int[0], res);
    }

    @Test
    public void testFinderExc() {
        Method m = new Method();
        int arr[] = null;
        int value = 3;
        exp.expect(NullPointerException.class);
        m.finder(arr, value);
    }

    @Test
    public void testFinderChar() {
        Method m = new Method();
        int arr[] = {'a','a',5,2};
        int value = 97;
        int res[] = m.finder(arr, value);
        Assert.assertArrayEquals(new int[]{0,1}, res);
    }
}