package pl.sokol.demo;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddTest {

    @Test
    public void add(){
        Add add = new Add();
        Assert.assertEquals(3,add.add(2,1));

    }

}