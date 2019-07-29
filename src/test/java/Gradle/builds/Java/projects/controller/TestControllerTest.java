package Gradle.builds.Java.projects.controller;

import org.junit.Assert;
import org.junit.Test;

public class TestControllerTest {
    @Test
    public void name() {
        Assert.assertEquals(new TestController().test(), "aa");
    }
}