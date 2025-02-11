package org.example;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {
    @Test
    public void repeatStringOneTime() {
        Assert.assertEquals("hola", Main.repeat("hola", 1));
    }

    @Test
    public void repeatStringMultipleTimes() {
        Assert.assertEquals("holahola", Main.repeat("hola", 2));
    }

    @Test
    public void repeatStringZeroTimes() {
        Assert.assertEquals("", Main.repeat("", 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void repeatStringNegativeTimes() {
        Assert.assertEquals("", Main.repeat("", -1));
    }
}