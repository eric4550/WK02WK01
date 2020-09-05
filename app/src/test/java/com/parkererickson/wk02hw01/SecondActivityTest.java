package com.parkererickson.wk02hw01;

import android.content.Context;
import android.content.Intent;

import org.junit.Test;

import static org.junit.Assert.*;

public class SecondActivityTest {

    private Object SecondActivity;

    @Test
    public void testOnClick() throws Exception {
        Context context = null;
        SecondActivity secondActivity = new SecondActivity();
        Intent intent = new Intent();


        intent = secondActivity.getIntent(context);
        assertEquals(SecondActivity, intent);

    }
}