package com.parkererickson.wk02hw01;

import org.junit.*;

import static org.junit.Assert.assertEquals;

public class MainActivityTest {

    @Test
    public void testUsernamesMatch() throws Exception {
        String input1 = "Admin";
        String input2 = "admin";
        boolean output1, output2;

        MainActivity mainActivity = new MainActivity();
        output1 = mainActivity.usernamesMatch(input1);
        output2 = mainActivity.usernamesMatch(input2);

        assertEquals(true, output1);
        assertEquals(false, output2);
    }

    @Test
    public void testPasswordsMatch() throws Exception{
        String input = "Admin";
        String input2 = "admin";
        boolean output1, output2;


        MainActivity mainActivity = new MainActivity();
        output1 = mainActivity.passwordsMatch(input);
        output2 = mainActivity.passwordsMatch(input2);

        assertEquals(true, output1);
        assertEquals(false,output2);
    }
}
