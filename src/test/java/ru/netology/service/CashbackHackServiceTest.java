package ru.netology.service;

import org.testng.annotations.Test;

import java.util.concurrent.Callable;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemainifThePurchaseAmountIsNullRubles() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }
    @Test
    public void testRemainifThePurchaseAmountIsOneRubles() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }
    @Test
    public void testRemainifThePurchaseAmountIs999Rubles() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
    }
    @Test
    public void testRemainifThePurchaseAmountIs1000Rubles() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }
    @Test
    public void testRemainifThePurchaseAmountIs1001Rubles() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }
    @Test
    public void testRemainifThePurchaseAmountIs1999Rubles() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
    }
    @Test
    public void testRemainifThePurchaseAmountIs2000Rubles() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }
    @Test
    public void testRemainifThePurchaseAmountIs2001Rubles() {
        CashbackHackService service = new CashbackHackService();
        int amount = 2001;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }
}