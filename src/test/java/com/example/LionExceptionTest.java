package com.example;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class LionExceptionTest {
    Feline feline = new Feline();

    @Rule
    public ExpectedException exception =ExpectedException.none();

    @Test(expected = Exception.class)
    public void LionException() throws Exception {
        new Lion("самка", feline);
        exception.expectMessage("Нужно использовать допустимые значения пола животного - самей или самка");
    }
}
