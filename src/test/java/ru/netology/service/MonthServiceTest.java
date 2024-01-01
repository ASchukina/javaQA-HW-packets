package ru.netology.service;

// import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class MonthServiceTest {

    @ParameterizedTest
    @CsvFileSource (files="src/test/resources/month.csv")

    void calcForMonthInYear (int income, int expenses, int threshold, int expected) {
        MonthService service = new MonthService();
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals (expected, actual);
    }
}
