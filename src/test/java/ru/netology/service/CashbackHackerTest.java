package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackerTest {

    @Test
    public void shouldReturnFirst() {

        CashbackHacker service = new CashbackHacker();

        int expected = 999;
        int actual = service.remain(1);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnSecond() {

        CashbackHacker service = new CashbackHacker();

        int expected = 1000;
        int actual = service.remain(0);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnThird() {

        CashbackHacker service = new CashbackHacker();

        int expected = 990;
        int actual = service.remain(10);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFourth() {

        CashbackHacker service = new CashbackHacker();

        int expected = 499;
        int actual = service.remain(501);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnFiveth() {

        CashbackHacker service = new CashbackHacker();

        int expected = 1;
        int actual = service.remain(999);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnSixth() {

        CashbackHacker service = new CashbackHacker();

        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnSeventh() {

        CashbackHacker service = new CashbackHacker();

        int expected = 1000;
        int actual = service.remain(2000);

        assertEquals(expected, actual);
    }
}