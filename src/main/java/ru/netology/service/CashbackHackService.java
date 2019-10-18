package ru.netology.service;

public class CashbackHackService {
    private static final int boundary = 1000;

    public static int remain(int amount) {
        return boundary - amount % boundary;
    }
}
