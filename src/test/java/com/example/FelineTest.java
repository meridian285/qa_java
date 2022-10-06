package com.example;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FelineTest {

    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();
        List<String> expected  = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expected ,feline.getFood("Хищник"));
    }
    @Test
    public void getFamilyTest(){
        Feline feline = new Feline();
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        assertEquals("Ожидается результат - Кошачьи ",expected, actual);
    }

    @Test
    public void getKittensTest(){
        Feline feline = new Feline();
        int expected = feline.getKittens(1);
        int actual = feline.getKittens();
        assertEquals(expected, actual);
    }
}