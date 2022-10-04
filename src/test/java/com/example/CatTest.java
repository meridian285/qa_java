package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.*;
@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;
    @Test
    public void getSoundTest(){
        Cat cat = new Cat(feline);
        String expected = cat.getSound();
        String actual = "Мяу";
        assertEquals("Метод возвращает не верную строку", expected, actual);
    }
}
