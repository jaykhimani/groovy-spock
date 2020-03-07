package com.jak.sandbox.groovy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ItsGroovyJunitTest {
    @Test
    public void addTwo() {
        Object result = new ItsGroovy().addTwo(4, 9);
        assertNotNull(result);
        assertEquals(13, result);
    }
}