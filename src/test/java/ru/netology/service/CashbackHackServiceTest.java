package ru.netology.service;

import org.junit.Test;
import org.junit.Assert;


public class CashbackHackServiceTest {

    @Test
    public void shouldCalculateRemainIfAmountIs900() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;

        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);


    }

    @Test
    public void shouldCalculateRemainIfAmountIs1000(){
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;

        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void shouldCalculateRemainIfAmountIs1500() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1500;
        int expected = 500;

        int actual = service.remain(amount);

        Assert.assertEquals(actual, expected);

    }

    @Test
    public void shouldCalculateRemainIfAmountIs0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int expected = 0;

        int actual = service.remain(amount);

        Assert.assertEquals(expected, actual);

    }
}