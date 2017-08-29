package com.willekens.cedric.cookbook;

import org.junit.Test;

import java.io.Console;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        System.out.println("the test ran");
        assertEquals(4, 2 + 2);
    }

    @Test
    public void addition_isFalse() {
        assertEquals(5, 3 + 2);
    }
}