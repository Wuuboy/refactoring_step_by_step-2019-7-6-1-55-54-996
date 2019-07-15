package com.tws.refactoring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PoliceTest {
    @Test
    public void should_return_true_when_the_age_greater_18(){
        //giving
        Police police = new Police();
        Driver driver = new Driver(19);
        //when
        boolean result = police.checkDriver(driver);
        //then
        assertTrue(result);
    }

    @Test
    public void should_return_true_when_the_age_equal_18(){
        //giving
        Police police = new Police();
        Driver driver = new Driver(18);
        //when
        boolean result = police.checkDriver(driver);
        //then
        assertTrue(result);
    }

    @Test
    public void should_return_true_when_the_age_smaller_18(){
        //giving
        Police police = new Police();
        Driver driver = new Driver(17);
        //when
        boolean result = police.checkDriver(driver);
        //then
        assertTrue(!result);
    }


}
