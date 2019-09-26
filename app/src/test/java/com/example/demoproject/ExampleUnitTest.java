package com.example.demoproject;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void checkMethod1(){
        for (int i=1;i<=5;i++) {
            int j;
            if (i == 1 || i == 5)
                j = 1;
            else if (i == 2 || i == 4)
                j = 3;
            else j = 5;
            for (int k = 1; k <= j; k++)
                System.out.print(k);
            System.out.println("");
        }
    }

}