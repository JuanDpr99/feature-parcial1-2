package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

import java.nio.channels.ScatteringByteChannel;

public class TestParcial {

    // TODO Complete with more test cases


    @Test
    public void validateMenor() throws Exception {

        boolean result = false;

        validadAge validadAge = new validadAge();
        result = validadAge.checkAge(17);
        Assert.assertTrue(result);

    }

    @Test
    public void validateMayor() throws Exception {
        validadAge validadAge = new validadAge();
        boolean result = validadAge.checkAge(18);
        Assert.assertFalse(result);

    }

    @Test(expected = Exception.class)
    public void validateInvalid() throws Exception {

        boolean result = false;

        validadAge validadAge = new validadAge();

        result = validadAge.checkAge(-1);


    }




}