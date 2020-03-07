package com.jak.sandbox.yava;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class ItsJavaTest {

    @Test
    public void addTwo() {
        Integer result = new ItsJava().addTwo(3, 6);
        assertNotNull(result);
        assertThat(result, equalTo(9));
    }

    @Test
    public void addTwoOneMoreTime() {
        Integer result = new ItsJava().addTwo(3, 1);
        assertNotNull(result);
        assertThat(result, equalTo(4));
    }

}