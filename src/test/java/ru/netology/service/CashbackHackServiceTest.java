package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void shouldReturnAnythingIfAmount1000() {
        int actual = CashbackHackService.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturn200IfAmount800() {
        int actual = CashbackHackService.remain(800);
        int expected = 200;
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturn500IfAmount1500() {
        int actual = CashbackHackService.remain(1500);
        int expected = 500;
        assertEquals(expected, actual);
    }
}