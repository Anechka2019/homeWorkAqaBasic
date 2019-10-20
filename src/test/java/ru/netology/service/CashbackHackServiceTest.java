package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

        @Test
        void shouldRerurn100IfAmountIs900() {
            CashbackHackService service = new CashbackHackService();
            int amount = 900;
            int actual = service.remain(amount);
            int expected = 100;
            assertEquals(expected, actual);
        }

        //ошибка в тесте: если внести 1000, то к доплате 0 для получения кэшбека.
        @Test
        void shouldReturn0IfAmount1000() {
            CashbackHackService service = new CashbackHackService();
            int amount = 1000;
            int actual = service.remain(amount);
            int expected = 0;
            assertEquals(expected, actual);
        }
    }
