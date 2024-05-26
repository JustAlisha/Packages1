package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VacationServiceTest {
    @Test
    public void test() {
        VacationService service = new VacationService();

        int expected = 3;
        Object income = null;
        int actual = service.calculate(income:10_000, expences:3_000, threshold:20_000);
        Assertions.assertEquals(expected, actual);
    }
}