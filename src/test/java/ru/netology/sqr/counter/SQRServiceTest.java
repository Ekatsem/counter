package ru.netology.sqr.counter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/int.csv")
    public void calcSQR(int expected, int x, int y){
        SQRService service = new SQRService();

        int actual = service.calcSQRService(x, y);

        Assertions.assertEquals(expected, actual);
    }
}
